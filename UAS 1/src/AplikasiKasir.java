//@author Naufal Ulinnuha
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class AplikasiKasir extends javax.swing.JFrame {
    DefaultComboBoxModel mdl = new DefaultComboBoxModel();
    int b1=25000,b2=5000,b3=4000,b4=3000,b5=7000,b6=45000,b7=10000,b8=8000,b9=6000,b10=15000;
    int baris=0;
    static Object kolom[] = {"Nama Barang","Harga","Jumlah","Subtotal"};
    DefaultTableModel tbl = new DefaultTableModel (kolom,baris);
    
    public AplikasiKasir() {
        initComponents();
        THarga.setEditable(false);      TSubtotal.setEditable(false);
        TTotal.setEditable(false);      TDiskon.setEditable(false);
        TBayar.setEditable(false);
        mdl.addElement("Buku Tulis");   mdl.addElement("Ballpoint");
        mdl.addElement("Pensil");       mdl.addElement("Penghapus");
        mdl.addElement("Penggaris");    mdl.addElement("Pensil Warna");
        mdl.addElement("Tipex");        mdl.addElement("Spidol");
        mdl.addElement("Lem Uhu");      mdl.addElement("Stabilo");
        CBarang.setModel(mdl);
        TabelHasil.setModel(tbl);    
    }

    public double Total() {
        int i, jbaris = tbl.getRowCount();
        double tot=0;
        for (i=0; i<jbaris; i++){
            tot=tot+Double.parseDouble(tbl.getValueAt(i,3).toString());
        }
        return tot;
    }
    public void Diskon(){
        double diskon;
        if (Total()>100000){diskon=(Total()*0.05);TDiskon.setText(Double.toString(diskon));}
        else {diskon=0;TDiskon.setText(Double.toString(diskon));}
    }
    public void Bayar(){
        double bayar,diskon,total;
        total = Double.parseDouble(TTotal.getText());
        diskon = Double.parseDouble(TDiskon.getText());
        bayar = total-diskon;
        TBayar.setText(Double.toString(bayar));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBarang = new javax.swing.JComboBox<>();
        THarga = new javax.swing.JTextField();
        TJumlah = new javax.swing.JTextField();
        BTambah = new javax.swing.JButton();
        BReset = new javax.swing.JButton();
        TSubtotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelHasil = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TTotal = new javax.swing.JTextField();
        TDiskon = new javax.swing.JTextField();
        TBayar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("KASIR");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Harga");

        jLabel4.setText("Jumlah");

        CBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBarangActionPerformed(evt);
            }
        });

        TJumlah.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TJumlahCaretUpdate(evt);
            }
        });

        BTambah.setText("Tambah");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        BReset.setText("Reset");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });

        jLabel5.setText("Subtotal");

        BHapus.setText("Hapus");
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });

        TabelHasil.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TabelHasil);

        jLabel6.setText("Total");

        jLabel7.setText("Diskon");

        jLabel8.setText("Bayar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BHapus))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTambah)
                                        .addGap(18, 18, 18)
                                        .addComponent(BReset))
                                    .addComponent(THarga)
                                    .addComponent(TJumlah)
                                    .addComponent(CBarang, 0, 150, Short.MAX_VALUE)
                                    .addComponent(TSubtotal))))
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TTotal)
                    .addComponent(TDiskon)
                    .addComponent(TBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(THarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTambah)
                    .addComponent(BReset))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(BHapus)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        if (THarga.getText().equals("")||THarga.getText().equals("0")){
            JOptionPane.showMessageDialog(this, "Silahkan pilih barang", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (TJumlah.getText().equals("")||TJumlah.getText().equals("0")){
            JOptionPane.showMessageDialog(this, "Jumlah tidak boleh kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        else{
            String Barang = CBarang.getSelectedItem().toString();
            //JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
            tbl.addRow(new Object []{Barang,THarga.getText(),TJumlah.getText(),TSubtotal.getText()});
            TTotal.setText(Double.toString(Total()));
            Diskon();
            Bayar();
        }
    }//GEN-LAST:event_BTambahActionPerformed

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        if (tbl.getRowCount()==0){JOptionPane.showMessageDialog(this, "Tabel Kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);}
        while (tbl.getRowCount()>0){
            for (int i=0; i<tbl.getRowCount(); i++) {tbl.removeRow(i);}
        }
        TTotal.setText("");
        TDiskon.setText("");
        TBayar.setText("");
    }//GEN-LAST:event_BResetActionPerformed

    private void CBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBarangActionPerformed
        String Barang = CBarang.getSelectedItem().toString();
        int Harga;
        if      (Barang.equals("Buku Tulis"))   {Harga = b1;THarga.setText(Integer.toString(Harga));}
        else if (Barang.equals("Ballpoint"))    {Harga = b2;THarga.setText(Integer.toString(Harga));}
        else if (Barang.equals("Pensil"))       {Harga = b3;THarga.setText(Integer.toString(Harga));}
        else if (Barang.equals("Penghapus"))    {Harga = b4;THarga.setText(Integer.toString(Harga));}
        else if (Barang.equals("Penggaris"))    {Harga = b5;THarga.setText(Integer.toString(Harga));}
        else if (Barang.equals("Pensil Warna")) {Harga = b6;THarga.setText(Integer.toString(Harga));}
        else if (Barang.equals("Tipex"))        {Harga = b7;THarga.setText(Integer.toString(Harga));}
        else if (Barang.equals("Spidol"))       {Harga = b8;THarga.setText(Integer.toString(Harga));}
        else if (Barang.equals("Lem Uhu"))      {Harga = b9;THarga.setText(Integer.toString(Harga));}
        else if (Barang.equals("Stabilo"))      {Harga = b10;THarga.setText(Integer.toString(Harga));}
        if (TJumlah.getText().equals("")){TSubtotal.setText("");}
        else {
            int Harga2=Integer.parseInt(THarga.getText());
            int Jumlah=Integer.parseInt(TJumlah.getText());
            int Subtotal=Harga2*Jumlah;
            TSubtotal.setText(Integer.toString(Subtotal));
        }
        
    }//GEN-LAST:event_CBarangActionPerformed

    private void TJumlahCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TJumlahCaretUpdate
        if (TJumlah.getText().equals("")||TJumlah.getText().equals("0")||THarga.getText().equals("")||THarga.getText().equals("0")){TSubtotal.setText("");}
        else {
            int Harga=Integer.parseInt(THarga.getText());
            int Jumlah=Integer.parseInt(TJumlah.getText());
            double Subtotal=Harga*Jumlah;
            TSubtotal.setText(Double.toString(Subtotal));
        }
    }//GEN-LAST:event_TJumlahCaretUpdate

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        if (TabelHasil.getSelectedRowCount()==1){
            tbl.removeRow(TabelHasil.getSelectedRow());
            TTotal.setText(Double.toString(Total()));
            Diskon();
            Bayar();
        }
        else if (TabelHasil.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(this, "Pilih Baris yang ingin dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this, "Pilih satu baris saja", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BHapusActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BReset;
    private javax.swing.JButton BTambah;
    private javax.swing.JComboBox<String> CBarang;
    private javax.swing.JTextField TBayar;
    private javax.swing.JTextField TDiskon;
    private javax.swing.JTextField THarga;
    private javax.swing.JTextField TJumlah;
    private javax.swing.JTextField TSubtotal;
    private javax.swing.JTextField TTotal;
    private javax.swing.JTable TabelHasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
