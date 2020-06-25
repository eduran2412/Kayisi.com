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
public class Firma {
    private String kullaniciAdi;
    private Long sifre;
    private String sirketAdi;
    private Long telNo;
    private String sektor;
    private Long elemanSayisi;
    private String cinsiyet;

    public Firma() {
    }

    public Firma(String kullaniciAdi, Long sifre, String sirketAdi, Long telNo, String sektor, Long elemanSayisi, String cinsiyet) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.sirketAdi = sirketAdi;
        this.telNo = telNo;
        this.sektor = sektor;
        this.elemanSayisi = elemanSayisi;
        this.cinsiyet = cinsiyet;
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

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    public String getSektor() {
        return sektor;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;
    }

    public Long getElemanSayisi() {
        return elemanSayisi;
    }

    public void setElemanSayisi(Long elemanSayisi) {
        this.elemanSayisi = elemanSayisi;
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
    
    
    
    
    
}
