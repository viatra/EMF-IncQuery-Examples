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
package org.jnect.core.impl;

import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ConnectionDataHandler {

	private final Logger logger = Logger.getLogger(this.getClass().getName());
	
	protected KinectDataHandler dataHandler;
	private DocumentBuilder docBuilder;
	
	public ConnectionDataHandler() {
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			this.docBuilder = docBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		}
	}
	
	public void handleSpeechInput(String input) {
		this.dataHandler.handleSpeechData(input);
	}
	
	public void handleSkeletonInput(String input) {
		try {
			Document doc = this.docBuilder.parse(new InputSource(new StringReader(input)));
			this.dataHandler.handleSkeletonData(doc);
		} catch (SAXException e) {
			logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		}
	}
}
