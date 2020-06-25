/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DosyaDAO;
import entity.Dosya;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

@Named
@SessionScoped
public class DosyaBean implements Serializable {

    private Dosya dosya;
    private List<Dosya> dosyaList;
    private DosyaDAO dosyaDao;
    private Part doc;

    private final String uploadTo = "C:\\Users\\Mehmet\\Desktop";

    public void upload() {
        String fileName = Paths.get(doc.getSubmittedFileName()).getFileName().toString();
        try (InputStream input = doc.getInputStream()) {
            File ff = new File(uploadTo, fileName);
            Files.copy(input, ff.toPath());

            dosya = this.getDosya();
            dosya.setFilePath(ff.getParent());
            dosya.setFileName(ff.getName());
            dosya.setFileType(doc.getContentType());

            this.getDosyaDao().insert(dosya);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getUploadTo() {
        return uploadTo;
    }

    public Dosya getDosya() {
        if (this.dosya == null) {
            this.dosya = new Dosya();
        }
        return dosya;
    }

    public void setDosya(Dosya dosya) {

        this.dosya = dosya;
    }

    public List<Dosya> getDosyaList() {
        this.dosyaList = this.getDosyaDao().findAll();
        return dosyaList;
    }

    public void setDosyaList(List<Dosya> dosyaList) {
        this.dosyaList = dosyaList;
    }

    public DosyaDAO getDosyaDao() {
        if (this.dosyaDao == null) {
            this.dosyaDao = new DosyaDAO();
        }

        return dosyaDao;
    }

    public void setDosyaDao(DosyaDAO dosyaDao) {
        this.dosyaDao = dosyaDao;
    }

    public Part getDoc() {
        return doc;
    }

    public void setDoc(Part doc) {
        this.doc = doc;
    }

}
