/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.IsciDAO;
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
public class IsciBean implements Serializable {
    private IsciDAO idao;
    private Isci entity;
    
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
        this.pageCount=(int)Math.ceil(this.getIdao().count()/(double)pageSize);
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    
     public String Kaydet() {
        this.getIdao().Kaydet(entity);
        this.entity= new Isci();
        return "/index";
    }
    public String GuncelleForm(Isci i) {
        this.entity = i;
        return "/admin/adminIsci";
    }

    public String Guncelle() {
        this.getIdao().Guncelle(entity);
        this.entity= new Isci();
        return "/admin/adminIsci";

    }
    
    public String Sil(Isci i){
        this.getIdao().Sil(i);
        return "/admin/adminIsci";
        
    }
     
     public List<Isci> getRead() {
        return this.getIdao().Listele(page,pageSize);

    }
     public List<Isci> getReadGida() {
        return this.getIdao().ListeleGida(page,pageSize);

    }
     
     public List<Isci> getReadGiyim() {
        return this.getIdao().ListeleGiyim(page,pageSize);

    }
     
     public List<Isci> getReadHizmet() {
        return this.getIdao().ListeleHizmet(page,pageSize);

    }
     
     public List<Isci> getReadInsaat() {
        return this.getIdao().ListeleInsaat(page,pageSize);

    }
     
     public List<Isci> getReadSaglik() {
        return this.getIdao().ListeleSaglik(page,pageSize);

    }
     
     public List<Isci> getReadTurizm() {
        return this.getIdao().ListeleTurizm(page,pageSize);

    }

    public IsciDAO getIdao() {
        if (this.idao==null) {
            this.idao=new IsciDAO();
        }
        return idao;
    }

    public void setIdao(IsciDAO idao) {
        this.idao = idao;
    }

    public Isci getEntity() {
        if (this.entity==null) {
            this.entity= new Isci();
            
        }
        return entity;
    }

    public void setEntity(Isci entity) {
        this.entity = entity;
    }
     
     
     
    
}
