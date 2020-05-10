
package ogrkulup;

import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class jframe_adminpanel extends javax.swing.JFrame {

 
    public jframe_adminpanel() {
        initComponents();
        baglanVeYoneticiListele();
        kayit_PANEL.setVisible(false);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geriDon_Button1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        islemSec_COMBO = new javax.swing.JComboBox<>();
        yoneticiId_TEXT = new javax.swing.JTextField();
        kullaniciId_STEXT = new javax.swing.JLabel();
        geriDon_Button = new javax.swing.JButton();
        islemOnay_BUTTON = new javax.swing.JButton();
        kayit_PANEL = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        yoneticiKad_TEXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        yoneticiKayit_BUTTON = new javax.swing.JButton();
        yoneticiSifre_TEXT = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();

        geriDon_Button1.setBackground(new java.awt.Color(255, 51, 51));
        geriDon_Button1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        geriDon_Button1.setForeground(new java.awt.Color(255, 255, 255));
        geriDon_Button1.setText("Geri Dön");
        geriDon_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriDon_Button1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Yönetici Listesi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Lütfen İşlem Seçiniz:");

        islemSec_COMBO.setBackground(new java.awt.Color(255, 255, 204));
        islemSec_COMBO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        islemSec_COMBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz..", "Yeni Yönetici", "Yönetici Sil", "Yönetici Engelle" }));
        islemSec_COMBO.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                islemSec_COMBOİtemStateChanged(evt);
            }
        });

        yoneticiId_TEXT.setBackground(new java.awt.Color(153, 255, 153));
        yoneticiId_TEXT.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        yoneticiId_TEXT.setForeground(new java.awt.Color(255, 0, 0));
        yoneticiId_TEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoneticiId_TEXTActionPerformed(evt);
            }
        });

        kullaniciId_STEXT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kullaniciId_STEXT.setText("Yönetici ID:");

        geriDon_Button.setBackground(new java.awt.Color(255, 51, 51));
        geriDon_Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        geriDon_Button.setForeground(new java.awt.Color(255, 255, 255));
        geriDon_Button.setText("Geri Dön");
        geriDon_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriDon_ButtonActionPerformed(evt);
            }
        });

        islemOnay_BUTTON.setBackground(new java.awt.Color(153, 255, 153));
        islemOnay_BUTTON.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        islemOnay_BUTTON.setText("İşlemi Onayla");
        islemOnay_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                islemOnay_BUTTONActionPerformed(evt);
            }
        });

        kayit_PANEL.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Kullanıcı Adı:");

        yoneticiKad_TEXT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Şifre:");

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Yeni Yönetici");

        yoneticiKayit_BUTTON.setBackground(new java.awt.Color(153, 255, 153));
        yoneticiKayit_BUTTON.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        yoneticiKayit_BUTTON.setText("Kaydet");
        yoneticiKayit_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoneticiKayit_BUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kayit_PANELLayout = new javax.swing.GroupLayout(kayit_PANEL);
        kayit_PANEL.setLayout(kayit_PANELLayout);
        kayit_PANELLayout.setHorizontalGroup(
            kayit_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kayit_PANELLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(kayit_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kayit_PANELLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yoneticiKad_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kayit_PANELLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yoneticiSifre_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(yoneticiKayit_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(kayit_PANELLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kayit_PANELLayout.setVerticalGroup(
            kayit_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kayit_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kayit_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kayit_PANELLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kayit_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(yoneticiKad_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kayit_PANELLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(kayit_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kayit_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(yoneticiKayit_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(yoneticiSifre_TEXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        tablo.setBackground(new java.awt.Color(204, 255, 204));
        tablo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tablo.setModel(new javax.swing.table.DefaultTableModel(
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
        tablo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablo.setRowHeight(35);
        tablo.setRowMargin(9);
        jScrollPane2.setViewportView(tablo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(geriDon_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(637, 637, 637))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(kullaniciId_STEXT, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yoneticiId_TEXT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(islemOnay_BUTTON))
                            .addComponent(islemSec_COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(kayit_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geriDon_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(islemSec_COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(yoneticiId_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kullaniciId_STEXT))
                            .addComponent(islemOnay_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(kayit_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yoneticiId_TEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoneticiId_TEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yoneticiId_TEXTActionPerformed

    private void geriDon_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriDon_ButtonActionPerformed
             new jframe_anasayfa().setVisible(true);
            setVisible(false); //you can't see me!
            dispose();
    }//GEN-LAST:event_geriDon_ButtonActionPerformed

    private void geriDon_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriDon_Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_geriDon_Button1ActionPerformed

    String yoneticiKadi,yoneticiSifre;
    private void yoneticiKayit_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoneticiKayit_BUTTONActionPerformed
        
            yoneticiKadi=yoneticiKad_TEXT.getText();
            yoneticiSifre=yoneticiSifre_TEXT.getText();
                    
            if (yoneticiKadi.equals("") || yoneticiSifre.equals(""))
            {
              JOptionPane.showMessageDialog(null, "Lütfen Boş Alan Bırakmayınız", "Boş Geçilemez" , JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
            String kaydetQuery="INSERT INTO tbl_giris (kullanici_adi,kullanici_sifre,giris_onay) VALUES "
                    + "('"+yoneticiKadi+"','"+yoneticiSifre+"','1')";
            
            veritabani.ogrenciKaydet(kaydetQuery);
            baglanVeYoneticiListele();
            yoneticiKad_TEXT.setText("");
            yoneticiSifre_TEXT.setText("");
            }
            
    }//GEN-LAST:event_yoneticiKayit_BUTTONActionPerformed
  int secilenIslem;
    private void islemSec_COMBOİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_islemSec_COMBOİtemStateChanged
        secilenIslem=islemSec_COMBO.getSelectedIndex();
        if (secilenIslem==1) 
        {
           kayit_PANEL.setVisible(true);
        }
        else
        {
         kayit_PANEL.setVisible(false);
        }     
    }//GEN-LAST:event_islemSec_COMBOİtemStateChanged

    String yoneticiId="";
    private void islemOnay_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_islemOnay_BUTTONActionPerformed
           
        if (secilenIslem==2) 
        {
          
            System.out.println("SİLME İŞLEMİ");
            yoneticiIslemler(2);
        }
        else  if (secilenIslem==3) 
        {
         System.out.println("ENGELLEME İŞLEMİ");
          yoneticiIslemler(3);
        }  
        
    }//GEN-LAST:event_islemOnay_BUTTONActionPerformed
 
    public void yoneticiIslemler(int durum)
    {
         if (yoneticiId_TEXT.getText().equals(""))
            {
              JOptionPane.showMessageDialog(null, "Lütfen Yönetici ID'yi Giriniz", "Boş Geçilemez" , JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                if (durum==2) 
                {
                    yoneticiId=yoneticiId_TEXT.getText();
                    int dialogYoneticiSil = JOptionPane.showConfirmDialog (null, yoneticiId+"'no'lu Yönetici Silinsin mi ?","Sil",JOptionPane.OK_CANCEL_OPTION);
                    if(dialogYoneticiSil == JOptionPane.YES_OPTION)
                    {
                        String yoneticiSilQuery="DELETE FROM tbl_giris WHERE id='"+yoneticiId+"' ";          
                        veritabani.yoneticiSil(yoneticiSilQuery);
                        baglanVeYoneticiListele();
                        yoneticiId_TEXT.setText("");
                    } 
                }
                else if(durum==3)
                {
                    yoneticiId=yoneticiId_TEXT.getText();
                    int dialogYoneticiSil = JOptionPane.showConfirmDialog (null, yoneticiId+"'no'lu Yönetici Engellensin mi ?","Engelle",JOptionPane.ERROR_MESSAGE);
                    if(dialogYoneticiSil == JOptionPane.YES_OPTION)
                    {
                        String yoneticiEngelleQuery="UPDATE tbl_giris SET giris_onay=0 WHERE id='"+yoneticiId+"' ";          
                        veritabani.yoneticiSil(yoneticiEngelleQuery);
                        baglanVeYoneticiListele();
                        yoneticiId_TEXT.setText("");
                    } 
                }

            }
    
    }
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
            java.util.logging.Logger.getLogger(jframe_adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_adminpanel().setVisible(true);
       
     

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton geriDon_Button;
    private javax.swing.JButton geriDon_Button1;
    private javax.swing.JButton islemOnay_BUTTON;
    private javax.swing.JComboBox<String> islemSec_COMBO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel kayit_PANEL;
    private javax.swing.JLabel kullaniciId_STEXT;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField yoneticiId_TEXT;
    private javax.swing.JTextField yoneticiKad_TEXT;
    private javax.swing.JButton yoneticiKayit_BUTTON;
    private javax.swing.JPasswordField yoneticiSifre_TEXT;
    // End of variables declaration//GEN-END:variables

  
    DefaultTableModel model=new DefaultTableModel();
    Object[] kolonlar = {"Yönetici Id","Kullanıcı Adı","Şifre","Giriş İzni"};
    Object[] satirlar=new Object[4];
        
    private void baglanVeYoneticiListele() 
    {
        model.setColumnCount(0);
        model.setRowCount(0);
        veritabani.veritabaniBaglan();
        String listeSorgu="select * from tbl_giris";
        ResultSet rs = veritabani.yoneticiListele(listeSorgu);
        model.setColumnIdentifiers(kolonlar);
        try 
        {
                while (rs.next()) 
                {
                    satirlar[0]=rs.getInt("id");
                    satirlar[1]=rs.getString("kullanici_adi");
                    satirlar[2]=rs.getString("kullanici_sifre");
                    satirlar[3]=rs.getInt("giris_onay");
                    model.addRow(satirlar);
                }   
                tablo.setModel(model);
               
        } 
        catch (SQLException ex) 
        {
                ex.printStackTrace();
        }
  }
    
   
}

 
