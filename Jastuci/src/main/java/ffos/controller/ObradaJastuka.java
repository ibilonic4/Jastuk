/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.Controller.Obrada;
import ffos.model.Jastuk;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivor
 */
public class ObradaJastuka extends Obrada<Jastuk>{

    
    public void setData(String datum, String vrsta, String velicina, String boja ){
    if(getEntitet()==null){
    Jastuk j = new Jastuk();
    SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
    try{
   j.setVrsta(vrsta);
   j.setVelicina(velicina);
   j.setBoja(boja);
   j.setDatum((Date)df.parse(datum));
    
    }catch(ParseException ex){}
        setEntitet(j);
    }else {
     SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
     try{
   getEntitet().setVrsta(vrsta);
    getEntitet().setVelicina(velicina);
    getEntitet().setBoja(boja);
    getEntitet().setDatum((Date)df.parse(datum));
    
    }catch(ParseException ex){}
    }
       
   
    }
    
    
    
     public List<Jastuk> read(){
    return session.createQuery("from Jastuk").list();
    }
    
    
    
    
    
    
    @Override
    public void kontrolaCreate() throws Exception {
    }

    @Override
    public void kontrolaUpdate() throws Exception {
    }

    @Override
    public void kontrolaDelete() throws Exception {
    }
    
}
