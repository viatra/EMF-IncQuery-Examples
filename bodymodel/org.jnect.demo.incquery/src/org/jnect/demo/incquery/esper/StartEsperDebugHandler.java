package org.jnect.demo.incquery.esper;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.jnect.demo.incquery.esper.events.PatternMatchEventType;
import org.jnect.demo.incquery.esper.events.PatternMatchEvent;

/**
 * Esper debugging handler to aid Esper debugging without IncQuery.
 * 
 * @author istvanrath
 * 
 */
@SuppressWarnings("unused")
public class StartEsperDebugHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
		    
		    Thread t = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        samplingTestComplex();
                        // samplingTest();
                        // ymcaTest();
                        // iqTest();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                   
                }
		        
		    }, "Esper Debug");
		    t.start();
			
		} catch (Exception e) {
			throw new ExecutionException(e.getLocalizedMessage(), e);
		}

		return null;
	}

	/**
	 * Test-case for the sampling processing mode.
	 * 
	 * @throws InterruptedException
	 */
	private void samplingTest() throws InterruptedException {
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.LOST));

		Thread.sleep(1000l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.LOST));

		Thread.sleep(700l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.LOST));

		Thread.sleep(400l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.LOST));
	}

	/**
	 * Another test-case for the sampling processing mode.
	 * 
	 * @throws InterruptedException
	 */
	private void samplingTestComplex() throws InterruptedException {
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.LOST));

		Thread.sleep(1000l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.LOST));

		Thread.sleep(700l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.LOST));

		Thread.sleep(400l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.LOST));

		Thread.sleep(5500l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", PatternMatchEventType.LOST));

		Thread.sleep(700l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", PatternMatchEventType.LOST));

		Thread.sleep(400l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", PatternMatchEventType.LOST));

	}

	/**
	 * Test-case for the "YMCA" pattern.
	 * 
	 * @throws InterruptedException
	 */
	private void ymcaTest() throws InterruptedException {
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", PatternMatchEventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "M", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "M", PatternMatchEventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "C", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "C", PatternMatchEventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "A", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "A", PatternMatchEventType.LOST));
	}

	/**
	 * Test-case for the "IQ" pattern.
	 * 
	 * @throws InterruptedException
	 */
	private void iqTest() throws InterruptedException {
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", PatternMatchEventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", PatternMatchEventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", PatternMatchEventType.LOST));
	}
}
