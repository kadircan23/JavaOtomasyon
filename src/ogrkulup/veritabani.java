
package ogrkulup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

   
public class veritabani {
 
    
  static String url="jdbc:sqlite:C://sqlitedatabase//ogrDB.db"; 
  static Connection baglanti=null;
   static boolean veritabaniBaglan()
   {
       try 
       {
           baglanti=DriverManager.getConnection(url);
           System.out.println("Bağlantı Sağlandı..");
           return true;
       } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
       }
   }
   
   
   static ResultSet ogrListele(String sorgu)
   {
       Statement st;
       ResultSet rs;
       
      try 
      {
          st = baglanti.createStatement();
          rs=st.executeQuery(sorgu);
          
          return rs;
      } 
      catch (SQLException ex)
      {
        return null;
      }

   }
   
   static void ogrenciKaydet(String sorgu)
   {
       Statement st;

       
      try 
      {
        st = baglanti.createStatement();
        st.executeUpdate(sorgu);
        System.out.println("Öğrenci Basariyla Kaydedildi");
      } 
      catch (SQLException ex)
      {
    
      }
   }
   
   
  static ResultSet yoneticiListele(String sorgu)
   {
       Statement st;
       ResultSet rs;
       
      try 
      {
          st = baglanti.createStatement();
          rs=st.executeQuery(sorgu);
          return rs;
      } 
      catch (SQLException ex)
      {
        return null;
      }

   }
      
   
   static void yoneticiKaydet(String sorgu)
   {
       Statement st;
       try 
      {
        st = baglanti.createStatement();
        st.executeUpdate(sorgu);
        System.out.println("Yönetici Basariyla Kaydedildi");
      } 
      catch (SQLException ex)
      {
    
      }
   }
      
   
    static void yoneticiSil(String sorgu)
   {
       Statement st;
       try 
      {
        st = baglanti.createStatement();
        st.executeUpdate(sorgu);
        System.out.println("Yönetici Basariyla Silindi");
      } 
      catch (SQLException ex)
      {
    
      }
   }
    
     static void yoneticiEngelle(String sorgu)
   {
       Statement st;
       try 
      {
        st = baglanti.createStatement();
        st.executeUpdate(sorgu);
        System.out.println("Yönetici Basariyla Engellendi");
      } 
      catch (SQLException ex)
      {
    
      }
   }
     
    static void uyeGorevAta(String sorgu)
   {
       Statement st;
       try 
      {
        st = baglanti.createStatement();
        st.executeUpdate(sorgu);
        System.out.println("Görev Ataması Basarılı");
      } 
      catch (SQLException ex)
      {
    
      }
   }
      
}
