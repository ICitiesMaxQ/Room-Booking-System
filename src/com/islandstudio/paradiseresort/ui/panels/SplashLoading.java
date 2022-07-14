/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.islandstudio.paradiseresort.ui.panels;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author Kah Heng Siew
 */
public class SplashLoading extends javax.swing.JPanel {

    /**
     * Creates new form SplashLoading
     */
    public SplashLoading() {
        initComponents();
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        try {
            Image img = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource("resources/images/splash_background.png")));
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashLogo = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        loadingStatus = new javax.swing.JLabel();
        loadingPercent = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1500, 800));
        setMinimumSize(new java.awt.Dimension(1500, 800));
        setName("splashPanel"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1500, 800));

        splashLogo.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        splashLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        splashLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/splash_picture.png"))); // NOI18N
        splashLogo.setText("A wonderful place for relaxation~");
        splashLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        splashLogo.setIconTextGap(-80);
        splashLogo.setMaximumSize(new java.awt.Dimension(500, 500));
        splashLogo.setMinimumSize(new java.awt.Dimension(500, 500));
        splashLogo.setPreferredSize(new java.awt.Dimension(500, 500));
        splashLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        loadingBar.setName("loadingBar"); // NOI18N

        loadingStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loadingStatus.setText("Getting things ready......");

        loadingPercent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loadingPercent.setText("0%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadingBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(splashLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loadingStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loadingPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(457, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splashLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadingStatus)
                    .addComponent(loadingPercent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar loadingBar;
    public static javax.swing.JLabel loadingPercent;
    private javax.swing.JLabel loadingStatus;
    private javax.swing.JLabel splashLogo;
    // End of variables declaration//GEN-END:variables
}
