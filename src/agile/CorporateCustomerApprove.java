/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile;

/**
 *
 * @author user
 */
public class CorporateCustomerApprove extends javax.swing.JFrame {

    /**
     * Creates new form CorporateCustomerApprove
     */
    public CorporateCustomerApprove() {
        initComponents();
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
        jlbCompanyName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblCorporateCustID = new javax.swing.JLabel();
        jcbID = new javax.swing.JComboBox<>();
        jlblName = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jlblContactNo = new javax.swing.JLabel();
        jtfContactNo = new javax.swing.JTextField();
        jlblCompanyID = new javax.swing.JLabel();
        jtfCompanyID = new javax.swing.JTextField();
        jlblCompanyName = new javax.swing.JLabel();
        jtfCompanyName = new javax.swing.JTextField();
        jlblAddress = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jlblCreditLimit = new javax.swing.JLabel();
        jtfCreditLimit = new javax.swing.JTextField();
        jbApprove = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jlbCompanyName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlbCompanyName.setText("Fiore Flowershop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jlbCompanyName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbCompanyName)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Approve Corporate Customer");

        jlblCorporateCustID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblCorporateCustID.setText("Corporate Customer ID:");
        jlblCorporateCustID.setPreferredSize(new java.awt.Dimension(189, 22));

        jcbID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlblName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblName.setText("Name:");

        jtfName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlblContactNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblContactNo.setText("Contact Number:");

        jtfContactNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlblCompanyID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblCompanyID.setText("Company ID:");

        jtfCompanyID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlblCompanyName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblCompanyName.setText("Company Name:");

        jtfCompanyName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlblAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblAddress.setText("Address:");

        jtfAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlblCreditLimit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblCreditLimit.setText("Credit Limit:");

        jtfCreditLimit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jbApprove.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbApprove.setText("Approve");
        jbApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbApproveActionPerformed(evt);
            }
        });

        jbCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbCancel.setText("Cancel");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlblCreditLimit)
                                    .addComponent(jlblAddress)
                                    .addComponent(jlblCompanyName)
                                    .addComponent(jlblCompanyID)
                                    .addComponent(jlblContactNo)
                                    .addComponent(jtfName)
                                    .addComponent(jtfContactNo)
                                    .addComponent(jlblName)
                                    .addComponent(jtfCompanyID)
                                    .addComponent(jtfCompanyName)
                                    .addComponent(jtfAddress)
                                    .addComponent(jtfCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jcbID, javax.swing.GroupLayout.Alignment.LEADING, 0, 142, Short.MAX_VALUE)
                                        .addComponent(jlblCorporateCustID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jbApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblCorporateCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblName)
                .addGap(4, 4, 4)
                .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblContactNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblCompanyID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCompanyID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblCompanyName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblCreditLimit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbApprove)
                    .addComponent(jbCancel))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbApproveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbApproveActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelActionPerformed

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
            java.util.logging.Logger.getLogger(CorporateCustomerApprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorporateCustomerApprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorporateCustomerApprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorporateCustomerApprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CorporateCustomerApprove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbApprove;
    private javax.swing.JButton jbCancel;
    private javax.swing.JComboBox<String> jcbID;
    private javax.swing.JLabel jlbCompanyName;
    private javax.swing.JLabel jlblAddress;
    private javax.swing.JLabel jlblCompanyID;
    private javax.swing.JLabel jlblCompanyName;
    private javax.swing.JLabel jlblContactNo;
    private javax.swing.JLabel jlblCorporateCustID;
    private javax.swing.JLabel jlblCreditLimit;
    private javax.swing.JLabel jlblName;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfCompanyID;
    private javax.swing.JTextField jtfCompanyName;
    private javax.swing.JTextField jtfContactNo;
    private javax.swing.JTextField jtfCreditLimit;
    private javax.swing.JTextField jtfName;
    // End of variables declaration//GEN-END:variables
}
