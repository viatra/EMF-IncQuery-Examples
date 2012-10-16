package org.jnect.demo.incquery.gef3d.camera;

import java.util.logging.Logger;

import org.eclipse.draw3d.ui.camera.CameraInputHandler;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef3d.tools.AbstractTool3D;
import org.eclipse.gef3d.tools.CameraTool;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;

/**
 * This tool controls the camera. The actual camera control happens in an instance of {@link CameraInputHandler} and
 * this class only delegates SWT events to that class.
 * 
 * @author Jens von Pilgrim
 * @author Kristian Duske
 * @author istvanrath
 * modifications:
 *  - wire customcamerahandler in
 */

public class CustomCameraTool extends AbstractTool3D {

    @SuppressWarnings("unused")
    private static final Logger logger = Logger.getLogger(CameraTool.class.getName());

    /**
     * The camera input handler.
     */
    protected CustomCameraInputHandler m_handler;

    /**
     * The camera preference distributor.
     */
    protected CustomCameraPreferenceDistributor m_prefDistributor;

    private Cursor m_pushedCursor;

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#activate()
     */
    @Override
    public void activate() {

        super.activate();

        if (m_handler == null)
            m_handler = new CustomCameraInputHandler();

        if (m_prefDistributor == null)
            m_prefDistributor = new CustomCameraPreferenceDistributor(m_handler);

        m_prefDistributor.start();
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#deactivate()
     */
    @Override
    public void deactivate() {

        super.deactivate();
        m_prefDistributor.stop();
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#getCommandName()
     */
    @Override
    protected String getCommandName() {

        return "Camera Tool";
    }

    private int getStateMask(Input i_input) {

        int stateMask = 0;
        if (i_input.isAltKeyDown())
            stateMask |= SWT.ALT;
        if (i_input.isControlKeyDown())
            stateMask |= SWT.CONTROL;
        if (i_input.isShiftKeyDown())
            stateMask |= SWT.SHIFT;
        if (i_input.isModKeyDown(SWT.MOD1))
            stateMask |= SWT.MOD1;
        if (i_input.isModKeyDown(SWT.MOD2))
            stateMask |= SWT.MOD2;
        if (i_input.isModKeyDown(SWT.MOD3))
            stateMask |= SWT.MOD3;
        if (i_input.isModKeyDown(SWT.MOD4))
            stateMask |= SWT.MOD4;
        if (i_input.isMouseButtonDown(SWT.BUTTON1))
            stateMask |= SWT.BUTTON1;
        if (i_input.isMouseButtonDown(SWT.BUTTON2))
            stateMask |= SWT.BUTTON2;
        if (i_input.isMouseButtonDown(SWT.BUTTON3))
            stateMask |= SWT.BUTTON3;
        if (i_input.isMouseButtonDown(SWT.BUTTON4))
            stateMask |= SWT.BUTTON4;
        if (i_input.isMouseButtonDown(SWT.BUTTON5))
            stateMask |= SWT.BUTTON5;

        return stateMask;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#handleButtonDown(int)
     */
    @Override
    protected boolean handleButtonDown(int i_button) {

        setCursor(SWT.CURSOR_CROSS);
        m_handler.setScene(getScene());

        Input3D input = getCurrentInput3D();
        m_handler.buttonDown(i_button, getStateMask(input), input.getRealMouseLocation().x,
                input.getRealMouseLocation().y);

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#handleButtonUp(int)
     */
    @Override
    protected boolean handleButtonUp(int i_button) {

        restoreCursor();
        m_handler.setScene(getScene());

        Input3D input = getCurrentInput3D();
        m_handler.buttonUp(i_button, getStateMask(input), input.getRealMouseLocation().x,
                input.getRealMouseLocation().y);

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#handleDoubleClick(int)
     */
    @Override
    protected boolean handleDoubleClick(int i_button) {

        m_handler.setScene(getScene());
        Input3D input = getCurrentInput3D();
        m_handler.doubleClick(i_button, getStateMask(input), input.getRealMouseLocation().x,
                input.getRealMouseLocation().y);

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#handleDrag()
     */
    @Override
    protected boolean handleDrag() {

        m_handler.setScene(getScene());

        Input3D input = getCurrentInput3D();
        m_handler.mouseMove(getStateMask(input), input.getRealMouseLocation().x, input.getRealMouseLocation().y);

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#handleKeyDown(org.eclipse.swt.events.KeyEvent)
     */
    @Override
    protected boolean handleKeyDown(KeyEvent i_e) {

        m_handler.setScene(getScene());
        m_handler.keyDown(i_e);

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#handleKeyUp(org.eclipse.swt.events.KeyEvent)
     */
    @Override
    protected boolean handleKeyUp(KeyEvent i_e) {

        m_handler.setScene(getScene());
        m_handler.keyUp(i_e);

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#handleNativeDragFinished(org.eclipse.swt.dnd.DragSourceEvent)
     */
    @Override
    protected boolean handleNativeDragFinished(DragSourceEvent i_event) {

        restoreCursor();
        m_handler.setScene(getScene());

        Input3D input = getCurrentInput3D();
        m_handler.nativeDragFinished(input.getRealMouseLocation().x, input.getRealMouseLocation().y);

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#handleNativeDragStarted(org.eclipse.swt.dnd.DragSourceEvent)
     */
    @Override
    protected boolean handleNativeDragStarted(DragSourceEvent i_event) {

        setCursor(SWT.CURSOR_CROSS);
        m_handler.setScene(getScene());

        Input3D input = getCurrentInput3D();
        m_handler.nativeDragStarted(input.getRealMouseLocation().x, input.getRealMouseLocation().y);

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#keyUp(org.eclipse.swt.events.KeyEvent, org.eclipse.gef.EditPartViewer)
     */
    @Override
    public void keyUp(KeyEvent i_evt, EditPartViewer i_viewer) {

        super.keyUp(i_evt, i_viewer);

        m_handler.setScene(getScene());
        m_handler.keyUp(i_evt);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.tools.AbstractTool#mouseWheelScrolled(org.eclipse.swt.widgets.Event,
     *      org.eclipse.gef.EditPartViewer)
     */
    @Override
    public void mouseWheelScrolled(Event i_event, EditPartViewer i_viewer) {

        super.mouseWheelScrolled(i_event, i_viewer);

        m_handler.setScene(getScene());
        m_handler.mouseWheelScrolled(i_event.count);
    }

    private void restoreCursor() {

        if (m_pushedCursor != null) {
            Control ctrl = getCurrentViewer().getControl();
            ctrl.setCursor(m_pushedCursor);
            m_pushedCursor = null;
        }
    }

    private void setCursor(int i_cursorId) {

        // save current cursor
        Control ctrl = getCurrentViewer().getControl();
        while (ctrl != null) {
            if (ctrl.getCursor() != null) {
                m_pushedCursor = ctrl.getCursor();
                break;
            }

            ctrl = ctrl.getParent();
        }

        m_pushedCursor = getCurrentViewer().getControl().getDisplay().getSystemCursor(SWT.CURSOR_ARROW);

        // hide cursor and save position
        ctrl = getCurrentViewer().getControl();
        Display display = ctrl.getDisplay();

        Cursor cursor = display.getSystemCursor(i_cursorId);
        ctrl.setCursor(cursor);
    }
}
