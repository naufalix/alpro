//@author Naufal Ulinnuha
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BidangLingkaran extends javax.swing.JFrame {
    DefaultComboBoxModel mdl = new DefaultComboBoxModel();
    int baris =0;
    static Object kolom[] = {"Radius","Jenis","Hasil"};
    DefaultTableModel tbl = new DefaultTableModel(kolom, baris);
    
    public BidangLingkaran() {
        initComponents();
        TNama.setEditable(false);
        mdl.addElement("Keliling");
        mdl.addElement("Luas");
        CHitung.setModel(mdl);
        TabelLingkaran.setModel(tbl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TRadius = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelLingkaran = new javax.swing.JTable();
        CHitung = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        BProses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Bidang Lingkaran");

        jLabel2.setText("Nama Bidang");

        TNama.setText("Lingkaran");
        TNama.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TNamaComponentShown(evt);
            }
        });

        jLabel3.setText("Radius");

        TabelLingkaran.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TabelLingkaran);

        jLabel4.setText("Hitung");

        BProses.setText("Proses");
        BProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProsesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BProses)
                            .addComponent(TNama)
                            .addComponent(TRadius)
                            .addComponent(CHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BProses)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TNamaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TNamaComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_TNamaComponentShown

    private void BProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProsesActionPerformed
        if (TRadius.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Angka tidak boleh kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        else {
            double r = Double.parseDouble(TRadius.getText());
            String TJenis, THasil;
            TJenis=CHitung.getSelectedItem().toString();
            double H, phi=3.14;
            if (TJenis.equals("Keliling")){
                H=phi*r*2;
                THasil=Double.toString(Math.ceil(H));
                JOptionPane.showMessageDialog(this, "Nama   : "+TNama.getText()+"\nRadius   : "+r+"\n"+TJenis+" : "+THasil, "Hasil", JOptionPane.INFORMATION_MESSAGE);
                tbl.addRow(new Object []{TRadius.getText(),TJenis,THasil});
            }
            else if (TJenis.equals("Luas")){
                H=phi*r*r;
                THasil=Double.toString(Math.ceil(H));
                JOptionPane.showMessageDialog(this, "Nama   : "+TNama.getText()+"\nRadius   : "+r+"\n"+TJenis+" : "+THasil, "Hasil", JOptionPane.INFORMATION_MESSAGE);
                tbl.addRow(new Object []{TRadius.getText(),TJenis,THasil});
            }
        }
        
    }//GEN-LAST:event_BProsesActionPerformed

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
            java.util.logging.Logger.getLogger(BidangLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BidangLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BidangLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BidangLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BidangLingkaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BProses;
    private javax.swing.JComboBox<String> CHitung;
    private javax.swing.JTextField TNama;
    private javax.swing.JTextField TRadius;
    private javax.swing.JTable TabelLingkaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
