package co.edu.uniandes.archid.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import co.edu.uniandes.archid.csharp.antlr.CSharpLexer;
import co.edu.uniandes.archid.csharp.antlr.CSharpParser;
import co.edu.uniandes.archid.csharp.antlr.CSharpParserAdvancedVisitor;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdFactory;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Model;
import co.edu.uniandes.archid.csharp.test.GeneratorTest;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelHandler {

	public static String backName;
	public static String frontName;
	public static String projectName;
	
	private static final int FLUSH_LIMIT_SHIFT = 16;
	private static final Integer FLUSH_LIMIT = Integer.valueOf(1 << FLUSH_LIMIT_SHIFT);

	public static String[] getNames() {
		String[] names = { backName, frontName };
		return names;
	}

	public void execute(String path) {

		try {
			
			System.out.println("Discovering projects");
			
			String projectName = returnProyectName(path);
			
			path = path + "/src";
			
			//String path = "./rsc/ApplicationCore/";
			CSharpArchIdFactory factory = CSharpArchIdFactory.eINSTANCE;
			Model model = factory.createModel();
			model.setName("CSharpModel");
			processFiles(path, model, projectName);
			
			System.out.println("projectName ->" + projectName);
			
			System.out.println(" modelo -> " + model);
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	        Map<String, Object> m = reg.getExtensionToFactoryMap();
	        m.put("model", new XMIResourceFactoryImpl());
	        //m.put("xmi", new XMIResourceFactoryImpl());
	        
	        // Obtain a new resource set
	        ResourceSet resSet = new ResourceSetImpl();

	        // create a resource
	        Resource resource = resSet.createResource(URI
	                .createFileURI("E:\\models\\CSharpArchId.model"));
	        // Get the first model element and cast it to the right type, in my
	        // example everything is hierarchical included in this first node
	        
	        Map<String, Object> options = new HashMap<String, Object>();
			options.put(XMLResource.OPTION_FLUSH_THRESHOLD, FLUSH_LIMIT);
			options.put(XMLResource.OPTION_USE_FILE_BUFFER, Boolean.TRUE);
			options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
	        
	        resource.getContents().add(model);
	        resource.save(options);
	        
	        System.out.println(" Se guardo el modelo -> " + resource.getURI());
		} catch (IOException e) {
			System.out.println("Editing error.");
			e.printStackTrace();
		} 
		//GeneratorTest.pruebaVisitor(path);
	}
	
	private void processFiles(String path, Model model, String projectName) {
		File root = new File( path );
        File[] list = root.listFiles();
        if (list == null) return;
        for ( File f : list ) {
            if ( f.isDirectory() ) {
            	processFiles(f.getAbsolutePath(), model, projectName);
                System.out.println( "Dir:" + f.getAbsoluteFile() );
            }else {
            	if(f.getName().endsWith(".cs")) {
            		//solo procesa archivos con extensiion .cs
	                System.out.println( "File:" + f.getAbsoluteFile() );
	                procesFile(f, model, projectName);
            	}
            }
        }
	}
	
	private void procesFile(File f, Model model, String projectName) {
		InputStream in = null;
		try {
			in = new FileInputStream(f);
			final CSharpLexer lexer = new CSharpLexer(CharStreams.fromStream(in, StandardCharsets.UTF_8));
			CSharpParser parser = new CSharpParser(new CommonTokenStream(lexer));
			System.out.println(" parser -> " + parser.toString());
			ParseTree tree = parser.compilation_unit();
			final CSharpParserAdvancedVisitor<?> visitor =
					new CSharpParserAdvancedVisitor<String>(model, f.getName(), f.getPath(), projectName);
			visitor.visit(tree);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private String returnProyectName(String path) {
		if(path.indexOf("/") > 0) {
			return path.substring(path.lastIndexOf("/") + 1);
		} else if(path.indexOf("\\") > 0)  {
			return path.substring(path.lastIndexOf("\\") + 1);
		}
		return null;
	}
	
}
