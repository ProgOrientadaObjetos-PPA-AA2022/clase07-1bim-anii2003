/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        Calificacion c1 = new Calificacion(10,"Computación");;
        Calificacion c2 = new Calificacion(9,"Matemática");
        Calificacion c3 = new Calificacion(8,"Álgebra");     
        
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Profesor prof3 = new Profesor("René Elizalde", "nombramiento");
        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        c3.establecerProfesor(prof3);
                
        // ArrayList
        ArrayList <Calificacion> calificacion2 = new ArrayList<>();
        calificacion2.add(c1);
        calificacion2.add(c2);
        calificacion2.add(c3);
                        
        System.out.println("-----------------------------------------");
        
        for (int i = 0; i < calificacion2.size(); i++) {
            System.out.printf("%s - %s - %.2f\n",
                    calificacion2.get(i).obtenerProfesor().obtenerNombre(),
                    calificacion2.get(i).obtenerNombreMateria(),
                    calificacion2.get(i).obtenerNota());
        }
    }
}
