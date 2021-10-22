//@author Naufal Ulinnuha
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class BidangPersegiPanjang extends javax.swing.JFrame {
    DefaultComboBoxModel <String> mdl = new DefaultComboBoxModel<>();
    int baris =0;
    static Object kolom[] = {"Panjang","Lebar","Jenis","Hasil"};
    DefaultTableModel tbl = new DefaultTableModel(kolom,baris);
    
    public BidangPersegiPanjang() {
        initComponents();
        TNama.setEditable(false);
        mdl.addElement("Keliling");
        mdl.addElement("Luas");
        CHitung.setModel(mdl);
        TabelPersegiPanjang.setModel(tbl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TPanjang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TLebar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CHitung = new javax.swing.JComboBox<>();
        BProses = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelPersegiPanjang = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Bidang Persegi Panjang");

        jLabel2.setText("Nama Bidang");

        TNama.setText("Persegi Panjang");
        TNama.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TNamaComponentShown(evt);
            }
        });
        TNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNamaActionPerformed(evt);
            }
        });

        jLabel3.setText("Panjang");

        TPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPanjangActionPerformed(evt);
            }
        });

        jLabel4.setText("Lebar");

        jLabel5.setText("Hitung");

        CHitung.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CHitungComponentShown(evt);
            }
        });
        CHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHitungActionPerformed(evt);
            }
        });

        BProses.setText("Proses");
        BProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProsesActionPerformed(evt);
            }
        });

        TabelPersegiPanjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TabelPersegiPanjang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BProses)
                                    .addComponent(CHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(TNama, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(48, 48, 48)
                                    .addComponent(TPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(63, 63, 63)
                                .addComponent(TLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TLebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CHitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BProses)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProsesActionPerformed
        if (TPanjang.getText().equals("")||TLebar.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Angka tidak boleh kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        else {
            double p=Double.parseDouble(TPanjang.getText()), l=Double.parseDouble(TLebar.getText());
            String TJenis, THasil;
            TJenis=CHitung.getSelectedItem().toString();
            double H;
            if (TJenis.equals("Keliling")){
                H=2*(p+l);
                THasil=Double.toString(H);
                JOptionPane.showMessageDialog(this, "Nama : "+TNama.getText()+"\nPanjang : "+TPanjang.getText()+"\nLebar : "+TLebar.getText()+"\n"+TJenis+" : "+THasil,"Hasil",JOptionPane.INFORMATION_MESSAGE);
                tbl.addRow(new Object []{TPanjang.getText(),TLebar.getText(),TJenis,THasil});
            }
            else if (TJenis.equals("Luas")){
                H=p*l;
                THasil=Double.toString(H);
                JOptionPane.showMessageDialog(this, "Nama : "+TNama.getText()+"\nPanjang : "+p+"\nLebar : "+l+"\n"+TJenis+" : "+THasil,"Hasil",JOptionPane.INFORMATION_MESSAGE);
                tbl.addRow(new Object []{TPanjang.getText(),TLebar.getText(),TJenis,THasil});
            }
        }
    }//GEN-LAST:event_BProsesActionPerformed

    private void TNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNamaActionPerformed

    private void TPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TPanjangActionPerformed

    private void TNamaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TNamaComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_TNamaComponentShown

    private void CHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHitungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHitungActionPerformed

    private void CHitungComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CHitungComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_CHitungComponentShown

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
            java.util.logging.Logger.getLogger(BidangPersegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BidangPersegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BidangPersegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BidangPersegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BidangPersegiPanjang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BProses;
    private javax.swing.JComboBox<String> CHitung;
    private javax.swing.JTextField TLebar;
    private javax.swing.JTextField TNama;
    private javax.swing.JTextField TPanjang;
    private javax.swing.JTable TabelPersegiPanjang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
