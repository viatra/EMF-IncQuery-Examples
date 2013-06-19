package hu.bme.mit.incquery.examples.bpmn2.ttc2013.transformation.handlers;

import hu.bme.mit.incquery.examples.bpmn2.ttc2013.transformation.BPMNExecutorTransformation;
import hu.bme.mit.incquery.runtime.bpmn2.BPMNModelConnector;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.runtime.api.IModelConnectorTypeEnum;
import org.eclipse.ui.handlers.HandlerUtil;


public class BPMNExecutionHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final BPMNModelConnector modelConnector = new BPMNModelConnector(HandlerUtil.getActiveEditor(event));
        final Notifier notifier = modelConnector.getNotifier(IModelConnectorTypeEnum.RESOURCESET);

        final BPMNExecutorTransformation transformation = new BPMNExecutorTransformation();
        transformation.execute((ResourceSet) notifier);

        return null;
    }

}
