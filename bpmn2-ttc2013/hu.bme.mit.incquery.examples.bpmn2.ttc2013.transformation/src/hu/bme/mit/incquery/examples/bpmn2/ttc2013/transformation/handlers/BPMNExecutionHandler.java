package hu.bme.mit.incquery.examples.bpmn2.ttc2013.transformation.handlers;

import hu.bme.mit.incquery.examples.bpmn2.ttc2013.transformation.BPMNExecutorTransformation;
import hu.bme.mit.incquery.runtime.bpmn2.BPMNModelConnector;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.incquery.runtime.api.IModelConnectorTypeEnum;
import org.eclipse.ui.handlers.HandlerUtil;


public class BPMNExecutionHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final BPMNModelConnector modelConnector = new BPMNModelConnector(HandlerUtil.getActiveEditor(event));
        final ResourceSet set = (ResourceSet) modelConnector.getNotifier(IModelConnectorTypeEnum.RESOURCESET);
        
//        Bpmn2DiagramEditorInput input = (Bpmn2DiagramEditorInput)HandlerUtil.getActiveEditor(event).getEditorInput();
//        String modelUri = input.getModelUri().toString();

        final IFile file = (IFile) HandlerUtil.getActiveEditor(event).getEditorInput().getAdapter(IFile.class);
        final String modelUri = file.getFullPath().toString();
        
		final Resource modelResource = set.getResource(URI.createPlatformResourceURI(modelUri, false), true);
        TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(set);
        Resource executionResource = 
        		editingDomain.createResource(
        				URI.createURI(modelUri.concat(".bpmn20exec"), false).toString());
        
        final BPMNExecutorTransformation transformation = new BPMNExecutorTransformation();
        transformation.execute(editingDomain, modelResource, executionResource);
        
        try {
			executionResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }

}
