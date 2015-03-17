package com.jcorn.jcircleparty.client.view;

import com.jcorn.jcircleparty.client.model.User;

/**
 * jCircleParty
 * 
 * @author Markus Petritz
 * @version 1.0.0
 * @see http://petritzdesigns.at
 */
public class ThatsYouView extends javax.swing.JFrame {

    private final User user;
    
    public ThatsYouView(User user) {
        initComponents();
        this.user = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnTitle = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        pnFooter = new javax.swing.JPanel();
        lbCopyright = new javax.swing.JLabel();
        pnMain = new javax.swing.JPanel();
        pnCircle = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jCircleParty - Thats You!");
        setMaximumSize(new java.awt.Dimension(330, 413));
        setMinimumSize(new java.awt.Dimension(330, 413));
        setPreferredSize(new java.awt.Dimension(330, 413));
        setResizable(false);
        setSize(new java.awt.Dimension(330, 413));

        pnTitle.setBackground(new java.awt.Color(41, 128, 185));
        pnTitle.setFocusable(false);
        pnTitle.setLayout(new java.awt.GridBagLayout());

        lbTitle.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("That's You");
        lbTitle.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 7, 7, 7);
        pnTitle.add(lbTitle, gridBagConstraints);

        btOk.setText("OK");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onOk(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        pnTitle.add(btOk, gridBagConstraints);

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

        pnCircle.setPreferredSize(new java.awt.Dimension(300, 300));
        pnCircle.setSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout pnCircleLayout = new javax.swing.GroupLayout(pnCircle);
        pnCircle.setLayout(pnCircleLayout);
        pnCircleLayout.setHorizontalGroup(
            pnCircleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pnCircleLayout.setVerticalGroup(
            pnCircleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pnMain.add(pnCircle, new java.awt.GridBagConstraints());

        getContentPane().add(pnMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onOk(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onOk
        this.dispose();
    }//GEN-LAST:event_onOk

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOk;
    private javax.swing.JLabel lbCopyright;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel pnCircle;
    private javax.swing.JPanel pnFooter;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnTitle;
    // End of variables declaration//GEN-END:variables

}
