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
public class Eslestir {
    private String firmaAdi;
    private String firmaSektor;
    private Long firmaNo;
    private Long isciSayisi;
    private String cinsiyet;
    private String isciAdi;
    private String isciSoyadi;
    private Long isciTelNo;
    private String kullaniciAdi;
    private Long sifre;

    public Eslestir() {
    }

    public Eslestir(String firmaAdi, String firmaSektor, Long firmaNo, Long isciSayisi, String cinsiyet, String isciAdi, String isciSoyadi, Long isciTelNo, String kullaniciAdi, Long sifre) {
        this.firmaAdi = firmaAdi;
        this.firmaSektor = firmaSektor;
        this.firmaNo = firmaNo;
        this.isciSayisi = isciSayisi;
        this.cinsiyet = cinsiyet;
        this.isciAdi = isciAdi;
        this.isciSoyadi = isciSoyadi;
        this.isciTelNo = isciTelNo;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    

    


    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getFirmaSektor() {
        return firmaSektor;
    }

    public void setFirmaSektor(String firmaSektor) {
        this.firmaSektor = firmaSektor;
    }

    public Long getFirmaNo() {
        return firmaNo;
    }

    public void setFirmaNo(Long firmaNo) {
        this.firmaNo = firmaNo;
    }
    

    public Long getIsciSayisi() {
        return isciSayisi;
    }

    public void setIsciSayisi(Long isciSayisi) {
        this.isciSayisi = isciSayisi;
    }


    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getIsciAdi() {
        return isciAdi;
    }

    public void setIsciAdi(String isciAdi) {
        this.isciAdi = isciAdi;
    }

    public String getIsciSoyadi() {
        return isciSoyadi;
    }

    public void setIsciSoyadi(String isciSoyadi) {
        this.isciSoyadi = isciSoyadi;
    }

    public Long getIsciTelNo() {
        return isciTelNo;
    }

    public void setIsciTelNo(Long isciTelNo) {
        this.isciTelNo = isciTelNo;
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
    
    
    
    
    
}
