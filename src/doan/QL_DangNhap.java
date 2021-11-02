/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phong
 */
public class QL_DangNhap extends javax.swing.JFrame {

    public static ArrayList<String> ds = new ArrayList<String>();

    public void LoadSQL() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            ConnectionDB con = new ConnectionDB();
            String sql = "select * from DangNhap ";

            ResultSet rs = con.s.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("username"),
                    rs.getString("password"), rs.getString("type")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Loi " + e);
        }

    }

    public void ResetTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }

    public void XoaThongTinTK(String tk) {
        try {
            ConnectionDB con = new ConnectionDB();
            String sql = "delete from UserN where username='" + tk + "' ";
            con.s.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Loi " + e);
        }
    }

    /**
     * Creates new form QL_DangNhap
     */
    public QL_DangNhap() {
        initComponents();
        LoadSQL();
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
        btn_Add = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        combo_type = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblError = new javax.swing.JLabel();
        btn_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Quản lí đăng nhập người dùng");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tên tài khoản :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mật khẩu :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Type:");

        btn_Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_Clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        txt_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        combo_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combo_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "user", "admin" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Type"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));

        btn_Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(btn_Add)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(btn_Delete)
                                    .addGap(71, 71, 71)
                                    .addComponent(btn_Update))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_username)
                                        .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
                            .addGap(61, 61, 61)
                            .addComponent(btn_Clear)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(lblError)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btn_Back)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        lblError.setText("");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            if (!txt_username.getText().trim().equals("")) {
                ConnectionDB con = new ConnectionDB();
                String sql = "insert into DangNhap values('" + txt_username.getText() + "','" + txt_password.getText() + "','" + combo_type.getSelectedItem().toString() + "') ";
                con.s.executeUpdate(sql);
                ds.add(txt_username.getText());
                ResetTable();
                LoadSQL();
            } else {
                lblError.setText("Tennis Player should not be left blank!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Loi " + e);
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            if (jTable1.getSelectedRow() == -1) {
                if (jTable1.getRowCount() == 0) {
                    lblError.setText("Table is empty");
                } else {
                    lblError.setText("You must select a Tennis Player");
                }
            } else {
                ConnectionDB con = new ConnectionDB();
                String sql = "delete from DangNhap where username='" + model.getValueAt(jTable1.getSelectedRow(), 0).toString() + "' ";
                if (ds.size() == 0) {
                    int dialogButtons = JOptionPane.YES_NO_CANCEL_OPTION;
                    int dl = JOptionPane.showConfirmDialog(this, "Việc xóa tk dẫn đến xóa mọi thông tin tk. Bạn có chắc không ", "Thông báo", dialogButtons);
                    if (dl == 0) {
                        con.s.executeUpdate(sql);
                        XoaThongTinTK(model.getValueAt(jTable1.getSelectedRow(), 0).toString());
                        ResetTable();
                        LoadSQL();
                    }
                } else {
                    ds.remove(model.getValueAt(jTable1.getSelectedRow(), 0).toString());
                    con.s.executeUpdate(sql);
                    ResetTable();
                    LoadSQL();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Loi " + e);
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        try {
            if (jTable1.getSelectedRow() == -1) {
                if (jTable1.getRowCount() == 0) {
                    lblError.setText("Table is empty");
                } else {
                    lblError.setText("You must select a Tennis Player");
                }
            } else {

                ConnectionDB con = new ConnectionDB();
                String sql = "update DangNhap set username='" + txt_username.getText() + "',password='"
                        + txt_password.getText() + "',type='" + combo_type.getSelectedItem().toString() + "' where username='" + txt_username.getText() + "'";
                con.s.executeUpdate(sql);
                ResetTable();
                LoadSQL();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Loi " + e);
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        txt_username.setText("");
        txt_password.setText("");
        txt_username.requestFocus();
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        txt_username.setText(model.getValueAt(jTable1.getSelectedRow(), 0).toString());
        txt_password.setText(model.getValueAt(jTable1.getSelectedRow(), 1).toString());
        combo_type.setSelectedItem(model.getValueAt(jTable1.getSelectedRow(), 2).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        Admin l =new Admin();
         l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BackActionPerformed

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
            java.util.logging.Logger.getLogger(QL_DangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_DangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_DangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_DangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QL_DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Update;
    private javax.swing.JComboBox<String> combo_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
