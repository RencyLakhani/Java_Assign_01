/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package q2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 57ren
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Bus_number = new javax.swing.JTextField();
        CPhone = new javax.swing.JTextField();
        pager = new javax.swing.JTextField();
        txtpname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bAdd = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        homeAdd = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Home_Number = new java.awt.TextField();
        btnrefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Person Name ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 39, 37, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Home Phone No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Pager");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 110, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Home Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Bussiness Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("cellure  phone");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 130, 20));

        Bus_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bus_numberActionPerformed(evt);
            }
        });
        getContentPane().add(Bus_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, 30));

        CPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(CPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 170, 30));

        pager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagerActionPerformed(evt);
            }
        });
        getContentPane().add(pager, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 170, 30));

        txtpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtpname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 170, 40));

        bAdd.setColumns(20);
        bAdd.setRows(5);
        jScrollPane1.setViewportView(bAdd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 170, 50));

        homeAdd.setColumns(20);
        homeAdd.setRows(5);
        jScrollPane2.setViewportView(homeAdd);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 170, 60));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 30));

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pname", "Address", "Phone No", "Buss Add", "B Phone", "Celler phone", "pager"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jTable1MouseWheelMoved(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 400, 220));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Bussiness Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 20));
        getContentPane().add(Home_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 170, 40));

        btnrefresh.setBackground(new java.awt.Color(255, 204, 204));
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 130, 30));

        btnDelete.setBackground(new java.awt.Color(204, 255, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 140, 30));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 204));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bus_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bus_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bus_numberActionPerformed

    private void CPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPhoneActionPerformed

    private void pagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagerActionPerformed

    private void txtpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpnameActionPerformed
    ArrayList<AddressBook> ai = new ArrayList<AddressBook>();
    
   
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtpname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Enter Valid Values !!");
        }
        String PName = txtpname.getText();
        String Address = homeAdd.getText();
        String HomePhone = Home_Number.getText();
        String BAddress = bAdd.getText();
        String BMno = Bus_number.getText();
        String Cphone = CPhone.getText();
        String Pager = pager.getText();
       // String Fax_machine = Fax_machine.getText();
       ai.add(new AddressBook(PName,Address,HomePhone,BAddress,BMno,Cphone,Pager));
       
       
       DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
       String data[] = {PName,Address,HomePhone,BAddress,BMno,Cphone,Pager};
       tblModel.addRow(data);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jTable1MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseWheelMoved

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
                // TODO add your handling code here:
        txtpname.setText(""); 
        homeAdd.setText("");
        Home_Number.setText("");
        bAdd.setText("");
        Bus_number.setText("");
        CPhone.setText("");
        pager.setText("");
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();  
        if(jTable1.getSelectedRow()==1)
        {
            tblModel.removeRow(jTable1.getSelectedRow());            
            JOptionPane.showMessageDialog(this, "Row is Deleted Succesfully");
        }      
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();  

        if(jTable1.getSelectedRowCount()==1)
        {
        String PName = txtpname.getText();
        String Address = homeAdd.getText();
        String HomePhone = Home_Number.getText();
        String BAddress = bAdd.getText();
        String BMno = Bus_number.getText();
        String Cphone = CPhone.getText();
        String Pager = pager.getText();
        
            tblModel.setValueAt(PName, jTable1.getSelectedRow(),0);
            tblModel.setValueAt(Address, jTable1.getSelectedRow(),1);
            tblModel.setValueAt(HomePhone, jTable1.getSelectedRow(),2);
            tblModel.setValueAt(BAddress, jTable1.getSelectedRow(),3);
            tblModel.setValueAt(BMno, jTable1.getSelectedRow(),4);
            tblModel.setValueAt(Cphone, jTable1.getSelectedRow(),5);
            tblModel.setValueAt(Pager, jTable1.getSelectedRow(),6);
            
            JOptionPane.showMessageDialog(this, "Updated Succesfully");

        }  
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();  
        
        String PName = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String Address = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String HomePhone = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String BAddress = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String BMno = tblModel.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String Cphone =  tblModel.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String Pager = tblModel.getValueAt(jTable1.getSelectedRow(), 6).toString();
        
        txtpname.setText(PName); 
        homeAdd.setText(Address);
        Home_Number.setText(HomePhone);
        bAdd.setText(BAddress);
        Bus_number.setText(BMno);
        CPhone.setText(Cphone);
        pager.setText(Pager);    
        
    }//GEN-LAST:event_jTable1MouseClicked

   
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bus_number;
    private javax.swing.JTextField CPhone;
    private java.awt.TextField Home_Number;
    private javax.swing.JTextArea bAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JTextArea homeAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pager;
    private javax.swing.JTextField txtpname;
    // End of variables declaration//GEN-END:variables
}
