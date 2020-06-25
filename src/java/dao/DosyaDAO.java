/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Dosya;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;


public class DosyaDAO extends DBConnection{
    
    private Connection connect;

    public Connection getConnect() {
        return connect;
    }

    public void setConnect(Connection connect) {
        this.connect = connect;
    }
    
    public List<Dosya> findAll(){
        List<Dosya> dlist= new ArrayList<>();
        try {
            PreparedStatement pst=this.getConnection().prepareStatement("select * from dosya");
            ResultSet rs=pst.executeQuery();
            while (rs.next()) {                
               Dosya d = new Dosya();
               d.setId(rs.getInt("id"));
               d.setFilePath(rs.getString("path"));
               d.setFileName(rs.getString("name"));
               d.setFileType(rs.getString("type"));
               dlist.add(d);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return dlist;
    }
    
    public void insert(Dosya d){
        String quer="insert into dosya (path,name,type) values(?,?,?)";
         try {
            PreparedStatement pst=this.getConnection().prepareStatement(quer);
            pst.setString(1, d.getFilePath());
            pst.setString(2, d.getFileName());
            pst.setString(3, d.getFileType());
            pst.executeUpdate();
           
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
       
    }
}
