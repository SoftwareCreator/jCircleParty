package com.jcorn.jcircleparty.client.view;

import com.jcorn.jcircleparty.client.model.User;
import com.jcorn.jcircleparty.helper.Settings;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * jCircleParty
 * 
 * @author Markus Petritz
 * @version 1.0.0
 * @see http://petritzdesigns.at
 */
public class LoginView extends javax.swing.JFrame {

    private final ClientMainView main;
    
    public LoginView(ClientMainView main) {
        initComponents();
        initLabels();
        this.main = main;
    }
    
    private void initLabels() {
        lbTitle.setText(Settings.getTitle());
        lbCopyright.setText(Settings.getCopyright());
    }
    
    public void setUsername(String username) {
        tfUsername.setText(username);
    }
    
    private void showRegister() {
        this.setVisible(false);

        RegisterView register = new RegisterView(this);
        register.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnFooter = new javax.swing.JPanel();
        lbRegister = new javax.swing.JLabel();
        lbCopyright = new javax.swing.JLabel();
        pnTitle = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbInfo = new javax.swing.JLabel();
        btQuit = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();
        lbUsernameIcon = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lbPasswordIcon = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("jCircleParty - Login");
        setMinimumSize(new java.awt.Dimension(444, 381));

        pnFooter.setBackground(new java.awt.Color(41, 128, 185));
        pnFooter.setFocusable(false);
        pnFooter.setLayout(new java.awt.GridLayout());

        lbRegister.setForeground(new java.awt.Color(255, 255, 255));
        lbRegister.setText("Register");
        lbRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onRegisterClicked(evt);
            }
        });
        pnFooter.add(lbRegister);

        lbCopyright.setForeground(new java.awt.Color(255, 255, 255));
        lbCopyright.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCopyright.setText("Copyright (c) jCorn Development");
        pnFooter.add(lbCopyright);

        getContentPane().add(pnFooter, java.awt.BorderLayout.SOUTH);

        pnTitle.setBackground(new java.awt.Color(41, 128, 185));
        pnTitle.setFocusable(false);
        pnTitle.setLayout(new java.awt.GridBagLayout());

        lbTitle.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("jCircleParty");
        lbTitle.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 7, 7, 7);
        pnTitle.add(lbTitle, gridBagConstraints);

        lbInfo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbInfo.setForeground(new java.awt.Color(255, 255, 255));
        lbInfo.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(24, 3, 7, 7);
        pnTitle.add(lbInfo, gridBagConstraints);

        btQuit.setText("quit");
        btQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onQuit(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        pnTitle.add(btQuit, gridBagConstraints);

        getContentPane().add(pnTitle, java.awt.BorderLayout.NORTH);

        pnMain.setLayout(new java.awt.GridBagLayout());

        lbUsernameIcon.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbUsernameIcon.setText("@");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnMain.add(lbUsernameIcon, gridBagConstraints);

        tfUsername.setColumns(8);
        tfUsername.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnMain.add(tfUsername, gridBagConstraints);

        lbPasswordIcon.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbPasswordIcon.setText("P");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 2, 2);
        pnMain.add(lbPasswordIcon, gridBagConstraints);

        btLogin.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        btLogin.setText(">");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLogin(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnMain.add(btLogin, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 2, 2, 2);
        pnMain.add(tfPassword, gridBagConstraints);

        getContentPane().add(pnMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLogin
        String username = tfUsername.getText();
        String password = Arrays.toString(tfPassword.getPassword());
        
        if(User.login(username, password)) {
            User user = User.getUser(username, password);
            ThatsYouView you = new ThatsYouView(user);
            
            main.setUser(user);
            main.setVisible(true);
            
            you.setVisible(true);
            
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "You entered a wrong username or password!");
        }
    }//GEN-LAST:event_onLogin

    private void onQuit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onQuit
        if (JOptionPane.showConfirmDialog(this, "Do you really want to quit?", "Quit?", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_onQuit

    private void onRegisterClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onRegisterClicked
        showRegister();
    }//GEN-LAST:event_onRegisterClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btQuit;
    private javax.swing.JLabel lbCopyright;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbPasswordIcon;
    private javax.swing.JLabel lbRegister;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUsernameIcon;
    private javax.swing.JPanel pnFooter;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnTitle;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

}
