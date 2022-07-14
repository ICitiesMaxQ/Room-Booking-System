/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.islandstudio.paradiseresort.ui.panels;

import com.islandstudio.paradiseresort.event.GUIEventHandler;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author Kah Heng Siew
 */
public class LoginUI extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    /* Initialization */
    public LoginUI() {
        initComponents();
    }

    /* This method override the paintComponent method within this panel to create gradient background!  */
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        Graphics2D gpd = (Graphics2D) g;

        Color bgColor_1 = new Color(123, 21, 244);
        Color bgColor_2 = new Color(123, 112, 21);

        GradientPaint gdPaint = new GradientPaint(0, 0, bgColor_1, 0, this.getHeight(), bgColor_2);

        gpd.setPaint(gdPaint);
        gpd.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginComponent = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                Graphics2D gpd = (Graphics2D) g;

                Color bgColor_1 = new Color(255, 255, 255, 115);

                gpd.setPaint(bgColor_1);
                gpd.fillRect(0, 0, this.getWidth(), this.getHeight());
            }
        };
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginBTN = new javax.swing.JButton();
        greetingLabel = new javax.swing.JLabel();
        usernameTXT = new javax.swing.JLabel();
        passwordTXT = new javax.swing.JLabel();
        iconFrame = new javax.swing.JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                try {
                    Image img = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource("resources/images/logo.png")));
                    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        setMinimumSize(new java.awt.Dimension(1500, 800));
        setPreferredSize(new java.awt.Dimension(1500, 800));

        loginComponent.setOpaque(false);

        loginBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginBTN.setText("Log In");
        loginBTN.setActionCommand("Log in");
        loginBTN.addActionListener(GUIEventHandler.actionListener);

        greetingLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 35)); // NOI18N
        greetingLabel.setText("Welcome to Paradise Resort!");

        usernameTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameTXT.setText("Username:");

        passwordTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordTXT.setText("Password:");

        javax.swing.GroupLayout loginComponentLayout = new javax.swing.GroupLayout(loginComponent);
        loginComponent.setLayout(loginComponentLayout);
        loginComponentLayout.setHorizontalGroup(
            loginComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginComponentLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(loginComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginComponentLayout.createSequentialGroup()
                        .addGroup(loginComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginComponentLayout.createSequentialGroup()
                                .addGroup(loginComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTXT)
                                    .addGroup(loginComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passwordField)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(passwordTXT))
                                .addGap(94, 94, 94))
                            .addComponent(greetingLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginComponentLayout.createSequentialGroup()
                        .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))))
        );
        loginComponentLayout.setVerticalGroup(
            loginComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginComponentLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(greetingLabel)
                .addGap(98, 98, 98)
                .addComponent(usernameTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(passwordTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(loginBTN)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        iconFrame.setOpaque(false);

        javax.swing.GroupLayout iconFrameLayout = new javax.swing.GroupLayout(iconFrame);
        iconFrame.setLayout(iconFrameLayout);
        iconFrameLayout.setHorizontalGroup(
            iconFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
        );
        iconFrameLayout.setVerticalGroup(
            iconFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(iconFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginComponent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginComponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(iconFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel greetingLabel;
    private javax.swing.JPanel iconFrame;
    private static javax.swing.JButton loginBTN;
    private javax.swing.JPanel loginComponent;
    private static javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordTXT;
    private static javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameTXT;
    // End of variables declaration//GEN-END:variables

    public static JButton getLoginBTN() {
        return loginBTN;
    }

    public static JTextField getUsernameField() {
        return usernameField;
    }

    public static JPasswordField getPasswordField() {
        return passwordField;
    }
}
