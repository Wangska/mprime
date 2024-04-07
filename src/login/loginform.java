
package login;

import adminfolder.admindash;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class loginform extends javax.swing.JFrame {

    
    public loginform() {
        initComponents();
    }
    
    public static boolean loginAcc(String username1, String password1){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM users WHERE username ='"+username1+"' AND password ='"+password1+"' ";
            ResultSet resultSet = connector.getData(query);
            return resultSet.next();
        
        
        }catch(SQLException e){
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpass = new javax.swing.JTextField();
        jregisterbutton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        juser = new javax.swing.JTextField();
        jloginbtn1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(642, 535));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 170, 110, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 110, 120, 30);

        jpass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(jpass);
        jpass.setBounds(270, 170, 210, 30);

        jregisterbutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jregisterbutton.setText("Register");
        jregisterbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jregisterbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(jregisterbutton);
        jregisterbutton.setBounds(130, 370, 120, 40);

        jCheckBox1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCheckBox1.setText("Show Password");
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(320, 200, 170, 23);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 250, 100, 40);

        juser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(juser);
        juser.setBounds(270, 110, 210, 30);

        jloginbtn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jloginbtn1.setText("Login");
        jloginbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(jloginbtn1);
        jloginbtn1.setBounds(420, 250, 120, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Create an Account?");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 340, 200, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jregisterbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jregisterbuttonActionPerformed
        // TODO add your handling code here:
        
                
                Registerform ads = new Registerform();
                ads.setVisible(true);
                this.dispose();
      
        
        
                
        
    }//GEN-LAST:event_jregisterbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jloginbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginbtn1ActionPerformed
        // login button
        
        if(loginAcc(juser.getText(),jpass.getText())){
           JOptionPane.showMessageDialog(null,"Login Successfully");
           admindash ads = new admindash();
           ads.setVisible(true);
           this.dispose();
       }else{
           JOptionPane.showMessageDialog(null, "Invalid User or Password");
           
        
       }
        
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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jloginbtn1;
    private javax.swing.JTextField jpass;
    private javax.swing.JButton jregisterbutton;
    private javax.swing.JTextField juser;
    // End of variables declaration//GEN-END:variables
}
