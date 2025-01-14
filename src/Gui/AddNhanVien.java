/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import Dao.NhanVienDao;
import Pojo.Connect;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.PreparedStatement;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author 84862
 */
public class AddNhanVien extends javax.swing.JFrame {
    /**
     * Creates new form AddNhanVien
     */
    formNhanVien Goc;
   
    
    public AddNhanVien(formNhanVien temp) {
        initComponents();
        Goc=temp;
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdog_Sex = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btn_Luu = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_TenNhanVien = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_ChucVu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_TenDangNhap = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_NgaySinh = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_SoDT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rdo_Nam = new javax.swing.JRadioButton();
        rdo_Nu = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Anh = new javax.swing.JLabel();
        btn_ChonAnh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("THÊM NHÂN VIÊN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        btn_Luu.setBackground(new java.awt.Color(0, 255, 0));
        btn_Luu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Luu.setForeground(new java.awt.Color(255, 255, 255));
        btn_Luu.setText("Lưu");
        btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 140, 40));

        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 130, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Tên nhân viên :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        getContentPane().add(txt_TenNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 160, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Chức vụ :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        getContentPane().add(txt_ChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 160, 25));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Tên Đăng Nhập :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        getContentPane().add(txt_TenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 160, 25));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Ngày Sinh :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));
        getContentPane().add(txt_NgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 210, 25));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("Số điện thoại :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));
        getContentPane().add(txt_SoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 210, 25));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Giới tính :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        rdog_Sex.add(rdo_Nam);
        rdo_Nam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdo_Nam.setForeground(new java.awt.Color(153, 0, 0));
        rdo_Nam.setText("Nam");
        getContentPane().add(rdo_Nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 60, 40));

        rdog_Sex.add(rdo_Nu);
        rdo_Nu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdo_Nu.setForeground(new java.awt.Color(153, 0, 0));
        rdo_Nu.setText("Nữ");
        getContentPane().add(rdo_Nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 60, 40));

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("(*)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("(*)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("(*)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("(*)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("(*)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Hình ảnh :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        getContentPane().add(txt_Anh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 160, 150));

        btn_ChonAnh.setBackground(new java.awt.Color(153, 0, 0));
        btn_ChonAnh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ChonAnh.setForeground(new java.awt.Color(255, 255, 255));
        btn_ChonAnh.setText("Chọn ảnh");
        btn_ChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChonAnhActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ChonAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        // TODO add your handling code here:
        Goc.NhanVienEvent.themNhanVien(this);
    }//GEN-LAST:event_btn_LuuActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_CancelActionPerformed
    public String selectedImagePath;
    private void btn_ChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChonAnhActionPerformed
        // TODO add your handling code here:
        JFileChooser filechoose = new JFileChooser();
        filechoose.setCurrentDirectory(new File("C:\\AppDatPhongKhachSan\\src\\Anh"));
        filechoose.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = filechoose.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = filechoose.getSelectedFile();
            String pathFile = file.getAbsolutePath();
            BufferedImage b;
            try {
                b = ImageIO.read(file);
                if (b != null) {
                    txt_Anh.setIcon(Goc.ResizeImage(pathFile));
                    selectedImagePath = pathFile; // Lưu trữ đường dẫn ảnh đã chọn
                } else {
                    System.out.println("Could not read the image file: " + pathFile);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_ChonAnhActionPerformed

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
            java.util.logging.Logger.getLogger(AddNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNhanVien(new formNhanVien()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Cancel;
    public javax.swing.JButton btn_ChonAnh;
    public javax.swing.JButton btn_Luu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JRadioButton rdo_Nam;
    public javax.swing.JRadioButton rdo_Nu;
    private javax.swing.ButtonGroup rdog_Sex;
    public javax.swing.JLabel txt_Anh;
    public javax.swing.JTextField txt_ChucVu;
    public javax.swing.JTextField txt_NgaySinh;
    public javax.swing.JTextField txt_SoDT;
    public javax.swing.JTextField txt_TenDangNhap;
    public javax.swing.JTextField txt_TenNhanVien;
    // End of variables declaration//GEN-END:variables

}
