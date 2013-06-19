package hu.bme.mit.incquery.examples.bpmn2.ttc2013.transformation;

import hu.bme.mit.incquery.examples.bpmn.ttc2013.rules.Rules;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
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

    public void execute(Resource modelResource, Resource executionResource) {
    	// TODO runtime modell összerakása
    	try {
            IncQueryEngine engine = IncQueryEngine.on(modelResource.getResourceSet());
			UpdateCompleteBasedSchedulerFactory scheduling = Schedulers.getIQEngineSchedulerFactory(engine);
			ExecutionSchema execSchema = EventDrivenVM.createExecutionSchema(
					IncQueryEventRealm.create(engine), 
					scheduling, 
					Collections.<RuleSpecification<?>>emptySet());
			execSchema.setConflictResolver(new FairRandomConflictResolver());
									
			Rules ruleSet = new Rules(engine, null, null, null, 0);
			execSchema.addRule(ruleSet.createEndingRuleSpecification());
			execSchema.addRule(ruleSet.createProcessInstantiationRuleSpecification());
			execSchema.addRule(ruleSet.createStartingRuleSpecification(), true); // START now!
			execSchema.dispose();		
			
		} catch (IncQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	

    }
}
