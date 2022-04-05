/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.Controller.Obrada;
import ffos.model.Vlasnik;
import java.util.List;

/**
 *
 * @author Ivor
 */
public class ObradaVlasnika extends Obrada<Vlasnik> {

     public void SetData(String ime, String prezime){
    
    if(getEntitet()==null){
    Vlasnik v = new Vlasnik();
    v.setIme(ime);
    v.setPrezime(prezime);
        setEntitet(v);
    }else {
    getEntitet().setIme(ime);
    getEntitet().setPrezime(prezime);
    }
    
    
    }
    
    public List<Vlasnik> read(){
    return session.createQuery("from Vlasnik").list();
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
