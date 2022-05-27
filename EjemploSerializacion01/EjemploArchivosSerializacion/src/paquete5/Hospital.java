/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;
    
    public Hospital(String n, int nC, double p, String m){
        nombre = n;
        numeroCamas = nC;
        presupuesto = p;
        idHospital = m;
    }
    
    public void establecerIdHospital(String m){
        idHospital = m;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumeroCamas(int nC){
        numeroCamas = nC;
    }
    
    public void establecerPresupuesto(double p){
        presupuesto = p;
    }
    
    public String obtenerIdHospital(){
        return idHospital;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
    @Override
    public String toString() {
        String cadena = "Hospital\n";
            cadena = String.format("%s - %d - %.2f - %s\n",
                    obtenerNombre(),
                    obtenerNumeroCamas(),
                    obtenerPresupuesto(),
                    obtenerIdHospital());
        return cadena;
        }
    }