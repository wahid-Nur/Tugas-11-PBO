/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kruwell.program;

import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Mahasiswa extends javax.swing.JFrame {
    
    private void kosongkan_form(){
        txtNomhs.setEditable(true);
        txtNomhs.setText(null);
        txtNama.setText(null);
        cbJurusan.setSelectedItem(this);
    }

    private void tampilkan_data(Object Nomhs){
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn ("Nomhs.");
        model.addColumn ("Nama");
        model.addColumn ("Jurusan");
        
        try{
            int NOmhs = 1;
            String sql = "SELECT * FROM MAHASISWA";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{Nomhs,res.getString(1),res.getString(2),res.getString(3)});
           
            }
            tabelMahasiswa.setModel (model);
        }catch (SQLException e){
            System.out.println("Error : "  + e.getMessage());
        }
        
    }
    /**
     * Creates new form Mahasiswa
     */
    public Mahasiswa() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomhs = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cbJurusan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();
        tbTambah = new javax.swing.JButton();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbBatal = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATA MAHASISW");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DATA MAHASISWA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 32, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nomhs");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));
        getContentPane().add(txtNomhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 137, -1));

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 297, -1));

        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tehnik Informatika", "SiStem Informasi", " ", " " }));
        getContentPane().add(cbJurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 137, -1));

        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMahasiswa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 299, 543, 139));

        tbTambah.setText("Tambah");
        tbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambahActionPerformed(evt);
            }
        });
        getContentPane().add(tbTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 249, -1, -1));

        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(tbSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 249, -1, -1));

        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });
        getContentPane().add(tbEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 249, -1, -1));

        tbHapus.setText("Hapus");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });
        getContentPane().add(tbHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 249, -1, -1));

        tbBatal.setText("Batal");
        tbBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBatalActionPerformed(evt);
            }
        });
        getContentPane().add(tbBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 249, -1, -1));

        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(tbKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 249, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Fakultas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void tbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambahActionPerformed
        // TODO add your handling code here:
        Kosongkan_form();
    }//GEN-LAST:event_tbTambahActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String  sql = "INSERT INTO MAHASISWA VALUES ('"+txtNomhs.getText()+"','"+txtNama.getText()+"','"+cbJurusan.getSelectedItem()+"')";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.PrepareStatement(sql);
            pstm.execute();
            JOptionpane.showMessageDialog(null, "Proses Simpan Data Berhasil..");
            tampilkan_data();
            kosongkan_form();
        }catch(HeadlessException | SQLException e){
            JOptionpane.showMessageDialog(this, e.getMessage());
        
        }
        
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
        // TODO add your handling code here:
        int baris = tabelMahasiswa.rowAtpoint(evt.getpoin());
        String Nomhs = tabelMahasiswa.getValuecAT(baris, 1).toString();
        txtNomhs.setText(NOmhs);
        
         String Nama = tabelMahasiswa.getValuecAT(baris, 2).toString();
        txtNama.setText(Nama);
        
         String Jurusan = tabelMahasiswa.getValuecAT(baris, 3).toString();
         cbJurusan.stSelectedItem(jurusan);
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE Mahasiswa SET Nomhs='"+txtNomhs.getText()+"',Nama='"+txtNama.getText()+"',Jurusan='"+cbJurusan.getSelectedItem()+"' WHERE Nomhs = '"+txtNomhs.getText()+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil...");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        // TODO add your handling code here:
        try{
              String sql ="DELETE FROM MAHASISWA WHERE Nomhs='"+txtNomhs.getText()+"'";
              java.sql.Connection conn = (Connection)Konfig.configDB();
              java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
              pstm.execute();
              JOptionPane.showMessageDialog(null, "Hapus Data Berhasil...");
        }catch(HeadlessException | SQLException e){
              JOptionPane.showMessageDialog(this, e.getMessage());
        tampilkan_data();
        kosongkan_form();       
    }//GEN-LAST:event_tbHapusActionPerformed

    private void tbBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBatalActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_tbBatalActionPerformed

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
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelMahasiswa;
    private javax.swing.JButton tbBatal;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JButton tbTambah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNomhs;
    // End of variables declaration//GEN-END:variables
}
