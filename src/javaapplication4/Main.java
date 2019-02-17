/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /*


    */
    public static void main(String[] args) throws FileNotFoundException {
        
        Universidad un = new Universidad();
        
        Profesional sedeBog = new Profesional(1, "ciudad", "direccion", 3165000, 100000);
        sedeBog.addPrograma("Nombre del programa", "la descripcion del programa", null);
        
        un.regSede(sedeBog);
        
        File savefile = new File("savefile.txt");
        
        PrintStream out = new PrintStream(savefile);
        
        System.out.println(un.getAllInfo());
        
        out.println(un.getAllInfo());
        
        
    }
    
}
