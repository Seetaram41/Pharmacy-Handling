
import DataBaseOperation.DbConnection;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Seeta Ram
 */
public class Profile extends javax.swing.JFrame {
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
    public String username = "";
     
    public Profile() {
        initComponents();
    }
    public Profile(String tempUsername) {
        initComponents();
        username=tempUsername;
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        dateDob = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Profile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 6, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 14, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 850, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 153, -1, 109));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Update Profile");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 102, -1, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 102, 250, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 153, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 153, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Phno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 209, -1, -1));

        txtPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 209, 250, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 268, -1, -1));

        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 268, 250, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 335, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 268, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Address");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 268, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("DOB");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 341, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 408, -1, -1));
        getContentPane().add(dateDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 240, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all_pages_background.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel12ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jLabel12ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel12ComponentShown
        
    }//GEN-LAST:event_jLabel12ComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       
        try{
            Connection con =DbConnection.getCon();
            String query = "select*from appuser where username=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                txtName.setText(rs.getString("name"));
                txtEmail.setText(rs.getString("email"));
                txtPhone.setText(rs.getString("phno"));
                txtAddress.setText(rs.getString("address"));
                String dob = rs.getString("dob");
                SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
                    
                if(dob!=""){
                    dateDob.setDate(sdf.parse(dob));
                }
                  
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String name = txtName.getText();
       String email = txtEmail.getText();
       String phno = txtPhone.getText();
       String address=txtAddress.getText();
       SimpleDateFormat sdf =  new SimpleDateFormat("dd-mm-yyyy");
       Date date = dateDob.getDate();
       String dob="";
       if(date!=null){
           dob = sdf.format(date);
       }
       if(name.equals("")){
           JOptionPane.showMessageDialog(null,"Name field is required");
       }
       else if(dob.equals("")){
           JOptionPane.showMessageDialog(null,"Date Of Birth field is required");
       }
       else if(phno.equals("")){
           JOptionPane.showMessageDialog(null,"Mobile Number field is required");
       }
       else if(!phno.matches(mobileNumberPattern) || phno.length()!=10){
           JOptionPane.showMessageDialog(null,"Mobile Number field is invalid");
       }
       else if(email.equals("")){
           JOptionPane.showMessageDialog(null,"Email field is required");
       }
       else if(!email.matches(emailPattern)){
           JOptionPane.showMessageDialog(null,"Email Pattern is invalid");
       }
       else if (address.equals("")){
           JOptionPane.showMessageDialog(null,"Address field is required");
       }
       else{
            try {
            Connection con = DbConnection.getCon();
            String sql = "Update appuser set name = ?,email=?,phno=?,address=?,dob=? where username =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2, email);
            ps.setString(3,phno);
            ps.setString(4, address);
            ps.setString(5, dob);
            ps.setString(6, username);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Details has been updated successfully");
            setVisible(false);
            new Profile(username).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "e");
        }
       }
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateDob;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
