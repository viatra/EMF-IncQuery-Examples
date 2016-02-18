package org.jnect.demo.query.app;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.ide.IDE;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(400, 300));
		//configurer.setShowMenuBar(false);
		configurer.setShowCoolBar(true);
		configurer.setShowStatusLine(false);
		configurer.setTitle("Jnect/IncQuery RCP Demo Application");
	}
	
	
	@Override
	public void postWindowOpen() {
		// open the GEF editor programmatically
		
		File fileToOpen = new File("test.humanbodymodel");
		IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		page.closeAllEditors(false);
		try {
			IDE.openEditorOnFileStore(page, fileStore);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		
		File fileToOpen3d = new File("test.humanbodymodel3d");
		IFileStore fileStore3d = EFS.getLocalFileSystem().getStore(fileToOpen3d.toURI());
		try {
			IDE.openEditorOnFileStore(page, fileStore3d);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
	
}
