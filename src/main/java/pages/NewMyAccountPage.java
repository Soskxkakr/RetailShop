/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import java.awt.Color;
import model.User;

/**
 *
 * @author Reinaldo Taslim
 */
public class NewMyAccountPage extends javax.swing.JFrame {

    public NewMyAccountPage(User user) {
        super("My Account Page");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        initComponents();
        
        this.nameLblValue.setText(user.getName());
        this.usernameLblValue.setText(user.getCredential().getUsername());
        this.passwordLblValue.setText(user.getCredential().getPassword());
        this.contactLblValue.setText(user.getContactNo());
        this.emailLblValue.setText(user.getEmail());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usernameLblValue = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        contactLbl = new javax.swing.JLabel();
        nameLblValue = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        contactLblValue = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        emailLblValue = new javax.swing.JLabel();
        passwordLblValue = new javax.swing.JLabel();
        backPanel = new javax.swing.JPanel();
        backIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLblValue.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        usernameLblValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLblValue.setText("Username");
        jPanel1.add(usernameLblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 180, -1));

        usernameLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        usernameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLbl.setText("Username");
        jPanel1.add(usernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 104, -1));

        nameLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLbl.setText("Name");
        jPanel1.add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 104, -1));

        contactLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        contactLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactLbl.setText("Contact no");
        jPanel1.add(contactLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 104, -1));

        nameLblValue.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        nameLblValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLblValue.setText("Name");
        jPanel1.add(nameLblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 180, -1));

        emailLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLbl.setText("E-mail");
        jPanel1.add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 104, -1));

        contactLblValue.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        contactLblValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactLblValue.setText("Contact no");
        jPanel1.add(contactLblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 180, -1));

        passwordLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLbl.setText("Password");
        jPanel1.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 104, -1));

        emailLblValue.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        emailLblValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLblValue.setText("E-mail");
        jPanel1.add(emailLblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 180, -1));

        passwordLblValue.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        passwordLblValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLblValue.setText("Password");
        jPanel1.add(passwordLblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 180, -1));

        backPanel.setBackground(new java.awt.Color(204, 204, 204));
        backPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backPanelMouseExited(evt);
            }
        });

        backIcon.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        backIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/Back.png"))); // NOI18N
        backIcon.setText("Back");

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addComponent(backIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPanelMouseEntered
        backPanel.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_backPanelMouseEntered

    private void backPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPanelMouseExited
        backPanel.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_backPanelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backIcon;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel contactLbl;
    private javax.swing.JLabel contactLblValue;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel emailLblValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel nameLblValue;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel passwordLblValue;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JLabel usernameLblValue;
    // End of variables declaration//GEN-END:variables
}
