package co.edu.uniandes.archid.csharp.handler;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

import co.edu.uniandes.archid.csharp.util.EolStandalone;
import co.edu.uniandes.archid.csharp.util.EplStandalone;
import co.edu.uniandes.archid.csharp.util.EpsilonStandalone;


public class EPLHandler {

	private static final String[] FILES_BACK = { "epl/name.epl" };
	private static final String[] FILES_FRONT = { "epl/dtos.epl", "epl/detailDTOs.epl", "epl/resources.epl" };
	public static List<String> args;

	
	public EPLHandler(List<String> args) {
		EPLHandler.args = args;
	}
	
	public static List<String> getArgs(){
		return args;
	}


	public void execute(String[] names) {
		/*EolStandalone eol = new EolStandalone();
		eol.setSource("epl/categorization.eol");
		List<IModel> models = new ArrayList<IModel>();
		try {
			System.out.println("Getting categorization.");
			models.add(EpsilonStandalone.createEmfModel("rulesModel", "epl/ReferenceArchitecture.xmi",
					"epl/rules.ecore", true, true));
			eol.setModels(models);
			eol.execute(true);
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		for (String eplFile : FILES_BACK) {
			EplStandalone epl = new EplStandalone();
			epl.setSource(eplFile);
			List<IModel>  models = new ArrayList<IModel>();
			try {
				System.out.println("Running pattern on back.");
				/*models.add(EpsilonStandalone.createEmfModelByURI(
						"csharpModel", "file://" + System.getProperty("user.dir").replace("\\", "/") + "/" + names[0]
								+ "/" + names[0] + "_java.xmi",
						EpsilonStandalone.CSHARP_METAMODEL_URI, true, true));
				models.add(EpsilonStandalone.createEmfModel("rulesModel", "epl/ReferenceArchitecture.xmi",
						"epl/rules.ecore", true, true));*/
				models.add(EpsilonStandalone.createEmfModelByURI(
						"csharpModel", "./CSharpArchId.model",
						EpsilonStandalone.CSHARP_METAMODEL_URI, true, true));
				epl.setModels(models);
				epl.execute(true);
			} catch (EolModelLoadingException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/*for (String eplFile : FILES_FRONT) {
			EplStandalone epl = new EplStandalone();
			epl.setSource(eplFile);
			models = new ArrayList<IModel>();
			try {
				System.out.println("Running pattern on front.");
				models.add(EpsilonStandalone.createEmfModelByURI(
						"javaModel", "file:///" + System.getProperty("user.dir").replace("\\", "/") + "/" + names[1]
								+ "/" + names[1] + "_java.xmi",
						EpsilonStandalone.MODISCO_JAVA_METAMODEL_URI, true, true));
				models.add(EpsilonStandalone.createEmfModel("rulesModel", "epl/ReferenceArchitecture.xmi",
						"epl/rules.ecore", true, true));
				epl.setModels(models);
				epl.execute(true);
			} catch (EolModelLoadingException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
	}
}
