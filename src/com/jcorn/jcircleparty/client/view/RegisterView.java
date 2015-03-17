package com.jcorn.jcircleparty.client.view;

import com.jcorn.jcircleparty.helper.Settings;

/**
 * jCircleParty
 * 
 * @author Markus Petritz
 * @version 1.0.0
 * @see http://petritzdesigns.at
 */
public class RegisterView extends javax.swing.JFrame {

    private LoginView login;
    
    public RegisterView(LoginView login) {
        initComponents();
        initLabels();
        this.login = login;
    }
    
    private void initLabels() {
        lbTitle.setText(Settings.getTitle());
        lbCopyright.setText(Settings.getCopyright());
    }
    
    private void back() {
        login.setVisible(true);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnTitle = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbInfo = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();
        pnFooter = new javax.swing.JPanel();
        lbCopyright = new javax.swing.JLabel();
        pnMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("jCircleParty - Register");

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
        lbInfo.setText("Register");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(24, 3, 7, 7);
        pnTitle.add(lbInfo, gridBagConstraints);

        btBack.setText("back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBack(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        pnTitle.add(btBack, gridBagConstraints);

        getContentPane().add(pnTitle, java.awt.BorderLayout.NORTH);

        pnFooter.setBackground(new java.awt.Color(41, 128, 185));
        pnFooter.setFocusable(false);
        pnFooter.setLayout(new java.awt.GridLayout());

        lbCopyright.setForeground(new java.awt.Color(255, 255, 255));
        lbCopyright.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCopyright.setText("Copyright (c) jCorn Development");
        pnFooter.add(lbCopyright);

        getContentPane().add(pnFooter, java.awt.BorderLayout.SOUTH);

        pnMain.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(pnMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onBack(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBack
        back();
    }//GEN-LAST:event_onBack

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JLabel lbCopyright;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel pnFooter;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnTitle;
    // End of variables declaration//GEN-END:variables

}
