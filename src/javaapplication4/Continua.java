/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Estudiante
 */
public class Continua extends Sede{
    private String cursoMasPopular;

    public Continua(String cursoMasPopular, String nombre, String direccion, int telefono, double area) {
        super(nombre, direccion, telefono, area);
        this.cursoMasPopular = cursoMasPopular;
    }
    
    @Override
    public String darInformacion() {
        String listInfo = "";
        listInfo += "Sede tipo: " + this.getClass().getSimpleName() + "\r\n";
        listInfo += "Nombre: " + this.nombre + "\r\n";
        listInfo += "Direccion: " + this.direccion + "\r\n";
        listInfo += "Telefono: " + this.telefono + "\r\n";
        listInfo += "Area: " + this.area + "\r\n";
        listInfo += "Programa mas popular: " + cursoMasPopular + "\r\n";
        listInfo += "Programas: " + this.getProgramas();
        return listInfo;
//Si se quisiera mostrar el curso con mas estudiantes como el mas popular:
//        ProgramaFormacion progPopular = this.programas.get(0);
//        for (ProgramaFormacion p : this.programas){
//            if (p.getEstudiantes().size() > progPopular.getEstudiantes().size()){
//                progPopular = p;
//            }
//        }
//        listInfo += "Programa mas popular: " + progPopular.getNombre();
    }
    
}
