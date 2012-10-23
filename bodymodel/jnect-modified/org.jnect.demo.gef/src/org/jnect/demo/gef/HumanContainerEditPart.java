/*******************************************************************************
 * Copyright (c) 2012 jnect.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 *******************************************************************************/
package org.jnect.demo.gef;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.widgets.Display;
import org.jnect.bodymodel.Body;
import org.jnect.core.IKinectFrameListener;
import org.jnect.core.KinectManager;

public class HumanContainerEditPart extends AbstractGraphicalEditPart implements IKinectFrameListener {
	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setLayoutManager(new FreeformLayout());
		layer.setBorder(new LineBorder(1));
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}

	@Override
	protected List<EObject> getModelChildren() {
		// List<PositionedElement> retVal = new ArrayList<PositionedElement>();
		Body opd = (Body) getModel();
		ArrayList<EObject> ret = new ArrayList<EObject>();
		ret.add(opd.getHead());
		ret.add(opd.getCenterShoulder());
		ret.add(opd.getCenterHip());
		ret.add(opd.getSpine());

		ret.add(opd.getLeftAnkle());
		ret.add(opd.getLeftElbow());
		ret.add(opd.getLeftFoot());
		ret.add(opd.getLeftHand());
		ret.add(opd.getLeftHip());
		ret.add(opd.getLeftKnee());
		ret.add(opd.getLeftShoulder());
		ret.add(opd.getLeftWrist());

		ret.add(opd.getRightAnkle());
		ret.add(opd.getRightElbow());
		ret.add(opd.getRightFoot());
		ret.add(opd.getRightHand());
		ret.add(opd.getRightHip());
		ret.add(opd.getRightKnee());
		ret.add(opd.getRightShoulder());
		ret.add(opd.getRightWrist());

		// return opd.eContents();
		return ret;
	}
	
	@Override
	public void setModel(Object model) {
		super.setModel(model);
    	// register this as a kinect update listener
    	KinectManager.INSTANCE.addKinectFrameListener(this);
	}

	@Override
	public void kinectReveivedFrame() {
		// update entire editpart hierarchy
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				for (Object o : getChildren()) {
					((EditPart) o).refresh();
				}

			}

		});
	}


	
	@Override
	public void deactivate() {
		KinectManager.INSTANCE.removeKinectFrameListener(this);
		super.deactivate();
	}

}