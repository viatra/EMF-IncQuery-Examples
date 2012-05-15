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
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;

import eclassnames.EClassNamesMatch;
import eclassnames.EClassNamesMatcher;

/**
 * @author Abel Hegedus
 *
 */
public class IncQueryHeadless {

	public void execute(String modelPath) {
		
		//Loads the resource
		long start = System.nanoTime();
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(modelPath);
		Resource resource = resourceSet.getResource(fileURI, true);
		
		long resourceInit = System.nanoTime();
		IncQueryEngine.getDefaultLogger().logDebug("EMF load took: " + (resourceInit-start)/1000000 + " ms");
		 
		if(resource != null)
				{	
					try {
						//get all matches of the pattern
						long startMatching = System.nanoTime();
						
						EClassNamesMatcher matcher = EClassNamesMatcher.FACTORY.getMatcher(resource);
						
						long matcherInit = System.nanoTime();
						
						Collection<EClassNamesMatch> matches = matcher.getAllMatches();
						
						long collectedMatches = System.nanoTime();
						
						//System.out.println("Init took: " + (matcherInit-start) + " Collecting took: " + (collectedMatches-matcherInit) + " ns");
						IncQueryEngine.getDefaultLogger().logDebug("Init took: " + (matcherInit-startMatching)/1000000 + " Collecting took: " + (collectedMatches-matcherInit)/1000000 + " ms");
						
						System.gc();
						System.gc();
						System.gc();
						System.gc();
						System.gc();
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
						IncQueryEngine.getDefaultLogger().logDebug("Used memory: " + usedMemory + " bytes");
						IncQueryEngine.getDefaultLogger().logDebug("Used memory: " + (usedMemory/1024)/1024 + " megabytes");
					
						IncQueryEngine.getDefaultLogger().logDebug("Found matches:");
						for (EClassNamesMatch eClassNamesMatch : matches) {
							IncQueryEngine.getDefaultLogger().logDebug(eClassNamesMatch.prettyPrint());
						}
					
					} catch (IncQueryRuntimeException e) {
						e.printStackTrace(); 
					}
				}
	}
}
