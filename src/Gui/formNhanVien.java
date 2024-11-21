/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gui;

import Dao.NhanVienDao;
import Pojo.Connect;
import Pojo.NhanVien;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 84862
 */
public class formNhanVien extends javax.swing.JPanel {
    public DefaultTableModel dtm_DanhSach;
    public List<NhanVien> nhanviens= new ArrayList<>();
    NhanVienDao NhanVienEvent= new NhanVienDao(this);
    /**
     * Creates new form formNhanVien
     */
    public formNhanVien() {
        initComponents();
        initNhanVien();
        initTable();
        txt_MaNhanVien.enable(false);
    }

    public void initNhanVien()
    {
        nhanviens.clear();
        try {
            Connect.Connect();
            String sql="SELECT * FROM Admin.NhanVien ORDER BY MaNV ASC";
            Statement statement=Connect.conn.createStatement();
            ResultSet result=statement.executeQuery(sql);
            while(result.next())
            {
                NhanVien temp= new NhanVien();
                temp.setMaNV(result.getInt(1));
                temp.setTenNV(result.getString(2));
                temp.setChucVu(result.getString(3));
                temp.setSoDT(result.getString(4));
                temp.setGioiTinh(result.getString(5));
                temp.setTenDangNhap(result.getString(6));
                Date ngaysinh=result.getDate(7);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String ngayGioFormatted = sdf.format(ngaysinh);
                temp.setNgaySinh(ngayGioFormatted);
                temp.setHinhAnh(result.getString(8));
                nhanviens.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(formNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public ImageIcon ResizeImage(String imagePath)
   {
       ImageIcon MyImage = new ImageIcon(imagePath);
        if (MyImage.getIconWidth() == -1) {
            // Hình ảnh không tồn tại
            System.out.println("Image not found: " + imagePath);
            return null;
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(txt_img.getWidth(), txt_img.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
   }
    
    
    public void initTable()
    {
        Connect.Connect();
        dtm_DanhSach = new DefaultTableModel();
        dtm_DanhSach.addColumn("MaNV");
        dtm_DanhSach.addColumn("TenNV");
        dtm_DanhSach.addColumn("Chức Vụ");
        dtm_DanhSach.addColumn("SDT");
        dtm_DanhSach.addColumn("Giới Tính");
        dtm_DanhSach.addColumn("Tên Đăng Nhập");
        dtm_DanhSach.addColumn("Ngày Sinh");
        dtm_DanhSach.addColumn("Hình ảnh");
        tb_NhanVien.setModel(dtm_DanhSach);
        dtm_DanhSach.setRowCount(0);
        int so=nhanviens.size();
        for(int i=0;i<so;i++)
        {
            Object arr[] = {nhanviens.get(i).getMaNV(),nhanviens.get(i).getTenNV(),nhanviens.get(i).getChucVu(),nhanviens.get(i).getSoDT(),nhanviens.get(i).getGioiTinh(),nhanviens.get(i).getTenDangNhap(),nhanviens.get(i).getNgaySinh(),nhanviens.get(i).getHinhAnh()}; 
            dtm_DanhSach.addRow(arr);
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

        group_GioiTinh = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_NhanVien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_MaNhanVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_TenNhanVien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_ChucVu = new javax.swing.JTextField();
        txt_SoDT = new javax.swing.JTextField();
        txt_NgaySinh = new javax.swing.JTextField();
        txt_TenDangNhap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_Them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        txt_Search = new javax.swing.JTextField();
        btn_Tim = new javax.swing.JButton();
        rdo_Nu = new javax.swing.JRadioButton();
        rdo_Nam = new javax.swing.JRadioButton();
        txt_img = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_DoiAnh = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1370, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Nhân viên");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        tb_NhanVien.setForeground(new java.awt.Color(153, 0, 0));
        tb_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MaNV", "TenNV", "Chức Vụ", "SDT", "Giới Tính", "Tên Đăng Nhập", "Ngày Sinh", "Hình ảnh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_NhanVien.setPreferredSize(new java.awt.Dimension(700, 500));
        tb_NhanVien.setRowHeight(40);
        tb_NhanVien.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tb_NhanVien.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tb_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_NhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_NhanVien);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1370, 330));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Mã nhân viên :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
        add(txt_MaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 330, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Tên nhân viên :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
        add(txt_TenNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 330, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Chức vụ :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Số điện thoại :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Giới tính :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Ngày Sinh :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Tên Đăng Nhập :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));
        add(txt_ChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 330, 30));
        add(txt_SoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 370, 30));
        add(txt_NgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 370, 30));
        add(txt_TenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 330, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Tìm Kiếm :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, -1));

        btn_Them.setBackground(new java.awt.Color(0, 255, 51));
        btn_Them.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Them.setForeground(new java.awt.Color(255, 255, 255));
        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/add.png"))); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });
        add(btn_Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 100, 40));

        btn_Xoa.setBackground(new java.awt.Color(255, 0, 0));
        btn_Xoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/xoa.png"))); // NOI18N
        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });
        add(btn_Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 100, 40));

        btn_Sua.setBackground(new java.awt.Color(0, 51, 255));
        btn_Sua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/sua.png"))); // NOI18N
        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });
        add(btn_Sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 260, 100, 40));

        txt_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_SearchKeyPressed(evt);
            }
        });
        add(txt_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 330, 30));

        btn_Tim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/search.png"))); // NOI18N
        btn_Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimActionPerformed(evt);
            }
        });
        add(btn_Tim, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 210, 40, 30));

        group_GioiTinh.add(rdo_Nu);
        rdo_Nu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdo_Nu.setForeground(new java.awt.Color(153, 0, 0));
        rdo_Nu.setText("Nữ");
        add(rdo_Nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, 120, 40));

        group_GioiTinh.add(rdo_Nam);
        rdo_Nam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdo_Nam.setForeground(new java.awt.Color(153, 0, 0));
        rdo_Nam.setText("Nam");
        add(rdo_Nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 120, 40));

        txt_img.setBackground(new java.awt.Color(153, 153, 153));
        txt_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/hotel.png"))); // NOI18N
        add(txt_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 90, 140, 120));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Hình ảnh :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 60, -1, -1));

        btn_DoiAnh.setBackground(new java.awt.Color(153, 153, 153));
        btn_DoiAnh.setText("Chọn ảnh");
        btn_DoiAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoiAnhActionPerformed(evt);
            }
        });
        add(btn_DoiAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tb_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_NhanVienMouseClicked
        // TODO add your handling code here:
        int selectedRow = tb_NhanVien.getSelectedRow();
        if (selectedRow != -1) {
            Object maNV = tb_NhanVien.getValueAt(selectedRow, 0);
            txt_MaNhanVien.setText(String.valueOf(maNV));
            Object tenNV = tb_NhanVien.getValueAt(selectedRow, 1);
            txt_TenNhanVien.setText((String) tenNV);
            Object chucVu = tb_NhanVien.getValueAt(selectedRow, 2);
            txt_ChucVu.setText((String) chucVu);
            Object sdt = tb_NhanVien.getValueAt(selectedRow, 3);
            txt_SoDT.setText((String) sdt);
            
            
            Object gioiTinh = tb_NhanVien.getValueAt(selectedRow, 4);
            String sex=(String) gioiTinh;
            
            if(sex.equals("Nam"))
            {
                rdo_Nam.setSelected(true);
            }else
            {
                rdo_Nu.setSelected(true);
            }
            
            
            Object tenDN = tb_NhanVien.getValueAt(selectedRow, 5);
            txt_TenDangNhap.setText((String) tenDN);
            Object NgaySinh = tb_NhanVien.getValueAt(selectedRow, 6);
            txt_NgaySinh.setText((String) NgaySinh);
            Object hinhanh = tb_NhanVien.getValueAt(selectedRow, 7);
            String imagePath = "C:\\AppDatPhongKhachSan\\src\\Anh/" + hinhanh;
            txt_img.setIcon(ResizeImage(imagePath));
            ImageIcon icon = ResizeImage(imagePath);
            if (icon != null) {
                txt_img.setIcon(icon);
            } else {
                txt_img.setIcon(null); // Xóa ảnh nếu không tìm thấy
            }
        }
    }//GEN-LAST:event_tb_NhanVienMouseClicked

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        // TODO add your handling code here:
         NhanVienEvent.EditNhanVien();
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        // TODO add your handling code here:
        NhanVienEvent.deleteNhanVien();
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimActionPerformed
        // TODO add your handling code here:
       NhanVienEvent.timKiem();
    }//GEN-LAST:event_btn_TimActionPerformed

                                      

    
    private void txt_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SearchKeyPressed
        // TODO add your handling code here:
        nhanviens.clear();
        try {
            Connect.Connect();
            String searchText = txt_Search.getText().trim();
            String sql="SELECT * FROM Admin.NhanVien WHERE (MaNV LIKE ?  OR TenNV LIKE ?) ORDER BY MaNV ASC";
            PreparedStatement statement = Connect.conn.prepareStatement(sql);
            statement.setString(1, "%" + searchText + "%"); // Search within name
            statement.setString(2, "%" + searchText + "%"); // Search within ID (optional)

            ResultSet result = statement.executeQuery();
            while(result.next())
            {
                NhanVien temp= new NhanVien();
                temp.setMaNV(result.getInt(1));
                temp.setTenNV(result.getString(2));
                temp.setChucVu(result.getString(3));
                temp.setSoDT(result.getString(4));
                temp.setGioiTinh(result.getString(5));
                temp.setTenDangNhap(result.getString(6));
                Date ngaysinh=result.getDate(7);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String ngayGioFormatted = sdf.format(ngaysinh);
                temp.setNgaySinh(ngayGioFormatted);
                nhanviens.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(formNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        initTable();
    }//GEN-LAST:event_txt_SearchKeyPressed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:
        AddNhanVien temp= new AddNhanVien(this);
        temp.setVisible(true);
    }//GEN-LAST:event_btn_ThemActionPerformed

    public String selectedImagePath;
    private void btn_DoiAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoiAnhActionPerformed
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
                    txt_img.setIcon(ResizeImage(pathFile));
                    selectedImagePath = pathFile; // Lưu trữ đường dẫn ảnh đã chọn
                } else {
                    System.out.println("Could not read the image file: " + pathFile);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_DoiAnhActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DoiAnh;
    public javax.swing.JButton btn_Sua;
    public javax.swing.JButton btn_Them;
    public javax.swing.JButton btn_Tim;
    public javax.swing.JButton btn_Xoa;
    private javax.swing.ButtonGroup group_GioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rdo_Nam;
    public javax.swing.JRadioButton rdo_Nu;
    public javax.swing.JTable tb_NhanVien;
    public javax.swing.JTextField txt_ChucVu;
    public javax.swing.JTextField txt_MaNhanVien;
    public javax.swing.JTextField txt_NgaySinh;
    public javax.swing.JTextField txt_Search;
    public javax.swing.JTextField txt_SoDT;
    public javax.swing.JTextField txt_TenDangNhap;
    public javax.swing.JTextField txt_TenNhanVien;
    public javax.swing.JLabel txt_img;
    // End of variables declaration//GEN-END:variables
}