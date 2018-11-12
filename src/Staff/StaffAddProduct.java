/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class StaffAddProduct extends javax.swing.JFrame {

    /**
     * Creates new form StaffAddProduct
     */
    public StaffAddProduct() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblStaffID = new javax.swing.JLabel();
        jtfStaffID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblProductID = new javax.swing.JLabel();
        jtfProductID = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblProductName = new javax.swing.JLabel();
        jtfProductName = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        jtfPrice = new javax.swing.JTextField();
        jtfRM = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblQuan = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDesc = new javax.swing.JTextArea();
        jtfQuan = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jbtAdd = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jtfImage = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblCatog = new javax.swing.JLabel();
        jcbProductType = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("PV 10's Flowers");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("CompName");

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lblStaffID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStaffID.setText("Staff ID :");

        jtfStaffID.setEditable(false);
        jtfStaffID.setBackground(new java.awt.Color(153, 153, 255));
        jtfStaffID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfStaffID.setForeground(new java.awt.Color(255, 255, 255));
        jtfStaffID.setText("S1001");
        jtfStaffID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblProductID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductID.setText("Product ID :");

        jtfProductID.setEditable(false);
        jtfProductID.setBackground(new java.awt.Color(153, 153, 255));
        jtfProductID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfProductID.setForeground(new java.awt.Color(255, 255, 255));
        jtfProductID.setText("P1010");
        jtfProductID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProductIDActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        lblProductName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductName.setText("Product Name :");

        jtfProductName.setBackground(new java.awt.Color(153, 153, 255));
        jtfProductName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfProductName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrice.setText("Price (per) :");

        jtfPrice.setBackground(new java.awt.Color(153, 153, 255));
        jtfPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPriceActionPerformed(evt);
            }
        });

        jtfRM.setEditable(false);
        jtfRM.setBackground(new java.awt.Color(153, 153, 255));
        jtfRM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfRM.setText("RM");
        jtfRM.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        lblQuan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuan.setText("Quantitie(s) :");

        lblDesc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDesc.setText("Product Description :");

        jtaDesc.setColumns(20);
        jtaDesc.setRows(5);
        jScrollPane2.setViewportView(jtaDesc);

        jtfQuan.setBackground(new java.awt.Color(153, 153, 255));
        jtfQuan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfQuan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfQuanActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jbtAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtAdd.setText("Add Product");
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });

        lblImage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblImage.setText("Product Image :");

        jtfImage.setEditable(false);
        jtfImage.setBackground(new java.awt.Color(153, 153, 255));
        jtfImage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfImage.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Browse Image");

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        lblCatog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCatog.setText("Product Type :");

        jcbProductType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbProductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fresh Flowers", "Bouquets", "Floral Arrangements" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblProductName)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblProductID)
                                .addComponent(lblStaffID)
                                .addComponent(jtfStaffID)
                                .addComponent(jSeparator1)
                                .addComponent(jtfProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfProductName))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jbtAdd))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblQuan)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(jtfQuan, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(lblPrice)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                    .addComponent(jtfRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addComponent(lblDesc))
                                                    .addGap(32, 32, 32))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtfImage, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblImage, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton1)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jSeparator3)
                                                .addGap(127, 127, 127)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(129, 129, 129))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCatog)
                            .addComponent(jcbProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStaffID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblProductID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblProductName)
                .addGap(10, 10, 10)
                .addComponent(jtfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCatog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDesc)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblPrice)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblQuan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(lblImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbtAdd)
                        .addContainerGap())))
        );

        lblStaffID.getAccessibleContext().setAccessibleName("lblStaffID");
        jtfStaffID.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jtbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"P1001", "Sun Flower", "Fresh Flowers", "Collect on current day morning",  new Double(50.0), "none"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Product Type", "Product Desc", "Price(RM)", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbProduct);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(223, 223, 223))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProductIDActionPerformed

    private void jtfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPriceActionPerformed

    private void jtfQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQuanActionPerformed

    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
       
        if(jtfProductName.getText().equals("") && jtaDesc.getText().equals("") && jtfPrice.getText().equals("") && jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Name \n Product Description \n Price \n Quantity \n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!jtfProductName.getText().equals("") && jtaDesc.getText().equals("") && jtfPrice.getText().equals("") && jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Description \n Price \n Quantity \n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!jtfProductName.getText().equals("") && !jtaDesc.getText().equals("") && jtfPrice.toString()=="" && jtfQuan.toString()==""){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Price \n Quantity \n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!jtfProductName.getText().equals("") && !jtaDesc.getText().equals("") && !jtfPrice.toString().equals("") && jtfQuan.toString()==""){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Quantity \n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(jtfProductName.getText().equals("") && jtaDesc.getText().equals("") && !jtfPrice.toString().equals("") && !jtfQuan.toString().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Name \n Product Description","Error",JOptionPane.ERROR_MESSAGE);
        }else if(jtfProductName.getText().equals("") && !jtaDesc.getText().equals("") && jtfPrice.getText().equals("") && !jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Name \nPrice ","Error",JOptionPane.ERROR_MESSAGE);
        }else if(jtfProductName.getText().equals("") && !jtaDesc.getText().equals("") && !jtfPrice.getText().equals("") && jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Name \n  Quantity \n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!jtfProductName.getText().equals("") && jtaDesc.getText().equals("") && jtfPrice.getText().equals("") && !jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Description \n Price\n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!jtfProductName.getText().equals("") && jtaDesc.getText().equals("") && !jtfPrice.getText().equals("") && jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Description \nQuantity \n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!jtfProductName.getText().equals("") && !jtaDesc.getText().equals("") && jtfPrice.getText().equals("") && jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Price \n Quantity \n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!jtfProductName.getText().equals("") && !jtaDesc.getText().equals("") && jtfPrice.getText().equals("") && !jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Price\n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!jtfProductName.getText().equals("") && jtaDesc.getText().equals("") && !jtfPrice.getText().equals("") && !jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Description\n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(jtfProductName.getText().equals("") && !jtaDesc.getText().equals("") && !jtfPrice.getText().equals("") && !jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Name\n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(jtfProductName.getText().equals("") && jtaDesc.getText().equals("") && !jtfPrice.getText().equals("") && jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Name \n Product Description\n Quantity \n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(jtfProductName.getText().equals("") && !jtaDesc.getText().equals("") && jtfPrice.getText().equals("") && jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Name \n Price \n Quantity \n","Error",JOptionPane.ERROR_MESSAGE);
        }else if(jtfProductName.getText().equals("") && jtaDesc.getText().equals("") && jtfPrice.getText().equals("") && !jtfQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The below field(s) can't be empty \n"
                    + "Product Name \n Product Description \n Price \n","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Product Add successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbtAddActionPerformed

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
            java.util.logging.Logger.getLogger(StaffAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffAddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JComboBox<String> jcbProductType;
    private javax.swing.JTextArea jtaDesc;
    private javax.swing.JTable jtbProduct;
    private javax.swing.JTextField jtfImage;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JTextField jtfProductID;
    private javax.swing.JTextField jtfProductName;
    private javax.swing.JTextField jtfQuan;
    private javax.swing.JTextField jtfRM;
    private javax.swing.JTextField jtfStaffID;
    private javax.swing.JLabel lblCatog;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuan;
    private javax.swing.JLabel lblStaffID;
    // End of variables declaration//GEN-END:variables
}
