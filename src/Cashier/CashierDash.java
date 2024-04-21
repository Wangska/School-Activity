/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cashier;

import LoginandRegister.LoginForm;
import Panels.Cashier_dash;
import config.dbConnector;
import config.session;
import displayuserinfo.displayuser;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import panelloader.JpanelLoader;

/**
 *
 * @author Sofia
 */
public class CashierDash extends javax.swing.JFrame {

    JpanelLoader jpload = new JpanelLoader();
    
    public CashierDash() {
        initComponents();
        displayusers();
        
    }
    static String id;
    static String last;
    static String first;
    static String middle;
    static String adds;
    static String contac;
    static String email_add;
    static String gender_m;
    static String user_name;
    static String pass_word;
    static String confirm_password;
    
   
     public void displayusers(){
    
        session sess = session.getInstance();
       
        cashierdisplay.setText(""+sess.getLast());
        cashierdisplayfirst.setText(""+sess.getFirst());
       
    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Display_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cashierdisplay = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cashierdisplayfirst = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        Display_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Display_panel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Display_panelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout Display_panelLayout = new javax.swing.GroupLayout(Display_panel);
        Display_panel.setLayout(Display_panelLayout);
        Display_panelLayout.setHorizontalGroup(
            Display_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1266, Short.MAX_VALUE)
        );
        Display_panelLayout.setVerticalGroup(
            Display_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        jPanel1.add(Display_panel);
        Display_panel.setBounds(10, 70, 1270, 650);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 10, 94, 30);

        cashierdisplay.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cashierdisplay.setForeground(new java.awt.Color(255, 255, 255));
        cashierdisplay.setText("Cashier");
        jPanel2.add(cashierdisplay);
        cashierdisplay.setBounds(170, 10, 310, 30);

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("Log-out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(1169, 10, 90, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons8-account-48.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 0, 48, 50);

        cashierdisplayfirst.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cashierdisplayfirst.setForeground(new java.awt.Color(255, 255, 255));
        cashierdisplayfirst.setText("Cashier");
        jPanel2.add(cashierdisplayfirst);
        cashierdisplayfirst.setBounds(300, 10, 310, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Peach and Orange Creative Illustrated Abstract Pizza Boxcar Presentation (1).png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(190, 0, 1080, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Peach and Orange Creative Illustrated Abstract Pizza Boxcar Presentation (1).png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(-390, 0, 790, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 1270, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Display_panelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Display_panelAncestorAdded
        // TODO add your handling code here:
        
        
        Cashier_dash cash = new Cashier_dash();
        jpload.jPanelLoader(Display_panel, cash);
        
        displayusers();
        
        
    }//GEN-LAST:event_Display_panelAncestorAdded

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // lgout btn
        JOptionPane.showMessageDialog(null, "Log-out Successfully");
        LoginForm log = new LoginForm();
        log.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // mouse click displaying details
        
        String last = cashierdisplay.getText();
        
        dbConnector dbc = new dbConnector();
        
        try{
            
            String query =("SELECT * FROM users WHERE lastname ='"+last+"' ");
            ResultSet rs = dbc.getData(query);
            
            if(rs.next()){
                
                session sess = session.getInstance(); 
                
                displayuser dis = new displayuser();
                
                dis.display_id.setText(""+sess.getId());
                dis.reglast.setText(""+sess.getLast());
                dis.regfirst.setText(""+sess.getFirst());
                dis.regmid.setText(""+sess.getMiddle());
                dis.regadd.setText(""+sess.getAdds());
                dis.regcontact.setText(""+sess.getContac());
                dis.regemail.setText(""+sess.getEmail_add());
                dis.gen2.setText(""+sess.getGender_m());
                dis.setVisible(true);
                
            
            }
        
        
        }catch(SQLException e){
            System.out.println(""+e);

        }
        displayusers();
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        session sess = session.getInstance();
        int user_id = sess.getId();
        
        if(user_id == 0){
            JOptionPane.showMessageDialog(null, "No Account, Login First!");
            LoginForm log = new LoginForm();
            log.setVisible(true);
            this.dispose();
        }else{
            cashierdisplay.setText(""+sess.getLast());
        }
        displayusers();
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(CashierDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Display_panel;
    public javax.swing.JLabel cashierdisplay;
    public javax.swing.JLabel cashierdisplayfirst;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
