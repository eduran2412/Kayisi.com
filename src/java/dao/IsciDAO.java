/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class IsciDAO {
    private DBConnection db;

    public DBConnection getDb() {
        if (this.db == null) {
            this.db = new DBConnection();
        }
        return db;
    }

    public List<Isci> Listele(int page, int pageSize) {
        
        List<Isci> iscilist = new ArrayList<>();
        int start=(page-1)*pageSize;
        Isci i;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from isciler order by telNo asc limit "+start+","+pageSize );

            while (rs.next()) {
                i=new Isci(rs.getString("kullaniciAdi"), rs.getLong("sifre"),rs.getString("ad"),rs.getString("soyad"),rs.getString("cinsiyet"),rs.getLong("telNo"),rs.getString("sektor"),rs.getString("firmaAdi"),rs.getLong("firmaNo"));
                
                iscilist.add(i);
            }
        } catch (Exception e) {
        }
        return iscilist;
    }
    
    
    public int count () {
        int count=0;
        List<Isci> iscilist = new ArrayList<>();
        
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select count(telNo) as isciler_count from isciler");
            rs.next();
            count=rs.getInt("isciler_count");
          
        } catch (Exception e) {
        }
        return count;
    }
    
    
    public void Guncelle(Isci i){
        try {
            Statement st = this.getDb().getConnection().createStatement();
            st.executeUpdate("update isciler set ad='" + i.getAd()+ "', soyad='"+i.getSoyad()+"', cinsiyet='"+i.getCinsiyet()+"', telNo='"+i.getTelNo()+"',sektor='"+i.getSektor()+"', firmaAdi='"+i.getFirmaAdi()+"', firmaNo='"+i.getFirmaNo()+"' where kullaniciAdi='"+i.getKullaniciAdi()+"'");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void Sil(Isci i){
        try {
            Statement st = this.getDb().getConnection().createStatement();
            st.executeUpdate("delete from isciler where kullaniciAdi='"+i.getKullaniciAdi()+"'");
               
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void Kaydet(Isci a) {
        List<Isci> iscilist = new ArrayList<>();
        try {
            Statement st = this.getDb().getConnection().createStatement();
            st.executeUpdate("insert into isciler values('" + a.getKullaniciAdi()+ "','" + a.getSifre()+ "','" + a.getAd()+ "','" + a.getSoyad()+ "','" + a.getCinsiyet()+ "','" + a.getTelNo()+ "','" + a.getSektor()+ "','firma yok','0');");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        iscilist.add(a);
    }
    
    public void setDb(DBConnection db) {
        this.db = db;
    }
    
    
    
    
     public List<Isci> ListeleGida(int page, int pageSize) {
        List<Isci> iscilist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from isciler where sektor='gıda' or sektor = 'Gıda' order by telNo asc limit "+start+","+pageSize);

            while (rs.next()) {
                iscilist.add(new Isci(rs.getString("kullaniciAdi"), rs.getLong("sifre"),rs.getString("ad"),rs.getString("soyad"),rs.getString("cinsiyet"),rs.getLong("telNo"),rs.getString("sektor"),rs.getString("firmaAdi"),rs.getLong("firmaNo")));
            }
        } catch (Exception e) {
        }
        return iscilist;
    }
     public List<Isci> ListeleHizmet(int page, int pageSize) {
        List<Isci> iscilist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from isciler where sektor='hizmet' or sektor = 'Hizmet' order by telNo asc limit "+start+","+pageSize );

            while (rs.next()) {
                iscilist.add(new Isci(rs.getString("kullaniciAdi"), rs.getLong("sifre"),rs.getString("ad"),rs.getString("soyad"),rs.getString("cinsiyet"),rs.getLong("telNo"),rs.getString("sektor"),rs.getString("firmaAdi"),rs.getLong("firmaNo")));
            }
        } catch (Exception e) {
        }
        return iscilist;
    }
     public List<Isci> ListeleGiyim(int page, int pageSize) {
        List<Isci> iscilist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from isciler where sektor='giyim' or sektor = 'Giyim' order by telNo asc limit "+start+","+pageSize);

            while (rs.next()) {
                iscilist.add(new Isci(rs.getString("kullaniciAdi"), rs.getLong("sifre"),rs.getString("ad"),rs.getString("soyad"),rs.getString("cinsiyet"),rs.getLong("telNo"),rs.getString("sektor"),rs.getString("firmaAdi"),rs.getLong("firmaNo")));
            }
        } catch (Exception e) {
        }
        return iscilist;
    }
     public List<Isci> ListeleInsaat(int page, int pageSize) {
        List<Isci> iscilist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from isciler where sektor='inşaat' or sektor = 'İnşaat' order by telNo asc limit "+start+","+pageSize);

            while (rs.next()) {
                iscilist.add(new Isci(rs.getString("kullaniciAdi"), rs.getLong("sifre"),rs.getString("ad"),rs.getString("soyad"),rs.getString("cinsiyet"),rs.getLong("telNo"),rs.getString("sektor"),rs.getString("firmaAdi"),rs.getLong("firmaNo")));
            }
        } catch (Exception e) {
        }
        return iscilist;
    }
     public List<Isci> ListeleSaglik(int page, int pageSize) {
        List<Isci> iscilist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from isciler where sektor='Sağlık' or sektor = 'sağlık' order by telNo asc limit "+start+","+pageSize);

            while (rs.next()) {
                iscilist.add(new Isci(rs.getString("kullaniciAdi"), rs.getLong("sifre"),rs.getString("ad"),rs.getString("soyad"),rs.getString("cinsiyet"),rs.getLong("telNo"),rs.getString("sektor"),rs.getString("firmaAdi"),rs.getLong("firmaNo")));
            }
        } catch (Exception e) {
        }
        return iscilist;
    }
     public List<Isci> ListeleTurizm(int page, int pageSize) {
        List<Isci> iscilist = new ArrayList<>();
        int start=(page-1)*pageSize;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from isciler where sektor='turizm' or sektor = 'Turizm' order by telNo asc limit "+start+","+pageSize);

            while (rs.next()) {
                iscilist.add(new Isci(rs.getString("kullaniciAdi"), rs.getLong("sifre"),rs.getString("ad"),rs.getString("soyad"),rs.getString("cinsiyet"),rs.getLong("telNo"),rs.getString("sektor"),rs.getString("firmaAdi"),rs.getLong("firmaNo")));
            }
        } catch (Exception e) {
        }
        return iscilist;
    }
}
