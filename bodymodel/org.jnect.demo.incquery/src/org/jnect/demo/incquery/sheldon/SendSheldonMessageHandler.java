package org.jnect.demo.incquery.sheldon;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import org.jnect.core.KinectManager;

//import bodymodel.jump.JumpMatcher;
import bodymodel.righthandabovehead.RightHandAboveHeadMatch;
import bodymodel.righthandabovehead.RightHandAboveHeadMatcher;

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
