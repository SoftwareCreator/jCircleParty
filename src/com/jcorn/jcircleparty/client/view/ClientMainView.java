package com.jcorn.jcircleparty.client.view;

import com.jcorn.jcircleparty.client.model.Circle;
import com.jcorn.jcircleparty.client.model.User;
import com.jcorn.jcircleparty.helper.Settings;
import javax.swing.JOptionPane;

/**
 * jCircleParty
 *
 * @author Markus Petritz
 * @author Julian Maierl
 * @version 1.0.0
 * @see http://petritzdesigns.at
 */
public class ClientMainView extends javax.swing.JFrame {

    private User user;

    public ClientMainView() {
        initComponents();
        try {
            initClasses();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage());
        }
        initLabels();
    }

    private void checkLogin() {
        if (!Settings.isLogin()) {
            showLogin();
        }
    }

    private void showLogin() {
        //Quit Server Connection
        //Syncronize with Server

        this.setVisible(false);

        this.user = null;
        Settings.setIsLogin(false);

        LoginView login = new LoginView(this);
        login.setVisible(true);
    }

    private void initClasses() throws Exception {
        this.user = new User("Not defined", "notdefined@mail.com", "not_defined", new Circle());
    }

    private void initLabels() {
        setLocationRelativeTo(null);
        
        lbTitle.setText(Settings.getTitle());
        lbVersion.setText(String.format("Version %s", Settings.getVersion()));
        lbCopyright.setText(Settings.getCopyright());

        setUser(user);
        resetGame();
    }

    private void resetGame() {
        lbScore.setText("Score: 0");
        lbTime.setText("00:00:00");
    }

    public void setUser(User usr) {
        lbProfilName.setText(usr.getName());
        lbProfilUsername.setText(String.format("@%s", usr.getUsername()));

        lbStatsHighscore.setText(String.format("Highscore: %d", usr.getHighscore()));
        lbStatsPlaytime.setText(String.format("Playtime: %d hrs", usr.getPlaytime()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitle = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbCopyright = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        pnInfo = new javax.swing.JPanel();
        pnProfil = new javax.swing.JPanel();
        lbProfilName = new javax.swing.JLabel();
        lbProfilUsername = new javax.swing.JLabel();
        btProfileLogout = new javax.swing.JButton();
        btQuit = new javax.swing.JButton();
        pnStats = new javax.swing.JPanel();
        lbStatsHighscore = new javax.swing.JLabel();
        lbStatsPlaytime = new javax.swing.JLabel();
        pnChat = new javax.swing.JPanel();
        lbChatTitle = new javax.swing.JLabel();
        spChat = new javax.swing.JScrollPane();
        liChat = new javax.swing.JList();
        tfChatText = new javax.swing.JTextField();
        btChatSend = new javax.swing.JButton();
        pnPartyRoom = new javax.swing.JPanel();
        lbTime = new javax.swing.JLabel();
        lbScore = new javax.swing.JLabel();
        btRandom = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("jCircleParty");
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(949, 700));
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                onFocuesGainedFrame(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                onMouseEnteredFrame(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                onOpenFrame(evt);
            }
        });
        getContentPane().setLayout(null);

        pnTitle.setBackground(new java.awt.Color(41, 128, 185));
        pnTitle.setFocusable(false);
        pnTitle.setLayout(null);

        lbTitle.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("jCircleParty");
        lbTitle.setFocusable(false);
        pnTitle.add(lbTitle);
        lbTitle.setBounds(20, 0, 210, 70);

        lbCopyright.setForeground(new java.awt.Color(255, 255, 255));
        lbCopyright.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCopyright.setText("Copyright (c) jCorn Development");
        lbCopyright.setFocusable(false);
        pnTitle.add(lbCopyright);
        lbCopyright.setBounds(730, 40, 210, 20);

        lbVersion.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbVersion.setForeground(new java.awt.Color(255, 255, 255));
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbVersion.setText("Version 1.0.0");
        lbVersion.setFocusable(false);
        pnTitle.add(lbVersion);
        lbVersion.setBounds(810, 10, 130, 40);

        getContentPane().add(pnTitle);
        pnTitle.setBounds(0, 0, 950, 70);

        pnInfo.setLayout(null);

        pnProfil.setBackground(new java.awt.Color(231, 76, 60));
        pnProfil.setFocusable(false);
        pnProfil.setLayout(null);

        lbProfilName.setFont(new java.awt.Font("Lucida Grande", 0, 30)); // NOI18N
        lbProfilName.setForeground(new java.awt.Color(255, 255, 255));
        lbProfilName.setText("Markus Petritz");
        lbProfilName.setFocusable(false);
        pnProfil.add(lbProfilName);
        lbProfilName.setBounds(20, 10, 320, 60);

        lbProfilUsername.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lbProfilUsername.setForeground(new java.awt.Color(255, 255, 255));
        lbProfilUsername.setText("@petritzdesigns");
        lbProfilUsername.setFocusable(false);
        pnProfil.add(lbProfilUsername);
        lbProfilUsername.setBounds(20, 60, 320, 20);

        btProfileLogout.setText("Logout");
        btProfileLogout.setFocusable(false);
        btProfileLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onProfileLogout(evt);
            }
        });
        pnProfil.add(btProfileLogout);
        btProfileLogout.setBounds(340, 20, 100, 29);

        btQuit.setText("Quit");
        btQuit.setFocusable(false);
        btQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onQuit(evt);
            }
        });
        pnProfil.add(btQuit);
        btQuit.setBounds(340, 50, 100, 29);

        pnInfo.add(pnProfil);
        pnProfil.setBounds(0, 0, 450, 100);

        pnStats.setFocusable(false);
        pnStats.setLayout(null);

        lbStatsHighscore.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lbStatsHighscore.setText("Highscore: 10422");
        lbStatsHighscore.setFocusable(false);
        pnStats.add(lbStatsHighscore);
        lbStatsHighscore.setBounds(20, 10, 420, 35);

        lbStatsPlaytime.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lbStatsPlaytime.setText("Playtime: 10 hours");
        lbStatsPlaytime.setFocusable(false);
        pnStats.add(lbStatsPlaytime);
        lbStatsPlaytime.setBounds(20, 40, 420, 35);

        pnInfo.add(pnStats);
        pnStats.setBounds(0, 100, 450, 80);

        pnChat.setBackground(new java.awt.Color(204, 204, 204));
        pnChat.setFocusable(false);
        pnChat.setLayout(null);

        lbChatTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lbChatTitle.setText("Chat");
        pnChat.add(lbChatTitle);
        lbChatTitle.setBounds(20, 10, 70, 40);

        liChat.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "@applemarkus: Hallo", "@applemarkus: Wie geht's?", "@julian: Gut, dir?" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        liChat.setFocusable(false);
        spChat.setViewportView(liChat);

        pnChat.add(spChat);
        spChat.setBounds(20, 60, 410, 310);
        pnChat.add(tfChatText);
        tfChatText.setBounds(20, 380, 310, 40);

        btChatSend.setText("Send");
        btChatSend.setFocusable(false);
        btChatSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onChatSend(evt);
            }
        });
        pnChat.add(btChatSend);
        btChatSend.setBounds(340, 380, 90, 40);

        pnInfo.add(pnChat);
        pnChat.setBounds(0, 180, 450, 430);

        getContentPane().add(pnInfo);
        pnInfo.setBounds(0, 70, 450, 610);

        pnPartyRoom.setBackground(new java.awt.Color(189, 195, 199));
        pnPartyRoom.setPreferredSize(new java.awt.Dimension(500, 500));
        pnPartyRoom.setSize(new java.awt.Dimension(500, 500));
        pnPartyRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                onMouseEnteredPartyRoom(evt);
            }
        });
        getContentPane().add(pnPartyRoom);
        pnPartyRoom.setBounds(450, 120, 500, 500);

        lbTime.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lbTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTime.setText("00:01:25");
        lbTime.setFocusable(false);
        getContentPane().add(lbTime);
        lbTime.setBounds(800, 80, 140, 30);

        lbScore.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lbScore.setText("Score: 25");
        lbScore.setFocusable(false);
        getContentPane().add(lbScore);
        lbScore.setBounds(460, 80, 280, 30);

        btRandom.setText("Random");
        btRandom.setFocusable(false);
        btRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRandom(evt);
            }
        });
        getContentPane().add(btRandom);
        btRandom.setBounds(850, 630, 90, 40);

        btReset.setText("Reset");
        btReset.setFocusable(false);
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onReset(evt);
            }
        });
        getContentPane().add(btReset);
        btReset.setBounds(560, 630, 90, 40);

        btStart.setText("Start");
        btStart.setFocusable(false);
        btStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onStart(evt);
            }
        });
        getContentPane().add(btStart);
        btStart.setBounds(460, 630, 90, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onProfileLogout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onProfileLogout
        showLogin();
    }//GEN-LAST:event_onProfileLogout

    private void onQuit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onQuit
        quit();
    }//GEN-LAST:event_onQuit

    private void onChatSend(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onChatSend
        chatSend();
    }//GEN-LAST:event_onChatSend

    private void onStart(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onStart
        gameStart();
    }//GEN-LAST:event_onStart

    private void onReset(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onReset
        resetGame();
    }//GEN-LAST:event_onReset

    private void onRandom(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRandom
        gameRandom();
    }//GEN-LAST:event_onRandom

    private void onMouseEnteredPartyRoom(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMouseEnteredPartyRoom
        pnPartyRoom.requestFocus();
    }//GEN-LAST:event_onMouseEnteredPartyRoom

    private void onMouseEnteredFrame(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMouseEnteredFrame
        checkLogin();
    }//GEN-LAST:event_onMouseEnteredFrame

    private void onFocuesGainedFrame(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_onFocuesGainedFrame
        checkLogin();
    }//GEN-LAST:event_onFocuesGainedFrame

    private void onOpenFrame(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onOpenFrame
        checkLogin();
    }//GEN-LAST:event_onOpenFrame

    private void quit() {
        if (JOptionPane.showConfirmDialog(this, "Do you really want to quit?", "Quit?", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
            //Quit Server Connection
            //Syncronize with Server
            //Then quit
            System.exit(0);
        }
    }

    private void chatSend() {
        tfChatText.setText("");
        liChat.clearSelection();
    }

    private void gameStart() {

    }

    private void gameRandom() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChatSend;
    private javax.swing.JButton btProfileLogout;
    private javax.swing.JButton btQuit;
    private javax.swing.JButton btRandom;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btStart;
    private javax.swing.JLabel lbChatTitle;
    private javax.swing.JLabel lbCopyright;
    private javax.swing.JLabel lbProfilName;
    private javax.swing.JLabel lbProfilUsername;
    private javax.swing.JLabel lbScore;
    private javax.swing.JLabel lbStatsHighscore;
    private javax.swing.JLabel lbStatsPlaytime;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JList liChat;
    private javax.swing.JPanel pnChat;
    private javax.swing.JPanel pnInfo;
    private javax.swing.JPanel pnPartyRoom;
    private javax.swing.JPanel pnProfil;
    private javax.swing.JPanel pnStats;
    private javax.swing.JPanel pnTitle;
    private javax.swing.JScrollPane spChat;
    private javax.swing.JTextField tfChatText;
    // End of variables declaration//GEN-END:variables

}
