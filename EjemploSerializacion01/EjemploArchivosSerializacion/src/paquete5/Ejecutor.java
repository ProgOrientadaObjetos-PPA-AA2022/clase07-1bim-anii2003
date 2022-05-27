/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

public class Ejecutor {

    public static void main(String[] args) {

        String nombreArchivo = "data/hospitales.data";

        Hospital h1 = new Hospital("Isidro Ayora", 100, 38.500,"11111");
        Hospital h2 = new Hospital("Hospital del Seguro", 220, 100.800,"11112");
        Hospital h3 = new Hospital("Clínica Santa Ana", 145, 58.300,"11113");
        Hospital h4 = new Hospital("Clínica Fernando Castiel", 165, 68.000,"11114");
        
        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        // establecer el valor del atributo registro
        archivo.establecerRegistro(h1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();

        // establecer el valor del atributo registro
        archivo.establecerRegistro(h2);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();

        // establecer el valor del atributo registro
        archivo.establecerRegistro(h3);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();

        // establecer el valor del atributo registro
        archivo.establecerRegistro(h4);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();

        // proceso para lectura del archivo
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospitales();
        
        // System.out.println(lectura.toString());
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
