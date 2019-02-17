/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public abstract class Sede {
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected double area;
    protected ArrayList<ProgramaFormacion> programas;

    public Sede(String nombre, String direccion, int telefono, double area) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.area = area;
        this.programas = new ArrayList<>();
    }
    
    public boolean addPrograma (String progName, String desc, ArrayList<Estudiante> estd) {
        return programas.add(new ProgramaFormacion(progName, desc, estd));
    }
    
    public boolean deletePrograma (String progName) {
        for (ProgramaFormacion p : programas){
            if (p.getNombre() == progName){
                return programas.remove(p);
            }
        }
        return false;
    }
    
    public String getProgramas () {
        String listProg = "";
        for (ProgramaFormacion p : programas){
            listProg += "Nombre: " + p.getNombre() + "\r\n";
            listProg += "Descripcion: " + p.getDescripcion() + "\r\n";
        }
        return listProg;
    }
    
    public abstract String darInformacion ();
}
