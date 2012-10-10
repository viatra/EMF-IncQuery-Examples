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
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

/**
 * Simple view for the Jnect/IncQuery YMCA Demo. Hosts a large label that will display characters "inputted" using the
 * YMCA patterns.
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

    static int font_height = 48;

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
     */
    public void createPartControl(Composite parent) {
        parent.setLayout(new FillLayout());
        incqueryLabel = new Text(parent, SWT.BORDER | SWT.H_SCROLL);
        esperLabel = new Text(parent, SWT.BORDER | SWT.H_SCROLL);
        // set colors
        incqueryLabel.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
        incqueryLabel.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
        esperLabel.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
        esperLabel.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
        // set large font
        FontData[] fontData = incqueryLabel.getFont().getFontData();
        for (int i = 0; i < fontData.length; ++i) {
            fontData[i].setHeight(font_height);
        }
        final Font newFont = new Font(Display.getDefault(), fontData);
        incqueryLabel.setFont(newFont);
        esperLabel.setFont(newFont);
        incqueryLabel.addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                newFont.dispose();
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

    public static void appendStringIncQuery(final String s) {
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                Text iqL = getActiveView().getIncqueryLabel();
                iqL.setText(iqL.getText() + s);
            }
        });
    }

    public static void appendStringEsper(final String s) {
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                Text eL = getActiveView().getEsperLabel();
                eL.setText(eL.getText() + s);
            }
        });
    }

    private static YMCADemoView getActiveView() {
        try {
            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(YMCADemoView.ID);
        } catch (PartInitException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        YMCADemoView v = (YMCADemoView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .getActivePart();
        return v;
    }

}