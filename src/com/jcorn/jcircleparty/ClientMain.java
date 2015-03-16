package com.jcorn.jcircleparty;

import com.jcorn.jcircleparty.client.view.ClientMainView;
import com.jcorn.jcircleparty.helper.JC;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * jCircleParty
 * 
 * @author Markus Petritz
 * @author Julian Maierl
 * @version 1.0.0
 * @see http://petritzdesigns.at
 */
public class ClientMain {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JC.debug(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ClientMainView client = new ClientMainView();
                client.setVisible(true);
            }
        });
    }

}
