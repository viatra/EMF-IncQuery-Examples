package org.jnect.demo.incquery.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

/**
 * Simple view for the Jnect/IncQuery YMCA Demo. Hosts a large label that will display characters "inputted"
 * using the YMCA patterns.
 * 
 * @author istvanrath
 */

public class YMCADemoView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.jnect.demo.incquery.views.YMCADemoView";

	/**
	 * Label used to display output from IncQuery matchers/deltamonitors.
	 */
	private Text incqueryLabel;

	public Text getIncqueryLabel() {
		return incqueryLabel;
	}

	public Text getEsperLabel() {
		return esperLabel;
	}

	/**
	 * Label used to display output from the Esper engine.
	 */
	private Text esperLabel;

	/**
	 * The constructor.
	 */
	public YMCADemoView() {
	}

	static int font_height_large = 48;
	static int font_height_small = 24;
	

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		// FillLayout fl = new
		parent.setLayout(new FillLayout(SWT.VERTICAL));
		esperLabel = new Text(parent, SWT.BORDER | SWT.H_SCROLL);
		incqueryLabel = new Text(parent, SWT.BORDER | SWT.H_SCROLL);
		// set colors
		incqueryLabel.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		incqueryLabel.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
		esperLabel.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		esperLabel.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_RED));
		// set large font
		FontData[] fontData_iq = incqueryLabel.getFont().getFontData();
		for (int i = 0; i < fontData_iq.length; ++i) {
			fontData_iq[i].setHeight(font_height_small);
		}
		final Font newFont = new Font(Display.getDefault(), fontData_iq);
		incqueryLabel.setFont(newFont);
		incqueryLabel.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				newFont.dispose();
			}
		});
		
		FontData[] fontData_e = esperLabel.getFont().getFontData();
		for (int i = 0; i < fontData_e.length; ++i) {
			fontData_e[i].setHeight(font_height_large);
		}
		final Font newFont_e = new Font(Display.getDefault(), fontData_e);
		esperLabel.setFont(newFont_e);
		esperLabel.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				newFont_e.dispose();
			}
		});
		
		incqueryLabel.setText("IQ: ");
		esperLabel.setText("E: ");
		// ymcalabel.setText("YMCA!");
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		incqueryLabel.setFocus();
	}

	static final int iqL_maxlength = 20;
	static final int eL_maxlength = 10;
	
	
	public static void appendStringIncQuery(final String s) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				Text iqL = getActiveView().getIncqueryLabel();
				if (iqL.getText().length()>iqL_maxlength) {
					iqL.setText("");
				}
				iqL.setText(iqL.getText() + s);
			}
		});
	}

	public static void appendStringEsper(final String s) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				Text eL = getActiveView().getEsperLabel();
				if (eL.getText().length()>eL_maxlength) {
					eL.setText("");
				}
				eL.setText(eL.getText() + s);
			}
		});
	}

	private static YMCADemoView getActiveView() {
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(YMCADemoView.ID);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		YMCADemoView v = (YMCADemoView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActivePart();
		return v;
	}

}