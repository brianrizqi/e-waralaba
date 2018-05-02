/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connector.config;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brian R
 */
public class gudang2 extends javax.swing.JPanel {

    Connection connection = config.Connection();
    Statement statement;
    ResultSet resultSet;

    public gudang2() {
        initComponents();
        DropToko();
        DropBarang();
    }

    public JButton getBtnHapus() {
        return btnHapus;
    }

    public JButton getBtnReset() {
        return btnReset;
    }

    public JButton getBtnSimpan() {
        return btnSimpan;
    }

    public JButton getBtnUbah() {
        return btnUbah;
    }

    public JComboBox<String> getDdBarang() {
        return ddBarang;
    }

    public JComboBox<String> getDdUsers() {
        return ddUsers;
    }

    public JTextField getJumlah_field() {
        return jumlah_field;
    }

    public JTable getTable_gudang2() {
        return table_gudang2;
    }

    public void setTable_gudang2(DefaultTableModel tabel) {
        this.table_gudang2.setModel(tabel);
    }

    public void setTabel(JTable t, DefaultTableModel tabel) {
        t.setModel(tabel);
    }

    private void DropToko() {
        try {
            String sql = "select * from users where status = 3 order by username";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String users = resultSet.getString("users.username");
                ddUsers.addItem(users);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void DropBarang() {
        try {
            String sql = "select * from barang order by nama_barang";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String barang = resultSet.getString("barang.nama_barang");
                ddBarang.addItem(barang);
            }
        } catch (Exception e) {
            e.getMessage();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table_gudang2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ddUsers = new javax.swing.JComboBox<>();
        ddBarang = new javax.swing.JComboBox<>();
        jumlah_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(690, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_gudang2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Id Toko", "Id Barang", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(table_gudang2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 400, 440));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 180, -1));

        jLabel1.setText("Pencarian");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        add(ddUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 100, -1));

        add(ddBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 100, -1));

        jumlah_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_fieldActionPerformed(evt);
            }
        });
        add(jumlah_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 110, -1));

        jLabel2.setText("Toko");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel3.setText("Barang");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel4.setText("Jumlah");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        btnSimpan.setText("Simpan");
        add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        btnUbah.setText("Ubah");
        add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        btnHapus.setText("Hapus");
        add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        btnReset.setText("Reset");
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jumlah_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_fieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> ddBarang;
    private javax.swing.JComboBox<String> ddUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jumlah_field;
    private javax.swing.JTable table_gudang2;
    // End of variables declaration//GEN-END:variables
}
