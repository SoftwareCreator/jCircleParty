package com.jcorn.jcircleparty;

import com.jcorn.jcircleparty.helper.JC;
import com.jcorn.jcircleparty.server.view.ServerMainView;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * jCircleParty
 *
 * @author Markus Petritz
 * @version 1.0.0
 * @see http://petritzdesigns.at
 */
public class ServerMain {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JC.debug(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ServerMainView server = new ServerMainView();
                server.setVisible(true);
            }
        });
    }

}
