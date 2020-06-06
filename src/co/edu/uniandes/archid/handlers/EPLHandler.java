package co.edu.uniandes.archid.handlers;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

import co.edu.uniandes.archid.utils.EolStandalone;
import co.edu.uniandes.archid.utils.EplStandalone;
import co.edu.uniandes.archid.utils.EpsilonStandalone;

public class EPLHandler {

	private static final String[] FILES_BACK = { "epl/logic.epl", "epl/entities.epl" };
	private static final String[] FILES_FRONT = { "epl/dtos.epl", "epl/detailDTOs.epl", "epl/resources.epl" };
	public static List<String> args;
	private static final String EPL_FILE = "epl/name.epl";

	
	public EPLHandler(List<String> args) {
		EPLHandler.args = args;
	}
	
	public static List<String> getArgs(){
		return args;
	}


	public void execute(String[] names) {
		EolStandalone eol = new EolStandalone();
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
		}
		
		EplStandalone epl = new EplStandalone();
		epl.setSource(EPL_FILE);
		models = new ArrayList<IModel>();
		try {
			System.out.println("Running pattern on source.");
			models.add(EpsilonStandalone.createEmfModel("Model", "E:\\models\\CSharpArchId.model",
					"epl/cSharpArchId.ecore", true, true));
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
		
	}
}
