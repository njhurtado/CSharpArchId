package co.edu.uniandes.archid;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import co.edu.uniandes.archid.handlers.EPLHandler;
import co.edu.uniandes.archid.handlers.GithubHandler;
import co.edu.uniandes.archid.handlers.ModelHandler;

public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println(" inicia la aplicación: Application");
		Map<String, String[]> mm = context.getArguments();
		final List<String> args = Arrays.asList(mm.get(IApplicationContext.APPLICATION_ARGS));
		String path = null;
		String urlRepo = null;
		if(args != null && args.size() == 2) {
			path = args.get(1);
		}
		if(args != null && args.size() == 3) {
			path = args.get(1);
			urlRepo = args.get(2);
		}
		System.out.println("Ruta proyecto : " + path);
		
		if(path != null) {
			ModelHandler model = new ModelHandler();
			model.execute(path);
			System.out.println(" ejecuta ModelHandler");
			GithubHandler git = new GithubHandler(urlRepo);
			EPLHandler epl = new EPLHandler(args);
			epl.execute(ModelHandler.getNames());
			System.out.println(" ejecuta EPLHandler");
			git.execute();
			System.out.println(" ejecuta GithubHandler");
		} else {
			System.out.println("Debe enviar la ruta del proyecto como argumento ");
		}
		return EXIT_OK;
	}

	@Override
	public void stop() {
	}

}
