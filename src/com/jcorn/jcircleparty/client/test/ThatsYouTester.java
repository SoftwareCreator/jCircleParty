package com.jcorn.jcircleparty.client.test;

import com.jcorn.jcircleparty.client.model.Circle;
import com.jcorn.jcircleparty.client.model.User;
import com.jcorn.jcircleparty.client.view.ThatsYouView;
import com.jcorn.jcircleparty.helper.JC;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * jCircleParty
 * 
 * @author Markus Petritz
 * @version 1.0.0
 * @see http://petritzdesigns.at
 */
public class ThatsYouTester {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JC.debug(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    ThatsYouView view = new ThatsYouView(new User("Test Test", "test@mail.com", "test", new Circle(0, 0, 200, Color.blue)));
                    view.setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    JC.debug(ex);
                }
            }
        });
    }

}
