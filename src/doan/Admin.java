/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

/**
 *
 * @author phong
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
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

        jLabel1 = new javax.swing.JLabel();
        btn_GD_RutTien = new javax.swing.JButton();
        btn_GD_NhanTien = new javax.swing.JButton();
        btn_QL_DangNhap = new javax.swing.JButton();
        btn_QL_ThongTin = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        btn_GD_ChuyenTien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("ADMIN");

        btn_GD_RutTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_GD_RutTien.setText("Quản lí giao dich rút tiền");
        btn_GD_RutTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GD_RutTienActionPerformed(evt);
            }
        });

        btn_GD_NhanTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_GD_NhanTien.setText("Quản lí giao dịch nhận tiền");
        btn_GD_NhanTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GD_NhanTienActionPerformed(evt);
            }
        });

        btn_QL_DangNhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_QL_DangNhap.setText("Quản lí đăng nhập");
        btn_QL_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QL_DangNhapActionPerformed(evt);
            }
        });

        btn_QL_ThongTin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_QL_ThongTin.setText("Quản lí thông tin người dùng");
        btn_QL_ThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QL_ThongTinActionPerformed(evt);
            }
        });

        btn_Thoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Thoat.setText("Đăng xuất");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        btn_GD_ChuyenTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_GD_ChuyenTien.setText("Quản lí giao dịch chuyển tiền");
        btn_GD_ChuyenTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GD_ChuyenTienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_GD_RutTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_GD_NhanTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_QL_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btn_GD_ChuyenTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_QL_ThongTin)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(234, 234, 234))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_QL_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_QL_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_GD_RutTien, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_GD_ChuyenTien, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_GD_NhanTien, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_QL_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QL_DangNhapActionPerformed
        QL_DangNhap dn=new QL_DangNhap();
        dn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_QL_DangNhapActionPerformed

    private void btn_QL_ThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QL_ThongTinActionPerformed
        QL_User u=new QL_User();
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_QL_ThongTinActionPerformed

    private void btn_GD_RutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GD_RutTienActionPerformed
        QL_GD_Rut rt=new QL_GD_Rut();
        rt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_GD_RutTienActionPerformed

    private void btn_GD_ChuyenTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GD_ChuyenTienActionPerformed
        QL_GD_Chuyen ct=new QL_GD_Chuyen();
        ct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_GD_ChuyenTienActionPerformed

    private void btn_GD_NhanTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GD_NhanTienActionPerformed
        QL_GD_Nhan n=new QL_GD_Nhan();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_GD_NhanTienActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        Login l =new Login();
         l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ThoatActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_GD_ChuyenTien;
    private javax.swing.JButton btn_GD_NhanTien;
    private javax.swing.JButton btn_GD_RutTien;
    private javax.swing.JButton btn_QL_DangNhap;
    private javax.swing.JButton btn_QL_ThongTin;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
