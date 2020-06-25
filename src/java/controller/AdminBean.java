/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FirmaDAO;
import dao.GirisDAO;
import entity.Firma;
import entity.Isci;
import java.io.Serializable;
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
public class AdminBean implements Serializable {

    private FirmaDAO fdao;
    private GirisDAO gdao;
    private Firma entity;
    
    
    public String GuncelleForm(Firma f) {
        this.entity = f;
        return "/admin/adminFirma";
    }

    public String Guncelle() {
        this.getFdao().Guncelle(entity);
        this.entity = new Firma();
        return "/admin/adminFirma";

    }
    
    public String Sil(Firma f) {
        this.getFdao().Sil(f);
        return "/admin/adminIsci";

    }

    public GirisDAO getGdao() {
        return gdao;
    }

    public void setGdao(GirisDAO gdao) {
        this.gdao = gdao;
    }


    public FirmaDAO getFdao() {
        return fdao;
    }

    public void setFdao(FirmaDAO fdao) {
        this.fdao = fdao;
    }

    
}
