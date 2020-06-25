/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


/**
 *
 * @author Furkan
 */
public class Isci {
    private String kullaniciAdi;
    private Long sifre;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private Long telNo;
    private String sektor;
    private String firmaAdi;
    private Long firmaNo;

    public Isci() {
    }

    public Isci(String kullaniciAdi, Long sifre, String ad, String soyad, String cinsiyet, Long telNo, String sektor, String firmaAdi, Long firmaNo) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.telNo = telNo;
        this.sektor = sektor;
        this.firmaAdi = firmaAdi;
        this.firmaNo = firmaNo;
    }

    


    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public Long getSifre() {
        return sifre;
    }

    public void setSifre(Long sifre) {
        this.sifre = sifre;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Long getTelNo() {
        return telNo;
    }

    public void setTelNo(Long telNo) {
        this.telNo = telNo;
    }



    public String getSektor() {
        return sektor;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public Long getFirmaNo() {
        return firmaNo;
    }

    public void setFirmaNo(Long firmaNo) {
        this.firmaNo = firmaNo;
    }
    
    

    
    
    
    
}
