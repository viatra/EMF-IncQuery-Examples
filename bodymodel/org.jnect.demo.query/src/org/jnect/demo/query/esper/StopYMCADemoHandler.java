package org.jnect.demo.query.esper;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;


/**
 * Handler class.
 * @author istvanrath
 * 
 */
public class StopYMCADemoHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
        EsperManager.getInstance().unregisterYMCAListeners();
		return null;
	}
	
}
