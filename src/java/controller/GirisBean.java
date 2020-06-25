/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FirmaDAO;
import dao.GirisDAO;
import entity.Eslestir;
import entity.Firma;
import entity.Isci;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Furkan
 */
@Named
@SessionScoped
public class GirisBean implements Serializable {

    private GirisDAO gdao;
    private FirmaDAO fdao;
    private Firma entity;
    private Isci entity2;
    Firma veri;
    

    public List<Eslestir> GirisIsci() {
        return this.getGdao().GirisIsci(entity2);
    }

    public String GirisFirma() {
        veri = this.getGdao().GirisFirma(entity);
        if (veri != null) {
            if (veri.getKullaniciAdi().equals("Admin")) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", veri);
                return "/admin/admin";
            } else {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", veri);
                return "/firma/isciSec";

            }

        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Hatalı Kullanıcı Adı Veya Şifre"));
            return "/index";
        }

    }


    public List<Eslestir> getSecilen() {
        return this.gdao.FirmaSecilen(veri);

    }

    public void Eslestir(Isci i) {
        this.getGdao().Eslestir(i, veri);
    }

    public List<Isci> getIsciRead() {
        return this.getGdao().IsciRead();
    }

    public GirisDAO getGdao() {
        if (this.gdao == null) {
            this.gdao = new GirisDAO();
        }
        return gdao;
    }

    public void setGdao(GirisDAO gdao) {
        this.gdao = gdao;
    }

    public Firma getEntity() {

        if (this.entity == null) {
            this.entity = new Firma();

        }
        return entity;
    }

    public void setEntity(Firma entity) {
        this.entity = entity;
    }

    public Isci getEntity2() {
        if (this.entity2 == null) {
            this.entity2 = new Isci();

        }
        return entity2;
    }

    public void setEntity2(Isci entity2) {
        this.entity2 = entity2;
    }

    public FirmaDAO getFdao() {
        return fdao;
    }

    public void setFdao(FirmaDAO fdao) {
        this.fdao = fdao;
    }
    
    

}
