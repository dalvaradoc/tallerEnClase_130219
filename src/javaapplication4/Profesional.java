/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Profesional extends Sede{
    private int progsAltaCalidad;
    
    private ArrayList<ProgramaFormacion> progCont;
    private ArrayList<ProgramaFormacion> progTec;

    public Profesional(int progsAltaCalidad, String nombre, String direccion, int telefono, double area) {
        super(nombre, direccion, telefono, area);
        this.progsAltaCalidad = progsAltaCalidad;
        this.progCont = new ArrayList<>();
        this.progTec = new ArrayList<>();
    }
    
    public boolean addProgramaCont (String progName, String desc, ArrayList<Estudiante> estd) {
        return progCont.add(new ProgramaFormacion(progName, desc, estd));
    }
    
    public boolean deleteProgramaCont (String progName) {
        for (ProgramaFormacion p : progCont){
            if (p.getNombre() == progName){
                return progCont.remove(p);
            }
        }
        return false;
    }
    
    public boolean addProgramaTec (String progName, String desc, ArrayList<Estudiante> estd) {
        return progTec.add(new ProgramaFormacion(progName, desc, estd));
    }
    
    public boolean deleteProgramaTec (String progName) {
        for (ProgramaFormacion p : progTec){
            if (p.getNombre() == progName){
                return progTec.remove(p);
            }
        }
        return false;
    }
    
    public String getOtherInfo () {
        String otherInfo = "";
        if (progCont.isEmpty()){
            otherInfo += "No hay programas de educacion continuada.\r\n";
        } else {
            otherInfo += "Programas Educacion Continuada: \r\n";
            for (ProgramaFormacion p : progCont){
                otherInfo += "Nombre: " + p.getNombre() + "\r\n";
                otherInfo += "Descripcion: " + p.getDescripcion() + "\r\n";
            }
        }
        if (progTec.isEmpty()){
            otherInfo += "No hay programas de educacion tecnologica. \r\n";
        } else {
            otherInfo += "Programas Educacion Tecnologica: \r\n";
            for (ProgramaFormacion p : progTec){
                otherInfo += "Nombre: " + p.getNombre() + "\r\n";
                otherInfo += "Descripcion: " + p.getDescripcion() + "\r\n";
            }
        }
        return otherInfo;
    }

    @Override
    public String darInformacion() {
        String listInfo = "";
        listInfo += "Sede tipo: " + this.getClass().getSimpleName() + "\r\n";
        listInfo += "Nombre: " + this.nombre + "\r\n";
        listInfo += "Direccion: " + this.direccion + "\r\n";
        listInfo += "Telefono: " + this.telefono + "\r\n";
        listInfo += "Area: " + this.area + "\r\n";
        listInfo += "Programas de Alta Calidad: " + progsAltaCalidad + "\r\n";
        listInfo += "Programas:" + "\r\n" + this.getProgramas();
        listInfo += this.getOtherInfo();
        return listInfo;
    }
   
}
