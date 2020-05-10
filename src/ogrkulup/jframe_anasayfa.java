 
package ogrkulup;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

 
public final class jframe_anasayfa extends javax.swing.JFrame {
    
    public jframe_anasayfa() { 
       initComponents();
       baglanVeListele(false); 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kapatButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        ogrAd_TEXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ogrSoyAd_TEXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ogrMail_TEXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ogrBolum_TEXT = new javax.swing.JTextField();
        ogrNo_TEXT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        yeniUyeButton = new javax.swing.JButton();
        ogrFakulte_TEXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        gorevlendirme_BUTTON = new javax.swing.JButton();
        kapatButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        uyeAra_BUTTON = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        listeyenile_BUTTON1 = new javax.swing.JButton();
        uyeidAra_TEXT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        kapatButton.setBackground(new java.awt.Color(255, 51, 51));
        kapatButton.setForeground(new java.awt.Color(255, 255, 255));
        kapatButton.setText("Oturumu Kapat");
        kapatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kapatButtonActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tablo);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        ogrAd_TEXT.setMinimumSize(new java.awt.Dimension(6, 26));

        jLabel3.setText("Öğrenci Soyadı");

        ogrSoyAd_TEXT.setMinimumSize(new java.awt.Dimension(6, 26));
        ogrSoyAd_TEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrSoyAd_TEXTActionPerformed(evt);
            }
        });

        jLabel4.setText("Mail Adresi");

        ogrMail_TEXT.setMinimumSize(new java.awt.Dimension(6, 26));

        jLabel5.setText("Bölüm");

        jLabel1.setText("Öğrenci No");

        ogrBolum_TEXT.setMinimumSize(new java.awt.Dimension(6, 26));

        ogrNo_TEXT.setMinimumSize(new java.awt.Dimension(6, 26));

        jLabel6.setText("Fakülte");

        yeniUyeButton.setBackground(new java.awt.Color(51, 204, 0));
        yeniUyeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yeniUyeButton.setForeground(new java.awt.Color(255, 255, 255));
        yeniUyeButton.setText("Yeni Üye Kaydı");
        yeniUyeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniUyeButtonActionPerformed(evt);
            }
        });

        ogrFakulte_TEXT.setMinimumSize(new java.awt.Dimension(6, 26));

        jLabel2.setText("Öğrenci Adı");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ogrNo_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ogrAd_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ogrSoyAd_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ogrMail_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ogrBolum_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(ogrFakulte_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(yeniUyeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yeniUyeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ogrBolum_TEXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ogrAd_TEXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ogrNo_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ogrSoyAd_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ogrMail_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ogrFakulte_TEXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gorevlendirme_BUTTON.setBackground(new java.awt.Color(204, 255, 204));
        gorevlendirme_BUTTON.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gorevlendirme_BUTTON.setText("Üye Görevlendirme");
        gorevlendirme_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gorevlendirme_BUTTONActionPerformed(evt);
            }
        });

        kapatButton3.setBackground(new java.awt.Color(255, 204, 51));
        kapatButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kapatButton3.setText("Admin Yönetim Paneli");
        kapatButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kapatButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        uyeAra_BUTTON.setBackground(new java.awt.Color(255, 255, 102));
        uyeAra_BUTTON.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uyeAra_BUTTON.setText("Üye Ara");
        uyeAra_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeAra_BUTTONActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Üye Id:");

        listeyenile_BUTTON1.setBackground(new java.awt.Color(255, 153, 102));
        listeyenile_BUTTON1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listeyenile_BUTTON1.setForeground(new java.awt.Color(255, 255, 255));
        listeyenile_BUTTON1.setText("Yenile");
        listeyenile_BUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeyenile_BUTTON1ActionPerformed(evt);
            }
        });

        uyeidAra_TEXT.setBackground(new java.awt.Color(255, 255, 204));
        uyeidAra_TEXT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(kapatButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(gorevlendirme_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(kapatButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uyeidAra_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uyeAra_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listeyenile_BUTTON1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(uyeAra_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(listeyenile_BUTTON1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(uyeidAra_TEXT))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gorevlendirme_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kapatButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kapatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ogrSoyAd_TEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrSoyAd_TEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ogrSoyAd_TEXTActionPerformed
    String ogrNo,ogrAdi,ogrSoyadi,ogrMail,ogrBolum,ogrFakulte;
    private void yeniUyeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniUyeButtonActionPerformed
            
            ogrNo=ogrNo_TEXT.getText();
            ogrAdi=ogrAd_TEXT.getText();
            ogrSoyadi=ogrSoyAd_TEXT.getText();
            ogrMail=ogrMail_TEXT.getText();
            ogrBolum=ogrBolum_TEXT.getText();
            ogrFakulte=ogrFakulte_TEXT.getText();
            
            if (ogrNo.equals("") || ogrAdi.equals("") || ogrSoyadi.equals("") || ogrMail.equals("") || ogrBolum.equals("") || ogrFakulte.equals("") )
            {
              JOptionPane.showMessageDialog(null, "Lütfen Boş Alan Bırakmayınız", "Boş Geçilemez" , JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
            String kaydetQuery="INSERT INTO tbl_ogrBilgi (ogr_no,ogr_adi,ogr_soyadi,ogr_mail,ogr_bolum,ogr_fakulte,ogr_gorev) VALUES "
                    + "('"+ogrNo+"','"+ogrAdi+"','"+ogrSoyadi+"','"+ogrMail+"','"+ogrBolum+"','"+ogrFakulte+"','UYE')";
            
            veritabani.ogrenciKaydet(kaydetQuery);
         
            ogrNo_TEXT.setText("");
            ogrAd_TEXT.setText("");
            ogrSoyAd_TEXT.setText("");
            ogrMail_TEXT.setText("");
            ogrBolum_TEXT.setText("");
            ogrFakulte_TEXT.setText(""); 
            baglanVeListele(false);
            }
            
    }//GEN-LAST:event_yeniUyeButtonActionPerformed

    private void kapatButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kapatButton3ActionPerformed
             new jframe_adminpanel().setVisible(true);
            setVisible(false); //you can't see me!
            dispose();
    }//GEN-LAST:event_kapatButton3ActionPerformed

    private void gorevlendirme_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gorevlendirme_BUTTONActionPerformed
        new jframe_gorevatama().setVisible(true);
    }//GEN-LAST:event_gorevlendirme_BUTTONActionPerformed

    private void kapatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kapatButtonActionPerformed
        int dialogOturumKapat = JOptionPane.showConfirmDialog (null, "Oturum Kapatılsın mı ?","Kapat",JOptionPane.OK_CANCEL_OPTION);
        if(dialogOturumKapat == JOptionPane.YES_OPTION)
        {
            new jframe_giris().setVisible(true);
            setVisible(false); //you can't see me!
            dispose();
        }       
    }//GEN-LAST:event_kapatButtonActionPerformed

    private void uyeAra_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeAra_BUTTONActionPerformed
        baglanVeListele(true); 
        uyeidAra_TEXT.setText("");
    }//GEN-LAST:event_uyeAra_BUTTONActionPerformed

    private void listeyenile_BUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeyenile_BUTTON1ActionPerformed
        baglanVeListele(false); 
    }//GEN-LAST:event_listeyenile_BUTTON1ActionPerformed

    
    DefaultTableModel model=new DefaultTableModel();
    Object[] kolonlar = {"Üye Id","Öğrenci No","Ad","Soyad","Mail Adresi","Bölümü","Fakültesi","Görevi"};
    Object[] satirlar=new Object[8];
    String araUyeId;
void baglanVeListele(boolean ara)
{
    if (ara==true) 
    {

        if (uyeidAra_TEXT.getText().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Lütfen Id Alanını Boş Alan Bırakmayınız", "Boş Geçilemez" , JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
             araUyeId=uyeidAra_TEXT.getText().toString();
            model.setColumnCount(0);
            model.setRowCount(0);
            veritabani.veritabaniBaglan();
            String listeSorgu="select * from tbl_ogrBilgi WHERE ogr_id='"+araUyeId+"'";
            ResultSet rs = veritabani.ogrListele(listeSorgu);
            model.setColumnIdentifiers(kolonlar);   
            try 
            {
                    while (rs.next()) 
                    {
                        satirlar[0]=rs.getInt("ogr_id");
                        satirlar[1]=rs.getInt("ogr_no");
                        satirlar[2]=rs.getString("ogr_adi");
                        satirlar[3]=rs.getString("ogr_soyadi");
                        satirlar[4]=rs.getString("ogr_mail");
                        satirlar[5]=rs.getString("ogr_bolum");
                        satirlar[6]=rs.getString("ogr_fakulte");
                        satirlar[7]=rs.getString("ogr_gorev");
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
    else if(ara==false)
    {
            model.setColumnCount(0);
            model.setRowCount(0);
            veritabani.veritabaniBaglan();
            String listeSorgu="select * from tbl_ogrBilgi";
            ResultSet rs = veritabani.ogrListele(listeSorgu);
            model.setColumnIdentifiers(kolonlar);

            try 
            {
                    while (rs.next()) 
                    {
                        satirlar[0]=rs.getInt("ogr_id");
                        satirlar[1]=rs.getInt("ogr_no");
                        satirlar[2]=rs.getString("ogr_adi");
                        satirlar[3]=rs.getString("ogr_soyadi");
                        satirlar[4]=rs.getString("ogr_mail");
                        satirlar[5]=rs.getString("ogr_bolum");
                        satirlar[6]=rs.getString("ogr_fakulte");
                        satirlar[7]=rs.getString("ogr_gorev");
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
            java.util.logging.Logger.getLogger(jframe_anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_anasayfa().setVisible(true);
               
            }
        });
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gorevlendirme_BUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kapatButton;
    private javax.swing.JButton kapatButton3;
    private javax.swing.JButton listeyenile_BUTTON1;
    private javax.swing.JTextField ogrAd_TEXT;
    private javax.swing.JTextField ogrBolum_TEXT;
    private javax.swing.JTextField ogrFakulte_TEXT;
    private javax.swing.JTextField ogrMail_TEXT;
    private javax.swing.JTextField ogrNo_TEXT;
    private javax.swing.JTextField ogrSoyAd_TEXT;
    private javax.swing.JTable tablo;
    private javax.swing.JButton uyeAra_BUTTON;
    private javax.swing.JTextField uyeidAra_TEXT;
    private javax.swing.JButton yeniUyeButton;
    // End of variables declaration//GEN-END:variables
 
}
