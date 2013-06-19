package hu.bme.mit.incquery.examples.bpmn2.ttc2013.transformation;

import java.util.Set;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.examples.bpmn.ttc2013.simulator.FairRandomConflictResolver;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.evm.api.EventDrivenVM;
import org.eclipse.incquery.runtime.evm.api.ExecutionSchema;
import org.eclipse.incquery.runtime.evm.api.RuleSpecification;
import org.eclipse.incquery.runtime.evm.specific.Schedulers;
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryEventRealm;
import org.eclipse.incquery.runtime.evm.specific.scheduler.UpdateCompleteBasedScheduler.UpdateCompleteBasedSchedulerFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

public class BPMNExecutorTransformation {

    public void execute(ResourceSet model) {
    	// TODO runtime modell összerakása
    	try {
			IncQueryEngine engine = IncQueryEngine.on(model);
			UpdateCompleteBasedSchedulerFactory scheduling = Schedulers.getIQEngineSchedulerFactory(engine);
			Set<RuleSpecification<?>> rules = null; // TODO add rules
			ExecutionSchema execSchema = EventDrivenVM.createExecutionSchema(IncQueryEventRealm.create(engine), scheduling);
			execSchema.setConflictResolver(new FairRandomConflictResolver());
			for (RuleSpecification<?> rule : rules) {
				execSchema.addRule(rule);
			}
			execSchema.
			execSchema.dispose();
			
			
		} catch (IncQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	

    }
}
