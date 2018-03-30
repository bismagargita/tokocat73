/*
 * To change this license header, choose License Headehasil in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Java.koneksi;
import com.mysql.jdbc.Connection;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 7
 */
public class Master_Pegawai_TambahPegawai extends javax.swing.JFrame {

    private String query;
    private Java.koneksi koneksi;
    private Connection con;
    public int lokasinya=0,status;
    private koneksi db = new koneksi();
    public Master_Pegawai_TambahPegawai() {
        initComponents();
        tampildatakecombolokasi();
        tampildatakecombokota();
        fKodePegawai.hide();
    }
    public void tampildatakecombolokasi(){
        try {
           
           query = "select nama_lokasi from lokasi";
           Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {                
                fLokasiP.addItem(rs.getString("nama_lokasi"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void tampildatakecombokota(){
        try {
           
           query = "select kota from kota_daerah";
           Statement st = db.Connect().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {                
                fKotaP.addItem(rs.getString("kota"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        fKodeUnikP = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        fNamaP = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        fTeleponP = new javax.swing.JTextField();
        fAlamatP = new javax.swing.JTextField();
        fContactP = new javax.swing.JTextField();
        fKodePegawai = new javax.swing.JLabel();
        fLokasiP = new javax.swing.JComboBox<>();
        fKotaP = new javax.swing.JComboBox<>();
        fACTIVE = new javax.swing.JRadioButton();
        fDEACTIVE = new javax.swing.JRadioButton();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton16.setBackground(new java.awt.Color(255, 51, 51));
        jButton16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton16.setText("BATAL");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setText("Kota");

        fKodeUnikP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fKodeUnikP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fKodeUnikPKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setText("Alamat");

        fNamaP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setText("Nama");

        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setText("Tambah / Update Pegawai ");

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setText("Lokasi");

        jButton15.setBackground(new java.awt.Color(85, 222, 93));
        jButton15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton15.setText("SIMPAN");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setText("Telepon");

        jLabel33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel33.setText("Contact");

        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setText("Kode Unik");

        fTeleponP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        fAlamatP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        fContactP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fContactP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fContactPActionPerformed(evt);
            }
        });

        fLokasiP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        fKotaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        fACTIVE.setBackground(new java.awt.Color(255, 153, 0));
        buttonGroup1.add(fACTIVE);
        fACTIVE.setText("ACTIVE");
        fACTIVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fACTIVEActionPerformed(evt);
            }
        });

        fDEACTIVE.setBackground(new java.awt.Color(255, 153, 0));
        buttonGroup1.add(fDEACTIVE);
        fDEACTIVE.setText("DEACTIVE");
        fDEACTIVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fDEACTIVEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fKodePegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fKodeUnikP, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(fTeleponP, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(fAlamatP, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(fNamaP, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(fContactP, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(fLokasiP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fKotaP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fACTIVE)
                        .addGap(18, 18, 18)
                        .addComponent(fDEACTIVE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton16)))
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fKodePegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(fKodeUnikP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(fNamaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(fLokasiP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30))
                    .addComponent(fAlamatP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(fKotaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(fTeleponP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(fContactP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fDEACTIVE)
                    .addComponent(fACTIVE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton16))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(446, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fContactPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fContactPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fContactPActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        Master_Pegawai ms = new Master_Pegawai(); // TODO add your handling code here:
        String kode_pegawai1=this.fKodePegawai.getText();
        int kode_pegawai = Integer.parseInt(kode_pegawai1);
        String kode_unik2=this.fKodeUnikP.getText();
        int kode_unik = Integer.parseInt(kode_unik2);
        String nama = this.fNamaP.getText();
        String lokasi = (String) this.fLokasiP.getSelectedItem();
        System.out.println("lokasi di :"+lokasi);
        //mengambil nilai status
         if (fACTIVE.isSelected()) {
                status=0;
            }
            if (fDEACTIVE.isSelected()) {
                status=1;
            }
        //mengambil nilai lokasi
         if(lokasi.equals("Pusat")) {
            lokasinya = 1;
        } else if (lokasi.equals("GUD63")) {
            lokasinya = 2;
        } else if (lokasi.equals("TOKO")) {
            lokasinya = 4;
        } else if (lokasi.equals("TENGAH")) {
            lokasinya = 5;
        } else if (lokasi.equals("UTARA")) {
            lokasinya = 6;
        }
        System.out.println("lokasi dlm bentuk int :"+lokasinya);
        
        String alamat = this.fAlamatP.getText();
        String kota = (String) this.fKotaP.getSelectedItem();
        String telepon = this.fTeleponP.getText();
        String contact = this.fContactP.getText();
        
        try {
            ms.edit(kode_pegawai,kode_unik,nama,lokasinya,lokasi,alamat,kota,telepon,contact,status);
            ms.bersih();
            ms.tampilTabel();
            this.dispose(); 
        } catch (Exception ex) {
            Logger.getLogger(Master_Supplier_TambahEdit.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15MouseClicked

    private void fACTIVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fACTIVEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fACTIVEActionPerformed

    private void fDEACTIVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fDEACTIVEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fDEACTIVEActionPerformed

    private void fKodeUnikPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fKodeUnikPKeyTyped
      char c=evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            JOptionPane.showMessageDialog(null,"Hanya Angka !");
            evt.consume();
        }
    }//GEN-LAST:event_fKodeUnikPKeyTyped

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
            java.util.logging.Logger.getLogger(Master_Pegawai_TambahPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master_Pegawai_TambahPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master_Pegawai_TambahPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master_Pegawai_TambahPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master_Pegawai_TambahPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JRadioButton fACTIVE;
    public javax.swing.JTextField fAlamatP;
    public javax.swing.JTextField fContactP;
    public javax.swing.JRadioButton fDEACTIVE;
    public javax.swing.JLabel fKodePegawai;
    public javax.swing.JTextField fKodeUnikP;
    public javax.swing.JComboBox<String> fKotaP;
    public javax.swing.JComboBox<String> fLokasiP;
    public javax.swing.JTextField fNamaP;
    public javax.swing.JTextField fTeleponP;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}