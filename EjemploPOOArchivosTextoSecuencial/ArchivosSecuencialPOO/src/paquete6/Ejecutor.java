/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // nombre del archivo
        String nombreArchivo = "hospitales.txt";

        Hospital h1 = new Hospital("Isidro Ayora", 100, 38.500);
        Hospital h2 = new Hospital("Hospital del Seguro", 220, 100.800);
        Hospital h3 = new Hospital("Clínica Santa Ana", 145, 58.300);
        Hospital h4 = new Hospital("Clínica Fernando Castiel", 165, 68.000);

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);

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
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        // System.out.println(lectura.toString());
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
