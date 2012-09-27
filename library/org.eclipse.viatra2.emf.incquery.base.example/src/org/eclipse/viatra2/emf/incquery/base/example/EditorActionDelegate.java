package org.eclipse.viatra2.emf.incquery.base.example;

import library.Library;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class EditorActionDelegate extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			IEditorPart currentEditor = HandlerUtil.getActiveEditor(event);
			
			if (currentEditor != null && currentEditor instanceof IEditingDomainProvider) {
				IEditingDomainProvider providerEditor = (IEditingDomainProvider) currentEditor;
				ResourceSet resourceSet = providerEditor.getEditingDomain().getResourceSet();
				
				if (resourceSet != null) {
					// loading library instance model under Test project's model folder
					Resource res = resourceSet.getResource(URI.createURI("platform:/resource/Test/model/lib.library"), true);
					Library lib = (Library) res.getContents().get(0);
	
					TestModule1 m1 = new TestModule1(lib);
					m1.executeQueries();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
