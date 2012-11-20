package hu.bme.mit.examples.uml.incquery.databinding.demo.handlers;

import hu.bme.mit.examples.uml.incquery.databinding.demo.ClassView;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;

public class LoadUMLModelHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        try {
            IWorkbenchPage page = HandlerUtil.getActiveSite(event).getPage();
            ClassView view = (ClassView) page.findView(ClassView.ID);
            if (view == null) {
                view = (ClassView) page.showView(ClassView.ID);
            }

            PapyrusMultiDiagramEditor providerEditor = (PapyrusMultiDiagramEditor) HandlerUtil.getActiveEditor(event);
            ResourceSet resourceSet = providerEditor.getDiagramEditPart().getEditingDomain().getResourceSet();
            view.loadModel(resourceSet);
            return null;
        } catch (PartInitException e) {
            throw new ExecutionException("Cannot find view", e);
        } catch (IncQueryException e) {
            throw new ExecutionException("Error initializing Pattern Matcher", e);
        }
    }

}
