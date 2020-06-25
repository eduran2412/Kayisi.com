/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Firma;
import entity.Isci;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author Furkan
 */
public class FirmaDAO {

    private DBConnection db;

    public DBConnection getDb() {
        if (this.db == null) {
            this.db = new DBConnection();
        }
        return db;
    }

    public List<Firma> Listele(int page, int pageSize) {
        List<Firma> firmalist = new ArrayList<>();
         int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from firmalar where kullaniciAdi!='Admin' order by telNo asc limit "+start+","+pageSize );

            while (rs.next()) {
                firmalist.add(new Firma(rs.getString("kullaniciAdi"), rs.getLong("sifre"), rs.getString("sirketAdi"), rs.getLong("telNo"), rs.getString("sektor"), rs.getLong("elemanSayisi"), rs.getString("cinsiyet")));
            }
        } catch (Exception e) {
        }
        return firmalist;
    }
    
    public int count() {
        int count=0;
        List<Firma> firmalist = new ArrayList<>();
      
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select count(telNo) as firmalar_count from firmalar" );
             rs.next();
            count=rs.getInt("firmalar_count");
           
        } catch (Exception e) {
        }
        return count;
    }
    
    public List<Firma> FirmaBilgi(Firma f) {
        List<Firma> firmalist = new ArrayList<>();
        
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from firmalar where kullaniciAdi='"+f.getKullaniciAdi()+"' ");

            while (rs.next()) {
                firmalist.add(new Firma(rs.getString("kullaniciAdi"), rs.getLong("sifre"), rs.getString("sirketAdi"), rs.getLong("telNo"), rs.getString("sektor"), rs.getLong("elemanSayisi"), rs.getString("cinsiyet")));
            }
        } catch (Exception e) {
        }
        return firmalist;
    }

    public void Kaydet(Firma a) {
        List<Firma> firmalist = new ArrayList<>();
        try {
            Statement st = this.getDb().getConnection().createStatement();
            st.executeUpdate("insert into firmalar values('" + a.getKullaniciAdi() + "','" + a.getSifre() + "','" + a.getSirketAdi() + "','" + a.getTelNo() + "','" + a.getSektor() + "','" + a.getElemanSayisi() + "','" + a.getCinsiyet() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        firmalist.add(a);
    }

    public void Guncelle(Firma f) {
        try {
            Statement st = this.getDb().getConnection().createStatement();
            st.executeUpdate("update firmalar set sirketAdi='" + f.getSirketAdi() + "', telNo='" + f.getTelNo() + "', sektor='" + f.getSektor() + "', telNo='" + f.getTelNo()+ "', elemanSayisi='" + f.getElemanSayisi() + "', cinsiyet='" + f.getCinsiyet() + "' where kullaniciAdi='" + f.getKullaniciAdi() + "'");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Sil(Firma f) {
        try {
            Statement st = this.getDb().getConnection().createStatement();
            st.executeUpdate("delete from firmalar where kullaniciAdi='" + f.getKullaniciAdi() + "'");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setDb(DBConnection db) {
        this.db = db;
    }

    public List<Firma> ListeleGida(int page, int pageSize) {
        List<Firma> firmalist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from firmalar where sektor='gıda' or sektor = 'Gıda' order by telNo asc limit "+start+","+pageSize );

            while (rs.next()) {
                firmalist.add(new Firma(rs.getString("kullaniciAdi"), rs.getLong("sifre"), rs.getString("sirketAdi"), rs.getLong("telNo"), rs.getString("sektor"), rs.getLong("elemanSayisi"), rs.getString("cinsiyet")));
            }
        } catch (Exception e) {
        }
        return firmalist;
    }

    public List<Firma> ListeleGiyim(int page, int pageSize) {
        List<Firma> firmalist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from firmalar where sektor='giyim' or sektor = 'Giyim' order by telNo asc limit "+start+","+pageSize );

            while (rs.next()) {
                firmalist.add(new Firma(rs.getString("kullaniciAdi"), rs.getLong("sifre"), rs.getString("sirketAdi"), rs.getLong("telNo"), rs.getString("sektor"), rs.getLong("elemanSayisi"), rs.getString("cinsiyet")));
            }
        } catch (Exception e) {
        }
        return firmalist;
    }

    public List<Firma> ListeleHizmet(int page, int pageSize) {
        List<Firma> firmalist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from firmalar where sektor='hizmet' or sektor = 'Hizmet' order by telNo asc limit "+start+","+pageSize );

            while (rs.next()) {
                firmalist.add(new Firma(rs.getString("kullaniciAdi"), rs.getLong("sifre"), rs.getString("sirketAdi"), rs.getLong("telNo"), rs.getString("sektor"), rs.getLong("elemanSayisi"), rs.getString("cinsiyet")));
            }
        } catch (Exception e) {
        }
        return firmalist;
    }

    public List<Firma> ListeleInsaat(int page, int pageSize) {
        List<Firma> firmalist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from firmalar where sektor='inşaat' or sektor = 'İnşaat' order by telNo asc limit "+start+","+pageSize );

            while (rs.next()) {
                firmalist.add(new Firma(rs.getString("kullaniciAdi"), rs.getLong("sifre"), rs.getString("sirketAdi"), rs.getLong("telNo"), rs.getString("sektor"), rs.getLong("elemanSayisi"), rs.getString("cinsiyet")));
            }
        } catch (Exception e) {
        }
        return firmalist;
    }

    public List<Firma> ListeleSaglik(int page, int pageSize) {
        List<Firma> firmalist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from firmalar where sektor='sağlık' or sektor = 'Sağlık' order by telNo asc limit "+start+","+pageSize  );

            while (rs.next()) {
                firmalist.add(new Firma(rs.getString("kullaniciAdi"), rs.getLong("sifre"), rs.getString("sirketAdi"), rs.getLong("telNo"), rs.getString("sektor"), rs.getLong("elemanSayisi"), rs.getString("cinsiyet")));
            }
        } catch (Exception e) {
        }
        return firmalist;
    }

    public List<Firma> ListeleTurizm(int page, int pageSize) {
        List<Firma> firmalist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from firmalar where sektor='turizm' or sektor = 'Turizm' order by telNo asc limit "+start+","+pageSize);

            while (rs.next()) {
                firmalist.add(new Firma(rs.getString("kullaniciAdi"), rs.getLong("sifre"), rs.getString("sirketAdi"), rs.getLong("telNo"), rs.getString("sektor"), rs.getLong("elemanSayisi"), rs.getString("cinsiyet")));
            }
        } catch (Exception e) {
        }
        return firmalist;
    }
}
