/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Eslestir;
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
 *
 */
public class GirisDAO {

    private DBConnection db;

    public Firma GirisFirma(Firma f) {
        Firma frm = null;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from firmalar where kullaniciAdi='" + f.getKullaniciAdi() + "' and sifre='" + f.getSifre() + "'");
            rs.next();
            frm = new Firma(rs.getString("kullaniciAdi"), rs.getLong("sifre"), rs.getString("sirketAdi"), rs.getLong("telNo"), rs.getString("sektor"), rs.getLong("elemanSayisi"), rs.getString("cinsiyet"));
        } catch (Exception e) {
        }

        return frm;
    }

    public List<Eslestir> GirisIsci(Isci i) {
        List<Eslestir> iscilist = new ArrayList<>();
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs;
            rs = st.executeQuery("select * from gida where isciKullaniciAdi='" + i.getKullaniciAdi() + "'");
            while (rs.next()) {
                iscilist.add(new Eslestir(rs.getString("firmaAdi"), rs.getString("firmaSektor"), rs.getLong("firmaNo"), rs.getLong("isciSayisi"), rs.getString("cinsiyet"), rs.getString("isciAdi"), rs.getString("isciSoyadi"), rs.getLong("isciTelNo"), rs.getString("isciKullaniciAdi"), rs.getLong("isciSifre")));
            }

            rs = st.executeQuery("select * from giyim where isciKullaniciAdi='" + i.getKullaniciAdi() + "'");
            while (rs.next()) {
                iscilist.add(new Eslestir(rs.getString("firmaAdi"), rs.getString("firmaSektor"), rs.getLong("firmaNo"), rs.getLong("isciSayisi"), rs.getString("cinsiyet"), rs.getString("isciAdi"), rs.getString("isciSoyadi"), rs.getLong("isciTelNo"), rs.getString("isciKullaniciAdi"), rs.getLong("isciSifre")));
            }

            rs = st.executeQuery("select * from hizmet where isciKullaniciAdi='" + i.getKullaniciAdi() + "'");
            while (rs.next()) {
                iscilist.add(new Eslestir(rs.getString("firmaAdi"), rs.getString("firmaSektor"), rs.getLong("firmaNo"), rs.getLong("isciSayisi"), rs.getString("cinsiyet"), rs.getString("isciAdi"), rs.getString("isciSoyadi"), rs.getLong("isciTelNo"), rs.getString("isciKullaniciAdi"), rs.getLong("isciSifre")));
            }

            rs = st.executeQuery("select * from insaat where isciKullaniciAdi='" + i.getKullaniciAdi() + "'");
            while (rs.next()) {
                iscilist.add(new Eslestir(rs.getString("firmaAdi"), rs.getString("firmaSektor"), rs.getLong("firmaNo"), rs.getLong("isciSayisi"), rs.getString("cinsiyet"), rs.getString("isciAdi"), rs.getString("isciSoyadi"), rs.getLong("isciTelNo"), rs.getString("isciKullaniciAdi"), rs.getLong("isciSifre")));
            }

            rs = st.executeQuery("select * from saglik where isciKullaniciAdi='" + i.getKullaniciAdi() + "'");
            while (rs.next()) {
                iscilist.add(new Eslestir(rs.getString("firmaAdi"), rs.getString("firmaSektor"), rs.getLong("firmaNo"), rs.getLong("isciSayisi"), rs.getString("cinsiyet"), rs.getString("isciAdi"), rs.getString("isciSoyadi"), rs.getLong("isciTelNo"), rs.getString("isciKullaniciAdi"), rs.getLong("isciSifre")));
            }

            rs = st.executeQuery("select * from turizm where isciKullaniciAdi='" + i.getKullaniciAdi() + "'");
            while (rs.next()) {
                iscilist.add(new Eslestir(rs.getString("firmaAdi"), rs.getString("firmaSektor"), rs.getLong("firmaNo"), rs.getLong("isciSayisi"), rs.getString("cinsiyet"), rs.getString("isciAdi"), rs.getString("isciSoyadi"), rs.getLong("isciTelNo"), rs.getString("isciKullaniciAdi"), rs.getLong("isciSifre")));
            }
        } catch (Exception e) {
        }
        return iscilist;
    }

    public void Eslestir(Isci i, Firma f) {
        try {
            Statement st = this.getDb().getConnection().createStatement();
            switch (f.getSektor()) {
                case "Gıda":
                case "gıda":
                    st.executeUpdate("insert into gida values('" + f.getSirketAdi() + "','" + f.getSektor() + "','" + f.getTelNo() + "','" + f.getElemanSayisi() + "','" + f.getCinsiyet() + "','" + i.getAd() + "','" + i.getSoyad() + "','" + i.getTelNo() + "','" + i.getKullaniciAdi() + "','" + i.getSifre() + "')");
                    st.executeUpdate("update isciler set firmaAdi='"+ f.getSirketAdi() +"' where kullaniciAdi='"+i.getKullaniciAdi()+"'");
                    break;
                case "Giyim":
                case "giyim":
                    st.executeUpdate("insert into giyim values('" + f.getSirketAdi() + "','" + f.getSektor() + "','" + f.getTelNo() + "','" + f.getElemanSayisi() + "','" + f.getCinsiyet() + "','" + i.getAd() + "','" + i.getSoyad() + "','" + i.getTelNo() + "','" + i.getKullaniciAdi() + "','" + i.getSifre() + "')");
                    st.executeUpdate("update isciler set firmaAdi='"+ f.getSirketAdi() +"' where kullaniciAdi='"+i.getKullaniciAdi()+"'");

                    break;
                case "İnşaat":
                case "inşaat":
                    st.executeUpdate("insert into insaat values('" + f.getSirketAdi() + "','" + f.getSektor() + "','" + f.getTelNo() + "','" + f.getElemanSayisi() + "','" + f.getCinsiyet() + "','" + i.getAd() + "','" + i.getSoyad() + "','" + i.getTelNo() + "','" + i.getKullaniciAdi() + "','" + i.getSifre() + "')");
                    st.executeUpdate("update isciler set firmaAdi='"+ f.getSirketAdi() +"' where kullaniciAdi='"+i.getKullaniciAdi()+"'");

                    break;
                case "Hizmet":
                case "hizmet":
                    st.executeUpdate("insert into hizmet values('" + f.getSirketAdi() + "','" + f.getSektor() + "','" + f.getTelNo() + "','" + f.getElemanSayisi() + "','" + f.getCinsiyet() + "','" + i.getAd() + "','" + i.getSoyad() + "','" + i.getTelNo() + "','" + i.getKullaniciAdi() + "','" + i.getSifre() + "')");
                    st.executeUpdate("update isciler set firmaAdi='"+ f.getSirketAdi() +"' where kullaniciAdi='"+i.getKullaniciAdi()+"'");

                    break;
                case "Sağlık":
                case "sağlık":
                    st.executeUpdate("insert into saglik values('" + f.getSirketAdi() + "','" + f.getSektor() + "','" + f.getTelNo() + "','" + f.getElemanSayisi() + "','" + f.getCinsiyet() + "','" + i.getAd() + "','" + i.getSoyad() + "','" + i.getTelNo() + "','" + i.getKullaniciAdi() + "','" + i.getSifre() + "')");
                    st.executeUpdate("update isciler set firmaAdi='"+ f.getSirketAdi() +"' where kullaniciAdi='"+i.getKullaniciAdi()+"'");

                    break;
                case "Turizm":
                case "turizm":
                    st.executeUpdate("insert into turizm values('" + f.getSirketAdi() + "','" + f.getSektor() + "','" + f.getTelNo() + "','" + f.getElemanSayisi() + "','" + f.getCinsiyet() + "','" + i.getAd() + "','" + i.getSoyad() + "','" + i.getTelNo() + "','" + i.getKullaniciAdi() + "','" + i.getSifre() + "')");
                    st.executeUpdate("update isciler set firmaAdi='"+ f.getSirketAdi() +"' where kullaniciAdi='"+i.getKullaniciAdi()+"'");

                    break;
                default:
                    break;
            }
            //st.executeUpdate("insert into gida values('"+f.getSirketAdi()+"','"+f.getSektor()+"','"+f.getElemanSayisi()+"','"+f.getCinsiyet()+"','"+i.getAd()+"','"+i.getSoyad()+"')");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

   
    public List<Eslestir> FirmaSecilen(Firma f) {
        List<Eslestir> iscilist = new ArrayList<>();
        Eslestir l;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs;
            switch (f.getSektor()) {
                case "Gıda":
                case "gıda":
                    rs = st.executeQuery("select * from gida where firmaAdi='" + f.getSirketAdi() + "'");
                    break;
                case "Giyim":
                case "giyim":
                    rs = st.executeQuery("select * from giyim where firmaAdi='" + f.getSirketAdi() + "'");
                    break;
                case "İnşaat":
                case "inşaat":
                    rs = st.executeQuery("select * from insaat where firmaAdi='" + f.getSirketAdi() + "'");
                    break;
                case "Hizmet":
                case "hizmet":
                    rs = st.executeQuery("select * from hizmet where firmaAdi='" + f.getSirketAdi() + "'");
                    break;
                case "Sağlık":
                case "sağlık":
                    rs = st.executeQuery("select * from saglik where firmaAdi='" + f.getSirketAdi() + "'");
                    break;
                case "Turizm":
                case "turizm":
                    rs = st.executeQuery("select * from turizm where firmaAdi='" + f.getSirketAdi() + "'");
                    break;
                default:
                    rs = st.executeQuery("select * from giyim where firmaAdi='Lolo'");
                    break;
            }

            while (rs.next()) {
                l = new Eslestir(rs.getString("firmaAdi"), rs.getString("firmaSektor"), rs.getLong("firmaNo"), rs.getLong("isciSayisi"), rs.getString("cinsiyet"), rs.getString("isciAdi"), rs.getString("isciSoyadi"), rs.getLong("isciTelNo"), rs.getString("isciKullaniciAdi"), rs.getLong("isciSifre"));

                iscilist.add(l);
            }
        } catch (Exception e) {
        }
        return iscilist;
    }

    public List<Isci> IsciRead() {
        List<Isci> iscilist = new ArrayList<>();
        Isci i;
        try {
            Statement st = this.getDb().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from isciler where firmaAdi='Firma Yok' or firmaAdi='firma yok'");

            while (rs.next()) {
                i = new Isci(rs.getString("kullaniciAdi"), rs.getLong("sifre"), rs.getString("ad"), rs.getString("soyad"), rs.getString("cinsiyet"), rs.getLong("telNo"), rs.getString("sektor"), rs.getString("firmaAdi"), rs.getLong("firmaNo"));

                iscilist.add(i);
            }
        } catch (Exception e) {
        }
        return iscilist;
    }

    public DBConnection getDb() {
        if (this.db == null) {
            this.db = new DBConnection();
        }
        return db;
    }

    public void setDb(DBConnection db) {
        this.db = db;
    }

}
