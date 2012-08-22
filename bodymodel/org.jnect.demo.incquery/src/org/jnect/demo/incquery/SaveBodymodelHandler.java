package org.jnect.demo.incquery;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jnect.core.KinectManager;

/**
 * 
 * @author istvanrath
 *
 */
public class SaveBodymodelHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ResourceSet rs = new ResourceSetImpl();
		URI fileURI = URI.createPlatformResourceURI("/bodymodel.incquery/demomodel.xmi", false);
		Resource resource = rs.createResource( fileURI );
		resource.getContents().add( KinectManager.INSTANCE.getSkeletonModel() );
		try {
			resource.save(null);
		} catch (IOException e) {
			throw new ExecutionException(e.getMessage());
		}
		return null;
	}

	
}
