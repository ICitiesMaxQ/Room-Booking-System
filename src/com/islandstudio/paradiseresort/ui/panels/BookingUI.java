/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.islandstudio.paradiseresort.ui.panels;

import com.github.lgooddatepicker.components.DatePicker;
import com.islandstudio.paradiseresort.event.GUIEventHandler;
import com.islandstudio.paradiseresort.ui.CustomRoundBorder;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author Kah Heng Siew
 */
public class BookingUI extends javax.swing.JPanel {

    /**
     * Creates new form BookingUI
     */
    public BookingUI() {
        initComponents();
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        try {
            Image img = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResource("resources/images/home_background.png")));
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Image not found!", "Error", JOptionPane.ERROR_MESSAGE);
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

        dateSelectionPanel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                Graphics2D gpd = (Graphics2D) g;

                Color bgColor_1 = new Color(255, 255, 255, 52);

                gpd.setPaint(bgColor_1);
                gpd.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 20, 20);
            }

            @Override
            public void setBorder(Border border) {
                super.setBorder(new CustomRoundBorder(20));
            }
        };
        checkInDate = new com.github.lgooddatepicker.components.DatePicker();
        checkOutDate = new com.github.lgooddatepicker.components.DatePicker();
        dateTitle = new javax.swing.JLabel();
        checkInDateTitle = new javax.swing.JLabel();
        checkOutDateTitle = new javax.swing.JLabel();
        checkRoomBTN = new javax.swing.JButton();
        roomTableScrollFrame = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        availableRoomTitle = new javax.swing.JLabel();
        totalNightsTitle = new javax.swing.JLabel();
        totalNights = new javax.swing.JTextField() {
            @Override
            public void setEditable(boolean b) {
                super.setEditable(false);
            }
        };
        customerDetailsPanel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                Graphics2D gpd = (Graphics2D) g;

                Color bgColor_1 = new Color(255, 255, 255, 52);

                gpd.setPaint(bgColor_1);
                gpd.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 20, 20);
            }

            @Override
            public void setBorder(Border border) {
                super.setBorder(new CustomRoundBorder(20));
            }
        };
        customerIC = new javax.swing.JTextField();
        customerDetailsTitle = new javax.swing.JLabel();
        customerICTitle = new javax.swing.JLabel();
        customerNameTitle = new javax.swing.JLabel();
        customerContactTitle = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        customerEmailTitle = new javax.swing.JLabel();
        csutomerContact = new javax.swing.JTextField();
        customerEmail = new javax.swing.JTextField();
        customerRoomTitle = new javax.swing.JLabel();
        customerRoomTypeTitle = new javax.swing.JLabel();
        customerRoomType = new javax.swing.JTextField() {
            @Override
            public void setEditable(boolean b) {
                super.setEditable(false);
            }
        };
        totalTitle = new javax.swing.JLabel();
        serviceTaxTitle = new javax.swing.JLabel();
        tourismTaxTitle = new javax.swing.JLabel();
        grandTotalTitle = new javax.swing.JLabel();
        total = new javax.swing.JTextField() {
            @Override
            public void setEditable(boolean b) {
                super.setEditable(false);
            }
        };
        serviceTax = new javax.swing.JTextField() {
            @Override
            public void setEditable(boolean b) {
                super.setEditable(false);
            }
        };
        tourismTax = new javax.swing.JTextField() {
            @Override
            public void setEditable(boolean b) {
                super.setEditable(false);
            }
        };
        grandTotal = new javax.swing.JTextField() {
            @Override
            public void setEditable(boolean b) {
                super.setEditable(false);
            }
        };
        bookBTN = new javax.swing.JButton();
        clearBookingBTN = new javax.swing.JButton();
        cancelBookingBTN = new javax.swing.JButton();
        customerRoom = new javax.swing.JTextField() {
            @Override
            public void setEditable(boolean b) {
                super.setEditable(false);
            }
        };
        mainTitlePanel = new javax.swing.JPanel();
        bookingTitle = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1500, 800));

        dateSelectionPanel.setOpaque(false);

        checkInDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        checkOutDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        dateTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dateTitle.setForeground(new java.awt.Color(255, 255, 255));
        dateTitle.setText("Date Selection");

        checkInDateTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        checkInDateTitle.setForeground(new java.awt.Color(255, 255, 255));
        checkInDateTitle.setText("Check In Date:");

        checkOutDateTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        checkOutDateTitle.setForeground(new java.awt.Color(255, 255, 255));
        checkOutDateTitle.setText("Check Out Date:");

        checkRoomBTN.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        checkRoomBTN.setText("Check Room");
        checkRoomBTN.addActionListener(GUIEventHandler.actionListener);

        roomTable.addMouseListener(GUIEventHandler.mouseListener);
        roomTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Room Type", "Room Price / night"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomTable.getTableHeader().setReorderingAllowed(false);
        roomTableScrollFrame.setViewportView(roomTable);

        availableRoomTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        availableRoomTitle.setForeground(new java.awt.Color(255, 255, 255));
        availableRoomTitle.setText("Select Room:");

        totalNightsTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        totalNightsTitle.setForeground(new java.awt.Color(255, 255, 255));
        totalNightsTitle.setText("Total Nights:");

        totalNights.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalNights.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout dateSelectionPanelLayout = new javax.swing.GroupLayout(dateSelectionPanel);
        dateSelectionPanel.setLayout(dateSelectionPanelLayout);
        dateSelectionPanelLayout.setHorizontalGroup(
            dateSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateSelectionPanelLayout.createSequentialGroup()
                .addGroup(dateSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dateSelectionPanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(dateSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomTableScrollFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availableRoomTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dateSelectionPanelLayout.createSequentialGroup()
                                .addGroup(dateSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkInDateTitle)
                                    .addComponent(checkInDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)
                                .addGroup(dateSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkOutDateTitle)
                                    .addComponent(checkOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(dateSelectionPanelLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(dateSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dateSelectionPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(totalNightsTitle))
                            .addComponent(totalNights, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkRoomBTN, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(dateSelectionPanelLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(dateTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dateSelectionPanelLayout.setVerticalGroup(
            dateSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateTitle)
                .addGap(30, 30, 30)
                .addGroup(dateSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInDateTitle)
                    .addComponent(checkOutDateTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalNightsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalNights, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(checkRoomBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(availableRoomTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomTableScrollFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        customerIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerIC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        customerDetailsTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        customerDetailsTitle.setForeground(new java.awt.Color(255, 255, 255));
        customerDetailsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerDetailsTitle.setText("Customer Booking Details");

        customerICTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        customerICTitle.setForeground(new java.awt.Color(255, 255, 255));
        customerICTitle.setText("Customer IC/Passport Number        :");

        customerNameTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        customerNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        customerNameTitle.setText("Customer Full Name                        :");

        customerContactTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        customerContactTitle.setForeground(new java.awt.Color(255, 255, 255));
        customerContactTitle.setText("Customer Contact                            :");

        customerName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        customerEmailTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        customerEmailTitle.setForeground(new java.awt.Color(255, 255, 255));
        customerEmailTitle.setText("Customer Email                                :");

        csutomerContact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        csutomerContact.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        customerEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        customerRoomTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        customerRoomTitle.setForeground(new java.awt.Color(255, 255, 255));
        customerRoomTitle.setText("Customer Room                               :");

        customerRoomTypeTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        customerRoomTypeTitle.setForeground(new java.awt.Color(255, 255, 255));
        customerRoomTypeTitle.setText("Customer Room Type                      :");

        customerRoomType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerRoomType.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        totalTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        totalTitle.setForeground(new java.awt.Color(255, 255, 255));
        totalTitle.setText("Total                                                 :");

        serviceTaxTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        serviceTaxTitle.setForeground(new java.awt.Color(255, 255, 255));
        serviceTaxTitle.setText("Service Tax (10% of Total)               :");

        tourismTaxTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        tourismTaxTitle.setForeground(new java.awt.Color(255, 255, 255));
        tourismTaxTitle.setText("Tourism Tax (RM 10 / Night)          :");

        grandTotalTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        grandTotalTitle.setForeground(new java.awt.Color(255, 255, 255));
        grandTotalTitle.setText("Grand Total                                      :");

        total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        serviceTax.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        serviceTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tourismTax.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tourismTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        grandTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        grandTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bookBTN.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        bookBTN.setText("Book");
        bookBTN.addActionListener(GUIEventHandler.actionListener);

        clearBookingBTN.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        clearBookingBTN.setText("Clear");
        clearBookingBTN.setActionCommand("Clear Booking");
        clearBookingBTN.addActionListener(GUIEventHandler.actionListener);

        cancelBookingBTN.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        cancelBookingBTN.setText("Cancel");
        cancelBookingBTN.setActionCommand("Cancel Booking");
        cancelBookingBTN.addActionListener(GUIEventHandler.actionListener);

        customerRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerRoom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout customerDetailsPanelLayout = new javax.swing.GroupLayout(customerDetailsPanel);
        customerDetailsPanel.setLayout(customerDetailsPanelLayout);
        customerDetailsPanelLayout.setHorizontalGroup(
            customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerDetailsPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tourismTaxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(customerNameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerICTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(customerContactTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerEmailTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerRoomTypeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(serviceTaxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grandTotalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerRoomTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerIC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csutomerContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerRoomType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceTax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tourismTax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grandTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerDetailsPanelLayout.createSequentialGroup()
                        .addComponent(customerDetailsTitle)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerDetailsPanelLayout.createSequentialGroup()
                        .addComponent(cancelBookingBTN)
                        .addGap(100, 100, 100)
                        .addComponent(clearBookingBTN)
                        .addGap(96, 96, 96)
                        .addComponent(bookBTN)
                        .addGap(163, 163, 163))))
        );
        customerDetailsPanelLayout.setVerticalGroup(
            customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerDetailsTitle)
                .addGap(18, 18, 18)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerICTitle)
                    .addComponent(customerIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameTitle)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerContactTitle)
                    .addComponent(csutomerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerEmailTitle)
                    .addComponent(customerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerRoomTitle)
                    .addComponent(customerRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerRoomTypeTitle)
                    .addComponent(customerRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTitle)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviceTaxTitle)
                    .addComponent(serviceTax, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tourismTaxTitle)
                    .addComponent(tourismTax, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grandTotalTitle)
                    .addComponent(grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBookingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBookingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainTitlePanel.setOpaque(false);

        bookingTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        bookingTitle.setForeground(new java.awt.Color(204, 204, 204));
        bookingTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookingTitle.setText("Book a Room");

        javax.swing.GroupLayout mainTitlePanelLayout = new javax.swing.GroupLayout(mainTitlePanel);
        mainTitlePanel.setLayout(mainTitlePanelLayout);
        mainTitlePanelLayout.setHorizontalGroup(
            mainTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTitlePanelLayout.createSequentialGroup()
                .addGap(625, 625, 625)
                .addComponent(bookingTitle)
                .addContainerGap(666, Short.MAX_VALUE))
        );
        mainTitlePanelLayout.setVerticalGroup(
            mainTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainTitlePanelLayout.createSequentialGroup()
                .addComponent(bookingTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dateSelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(mainTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(mainTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateSelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableRoomTitle;
    private static javax.swing.JButton bookBTN;
    private javax.swing.JLabel bookingTitle;
    private static javax.swing.JButton cancelBookingBTN;
    private static com.github.lgooddatepicker.components.DatePicker checkInDate;
    private javax.swing.JLabel checkInDateTitle;
    private static com.github.lgooddatepicker.components.DatePicker checkOutDate;
    private javax.swing.JLabel checkOutDateTitle;
    private static javax.swing.JButton checkRoomBTN;
    private static javax.swing.JButton clearBookingBTN;
    private static javax.swing.JTextField csutomerContact;
    private javax.swing.JLabel customerContactTitle;
    private javax.swing.JPanel customerDetailsPanel;
    private javax.swing.JLabel customerDetailsTitle;
    private static javax.swing.JTextField customerEmail;
    private javax.swing.JLabel customerEmailTitle;
    private static javax.swing.JTextField customerIC;
    private javax.swing.JLabel customerICTitle;
    private static javax.swing.JTextField customerName;
    private javax.swing.JLabel customerNameTitle;
    private static javax.swing.JTextField customerRoom;
    private javax.swing.JLabel customerRoomTitle;
    private static javax.swing.JTextField customerRoomType;
    private javax.swing.JLabel customerRoomTypeTitle;
    private javax.swing.JPanel dateSelectionPanel;
    private javax.swing.JLabel dateTitle;
    private static javax.swing.JTextField grandTotal;
    private javax.swing.JLabel grandTotalTitle;
    private javax.swing.JPanel mainTitlePanel;
    private static javax.swing.JTable roomTable;
    private javax.swing.JScrollPane roomTableScrollFrame;
    private static javax.swing.JTextField serviceTax;
    private javax.swing.JLabel serviceTaxTitle;
    private static javax.swing.JTextField total;
    private static javax.swing.JTextField totalNights;
    private javax.swing.JLabel totalNightsTitle;
    private javax.swing.JLabel totalTitle;
    private static javax.swing.JTextField tourismTax;
    private javax.swing.JLabel tourismTaxTitle;
    // End of variables declaration//GEN-END:variables

    public static JTextField getCustomerIC() {
        return customerIC;
    }

    public static JTextField getCustomerName() {
        return customerName;
    }

    public static JTextField getCustomerEmail() {
        return customerEmail;
    }

    public static JTextField getCustomerContact() {
        return csutomerContact;
    }

    public static JTextField getCustomerRoomType() {
        return customerRoomType;
    }

    public static JTextField getCustomerRoom() {
        return customerRoom;
    }

    public static JTextField getGrandTotal() {
        return grandTotal;
    }

    public static JTextField getServiceTax() {
        return serviceTax;
    }

    public static JTextField getTourismTax() {
        return tourismTax;
    }

    public static JTextField getTotal() {
        return total;
    }

    public static JButton getCheckRoomBTN() {
        return checkRoomBTN;
    }

    public static JButton getBookBTN() {
        return bookBTN;
    }

    public static JTable getRoomTable() {
        return roomTable;
    }

    public static DatePicker getCheckInDate() {
        return checkInDate;
    }

    public static DatePicker getCheckOutDate() {
        return checkOutDate;
    }

    public static JButton getClearBookingBTN() {
        return clearBookingBTN;
    }

    public static JButton getCancelBookingBTN() {
        return cancelBookingBTN;
    }

    public static JTextField getTotalNights() {
        return totalNights;
    }
}
