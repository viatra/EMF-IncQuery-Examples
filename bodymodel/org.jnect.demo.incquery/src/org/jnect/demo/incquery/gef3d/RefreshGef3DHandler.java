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
package org.jnect.demo.incquery.gef3d;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PlatformUI;


public class RefreshGef3DHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Jnect3DEditor editor = ((Jnect3DEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor());
		if (editor!=null) {
			editor.initializeGraphicalViewer();
		}
		return null;
	}

}
