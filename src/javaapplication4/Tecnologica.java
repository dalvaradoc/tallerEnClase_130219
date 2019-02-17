/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Alejandro
 */
public class Tecnologica extends Sede{
    private int estudMatriculados;

    public Tecnologica(int estudMatriculados, String nombre, String direccion, int telefono, double area) {
        super(nombre, direccion, telefono, area);
        this.estudMatriculados = estudMatriculados;
    }

    @Override
    public String darInformacion() {
        String listInfo = "";
        listInfo += "Sede tipo: " + this.getClass().getSimpleName() + "\r\n";
        listInfo += "Nombre: " + this.nombre + "\r\n";
        listInfo += "Direccion: " + this.direccion + "\r\n";
        listInfo += "Telefono: " + this.telefono + "\r\n";
        listInfo += "Area: " + this.area + "\r\n";
        listInfo += "Numero de estudiantes Matriculados: " + estudMatriculados + "\r\n";
        listInfo += "Programas: " + "\r\n" + this.getProgramas();
        return listInfo;
    }

    

    
}
