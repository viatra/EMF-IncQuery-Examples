package org.jnect.demo.incquery.esper;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.jnect.demo.incquery.esper.events.EventType;
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
			samplingTestComplex();
			// samplingTest();
			// ymcaTest();
			// iqTest();
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
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.LOST));

		Thread.sleep(1000l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.LOST));

		Thread.sleep(700l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.LOST));

		Thread.sleep(400l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.LOST));
	}

	/**
	 * Another test-case for the sampling processing mode.
	 * 
	 * @throws InterruptedException
	 */
	private void samplingTestComplex() throws InterruptedException {
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.LOST));

		Thread.sleep(1000l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.LOST));

		Thread.sleep(700l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.LOST));

		Thread.sleep(400l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.LOST));

		Thread.sleep(3000l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", EventType.LOST));

		Thread.sleep(700l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", EventType.LOST));

		Thread.sleep(400l);

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", EventType.LOST));

	}

	/**
	 * Test-case for the "YMCA" pattern.
	 * 
	 * @throws InterruptedException
	 */
	private void ymcaTest() throws InterruptedException {
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Y", EventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "M", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "M", EventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "C", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "C", EventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "A", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "A", EventType.LOST));
	}

	/**
	 * Test-case for the "IQ" pattern.
	 * 
	 * @throws InterruptedException
	 */
	private void iqTest() throws InterruptedException {
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "I", EventType.LOST));

		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", EventType.NEW));
		EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "Q", EventType.LOST));
	}
}
