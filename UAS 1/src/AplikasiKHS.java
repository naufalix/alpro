//@author Naufal Ulinnuha
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class AplikasiKHS extends javax.swing.JFrame {
    DefaultComboBoxModel mdl = new DefaultComboBoxModel();
    int baris=0;
    static Object kolom[] = {"Mata Kuliah","sks","Nilai Angka","Nilai Huruf"};
    DefaultTableModel tbl = new DefaultTableModel (kolom,baris);
    
    public AplikasiKHS() {
        initComponents();
        Tsks.setEditable(false);                        Tipk.setEditable(false);
        mdl.addElement("Pendidikan Agama");             mdl.addElement("Matematika Komputasi");
        mdl.addElement("Algoritma dan Pemrograman");    mdl.addElement("Dasar Teknologi Informasi");
        mdl.addElement("Jaringan Komputer");            mdl.addElement("Pemrograman Mobile");
        CMatkul.setModel(mdl);
        TabelHasil.setModel(tbl);
    }

    public int sks() {
        int i, jsks=0, jbaris = tbl.getRowCount();
        for (i=0; i<jbaris; i++){
            jsks=jsks+Integer.parseInt(tbl.getValueAt(i,1).toString());
        }
        return jsks;
    }
    public void IPK() {
        int i, jbaris=tbl.getRowCount();
        double ipk, tot=0;
        if(jbaris==0){Tipk.setText("");}
        else{
            for (i=0; i<jbaris; i++){
                if      (tbl.getValueAt(i,3).toString().equals("A")) {tot=tot+(Double.parseDouble(tbl.getValueAt(i,1).toString())*4);}
                else if (tbl.getValueAt(i,3).toString().equals("B+")){tot=tot+(Double.parseDouble(tbl.getValueAt(i,1).toString())*3.5);}
                else if (tbl.getValueAt(i,3).toString().equals("B")) {tot=tot+(Double.parseDouble(tbl.getValueAt(i,1).toString())*3);}
                else if (tbl.getValueAt(i,3).toString().equals("C+")){tot=tot+(Double.parseDouble(tbl.getValueAt(i,1).toString())*2.5);}
                else if (tbl.getValueAt(i,3).toString().equals("C")) {tot=tot+(Double.parseDouble(tbl.getValueAt(i,1).toString())*2);}
                else if (tbl.getValueAt(i,3).toString().equals("D+")){tot=tot+(Double.parseDouble(tbl.getValueAt(i,1).toString())*1.5);}
                else if (tbl.getValueAt(i,3).toString().equals("D")) {tot=tot+(Double.parseDouble(tbl.getValueAt(i,1).toString())*1);}
                else if (tbl.getValueAt(i,3).toString().equals("E")) {tot=tot+(Double.parseDouble(tbl.getValueAt(i,1).toString())*0);}
            }
            ipk = tot/sks();
            Tipk.setText(Double.toString(ipk));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CMatkul = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Tsks = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Tuts = new javax.swing.JTextField();
        Tuas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Tukk = new javax.swing.JTextField();
        BTambah = new javax.swing.JButton();
        BReset = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelHasil = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        Tipk = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("KHS MAHASISWA");

        jLabel2.setText("Nama");

        jLabel3.setText("NIM");

        jLabel4.setText("Salnan Ratih Asriningtias");

        jLabel5.setText("16048372732012");

        jLabel6.setText("Mata Kuliah");

        CMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMatkulActionPerformed(evt);
            }
        });

        jLabel7.setText("sks");

        jLabel8.setText("Nilai UTS (15%)");

        jLabel9.setText("Nilai UAS (15%)");

        jLabel10.setText("Nilai UKK (70%)");

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

        jLabel11.setText("IPK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(Tuas)
                                        .addComponent(Tuts)
                                        .addComponent(Tsks)
                                        .addComponent(CMatkul, 0, 170, Short.MAX_VALUE)
                                        .addComponent(Tukk))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTambah)
                                        .addGap(18, 18, 18)
                                        .addComponent(BReset)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BHapus))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tipk, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Tsks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Tuts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Tuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Tukk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTambah)
                    .addComponent(BReset)
                    .addComponent(BHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Tipk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        if(CMatkul.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(this, "Silahkan pilih Mata Kuliah", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(Tuts.getText().equals("")||Tuas.getText().equals("")||Tukk.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Nilai tidak boleh kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        else {
            double uts = Integer.parseInt(Tuts.getText().toString());
            double uas = Integer.parseInt(Tuas.getText().toString());
            double ukk = Integer.parseInt(Tukk.getText().toString());
            double NA = (0.15*uts)+(0.15*uas)+(0.7*ukk);
            String Matkul = CMatkul.getSelectedItem().toString();
            String sks = Tsks.getText();
            if      (NA<=50)        {tbl.addRow(new Object []{Matkul,sks,NA,"E"});}
            else if (NA>50&&NA<=55) {tbl.addRow(new Object []{Matkul,sks,NA,"D"});}
            else if (NA>55&&NA<=60) {tbl.addRow(new Object []{Matkul,sks,NA,"D+"});}
            else if (NA>60&&NA<=65) {tbl.addRow(new Object []{Matkul,sks,NA,"C"});}
            else if (NA>65&&NA<=70) {tbl.addRow(new Object []{Matkul,sks,NA,"C+"});}
            else if (NA>70&&NA<=75) {tbl.addRow(new Object []{Matkul,sks,NA,"B"});}
            else if (NA>75&&NA<=80) {tbl.addRow(new Object []{Matkul,sks,NA,"B+"});}
            else if (NA>80)         {tbl.addRow(new Object []{Matkul,sks,NA,"A"});}
            IPK();
        }
    }//GEN-LAST:event_BTambahActionPerformed

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        if (tbl.getRowCount()==0){JOptionPane.showMessageDialog(this, "Tabel Kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);}
        while (tbl.getRowCount()>0){
            for (int i=0; i<tbl.getRowCount(); i++) {tbl.removeRow(i);}
        }
        IPK();
    }//GEN-LAST:event_BResetActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        if (TabelHasil.getSelectedRowCount()==1){
            tbl.removeRow(TabelHasil.getSelectedRow());
        }
        else if (TabelHasil.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(this, "Pilih Baris yang ingin dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this, "Pilih satu baris saja", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        IPK();
    }//GEN-LAST:event_BHapusActionPerformed

    private void CMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMatkulActionPerformed
        String Matkul = CMatkul.getSelectedItem().toString();
        int sks;
        if      (Matkul.equals("Pendidikan Agama"))         {Tsks.setText("2");}
        else if (Matkul.equals("Matematika Komputasi"))     {Tsks.setText("2");}
        else if (Matkul.equals("Algoritma dan Pemrograman")){Tsks.setText("3");}
        else if (Matkul.equals("Dasar Teknologi Informasi")){Tsks.setText("3");}
        else if (Matkul.equals("Jaringan Komputer"))        {Tsks.setText("4");}
        else if (Matkul.equals("Pemrograman Mobile"))       {Tsks.setText("4");}
    }//GEN-LAST:event_CMatkulActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiKHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiKHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiKHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiKHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiKHS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BReset;
    private javax.swing.JButton BTambah;
    private javax.swing.JComboBox<String> CMatkul;
    private javax.swing.JTable TabelHasil;
    private javax.swing.JTextField Tipk;
    private javax.swing.JTextField Tsks;
    private javax.swing.JTextField Tuas;
    private javax.swing.JTextField Tukk;
    private javax.swing.JTextField Tuts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
