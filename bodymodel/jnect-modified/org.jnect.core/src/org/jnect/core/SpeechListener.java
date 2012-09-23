/*******************************************************************************
 * Copyright (c) 2012 jnect.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eugen Neufeld - initial API and implementation
 *******************************************************************************/
package org.jnect.core;

import java.util.Set;

/**
 * An abstract implementation of a SpeechListener. A {@link SpeechListener} can
 * be register at the {@link KinectManager}. It will be notified about
 * recognized texts.
 * 
 * @author Eugen Neufeld
 * 
 */
public abstract class SpeechListener {
	/**
	 * callback when a relevant speech is recognized
	 * 
	 * @param speech
	 *            - the speech recognized
	 */
	public abstract void notifySpeech(String speech);

	/**
	 * a set of words that this {@link SpeechListener} wants to be recognized
	 * and notified about
	 * 
	 * @return a {@link Set} of {@link String}s building the relevant words
	 */
	public abstract Set<String> getWords();

	/**
	 * if a {@link SpeechListener} is filtered than it will be only notified
	 * about recognized words that are contained in the {@link Set} provided by
	 * {@link #getWords()}
	 * 
	 * @return true if should be filtered, false otherwise
	 */
	public boolean isFiltered() {
		return true;
	}
}
