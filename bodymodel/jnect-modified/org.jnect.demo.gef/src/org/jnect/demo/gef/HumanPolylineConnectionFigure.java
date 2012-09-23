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
package org.jnect.demo.gef;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.XYLayout;

public class HumanPolylineConnectionFigure extends Figure {

	private PolylineConnection connection;
	
	public HumanPolylineConnectionFigure() {
		setLayoutManager(new XYLayout());
		connection = new PolylineConnection();
		add(connection);
	}
	
	  @Override 
	 protected void paintFigure(Graphics graphics) {
	    super.paint(graphics);
	  }
	  
	public PolylineConnection getPolylineConnection() {
		return this.connection;
	}
	
	public void setSourceAnchor(ChopboxAnchor sourceAnchor) {
		this.connection.setSourceAnchor(sourceAnchor);
	}
	
	public void setTargetAnchor(ChopboxAnchor targetAnchor) {
		this.connection.setTargetAnchor(targetAnchor);
	}
	
}
