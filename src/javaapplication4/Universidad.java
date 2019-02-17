/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Universidad {
    private ArrayList<Sede> sedes;

    public Universidad() {
        this.sedes = new ArrayList<>();
    }
    
    
    public String getAllInfo () {
        String allInfo = "";
        for (Sede s : sedes){
            allInfo += s.darInformacion();
        }
        return allInfo;
    }
    
    public boolean regSede (Sede s) {
        return sedes.add(s);
    }
    
    public boolean eliminarSede (String sname){
        for (Sede s : sedes){
            if (s.nombre == sname){
                return sedes.remove(s);
            }
        }
        return false;
    }
    
    public boolean modifSede (String sname, Sede news){
        for (Sede s : sedes){
            if (s.nombre == sname){
                return sedes.set(sedes.indexOf(s), news) != null;
            }    
        }
        return false;
    }
    
    public Sede getSede (String sname) {
        for (Sede s : sedes){
            if (s.nombre == sname){
                return s;
            }
        }
        return null;
    }
    
    public void consultarSede (String sname) {
        for (Sede s : sedes){
            if (s.nombre == sname){
                System.out.println(s.darInformacion());
            }
        }
    }

}
