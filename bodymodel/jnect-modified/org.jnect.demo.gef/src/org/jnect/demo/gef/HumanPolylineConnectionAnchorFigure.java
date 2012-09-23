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
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class HumanPolylineConnectionAnchorFigure extends Figure{

	public Label label;
	private ConnectionAnchor connectionAnchor;
	
	
	public HumanPolylineConnectionAnchorFigure() {
		setLayoutManager(new XYLayout());
		label = new Label();
		LineBorder borderL1 = new LineBorder();
		label.setBorder(borderL1);
		add(label);
	}
	
	public Label getLable() {
		return this.label;
	}
	
	  @Override 
	 protected void paintFigure(Graphics graphics) {
		  Rectangle r = getBounds().getCopy();
		  setConstraint(label, new Rectangle(0, 0, r.width, r.height));
		  label.invalidate();
	  }
	  
	  public ConnectionAnchor getConnectionAnchor() {
		  if (connectionAnchor == null) {
			  connectionAnchor = new ChopboxAnchor(this);
		  }
		  return connectionAnchor;
	  }
}
