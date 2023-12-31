
import DataBaseOperation.DbConnection;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Seeta Ram
 */
public class UpdateUser extends javax.swing.JFrame {

    
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
    /**
     * Creates new form UpdateUser
     */
    public UpdateUser() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboUserrole = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        dateDob = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Update User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 6, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 15, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 850, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 84, -1, -1));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 84, 350, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 82, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 195, -1, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 195, 270, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 266, -1, -1));

        txtMobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 270, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("UserRole");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 149, -1, -1));

        comboUserrole.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboUserrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pharmacists" }));
        getContentPane().add(comboUserrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 149, 270, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("DOB");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 240, -1, -1));
        getContentPane().add(dateDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 244, 270, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 291, -1, -1));

        comboGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 291, 270, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("PhNo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 149, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 149, 270, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Passward");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, 20));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 268, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Address");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 268, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 334, -1, -1));

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 270, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all_pages_background.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String username = txtUsername.getText();
        if(username.equals("")){
            JOptionPane.showMessageDialog(null, "Username must required for searching");
        }
        else{
            try {
                Connection con = DbConnection.getCon();
                PreparedStatement ps = con.prepareStatement("select*from appuser where username=?");
                ps.setString(1, username);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    
                    String id =rs.getString("appuser_pk");
                    String name = rs.getString("name");
                    String dob = rs.getString("dob");
                    String gender =rs.getString("gender");
                    String userrole = rs.getString("userrole");
                    String email =rs.getString("email");
                    String password = rs.getString("password");
                    String address = rs.getString("address");
                    String mobileNumber = rs.getString("phno");
                    
                    txtEmail.setText(email);
                    txtPassword.setText(password);
                    txtAddress.setText(address);
                    txtName.setText(name);
                    txtId.setText(id);
                    txtMobileNumber.setText(mobileNumber);
                    
                
                    if(userrole.equals("Admin")){
                        comboUserrole.removeAllItems();
                        comboUserrole.addItem("Admin");
                        comboUserrole.addItem("Pharmacist");
                    }
                    else{
                        comboUserrole.removeAllItems();
                        comboUserrole.addItem("Pharmacist");
                        comboUserrole.addItem("Admin");
                    }
                    
                    
                    if(gender.equals("Male")){
                        comboGender.removeAllItems();
                        comboGender.addItem("Male");
                        comboGender.addItem("Female");
                    }
                    else{
                        comboGender.removeAllItems();
                        comboGender.addItem("Female");
                        comboGender.addItem("Male");            
                    }
                    
                    
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
                    
                    if(dob!=""){
                        dateDob.setDate(sdf.parse(dob));
                    }
              
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNumberActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String username =txtUsername.getText();
        String mobileNumber = txtMobileNumber.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String name = txtName.getText();
        String gender = (String)comboGender.getSelectedItem();
        String userRole = (String)comboUserrole.getSelectedItem();
        String address = txtAddress.getText();
        String dob="";
        Date date = dateDob.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        
        if(date!=null){
             dob = sdf.format(date);
        }
        
         if(name.equals("")){
           JOptionPane.showMessageDialog(null,"Name field is required");
       }
       else if(dob.equals("")){
           JOptionPane.showMessageDialog(null,"Date Of Birth field is required");
       }
       else if(mobileNumber.equals("")){
           JOptionPane.showMessageDialog(null,"Mobile Number field is required");
       }
       else if(!mobileNumber.matches(mobileNumberPattern) || mobileNumber.length()!=10){
           JOptionPane.showMessageDialog(null,"Mobile Number field is invalid");
       }
       else if(email.equals("")){
           JOptionPane.showMessageDialog(null,"Email field is required");
       }
       else if(!email.matches(emailPattern)){
           JOptionPane.showMessageDialog(null,"Email Pattern is invalid");
       }
       else if(username.equals("")){
           JOptionPane.showMessageDialog(null,"Username field is required");
       }
       else if(password.equals("")){
           JOptionPane.showMessageDialog(null,"Password field is required");
       }
       else if(password.length()<6){
           JOptionPane.showMessageDialog(null,"Min Password length 6 required");
       }
       else if (address.equals("")){
           JOptionPane.showMessageDialog(null,"Address field is required");
       }
       else{
           try {
            Connection con = DbConnection.getCon();
            String sql = "Update appuser set userrole = ?,name = ?,dob=?,gender=?,phno=?,email=?,password=?,address=? where username=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userRole);
            ps.setString(2,name );
            ps.setString(3,dob );
            ps.setString(4, gender);
            ps.setString(5,mobileNumber);
            ps.setString(6,email );
            ps.setString(7,password );
            ps.setString(8,address );
            ps.setString(9,username );
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "User Data successfully Updated");
            setVisible(false);
            new UpdateUser().setVisible(true);
        } catch (Exception e) {
        }
       }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JComboBox<String> comboUserrole;
    private com.toedter.calendar.JDateChooser dateDob;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
