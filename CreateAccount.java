/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cindy
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
    initComponents();}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        termsncondition = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        termsncondition.setBorder(null);
        termsncondition.setContentAreaFilled(false);
        termsncondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termsnconditionActionPerformed(evt);
            }
        });
        jPanel1.add(termsncondition);
        termsncondition.setBounds(170, 980, 140, 30);

        signup.setBorder(null);
        signup.setContentAreaFilled(false);
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup);
        signup.setBounds(70, 910, 320, 40);

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 50, 80, 23);

        username.setBackground(new java.awt.Color(255, 253, 231));
        username.setBorder(null);
        jPanel1.add(username);
        username.setBounds(70, 340, 290, 30);

        jPasswordField1.setBackground(new java.awt.Color(255, 253, 231));
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(70, 550, 300, 30);

        email.setBackground(new java.awt.Color(255, 253, 231));
        email.setBorder(null);
        jPanel1.add(email);
        email.setBounds(70, 454, 290, 30);

        phonenumber.setBackground(new java.awt.Color(255, 253, 231));
        phonenumber.setBorder(null);
        phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberActionPerformed(evt);
            }
        });
        jPanel1.add(phonenumber);
        phonenumber.setBounds(70, 670, 290, 30);

        address.setBackground(new java.awt.Color(255, 253, 231));
        address.setBorder(null);
        jPanel1.add(address);
        address.setBounds(70, 790, 290, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\cindy\\Downloads\\Final Project programming\\login page\\sign up.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -70, 490, 1180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
           
        try {
            String url = "jdbc:mysql://localhost:3306/oishisushi";
            String userid = "root";
            String password = "root";
            String sql = "INSERT INTO login_page (`Username`, `Email`, `Password`, `Phone Number`, `Address`) VALUES (?,?,?,?,?)";
            String sql2 = "SELECT * FROM login_page";
            
            Connection connection = DriverManager.getConnection(url,userid,password);
            PreparedStatement preparedStmt = connection.prepareStatement(sql);
             
            preparedStmt.setString(1, username.getText());
            preparedStmt.setString(2, email.getText());
            preparedStmt.setString(3, jPasswordField1.getText());
            preparedStmt.setInt(4, Integer.parseInt(phonenumber.getText()));
            preparedStmt.setString(5, address.getText());

        
        preparedStmt.execute();
             
            
        } catch(Exception e) {
             Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, e);;
        }

    }//GEN-LAST:event_signupActionPerformed

    private void termsnconditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termsnconditionActionPerformed
        TermsnCondition tnc = new TermsnCondition ();
        tnc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_termsnconditionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginPage lp = new LoginPage ();
        lp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JButton signup;
    private javax.swing.JButton termsncondition;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
