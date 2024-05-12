/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayadmin;

import AdminforApproving.Admindash;
import displayuserinfo.*;
import Cashier.CashierDash;
import config.dbConnector;
import config.session;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sofia
 */
public class displayadmin extends javax.swing.JFrame {

    /**
     * Creates new form displayuser
     */
    public displayadmin() {
        initComponents();
        displayusers();
      
    }
    
    public void displayusers(){
    
        session sess = session.getInstance();
        
        display_id.setText(""+sess.getId());
        reglast.setText(""+sess.getLast());
        regfirst.setText(""+sess.getFirst());
        regmid.setText(""+sess.getMiddle());
        regadd.setText(""+sess.getAdds());
        regcontact.setText(""+sess.getContac());
        regemail.setText(""+sess.getEmail_add());
        gen2.setText(""+sess.getGender_m());
    
    }
    
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        display_id = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        regmid = new javax.swing.JLabel();
        gen2 = new javax.swing.JLabel();
        regfirst = new javax.swing.JLabel();
        reglast = new javax.swing.JLabel();
        regadd = new javax.swing.JLabel();
        regcontact = new javax.swing.JLabel();
        regemail = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(441, 479));
        setMinimumSize(new java.awt.Dimension(441, 479));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Last Name : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 100, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("First Name : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 140, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Middle Name : ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 180, 140, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Address :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 220, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 300, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Contact Number :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 260, 170, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Gender :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(40, 340, 150, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons8-return-25.png"))); // NOI18N
        jLabel6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(390, 10, 30, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("ID NO: ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 40, 80, 20);

        display_id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        display_id.setText("D ID");
        jPanel1.add(display_id);
        display_id.setBounds(100, 40, 80, 20);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Update Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 400, 190, 40);

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Update Information");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 400, 190, 40);

        regmid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        regmid.setText("jLabel1");
        jPanel1.add(regmid);
        regmid.setBounds(230, 180, 180, 30);

        gen2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gen2.setText("jLabel1");
        jPanel1.add(gen2);
        gen2.setBounds(230, 340, 180, 30);

        regfirst.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        regfirst.setText("jLabel1");
        jPanel1.add(regfirst);
        regfirst.setBounds(230, 140, 180, 30);

        reglast.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        reglast.setText("jLabel1");
        jPanel1.add(reglast);
        reglast.setBounds(230, 100, 180, 30);

        regadd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        regadd.setText("jLabel1");
        jPanel1.add(regadd);
        regadd.setBounds(230, 220, 180, 30);

        regcontact.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        regcontact.setText("jLabel1");
        jPanel1.add(regcontact);
        regcontact.setBounds(230, 260, 180, 30);

        regemail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        regemail.setText("jLabel1");
        jPanel1.add(regemail);
        regemail.setBounds(230, 300, 180, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Peach and Orange Creative Illustrated Abstract Pizza Boxcar Presentation.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(-410, 0, 850, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6AncestorAdded

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        
        this.dispose();
        Admindash ad = new Admindash();
            ad.setVisible(true);
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
         String ids = display_id.getText();
        
        dbConnector dbc = new dbConnector();
        
        try{
            
            String query =("SELECT * FROM users WHERE id ='"+ids+"' ");
            ResultSet rs = dbc.getData(query);
            
            if(rs.next()){
                
                updatepassadmin upd = new updatepassadmin();
                upd.display_id.setText(rs.getString("id"));
                upd.reguser.setText(rs.getString("username"));
              
                
                upd.setVisible(true);
                
            
            }
        
        
        }catch(Exception e){
        
        
        
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
       
        String ids = display_id.getText();
        
        dbConnector dbc = new dbConnector();
        
        try{
            
            String query =("SELECT * FROM users WHERE id ='"+ids+"' ");
            ResultSet rs = dbc.getData(query);
            
            if(rs.next()){
                
                session sess = session.getInstance(); 
                
                updateinfoadmin upd = new updateinfoadmin();
                upd.display_id.setText(""+sess.getId());
                upd.reglast.setText(""+sess.getLast());
                upd.regfirst.setText(""+sess.getFirst());
                upd.regmid.setText(""+sess.getMiddle());
                upd.regadd.setText(""+sess.getAdds());
                upd.regcontact.setText(""+sess.getContac());
                upd.regemail.setText(""+sess.getEmail_add());
                upd.gen.setSelectedItem(""+sess.getGender_m());
               
                
                upd.setVisible(true);
                
            
            }
        
        
        }catch(Exception e){
        
        
        
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
     
        
        
    }//GEN-LAST:event_formWindowActivated

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

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
            java.util.logging.Logger.getLogger(displayadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(displayadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(displayadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(displayadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new displayadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel display_id;
    public javax.swing.JLabel gen2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel regadd;
    public javax.swing.JLabel regcontact;
    public javax.swing.JLabel regemail;
    public javax.swing.JLabel regfirst;
    public javax.swing.JLabel reglast;
    public javax.swing.JLabel regmid;
    // End of variables declaration//GEN-END:variables
}
