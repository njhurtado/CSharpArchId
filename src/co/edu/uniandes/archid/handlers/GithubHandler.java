package co.edu.uniandes.archid.handlers;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.egit.github.core.Label;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.service.IssueService;
import org.eclipse.egit.github.core.service.UserService;
import org.kohsuke.github.GHUser;
import org.kohsuke.github.GHUserSearchBuilder;
import org.kohsuke.github.GitHub;

import java.util.Set;

import com.google.gson.Gson;

import co.edu.uniandes.archid.utils.Decision;
import co.edu.uniandes.archid.utils.Issue;
import co.edu.uniandes.archid.utils.Rule;

public class GithubHandler {
	public static String[] output;
	public static int[] issuesCount;
	public static HashMap<String, int[]> fileIssuesCount;
	public static HashMap<String, Set<String>> dependencies;
	public static HashMap<String, Set<String>> dependenciesIn;
	public static HashMap<Decision, List<Rule>> decisions;
	public static HashMap<String, List<Issue>> issues;

	public static RepositoryId repo;
	public static User author;
	public static IssueService service;
	public static List<org.eclipse.egit.github.core.Issue> issuesGithub;

	public GithubHandler(String urlRepo) {
		try {
			issuesCount = new int[22];
			fileIssuesCount = new HashMap<String, int[]>();
			dependencies = new HashMap<String, Set<String>>();
			dependenciesIn = new HashMap<String, Set<String>>();
			decisions = new HashMap<Decision, List<Rule>>();
			issues = new HashMap<String, List<Issue>>();
			ProcessBuilder processBuilder = new ProcessBuilder();
			processBuilder.command("cmd.exe", "/c",
					"git remote get-url origin && git rev-parse HEAD && git log -1 --pretty=format:%ae%n%aI");

			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			output = new String[4];
			int index = 0;
			while ((line = reader.readLine()) != null) {
				output[index] = line;
				index++;
			}
			process.waitFor();
			
			output[0] = urlRepo;
			output[1] = "9296841fa002a05283878c617cf62ddb178a7e7e";
			output[2] = "njhurtado@gmail.com";
			output[3] = urlRepo;

			service = new IssueService();
			String token = System.getenv("ARCHID_TOKEN");
			service.getClient().setOAuth2Token(token);
			UserService userService = new UserService();
			GitHub github = GitHub.connectUsingOAuth(token);
			GHUserSearchBuilder searchUser = github.searchUsers();
			searchUser.q(output[2]);
			searchUser.in("email");
			List<GHUser> results = searchUser.list().asList();
			if (!results.isEmpty())
				author = userService.getUser(results.get(0).getLogin());
			String url = output[0];
			String org = url.split("/")[3];
			String repoName = url.split("/")[4];
			if (repoName.endsWith(".git"))
				repoName = repoName.substring(0, repoName.indexOf("."));
			repo = new RepositoryId(org, repoName);
			HashMap<String, String> options = new HashMap<String, String>();
			options.put("state", "all");
			issuesGithub = service.getIssues(repo, options);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void execute() {
		if (EPLHandler.args.get(0).equals("--gh") || EPLHandler.args.get(0).equals("--full")) {
			String commit = output[1];
			for (org.eclipse.egit.github.core.Issue i : issuesGithub) {
				if (i.getState().equals("open")) {
					List<Label> previousLabels = i.getLabels();
					boolean found = false;
					for (int j = 0; j < previousLabels.size() && !found; j++) {
						if (previousLabels.get(j).getName().equals(commit.substring(0, 7)))
							found = true;
					}
					if (!found) {
						i.setState("closed");
						try {
							service.editIssue(repo, i);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		if (EPLHandler.args.get(0).equals("--db") || EPLHandler.args.get(0).equals("--full")) {
			try {
				String link = GithubHandler.output[0];
				String repoName = link.split("/")[4];
				if (repoName.endsWith(".git"))
					repoName = repoName.substring(0, repoName.indexOf("."));
				URL url = new URL("http://archtoringbd.herokuapp.com/history/" + repoName);
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.setRequestMethod("PUT");
				con.setDoOutput(true);
				con.setRequestProperty("Content-Type", "application/json");
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put("commitId", GithubHandler.output[1]);
				map.put("date", GithubHandler.output[3]);
				map.put("repo", link);
				map.put("issues", issuesCount);
				HashMap<String, HashMap<String, Object>> map2 = new HashMap<String, HashMap<String, Object>>();
				map2.put("data", map);
				String query = new Gson().toJson(map2);
				con.setRequestProperty("Content-Length", Integer.toString(query.length()));
				DataOutputStream out = new DataOutputStream(con.getOutputStream());
				out.writeBytes(query);
				out.flush();
				out.close();

				con.setConnectTimeout(5000);
				con.setReadTimeout(5000);

				int status = con.getResponseCode();
				System.out.println(status);

				ArrayList<HashMap<String, Object>> files = new ArrayList<HashMap<String, Object>>();
				for (int i = 0; i < fileIssuesCount.size(); i++) {
					HashMap<String, Object> x = new HashMap<String, Object>();
					x.put("name", fileIssuesCount.keySet().toArray()[i]);
					x.put("issues", fileIssuesCount.values().toArray()[i]);
					files.add(x);
				}

				for (Entry<String, Set<String>> ee : dependencies.entrySet()) {
					HashMap<String, Object> x = new HashMap<String, Object>();
					String key = ee.getKey();
					Set<String> values = ee.getValue();
					HashMap<String, Object> current = exists(files, key);
					if (current == null) {
						x.put("name", key);
						x.put("dependenciesOut", values.toArray());
						files.add(x);
					} else {
						files.remove(current);
						current.put("dependenciesOut", values.toArray());
						files.add(current);
					}
				}

				for (Entry<String, Set<String>> ee : dependenciesIn.entrySet()) {
					HashMap<String, Object> x = new HashMap<String, Object>();
					String key = ee.getKey();
					Set<String> values = ee.getValue();
					HashMap<String, Object> current = exists(files, key);
					if (current == null) {
						x.put("name", key);
						x.put("dependenciesIn", values.toArray());
						files.add(x);
					} else {
						files.remove(current);
						current.put("dependenciesIn", values.toArray());
						files.add(current);
					}
				}

				for (Entry<String, List<Issue>> ee : issues.entrySet()) {
					HashMap<String, Object> x = new HashMap<String, Object>();
					String key = ee.getKey();
					List<Issue> values = ee.getValue();
					HashMap<String, Object> current = exists(files, key);
					if (current == null) {
						x.put("name", key);
						x.put("issuesDetail", values);
						files.add(x);
					} else {
						files.remove(current);
						current.put("issuesDetail", values);
						files.add(current);
					}
				}

				URL url2 = new URL("http://archtoringbd.herokuapp.com/files/" + repoName);
				HttpURLConnection con2 = (HttpURLConnection) url2.openConnection();
				con2.setRequestMethod("PUT");
				con2.setDoOutput(true);
				con2.setRequestProperty("Content-Type", "application/json");
				HashMap<String, Object> map3 = new HashMap<String, Object>();
				map3.put("commitId", GithubHandler.output[1]);
				map3.put("date", GithubHandler.output[3]);
				map3.put("repo", link);
				map3.put("files", files);
				HashMap<String, HashMap<String, Object>> map4 = new HashMap<String, HashMap<String, Object>>();
				map4.put("data", map3);
				String query2 = new Gson().toJson(map4);
				con2.setRequestProperty("Content-Length", Integer.toString(query2.length()));
				DataOutputStream out2 = new DataOutputStream(con2.getOutputStream());
				out2.writeBytes(query2);
				out2.flush();
				out2.close();

				con2.setConnectTimeout(5000);
				con2.setReadTimeout(5000);

				status = con2.getResponseCode();
				System.out.println(status);

				ArrayList<HashMap<String, Object>> cat = new ArrayList<HashMap<String, Object>>();
				for (int i = 0; i < decisions.size(); i++) {
					HashMap<String, Object> x = new HashMap<String, Object>();
					x.put("title", ((Decision) decisions.keySet().toArray()[i]).getTitle());
					x.put("qa", ((Decision) decisions.keySet().toArray()[i]).getQa());
					x.put("rules", decisions.values().toArray()[i]);
					cat.add(x);
				}

				URL uc = new URL("http://archtoringbd.herokuapp.com/categorization/" + repoName);
				HttpURLConnection cc = (HttpURLConnection) uc.openConnection();
				cc.setRequestMethod("PUT");
				cc.setDoOutput(true);
				cc.setRequestProperty("Content-Type", "application/json");
				String queryc = new Gson().toJson(cat);
				cc.setRequestProperty("Content-Length", Integer.toString(queryc.length()));
				DataOutputStream outc = new DataOutputStream(cc.getOutputStream());
				outc.writeBytes(queryc);
				outc.flush();
				outc.close();

				cc.setConnectTimeout(5000);
				cc.setReadTimeout(5000);

				status = cc.getResponseCode();
				System.out.println(status);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private HashMap<String, Object> exists(ArrayList<HashMap<String, Object>> list, String name) {
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> current = list.get(i);
			if (current.containsValue(name))
				return current;
		}
		return null;

	}

}
