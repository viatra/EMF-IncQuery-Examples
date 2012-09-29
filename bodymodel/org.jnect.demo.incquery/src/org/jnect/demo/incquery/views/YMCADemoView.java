package org.jnect.demo.incquery.views;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;


/**
 * Simple view for the Jnect/IncQuery YMCA Demo.
 * Hosts a large label that will display characters "inputted" using the YMCA patterns.
 * @author istvanrath
 */

public class YMCADemoView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.jnect.demo.incquery.views.YMCADemoView";

	private Text ymcalabel;

	/**
	 * The constructor.
	 */
	public YMCADemoView() { }

	
	static int font_height = 48;
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
	    parent.setLayout(new FillLayout());
	    ymcalabel = new Text(parent, SWT.BORDER | SWT.H_SCROLL);
	    // set colors
	    ymcalabel.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
	    ymcalabel.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
	    // set large font
	    FontData[] fontData = ymcalabel.getFont().getFontData();
	    for(int i = 0; i < fontData.length; ++i) {
	        fontData[i].setHeight(font_height);
	    }
	    final Font newFont = new Font(Display.getCurrent(), fontData);
	    ymcalabel.setFont(newFont);
	    ymcalabel.addDisposeListener(new DisposeListener() {
	        public void widgetDisposed(DisposeEvent e) {
	            newFont.dispose();
	        }
	    });
	    ymcalabel.setText("YMCA!");
	}

	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		ymcalabel.setFocus();
	}
	
	public void appendString(String s) {
	    ymcalabel.setText(ymcalabel.getText() + s);
	}
	
}