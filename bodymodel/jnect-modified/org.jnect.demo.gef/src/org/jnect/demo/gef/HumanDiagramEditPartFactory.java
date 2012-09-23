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

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.jnect.bodymodel.Body;
import org.jnect.bodymodel.HumanLink;
import org.jnect.bodymodel.PositionedElement;

public class HumanDiagramEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;
		 
	    if(model instanceof Body) {
	      part = new HumanContainerEditPart();
	    } else if (model instanceof PositionedElement) {
	    	part = new HumanDiagramEditPart();
	    } else if (model instanceof HumanLink) {
	    	part = new HumanDiagramLinkEditPart();
	    }
	 
	    if(part != null) {
	      part.setModel(model);
	    }
	 
	    return part;
	}

}
