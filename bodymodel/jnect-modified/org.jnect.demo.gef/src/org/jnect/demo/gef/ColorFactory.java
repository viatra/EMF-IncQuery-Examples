/*******************************************************************************
 * Copyright (c) 2010-2011, Istvan Rath and Zoltan Ujhelyi
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Istvan Rath - initial API and implementation
 *******************************************************************************/

package org.jnect.demo.gef;

import java.util.HashMap;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * A factory class for creating colors.
 * @author Istvan Rath
 *
 */
public class ColorFactory 
{

	private static ColorFactory instance = new ColorFactory();
	
	/**
	 * Returns the singleton class for storing colors
	 * @return the singleton factory
	 */
	public static ColorFactory getInstance()
	{
		if (instance == null)
			instance = new ColorFactory();
		return instance;
	}
	
	private ColorFactory()
	{
		colors = new HashMap<RGB, Color>();
	}
	
	private HashMap<RGB, Color> colors;
	
	/**
	 * Returns the required color (by RGB code). If the same color is asked twice, the factory returns the same value
	 * @param R
	 * @param G
	 * @param B
	 * @return the corresponding color object
	 */
	public static Color getColor(int R, int G, int B)
	{
		Color color = getInstance().colors.get(new RGB(R,G,B));
		if (color == null)
		{
			color = new Color(Display.getCurrent(),R,G,B);
			getInstance().colors.put(new RGB(R,G,B), color);
		}
		return color;
	}
	
	@Override
	protected void finalize() throws Throwable {
		for (Color c: colors.values()) {
			c.dispose();
		}
		super.finalize();
	}
	
}
