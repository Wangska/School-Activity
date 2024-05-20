/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cashier;

import LoginandRegister.LoginForm;
import config.dbConnector;
import config.session;
import displayuserinfo.displayuser;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import panelloader.JpanelLoader;
import javax.swing.JTable;

/**
 *
 * @author Sofia
 */
public class CashierDash extends javax.swing.JFrame {

    JpanelLoader jpload = new JpanelLoader();
    
    public CashierDash() {
        initComponents();
        displayusers();
        data_load1();
        dates();
        times();
        
    }
    private void dates(){
        
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
         
        String dt = sdf.format(d);
        date.setText(dt);
             
    }
    
        Timer t;
        SimpleDateFormat st;
    
    private void times(){

        t = new Timer(0, (ActionEvent ae) -> {
            Date dt = new Date();
            st = new SimpleDateFormat("hh:mm:ss a");
            
            String tm = st.format(dt);
            time.setText(tm);
        });
        
        t.start();
        
    }
    
    public void data_load1(){

        dbConnector dbc = new dbConnector();
        
        try{
            
            String query = ("SELECT * FROM product");
            ResultSet rs = dbc.getData(query);
            Vector v = new Vector();
            
            while (rs.next()){
            v.add(rs.getString("pname"));
            
            DefaultComboBoxModel com = new DefaultComboBoxModel (v);
            com_pro.setModel(com);
        
        }
            
        }catch(SQLException e){
            System.out.println(e);
        
        
        }
        
        try{
        
        
       String querys =("SELECT * FROM extra WHERE exid =1");
       ResultSet rss = dbc.getData(querys);
        
        if(rss.next()){
        
            inid.setText(rss.getString("val"));
            
        
        }
        
        
            
        }catch(Exception e){
        
        }
        
        int i = Integer.valueOf(inid.getText());
        i++;
        inid.setText(String.valueOf(i));
        
        
}
    
    public void pro_tot_cal(){
    //product calculation
            
            Double qt = Double.valueOf(p_qty.getText());
            Double price = Double.valueOf(u_price.getText());
            Double tot ;
            
            tot = qt * price;
            
            total_price.setText(String.valueOf(tot));
    
    }
    
    public void cart_total(){
    
        int numofrow = sale_table.getRowCount();
        
        double total = 0;
        
        for(int i = 0; i < numofrow; i++){
            
            double value = Double.valueOf(sale_table.getValueAt(i, 5).toString());
            total += value ;
        
        
        }
        bill_total.setText(Double.toString(total));
        
        
        // total qnty count
        
        int numofrows = sale_table.getRowCount();
        
        double totals = 0;
        
        for(int i = 0; i < numofrows; i++){
            
            double values = Double.valueOf(sale_table.getValueAt(i, 3).toString());
            totals += values ;
        
        
        }
        total_qty.setText(Double.toString(totals));
        
        
    
    
    }
    
    public void tot(){
    
    // Total amount paid
        
        Double paid = Double.valueOf(paid_amt.getText());
        Double tot = Double.valueOf(bill_total.getText());
        Double due;
        
        due = paid - tot;
        
        balance_due.setText(String.valueOf(due));
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
     
      public void getData(String id){
          
          dbConnector dbc = new dbConnector();
         
         try{
             
             String query = "SELECT * FROM sales WHERE salesid ='"+id+"' ";
             ResultSet rs = dbc.getData(query);
              if(rs.next()){

                 session sess = session.getInstance(); 
                 
                 sess.setId(rs.getInt("INID"));
         
              }
         
         
         }catch(Exception e){
         
         
         }
  
     
     }
     
     
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Display_panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        inid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sale_table = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        paid_amt = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        bill_total = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        balance_due = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        total_qty = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        com_pro = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        p_qty = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        u_price = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        total_price = new javax.swing.JLabel();
        br_code = new javax.swing.JLabel();
        br_code1 = new javax.swing.JLabel();
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

        jPanel4.setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        inid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(inid);
        inid.setBounds(220, 10, 140, 24);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Invoice No :");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(80, 10, 120, 24);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Date :");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(420, 10, 70, 30);

        date.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(date);
        date.setBounds(490, 10, 166, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Time :");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(710, 10, 70, 30);

        time.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(time);
        time.setBounds(780, 10, 166, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Peach and Orange Creative Illustrated Abstract Pizza Boxcar Presentation (1).png"))); // NOI18N
        jPanel5.add(jLabel6);
        jLabel6.setBounds(910, -160, 340, 620);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Peach and Orange Creative Illustrated Abstract Pizza Boxcar Presentation (1).png"))); // NOI18N
        jPanel5.add(jLabel7);
        jLabel7.setBounds(0, 0, 1080, 530);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(10, 20, 1240, 50);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(null);

        sale_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INID", "Product Name", "Barcode", "Quantity", "Unit Price", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(sale_table);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7);
        jPanel7.setBounds(2, 2, 1230, 340);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Paid Amount :");

        paid_amt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        paid_amt.setText("0");
        paid_amt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid_amtActionPerformed(evt);
            }
        });
        paid_amt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paid_amtKeyReleased(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Total Amount :");

        bill_total.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bill_total.setText("00.00");
        bill_total.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Balance /Due :");

        balance_due.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        balance_due.setText("00.00");
        balance_due.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bill_total, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(balance_due, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bill_total, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balance_due, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Total Qty :");

        total_qty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        total_qty.setText("00");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paid_amt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(paid_amt)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_qty))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel8);
        jPanel8.setBounds(390, 360, 660, 90);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);
        jButton1.setBounds(20, 370, 80, 60);

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);
        jButton2.setBounds(130, 370, 89, 60);

        jButton3.setText("Remove All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);
        jButton3.setBounds(240, 370, 130, 60);

        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setText("Pay & Print");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);
        jButton4.setBounds(1060, 370, 160, 70);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Peach and Orange Creative Illustrated Abstract Pizza Boxcar Presentation (1).png"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(170, -70, 1126, 610);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Peach and Orange Creative Illustrated Abstract Pizza Boxcar Presentation (1).png"))); // NOI18N
        jLabel15.setText("jLabel14");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(0, -90, 1126, 610);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(10, 160, 1240, 460);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Product :");
        jPanel10.add(jLabel16);
        jLabel16.setBounds(10, 20, 63, 30);

        com_pro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        com_pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        com_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_proActionPerformed(evt);
            }
        });
        jPanel10.add(com_pro);
        com_pro.setBounds(80, 20, 190, 30);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Qty :");
        jPanel10.add(jLabel17);
        jLabel17.setBounds(350, 20, 31, 30);

        p_qty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p_qty.setText("0");
        p_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_qtyActionPerformed(evt);
            }
        });
        p_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p_qtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                p_qtyKeyReleased(evt);
            }
        });
        jPanel10.add(p_qty);
        p_qty.setBounds(390, 20, 103, 30);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Unit Price :");
        jPanel10.add(jLabel18);
        jLabel18.setBounds(520, 20, 76, 30);

        u_price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        u_price.setText("00.00");
        jPanel10.add(u_price);
        u_price.setBounds(610, 20, 48, 30);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Total Price :");
        jPanel10.add(jLabel19);
        jLabel19.setBounds(730, 20, 82, 30);

        total_price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        total_price.setText("00.00");
        jPanel10.add(total_price);
        total_price.setBounds(840, 20, 80, 30);

        br_code.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        br_code.setText("0");
        jPanel10.add(br_code);
        br_code.setBounds(1090, 20, 67, 30);

        br_code1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        br_code1.setText("Barcode :");
        jPanel10.add(br_code1);
        br_code1.setBounds(1000, 20, 67, 30);

        jPanel4.add(jPanel10);
        jPanel10.setBounds(10, 80, 1240, 70);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Display_panelLayout = new javax.swing.GroupLayout(Display_panel);
        Display_panel.setLayout(Display_panelLayout);
        Display_panelLayout.setHorizontalGroup(
            Display_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
            .addGroup(Display_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Display_panelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Display_panelLayout.setVerticalGroup(
            Display_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(Display_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Display_panelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
        cashierdisplay.setBounds(170, 10, 170, 30);

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
        cashierdisplayfirst.setBounds(250, 10, 310, 30);

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
        this.dispose();
        
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
        data_load1();
        
         
        
    }//GEN-LAST:event_formWindowActivated

    private void paid_amtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid_amtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paid_amtActionPerformed

    private void paid_amtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paid_amtKeyReleased

        tot();
    }//GEN-LAST:event_paid_amtKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // add to cart product details

        DefaultTableModel dt = (DefaultTableModel) sale_table.getModel();
        Vector v = new Vector();

        v.add(inid.getText()); // invoice id
        v.add(com_pro.getSelectedItem().toString());
        v.add(br_code.getText()); // barcode
        v.add(p_qty.getText()); // qty
        v.add(u_price.getText()); // unit price
        v.add(total_price.getText()); // total price

        dt.addRow(v);

        cart_total();
        tot();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // delete product

        try{

            DefaultTableModel dt = (DefaultTableModel) sale_table.getModel();
            int rw = sale_table.getSelectedRow();
            String id = dt.getValueAt(rw, 0).toString();

            dt.removeRow(rw);

        }catch(Exception e){

        }
        cart_total();
        tot();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // remove all

        DefaultTableModel dt = (DefaultTableModel) sale_table.getModel();
        dt.setRowCount(0);

        cart_total();
        tot();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // pay and print

        try{

            dbConnector dbc = new dbConnector();

            DefaultTableModel dt = (DefaultTableModel ) sale_table.getModel();
            int rc = dt.getRowCount();

            for(int i = 0; i < rc; i++){

                String inid = dt.getValueAt(i, 0).toString();
                String P_name = dt.getValueAt(i, 1).toString();
                String bar_code = dt.getValueAt(i, 2).toString();
                String qty = dt.getValueAt(i, 3).toString();
                String un_price = dt.getValueAt(i, 4).toString();
                String tot_price = dt.getValueAt(i, 5).toString();

                //cart db
                if(dbc.insertData("INSERT INTO cart (INID, Product_Name, "
                    + "Bar_code, qty, Unit_Price, Total_Price) Values"
                    + "('"+inid+"', '"+P_name+"', '"+bar_code+"', '"+qty+"',"
                    + " '"+un_price+"', '"+tot_price+"') ")){

            }

        }

        }catch(HeadlessException e){

            System.out.println(e);

        }

        try{

            dbConnector dbc = new dbConnector();

            //sales DB

            // `salesid`, `INID`, `Cid`, `Customer_Name`, `Total_Qty`, `Total_Bill`, `Status`, `Balance`
            String inv_id = inid.getText();
            String totqty = total_qty.getText();
            String tot_bil = bill_total.getText();
            String blnc = balance_due.getText();

            // paid check

            Double tot = Double.valueOf(bill_total.getText());
            Double pid = Double.valueOf(paid_amt.getText());
            String Status = null;

            if(pid.equals(0.0)){
                Status = "Unpaid";

            }else if(tot > pid){
                Status = "Partial";

            }else{
                Status = "Paid";
            }

            if(dbc.insertData("INSERT INTO sales (INID, "
                + " total_qty, tota_bill, "
                + "status, balance) Values('"+inv_id+"', "
                + "'"+totqty+"', '"+tot_bil+"', '"+Status+"', '"+blnc+"') ")){

            JOptionPane.showMessageDialog(null, "Data Saved");   
                   
            this.dispose();
            Receipt cash = new Receipt();
            cash.setVisible(true);

        }
             data_load1();
            getData(inv_id);

        }catch(Exception e){

            System.out.println(e);

        }

        //save last invoice number
        try{

            dbConnector dbc = new dbConnector();

            String id =inid.getText();

            if(dbc.insertData("UPDATE extra SET val='"+id+"' WHERE exid = 1")){
                return;
            }

        }catch(Exception e){
            System.out.println(e);

        }

        data_load1();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void com_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_proActionPerformed

        //Product Select
        // load unit price

        String names = com_pro.getSelectedItem().toString();

        dbConnector dbc = new dbConnector();

        try{

            String query =("SELECT pbarcode,pprice FROM product WHERE pname ='"+names+"' ");
            ResultSet rss = dbc.getData(query);

            if (rss.next()){
                u_price.setText(rss.getString("pprice"));
                br_code.setText(rss.getString("pbarcode"));

            }

            pro_tot_cal();

        }catch(SQLException e){

            System.out.println(e);

        }
    }//GEN-LAST:event_com_proActionPerformed

    private void p_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_qtyActionPerformed

    }//GEN-LAST:event_p_qtyActionPerformed

    private void p_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_qtyKeyPressed

    }//GEN-LAST:event_p_qtyKeyPressed

    private void p_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_qtyKeyReleased
        pro_tot_cal();
    }//GEN-LAST:event_p_qtyKeyReleased

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
    private javax.swing.JLabel balance_due;
    private javax.swing.JLabel bill_total;
    private javax.swing.JLabel br_code;
    private javax.swing.JLabel br_code1;
    public javax.swing.JLabel cashierdisplay;
    public javax.swing.JLabel cashierdisplayfirst;
    private javax.swing.JComboBox<String> com_pro;
    private javax.swing.JLabel date;
    private javax.swing.JLabel inid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField p_qty;
    private javax.swing.JTextField paid_amt;
    private javax.swing.JTable sale_table;
    private javax.swing.JLabel time;
    private javax.swing.JLabel total_price;
    private javax.swing.JLabel total_qty;
    private javax.swing.JLabel u_price;
    // End of variables declaration//GEN-END:variables
}
