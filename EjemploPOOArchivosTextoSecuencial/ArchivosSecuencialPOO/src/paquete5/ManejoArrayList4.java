/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Empresa;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("Lego","Madrid");     
        Empresa e2 = new Empresa("Vans","Miami");     
        Empresa e3 = new Empresa("Coffe and Sweet","Gye");     
        Empresa e4 = new Empresa("Shein","Barcelona");                
          
        // ArrayList
        ArrayList <Empresa> empresa = new ArrayList<>();
        empresa.add(e1);
        empresa.add(e2);
        empresa.add(e3);
        empresa.add(e4);
                               
        for (int i = 0; i < empresa.size(); i++) {
            System.out.printf("%s - %s\n",
                    empresa.get(i).obtenerNombre(),
                    empresa.get(i).obtenerCiudad());
        }
        
        System.out.println("-----------------------------------------");
    }
}
