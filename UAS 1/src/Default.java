//@author Naufal Ulinnuha
import javax.swing.ImageIcon;

public class Default extends javax.swing.JFrame {
    
    public Default() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        nim = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        anggota1 = new javax.swing.JMenuItem();
        anggota2 = new javax.swing.JMenuItem();
        anggota3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AplikasiKasir = new javax.swing.JMenuItem();
        AplikasiKHS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Data anggota kelompok 4");

        jMenu1.setText("Anggota");

        anggota1.setText("Anggota 1");
        anggota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anggota1ActionPerformed(evt);
            }
        });
        jMenu1.add(anggota1);

        anggota2.setText("Anggota 2");
        anggota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anggota2ActionPerformed(evt);
            }
        });
        jMenu1.add(anggota2);

        anggota3.setText("Anggota 3");
        anggota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anggota3ActionPerformed(evt);
            }
        });
        jMenu1.add(anggota3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Point 50");

        AplikasiKasir.setText("Aplikasi Kasir");
        AplikasiKasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AplikasiKasirMouseReleased(evt);
            }
        });
        jMenu2.add(AplikasiKasir);

        AplikasiKHS.setText("Aplikasi Perhitungan KHS/IPK");
        AplikasiKHS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AplikasiKHSMouseReleased(evt);
            }
        });
        jMenu2.add(AplikasiKHS);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(nim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void anggota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anggota1ActionPerformed
        ImageIcon img = new ImageIcon(getClass().getResource("/203140914111074.jpg"));
        foto.setIcon(img);
        nama.setText("Nama : Bayu Hadinugroho");
        nim.setText("NIM     : 203140914111074");
    }//GEN-LAST:event_anggota1ActionPerformed

    private void anggota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anggota2ActionPerformed
        ImageIcon img = new ImageIcon(getClass().getResource("/203140914111078.jpg"));
        foto.setIcon(img);
        nama.setText("Nama : Vivi Aini Sholikhaty");
        nim.setText("NIM     : 203140914111078");
    }//GEN-LAST:event_anggota2ActionPerformed

    private void anggota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anggota3ActionPerformed
        ImageIcon img = new ImageIcon(getClass().getResource("/203140914111088.jpg"));
        foto.setIcon(img);
        nama.setText("Nama : Muhammad Rizqi Naufal Ulinnuha");
        nim.setText("NIM     : 203140914111088");
    }//GEN-LAST:event_anggota3ActionPerformed

    private void AplikasiKasirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AplikasiKasirMouseReleased
        AplikasiKasir kasir = new AplikasiKasir();
        kasir.setLocationRelativeTo(this);
        kasir.setVisible(true);
    }//GEN-LAST:event_AplikasiKasirMouseReleased

    private void AplikasiKHSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AplikasiKHSMouseReleased
        AplikasiKHS khs = new AplikasiKHS();
        khs.setLocationRelativeTo(this);
        khs.setVisible(true);
    }//GEN-LAST:event_AplikasiKHSMouseReleased

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
            java.util.logging.Logger.getLogger(Default.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Default.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Default.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Default.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Default().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AplikasiKHS;
    private javax.swing.JMenuItem AplikasiKasir;
    private javax.swing.JMenuItem anggota1;
    private javax.swing.JMenuItem anggota2;
    private javax.swing.JMenuItem anggota3;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nim;
    // End of variables declaration//GEN-END:variables
}
