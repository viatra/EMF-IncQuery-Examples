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

import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.jnect.bodymodel.HumanLink;
import org.jnect.bodymodel.PositionedElement;

public class HumanDiagramEditPart extends AbstractGraphicalEditPart {

	public HumanDiagramEditPart() {
		super();
	}

	@Override
	protected IFigure createFigure() {
		return new HumanPolylineConnectionAnchorFigure();
	}

	@Override
	protected void createEditPolicies() {
	}

	@Override
	protected List<HumanLink> getModelSourceConnections() {
		PositionedElement model = (PositionedElement) getModel();
		return model.getOutgoingLinks();
	}

	@Override
	protected List<HumanLink> getModelTargetConnections() {
		PositionedElement model = (PositionedElement) getModel();
		return model.getIncomingLinks();
	}

	@Override
	protected void refreshVisuals() {
		final HumanPolylineConnectionAnchorFigure figure = (HumanPolylineConnectionAnchorFigure) getFigure();
		PositionedElement model = (PositionedElement) getModel();
		final HumanContainerEditPart parent = (HumanContainerEditPart) this
				.getParent();

		figure.getLable().setText(
				model.getClass().getInterfaces()[0].getSimpleName());
		// figure.getLable().setFont(new Font(Display.getCurrent(), "Arial", 5,
		// 1));
		figure.setForegroundColor(new Color(Display.getCurrent(), model
				.getColor_r(), model.getColor_g(), model.getColor_b()));

		if (getViewer() == null || getViewer().getControl() == null)
			return;

		Point size = getViewer().getControl().getSize();
		float xRamp = (size.x - 80) / 2;
		float yRamp = (size.y - 80) / 2;
		float ramp = Math.min(xRamp, yRamp);
		float xOffset = (size.x) / 2;
		float yOffset = (size.y) / 2;

		Rectangle layout = new Rectangle(Math.round(xOffset + model.getX()
				* ramp), Math.round(yOffset - model.getY() * ramp), 40, 40);
		parent.setLayoutConstraint(this, figure, layout);
	}

	@Override
	public void setModel(Object model) {
		super.setModel(model);

		((PositionedElement) model).eAdapters().add(new Adapter() {
			@Override
			public void notifyChanged(Notification notification) {
				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {
						refreshVisuals();
						refreshSourceConnections();
						refreshTargetConnections();
					}
				});
			}

			@Override
			public Notifier getTarget() {
				return (PositionedElement) getModel();
			}

			@Override
			public void setTarget(Notifier newTarget) {
				// TODO Auto-generated method stub
			}

			@Override
			public boolean isAdapterForType(Object type) {
				// TODO Auto-generated method stub
				return false;
			}
		});
	}

	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return ((HumanPolylineConnectionAnchorFigure) getFigure())
				.getConnectionAnchor();
	}

	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		return ((HumanPolylineConnectionAnchorFigure) getFigure())
				.getConnectionAnchor();
	}

	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return ((HumanPolylineConnectionAnchorFigure) getFigure())
				.getConnectionAnchor();
	}

	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return ((HumanPolylineConnectionAnchorFigure) getFigure())
				.getConnectionAnchor();
	}

}
