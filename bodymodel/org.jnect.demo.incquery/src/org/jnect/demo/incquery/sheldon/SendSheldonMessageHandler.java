package org.jnect.demo.incquery.sheldon;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
//import bodymodel.jump.JumpMatcher;

/**
 * 
 * @author istvanrath
 *
 */
public class SendSheldonMessageHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		SheldonConnectivity.getInstance().sendUDPMessage();
		return null;
	}

	
}
