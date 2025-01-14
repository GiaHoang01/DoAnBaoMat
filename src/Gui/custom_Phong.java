/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Gui;

import java.awt.Color;

/**
 *
 * @author 84862
 */
public class custom_Phong extends javax.swing.JPanel {


    /**
     * Creates new form custom_Phong
     */
    public custom_Phong(int maPhong,String tenLoaiPhong,int SoNguoiToiDa,String trangThai) {
        initComponents();

        txt_TenLoaiPhong.setText(tenLoaiPhong);
        txt_MaPhong.setText(""+maPhong);
        txt_SoNguoiToiDa.setText(SoNguoiToiDa+"");
        txt_TrangThai.setText(trangThai);
        String ten= trangThai;
        if(trangThai.equals("Trống"))
        {
            panel_Mau.setBackground(new Color(0, 255, 0));
            txt_TrangThai.setForeground(new Color(0, 255, 0));
        }
        else if(trangThai.equals("Bảo trì"))
        {
            panel_Mau.setBackground(new Color(102, 0, 102)); 
            txt_TrangThai.setForeground(new Color(102, 0, 102));
        }
        else
        {
            panel_Mau.setBackground(new Color(255, 0, 0)); 
            txt_TrangThai.setForeground(new Color(255, 0, 0));
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

        panel_Mau = new javax.swing.JPanel();
        txt_MaPhong = new javax.swing.JLabel();
        txt_TenLoaiPhong = new javax.swing.JLabel();
        txt_SoNguoiToiDa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_TrangThai = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(250, 100));
        setMinimumSize(new java.awt.Dimension(250, 100));
        setPreferredSize(new java.awt.Dimension(250, 100));

        panel_Mau.setBackground(new java.awt.Color(0, 255, 0));
        panel_Mau.setMaximumSize(new java.awt.Dimension(130, 100));
        panel_Mau.setMinimumSize(new java.awt.Dimension(130, 100));
        panel_Mau.setPreferredSize(new java.awt.Dimension(130, 100));

        txt_MaPhong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_MaPhong.setForeground(new java.awt.Color(255, 255, 255));

        txt_TenLoaiPhong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_TenLoaiPhong.setForeground(new java.awt.Color(255, 255, 255));
        txt_TenLoaiPhong.setText("V101");

        txt_SoNguoiToiDa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_SoNguoiToiDa.setForeground(new java.awt.Color(255, 255, 255));
        txt_SoNguoiToiDa.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên Phòng :");

        javax.swing.GroupLayout panel_MauLayout = new javax.swing.GroupLayout(panel_Mau);
        panel_Mau.setLayout(panel_MauLayout);
        panel_MauLayout.setHorizontalGroup(
            panel_MauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_MaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_MauLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(panel_MauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_TenLoaiPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_SoNguoiToiDa, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        panel_MauLayout.setVerticalGroup(
            panel_MauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MauLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_MauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_MaPhong)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_TenLoaiPhong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_SoNguoiToiDa)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        txt_TrangThai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_TrangThai.setForeground(new java.awt.Color(51, 255, 0));
        txt_TrangThai.setText("Trạng thái phòng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Mau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(txt_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Mau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txt_TrangThai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel_Mau;
    private javax.swing.JLabel txt_MaPhong;
    private javax.swing.JLabel txt_SoNguoiToiDa;
    private javax.swing.JLabel txt_TenLoaiPhong;
    private javax.swing.JLabel txt_TrangThai;
    // End of variables declaration//GEN-END:variables
}
