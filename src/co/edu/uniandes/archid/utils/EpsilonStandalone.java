/*****************************************************************************
 Copyright (c) 2008 The University of York.
 This program and the accompanying materials
 are made available under the terms of the Eclipse Public License 2.0
 which is available at https://www.eclipse.org/legal/epl-2.0/

 Contributors:
 Dimitrios Kolovos - initial API and implementation
 */
package co.edu.uniandes.archid.utils;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.osgi.framework.Bundle;

public abstract class EpsilonStandalone {

	public static final String MODISCO_JAVA_METAMODEL_URI = "http://www.eclipse.org/MoDisco/Java/0.2.incubation/java";
	public static final String RULES_METAMODEL_URI = "https://www.uniandes.edu.co/archtoring";

	private String source;
	private List<IModel> models;

	protected IEolModule module;
	protected List<Variable> parameters = new ArrayList<Variable>();

	protected Object result;

	public abstract IEolModule createModule();

	public void setSource(String source) {
		this.source = source;
	}

	public void setModels(List<IModel> models) {
		this.models = models;
	}

	public void postProcess() {
	}

	public void preProcess() {
	}

	public void execute(boolean sourceBundled) throws Exception {

		module = createModule();
		if (sourceBundled)
			module.parse(getFileURI(source));
		else
			module.parse(URI.create(source));

		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return;
		}

		for (IModel model : models) {
			module.getContext().getModelRepository().addModel(model);
		}

		for (Variable parameter : parameters) {
			module.getContext().getFrameStack().put(parameter);
		}

		preProcess();
		module.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
		result = execute(module);
		postProcess();
		module.getContext().getModelRepository().dispose();
	}

	public List<Variable> getParameters() {
		return parameters;
	}

	protected Object execute(IEolModule module) throws EolRuntimeException {
		return module.execute();
	}

	public static EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException, IOException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, getFileURI(metamodel));
		if(model.endsWith(".model")) {
			//Si se trata del modelo generado se carga desde el archivo, de lo contrario se carga de los archivos incluidos en el plugin
			properties.put(EmfModel.PROPERTY_MODEL_URI, getURIFromFile(model));
		} else {
			properties.put(EmfModel.PROPERTY_MODEL_URI, getFileURI(model));
		}
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

	public static EmfModel createEmfModelByURI(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException, IOException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, URI.create(model.replaceAll(" ","%20")));
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

	private static URI getFileURI(String fileName) throws URISyntaxException, IOException {
		System.out.println("Archivo -> " + fileName);
		Bundle bundle = Platform.getBundle("co.edu.uniandes.archid");
		if(FileLocator.find(bundle, new Path(fileName), null) != null) {
			return FileLocator.find(bundle, new Path(fileName), null).toURI();
		} 
		return null;
	}
	
	private static URI getURIFromFile(String fileName) throws URISyntaxException, IOException {
		System.out.println("Archivo -> " + fileName);
		File f = new File(fileName);
		if(f != null) {
			return f.toURI();
		} 
		return null;
	}
}