package co.edu.uniandes.archid.utils;

import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.epl.EplModule;

public class EplStandalone extends EpsilonStandalone {

	@Override
	public IEolModule createModule() {
		return new EplModule();
	}
}
