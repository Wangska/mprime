/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import adminfolder.admindash;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Sofia
 */
public class Registerform extends javax.swing.JFrame {

    /**
     * Creates new form Registerform
     */
    public Registerform() {
        initComponents();
    }
    
    public static String email_user, user_name;
    
    public boolean emailcheck(){
        dbConnector dbc = new dbConnector();
        
        try{
        String query = "SELECT * FROM users WHERE username ='"+reguser.getText()+"' AND email ='"+regemail.getText()+"' ";
            ResultSet resultSet = dbc.getData(query);
       
            
            if(resultSet.next()){
                email_user = resultSet.getString("email");  
                if(email_user.equals(regemail.getText())){
                    JOptionPane.showMessageDialog(null, "Email Already exist!");
                    regemail.setText("");
                }
                user_name = resultSet.getString("username");
                if(user_name.equals(reguser.getText())){
                    JOptionPane.showMessageDialog(null, "Username Already exist!");
                    reguser.setText("");
                }
                return true;
            }else{
                return false;
            }
            
            
        
        }catch(SQLException e){
            System.out.println(""+e);
            return false;
        }
        
    }
    
    public boolean usercheck(){
        dbConnector dbc = new dbConnector();
        
        try{
        String query = "SELECT * FROM users WHERE username ='"+reguser.getText()+"' AND email ='"+regemail.getText()+"' ";
            ResultSet resultSet = dbc.getData(query);
       
            
            if(resultSet.next()){
                user_name = resultSet.getString("username");
                if(user_name.equals(reguser.getText())){
                    JOptionPane.showMessageDialog(null, "Username Already exist!");
                    reguser.setText("");
                }
                return true;
            }else{
                return false;
            }
            
            
        
        }catch(SQLException e){
            System.out.println(""+e);
            return false;
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regemail = new javax.swing.JTextField();
        regcontact = new javax.swing.JTextField();
        reguser = new javax.swing.JTextField();
        regpass = new javax.swing.JTextField();
        reglast = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        regfirst = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        accnt_type = new javax.swing.JComboBox<>();
        jloginbtn1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 390, 150, 44);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Contact Number :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 180, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Last Name : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 80, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 130, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Username :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 240, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Have an Account?");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 430, 200, 30);

        regemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regemailActionPerformed(evt);
            }
        });
        jPanel1.add(regemail);
        regemail.setBounds(200, 130, 290, 30);

        regcontact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcontactActionPerformed(evt);
            }
        });
        jPanel1.add(regcontact);
        regcontact.setBounds(200, 180, 290, 30);

        reguser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(reguser);
        reguser.setBounds(200, 240, 290, 30);

        regpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(regpass);
        regpass.setBounds(200, 290, 290, 30);

        reglast.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(reglast);
        reglast.setBounds(200, 80, 290, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("First Name : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 30, 170, 30);

        regfirst.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(regfirst);
        regfirst.setBounds(200, 30, 290, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Password :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 290, 170, 30);

        accnt_type.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        accnt_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jPanel1.add(accnt_type);
        accnt_type.setBounds(200, 340, 290, 30);

        jloginbtn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jloginbtn1.setText("Login");
        jloginbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(jloginbtn1);
        jloginbtn1.setBounds(110, 460, 120, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Account Type :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 340, 150, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regemailActionPerformed

    private void regcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regcontactActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Register Button
        
        if(regfirst.getText().isEmpty() || reglast.getText().isEmpty() 
                || regemail.getText().isEmpty() || regcontact.getText().isEmpty() 
                || reguser.getText().isEmpty() || regpass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
            
        }else if(emailcheck()){
            System.out.println("Duplicate Exist!");
            
        }else if(regcontact.getText().length() != 11 ){
            JOptionPane.showMessageDialog(null, "Contact Number should be 11");
            regcontact.setText("");
            
        }else if(usercheck()){
            System.out.println("Duplicate Exist!");
            
        }else if(regpass.getText().length() <8){
            JOptionPane.showMessageDialog(null, "Password Should be 8!");
            regpass.setText("");

        }else{
            dbConnector dbc = new dbConnector();
        
        if(dbc.insertData("INSERT INTO users(firstname, lastname, email, contactnumber, username, password, account_type, status)"
                            + "Values ('"+regfirst.getText()+"', '"+reglast.getText()+"', '"+regemail.getText()+"',"
                                    + " '"+regcontact.getText()+"', '"+reguser.getText()+"', '"+regpass.getText()+"',"
                                            + " '"+accnt_type.getSelectedItem()+"','Pending')"))
        {
            JOptionPane.showMessageDialog(null, "Registration Successfully");
            loginform log = new loginform();
            log.setVisible(true);
            this.dispose();
        
        }else{
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
        }
        
        
      
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jloginbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginbtn1ActionPerformed
        // TODO add your handling code here:
                loginform ads = new loginform();
                ads.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jloginbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accnt_type;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jloginbtn1;
    private javax.swing.JTextField regcontact;
    private javax.swing.JTextField regemail;
    private javax.swing.JTextField regfirst;
    private javax.swing.JTextField reglast;
    private javax.swing.JTextField regpass;
    private javax.swing.JTextField reguser;
    // End of variables declaration//GEN-END:variables
}
