package co.edu.uniandes.archid.csharp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import co.edu.uniandes.archid.csharp.antlr.CSharpLexer;
import co.edu.uniandes.archid.csharp.antlr.CSharpParser;
import co.edu.uniandes.archid.csharp.antlr.CSharpParserAdvancedVisitor;
import co.edu.uniandes.archid.csharp.antlr.CSharpParserBaseVisitor;
import co.edu.uniandes.archid.csharp.antlr.CSharpParserVisitor;
import co.edu.uniandes.archid.csharp.handler.EPLHandler;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdFactory;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CSharpArchIdPackage;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.ClassDeclaration;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.CompileUnit;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.Model;
import co.edu.uniandes.archid.csharp.model.cSharpArchId.impl.CSharpArchIdPackageImpl;

public class GeneratorTest {

	private static final int FLUSH_LIMIT_SHIFT = 16;
	private static final Integer FLUSH_LIMIT = Integer.valueOf(1 << FLUSH_LIMIT_SHIFT);
	private static final String USER_DIR = "./rsc/csharp/";
	public static void main(String[] args) {
		pruebaVisitor(null);
	}

	public static void pruebaVisitor(String path) {
		//File f = new File("./rsc/parser_oracles/lcs.cs");
		//File f = new File("./rsc/design_patterns/abstract_factory.cs");
		//String path = "./rsc/parser_oracles/";
		//String path = "./rsc/design_patterns/";
		//String path = "./rsc/Infrastructure/";
		//String path = "./rsc/ApplicationCore/Services";
		//String path = "./rsc/ApplicationCore/";
		//String path = "./rsc/eShopOnWeb-master/src";
		//String path = "./rsc/Web/";
		//String path = "./rsc/prueba/";
		//File f = new File("./rsc/parser_oracles/drawdemo.cs");
		//InputStream in;
		try {
			/*in = new FileInputStream(f);
			final CSharpLexer lexer = new CSharpLexer(CharStreams.fromStream(in, StandardCharsets.UTF_8));
			
	        // create an instance of myWeb
			CSharpParser parser = new CSharpParser(new CommonTokenStream(lexer));
				
			System.out.println(" parser -> " + parser.toString());
			ParseTree tree = parser.compilation_unit();*/
			
			CSharpArchIdFactory factory = CSharpArchIdFactory.eINSTANCE;
			Model model = factory.createModel();
			model.setName("CSharpModel");
			processFiles(path, model, "eShopOnWeb-master");
			
			System.out.println(" modelo -> " + model);
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	        Map<String, Object> m = reg.getExtensionToFactoryMap();
	        m.put("model", new XMIResourceFactoryImpl());

	        // Obtain a new resource set
	        ResourceSet resSet = new ResourceSetImpl();

	        // create a resource
	        Resource resource = resSet.createResource(URI
	                .createURI("CSharpArchId.model"));
	        // Get the first model element and cast it to the right type, in my
	        // example everything is hierarchical included in this first node
	        resource.getContents().add(model);
	        resource.save(Collections.EMPTY_MAP);
	        
	        EPLHandler handler = new EPLHandler(null);
	        //handler.execute(null);
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void processFiles(String path, Model model, String projectName) {
		File root = new File( path );
        File[] list = root.listFiles();
        if (list == null) return;
        for ( File f : list ) {
            if ( f.isDirectory() ) {
            	processFiles(f.getAbsolutePath(), model, projectName );
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
	
	private static void procesFile(File f, Model model, String projectName) {
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
	
	private static void generModeloDePrueba() {
		// TODO Auto-generated method stub		
		CSharpArchIdPackageImpl.init();
        // Retrieve the default factory singleton
		CSharpArchIdFactory factory = CSharpArchIdFactory.eINSTANCE;
        // create an instance of myWeb
		Model modelo = factory.createModel();
		modelo.setName("Prueba");        
        // create a page
		CompileUnit cu = factory.createCompileUnit();
		cu.setName("archivo.cs");
		ClassDeclaration  clase = factory.createClassDeclaration();
		//clase.setName("Sumar");
		//cu.getTypeDeclaration().add(clase);
        modelo.getCompileUnits().add(cu);
        
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("model", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(URI
                .createURI("CSharpArchId.model"));
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(modelo);

        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
        // and so on, and so on
        // as you can see the EMF model can be (more or less) used as standard Java
	}
}
