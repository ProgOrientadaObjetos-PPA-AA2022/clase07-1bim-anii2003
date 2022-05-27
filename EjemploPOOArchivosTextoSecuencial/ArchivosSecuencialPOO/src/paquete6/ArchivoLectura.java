/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArchivoLectura {

    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Hospital> lista;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s", nombreArchivo);
        // data/hospitales.txt
        File f = new File(rutaArchivo); // data/hospitales.txt
        if (f.exists()) {
            try {
                entrada = new Scanner(new File(rutaArchivo));
                // entrada = new Scanner(System.in);
                // entrada = new Scanner(f);
            } // fin de try
            catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);

            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    // establecer valores de cada línea
    // en la lista de tipo Profesor
    public void establecerLista() {
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                // la línea en el archivo tiene la siguiente
                // estructura
                // "%s;%d;%.2f\n"
                // ["Isidro Ayora", "100", "38.500"]
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split(";")));
                // ["Isidro Ayora", "100", "38.500"]
                //       0            1       2
                // El primer parámetro se lo asocia con el nombre del Hospital
                String nombreH = linea_partes.get(0);
                // El segundo parámetro se lo asocia con el número de camas
                int numCamas = Integer.valueOf(linea_partes.get(1));
                // El tercer parámetro se asocia con el presupuesto del hospital
                double presupuesto = Double.parseDouble(linea_partes.
                        get(2).replace(",", "."));
                                
                Hospital h = new Hospital(nombreH,numCamas,presupuesto);
                lista.add(h);

            } // fin de while
        }
    }
    
    public ArrayList<Hospital> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString() {
        String cadena = "Lista Hospitales\n";
        for (int i = 0; i < obtenerLista().size(); i++) {
            Hospital hospTemporal = obtenerLista().get(i); // Obj. Hospital
            cadena = String.format("%s(%d) %s %d %.2f\n", cadena,
                    i + 1,
                    hospTemporal.obtenerNombre(), // obtenerLista().get(i).obtenerNombre(),
                    hospTemporal.obtenerNumeroCamas(), // obtenerLista().get(i).obtenerNumeroCamas),
                    hospTemporal.obtenerPresupuesto());    // obtenerLista().get(i).obtenerPresupuesto());
        }
        return cadena;
    }
}
