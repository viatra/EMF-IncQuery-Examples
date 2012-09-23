package org.jnect.demo.incquery;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.jnect.bodymodel.Body;
import org.jnect.core.KinectManager;

/**
 * 
 * @author istvanrath
 * 
 */
public class LoadBodymodelHandler extends AbstractHandler {

	static int serialNo = 0;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ResourceSelectionDialog rsd = new ResourceSelectionDialog(PlatformUI
				.getWorkbench().getActiveWorkbenchWindow().getShell(),
				ResourcesPlugin.getWorkspace().getRoot(),
				"Select body model snapshot to load");
		if (Window.OK == rsd.open()) {
			for (Object o : rsd.getResult()) {
				if (o instanceof IFile) {
					IFile f = (IFile) o;
					URI fileURI = URI.createURI(f.getFullPath()
							.toOSString(), false);
					ResourceSet rs = new ResourceSetImpl();
					Resource resource = rs.getResource(fileURI, true);
					try {
						resource.load(null);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (resource.getContents().size() > 0) {
						EObject root = resource.getContents().get(0);
						if (root instanceof Body) {
							KinectManager.INSTANCE
									.setSkeletonModel((Body) root);
							System.out.println("Body model successfully loaded: "+fileURI);
						}
					}
				}
			}
		}
		return null;
	}
}
