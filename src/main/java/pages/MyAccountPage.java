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
public class MyAccountPage extends javax.swing.JFrame {
    private User user;
    /**
     * Creates new form MyAccountPage
     */
    public MyAccountPage(User user) {
        super("My Account Page");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        initComponents();
        
        try {
            NameValueLabel.setText( this.user.getName() );
            UsernameValueLabel.setText( this.user.getCredential().getUsername() );
            PasswordValueLabel.setText( this.user.getCredential().getPassword() );
            ContactNoValueLabel.setText( this.user.getContactNo() );
            EmailValueLabel.setText( this.user.getEmail() );
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        BackPanel = new javax.swing.JPanel();
        BackLabel = new javax.swing.JLabel();
        TitlePanel = new javax.swing.JPanel();
        GreetingLabel = new javax.swing.JLabel();
        MyAccountLogo = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        ContacNoLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        NameValueLabel = new javax.swing.JLabel();
        UsernameValueLabel = new javax.swing.JLabel();
        PasswordValueLabel = new javax.swing.JLabel();
        ContactNoValueLabel = new javax.swing.JLabel();
        EmailValueLabel = new javax.swing.JLabel();
        ChangePasswordPanel = new javax.swing.JPanel();
        ChangePasswordLabel = new javax.swing.JLabel();
        CompletePanel = new javax.swing.JPanel();
        CompleteLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(153, 153, 153));

        BackPanel.setBackground(new java.awt.Color(204, 204, 204));
        BackPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackPanelMouseExited(evt);
            }
        });

        BackLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        BackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/Back.png"))); // NOI18N
        BackLabel.setText("Back");

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TitlePanel.setBackground(new java.awt.Color(204, 204, 204));

        GreetingLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        GreetingLabel.setText("Hello <name>");

        MyAccountLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/my_account.png"))); // NOI18N
        MyAccountLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(MyAccountLogo)
                .addGap(47, 47, 47)
                .addComponent(GreetingLabel)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGroup(TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TitlePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MyAccountLogo))
                    .addGroup(TitlePanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(GreetingLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        NameLabel.setText("USERNAME :");

        UsernameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        UsernameLabel.setText("NAME :");

        PasswordLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        PasswordLabel.setText("PASSWORD :");

        ContacNoLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        ContacNoLabel.setText("CONTACT NO :");

        EmailLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        EmailLabel.setText("E-MAIL :");

        NameValueLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        NameValueLabel.setText("<name>");

        UsernameValueLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        UsernameValueLabel.setText("<username>");

        PasswordValueLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        PasswordValueLabel.setText("<password>");

        ContactNoValueLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        ContactNoValueLabel.setText("<contact no>");

        EmailValueLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        EmailValueLabel.setText("<e-mail>");

        ChangePasswordPanel.setBackground(new java.awt.Color(204, 204, 204));
        ChangePasswordPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePasswordPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChangePasswordPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChangePasswordPanelMouseExited(evt);
            }
        });

        ChangePasswordLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        ChangePasswordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/Reset.png"))); // NOI18N
        ChangePasswordLabel.setText("   Change Password");

        javax.swing.GroupLayout ChangePasswordPanelLayout = new javax.swing.GroupLayout(ChangePasswordPanel);
        ChangePasswordPanel.setLayout(ChangePasswordPanelLayout);
        ChangePasswordPanelLayout.setHorizontalGroup(
            ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChangePasswordPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChangePasswordLabel)
                .addGap(79, 79, 79))
        );
        ChangePasswordPanelLayout.setVerticalGroup(
            ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChangePasswordLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CompletePanel.setBackground(new java.awt.Color(204, 204, 204));
        CompletePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompletePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CompletePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CompletePanelMouseExited(evt);
            }
        });

        CompleteLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        CompleteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/Checkmark.png"))); // NOI18N
        CompleteLabel.setText("Complete");

        javax.swing.GroupLayout CompletePanelLayout = new javax.swing.GroupLayout(CompletePanel);
        CompletePanel.setLayout(CompletePanelLayout);
        CompletePanelLayout.setHorizontalGroup(
            CompletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompletePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CompleteLabel)
                .addGap(79, 79, 79))
        );
        CompletePanelLayout.setVerticalGroup(
            CompletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CompleteLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330)
                        .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordLabel)
                            .addComponent(UsernameLabel)
                            .addComponent(NameLabel)
                            .addComponent(ContacNoLabel)
                            .addComponent(EmailLabel))
                        .addGap(101, 101, 101)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameValueLabel)
                            .addComponent(UsernameValueLabel)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(PasswordValueLabel)
                                .addGap(49, 49, 49)
                                .addComponent(ChangePasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ContactNoValueLabel)
                            .addComponent(EmailValueLabel)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(533, 533, 533)
                        .addComponent(CompletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel)
                    .addComponent(NameValueLabel))
                .addGap(54, 54, 54)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(UsernameValueLabel))
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordLabel)
                            .addComponent(PasswordValueLabel)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(ChangePasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContacNoLabel)
                    .addComponent(ContactNoValueLabel))
                .addGap(56, 56, 56)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel)
                    .addComponent(EmailValueLabel))
                .addGap(51, 51, 51)
                .addComponent(CompletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackPanelMouseEntered
        BackPanel.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_BackPanelMouseEntered

    private void BackPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackPanelMouseExited
        BackPanel.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_BackPanelMouseExited

    private void BackPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackPanelMouseClicked
        this.dispose();
        new AdminPage(user).setVisible(true);     
    }//GEN-LAST:event_BackPanelMouseClicked

    private void ChangePasswordPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordPanelMouseEntered
        ChangePasswordPanel.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_ChangePasswordPanelMouseEntered

    private void ChangePasswordPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordPanelMouseExited
        ChangePasswordPanel.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_ChangePasswordPanelMouseExited

    private void ChangePasswordPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangePasswordPanelMouseClicked

    private void CompletePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompletePanelMouseEntered
        CompletePanel.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_CompletePanelMouseEntered

    private void CompletePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompletePanelMouseExited
        CompletePanel.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_CompletePanelMouseExited

    private void CompletePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompletePanelMouseClicked
        this.dispose();
        new AdminPage(user).setVisible(true);
    }//GEN-LAST:event_CompletePanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLabel;
    private javax.swing.JPanel BackPanel;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel ChangePasswordLabel;
    private javax.swing.JPanel ChangePasswordPanel;
    private javax.swing.JLabel CompleteLabel;
    private javax.swing.JPanel CompletePanel;
    private javax.swing.JLabel ContacNoLabel;
    private javax.swing.JLabel ContactNoValueLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel EmailValueLabel;
    private javax.swing.JLabel GreetingLabel;
    private javax.swing.JLabel MyAccountLogo;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameValueLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PasswordValueLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel UsernameValueLabel;
    // End of variables declaration//GEN-END:variables
}
