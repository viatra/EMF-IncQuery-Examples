/*******************************************************************************
 * Copyright (c) 2004-2011 Abel Hegedus and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Abel Hegedus - initial API and implementation
 *******************************************************************************/
package org.eclipse.viatra2.emf.incquery.application;


import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.MatcherFactoryRegistry;

/**
 * @author Abel Hegedus
 *
 */
public class IncQueryHeadless {

	/**
	 * Returns the match set for patternFQN over the model in modelPath in pretty printed form
	 * 
	 * @param modelPath
	 * @param patternFQN
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String execute(String modelPath, String patternFQN) {

		StringBuilder results = new StringBuilder();
		// Loads the resource
		long start = System.nanoTime();
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(modelPath);
		Resource resource = resourceSet.getResource(fileURI, true);

		long resourceInit = System.nanoTime();
		System.out.println("EMF load took: " + (resourceInit - start) / 1000000 + " ms");

		if (resource != null) {
			try {
				// get all matches of the pattern
				long startMatching = System.nanoTime();

				IncQueryMatcher matcher = MatcherFactoryRegistry.getMatcherFactory(patternFQN).getMatcher(resource);

				long matcherInit = System.nanoTime();

				Collection<IPatternMatch> matches = matcher.getAllMatches();

				long collectedMatches = System.nanoTime();

				System.out.println(
						"Init took: " + (matcherInit - startMatching) / 1000000 + " Collecting took: "
								+ (collectedMatches - matcherInit) / 1000000 + " ms");

				System.gc();
				System.gc();
				System.gc();
				System.gc();
				System.gc();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
				System.out.println("Used memory: " + usedMemory + " bytes");
				System.out.println("Used memory: " + (usedMemory / 1024) / 1024 + " megabytes");

				System.out.println("Found matches:");
				for (IPatternMatch match : matches) {
				  System.out.println(match.prettyPrint());
					results.append(match.prettyPrint());
				}
				
				if(matches.size() == 0) {
					results.append("Empty match set");
				}

			} catch (IncQueryException e) {
				e.printStackTrace();
				results.append(e.getMessage());
			}
		} else {
			results.append("Resource not found");
		}
		return results.toString();
	}
}
