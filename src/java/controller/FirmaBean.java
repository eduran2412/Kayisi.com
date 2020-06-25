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
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Furkan
 */
@Named
@SessionScoped
public class FirmaBean implements Serializable {

    private FirmaDAO fdao;
    private GirisDAO gdao;
    private Firma entity;
    Firma veri;
    
    private int page=1;
    private int pageSize=3;
    private int pageCount;

    public void next(){
        if(this.page ==this.getPageCount())
            this.page=1;
        else
        page++;
        
    }
    public void previous(){
        if(this.page ==1)
            this.page=this.getPageCount();
        else
        page--;
        
    }
    
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
         this.pageCount=(int)Math.ceil(this.getFdao().count()/(double)pageSize);
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    
    

    public String Kaydet() {
        this.getFdao().Kaydet(entity);
        this.entity = new Firma();
        return "/index";
    }
    
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
        return "/admin/adminFirma";

    }
    

    

    public List<Firma> getRead() {
        return this.getFdao().Listele(page,pageSize);

    }
    
    public List<Firma> getReadGida() {
        return this.getFdao().ListeleGida(page,pageSize);

    }

    public List<Firma> getReadGiyim() {
        return this.getFdao().ListeleGiyim(page,pageSize);

    }

    public List<Firma> getReadHizmet() {
        return this.getFdao().ListeleHizmet(page,pageSize);

    }

    public List<Firma> getReadInsaat() {
        return this.getFdao().ListeleInsaat(page,pageSize);

    }

    public List<Firma> getReadSaglik() {
        return this.getFdao().ListeleSaglik(page,pageSize);

    }

    public List<Firma> getReadTurizm() {
        return this.getFdao().ListeleTurizm(page,pageSize);

    }

    public FirmaDAO getFdao() {
        if (this.fdao == null) {
            this.fdao = new FirmaDAO();
        }
        return fdao;
    }

    public void setFdao(FirmaDAO fdao) {
        this.fdao = fdao;
    }


    public GirisDAO getGdao() {
        return gdao;
    }

    public void setGdao(GirisDAO gdao) {
        this.gdao = gdao;
    }

    public Firma getEntity() {
        if (this.entity==null) {
            this.entity=new Firma();
            
        }
        return entity;
    }

    public void setEntity(Firma entity) {
        this.entity = entity;
    }

}
