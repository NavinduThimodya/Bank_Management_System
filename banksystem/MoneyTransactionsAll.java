/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banksystem;

import java.sql.*;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class MoneyTransactionsAll extends javax.swing.JFrame {

    /**
     * Creates new form ApproveAccounts
     */

    Connection conn1, conn2;
    PreparedStatement select, selectTransfers;

    int accountNumber;

    public MoneyTransactionsAll() {
        initComponents();
        showAllTransactions();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        MoneyTransferHomeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AllTransactionsTable = new javax.swing.JTable();
        MoneyTransferGetStatementButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 102, 255)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("All Transactions");

        MoneyTransferHomeButton.setBackground(new java.awt.Color(255, 255, 51));
        MoneyTransferHomeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MoneyTransferHomeButton.setText("Home");
        MoneyTransferHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyTransferHomeButtonActionPerformed(evt);
            }
        });

        AllTransactionsTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AllTransactionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transfer ID", "Money Amount", "Date", "Recipient", "Bank", "Branch", "Account Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(AllTransactionsTable);

        MoneyTransferGetStatementButton.setBackground(new java.awt.Color(0, 0, 204));
        MoneyTransferGetStatementButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MoneyTransferGetStatementButton.setForeground(new java.awt.Color(255, 255, 255));
        MoneyTransferGetStatementButton.setText("Get Statement");
        MoneyTransferGetStatementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyTransferGetStatementButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(MoneyTransferHomeButton)
                        .addGap(219, 219, 219)
                        .addComponent(jLabel12)))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MoneyTransferGetStatementButton)
                .addGap(190, 190, 190))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(MoneyTransferHomeButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12)))
                .addGap(7, 7, 7)
                .addComponent(MoneyTransferGetStatementButton)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showAllTransactions(){
    
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/bank_system","root","");

            selectTransfers = conn1.prepareStatement("select * from money_transfers");
            ResultSet rs2 = selectTransfers.executeQuery();
            ResultSetMetaData rsmd2 = rs2.getMetaData();
            int c2 = rsmd2.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) AllTransactionsTable.getModel();
            df.setRowCount(0);

            while(rs2.next()){

                Vector v = new Vector();

                for(int a=1; a<=c2; a++){
                    
                    v.add(rs2.getInt("transfer_id"));
                    v.add(rs2.getDouble("money_amount"));
                    v.add(rs2.getDate("date"));
                    v.add(rs2.getString("recipient_name"));
                    v.add(rs2.getString("bank"));
                    v.add(rs2.getString("branch"));
                    v.add(rs2.getInt("recipient_account_number"));

                }

                df.addRow(v);

            }

        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
        catch(Exception f){
            JOptionPane.showMessageDialog(null, f);
            System.out.println(f);
        }

    }

    private void MoneyTransferHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyTransferHomeButtonActionPerformed
        new ManagementSector().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MoneyTransferHomeButtonActionPerformed

    private void MoneyTransferGetStatementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyTransferGetStatementButtonActionPerformed
        new SelectedMoneyTransferStatement().setVisible(true);
    }//GEN-LAST:event_MoneyTransferGetStatementButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static
            void main(String args[]) {
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
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MoneyTransactionsAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoneyTransactionsAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoneyTransactionsAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoneyTransactionsAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public
                    void run() {
                new MoneyTransactionsAll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllTransactionsTable;
    private javax.swing.JButton MoneyTransferGetStatementButton;
    private javax.swing.JButton MoneyTransferHomeButton;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
