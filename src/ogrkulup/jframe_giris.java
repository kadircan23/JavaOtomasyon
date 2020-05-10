 
package ogrkulup;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
 
public class jframe_giris extends javax.swing.JFrame {
 
    public jframe_giris() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        girisYap_BUTTON = new javax.swing.JButton();
        kullaniciSifre_TEXT = new javax.swing.JPasswordField();
        kullaniciAdi_TEXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Kullanıcı Adı:");

        girisYap_BUTTON.setBackground(new java.awt.Color(153, 255, 153));
        girisYap_BUTTON.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        girisYap_BUTTON.setText("Giriş Yap");
        girisYap_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYap_BUTTONActionPerformed(evt);
            }
        });

        kullaniciSifre_TEXT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        kullaniciAdi_TEXT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Şifre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(girisYap_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(kullaniciAdi_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(kullaniciSifre_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kullaniciAdi_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciSifre_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(girisYap_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String kullaniciAdi,kullaniciSifre;
    private void girisYap_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYap_BUTTONActionPerformed
        
        kullaniciAdi=kullaniciAdi_TEXT.getText();
        kullaniciSifre=kullaniciSifre_TEXT.getText();

         
        if (girisYap(kullaniciAdi,kullaniciSifre)==1)
        {
            new jframe_anasayfa().setVisible(true);
            setVisible(false);  
            dispose();
        }
        else if (girisYap(kullaniciAdi,kullaniciSifre)==2)
        {
            JOptionPane.showMessageDialog(null, "Bilgilerinizi Kontrol Ediniz", "Giriş Yapılamadı " , JOptionPane.INFORMATION_MESSAGE);
        }
        else if (girisYap(kullaniciAdi,kullaniciSifre)==0)
        {
            JOptionPane.showMessageDialog(null, "Hesabınız Engellenmiştir. Kulüp Başkanı ile iletişime geçiniz.", "Engel" , JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_girisYap_BUTTONActionPerformed

       

int onayDurum,girisDurum,girisKontrol;
   public int girisYap(String kullaniciAd,String kullaniciSifre)
    {
        try 
        {
            veritabani.veritabaniBaglan(); 
            String sqlquery="SELECT COUNT(*) as onaySay,giris_onay AS girisKontrol FROM tbl_giris WHERE kullanici_adi='"+kullaniciAd+"' AND kullanici_sifre='"+kullaniciSifre+"'";
             
            try 
            {
                Statement st= veritabani.baglanti.createStatement();
                ResultSet sonuclar = st.executeQuery(sqlquery);
                while (sonuclar.next()) 
                {
                    onayDurum=sonuclar.getInt("onaySay");
                    girisKontrol=sonuclar.getInt("girisKontrol"); 
                }
                if ((onayDurum==1) && (girisKontrol==1))
                {
                    girisDurum=1;
                }
                else if ((onayDurum==1) && (girisKontrol==0))
                {
                   girisDurum=0;
                }
                else
                {
                    girisDurum=2;
                }
             
               
               
           }
            catch(Exception E)
            {
            
            }
                
      }
      catch (Exception e) 
     {
              
     }
        return girisDurum;
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
            java.util.logging.Logger.getLogger(jframe_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girisYap_BUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kullaniciAdi_TEXT;
    private javax.swing.JPasswordField kullaniciSifre_TEXT;
    // End of variables declaration//GEN-END:variables
}
