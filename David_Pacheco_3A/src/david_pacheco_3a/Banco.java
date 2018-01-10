/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david_pacheco_3a;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAVID
 */
public class Banco {

    static ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
    private Cuenta cuentaAgregar;

    public static void agregar(Cuenta f) {
        cuentas.add(f);
    }

    public static void grabarC() {
        PrintWriter pw = null;
        try {
            FileWriter fw = new FileWriter("texto.txt", true);
            pw = new PrintWriter(fw);
        } catch (IOException ex) {
            System.out.println("Error al abrir archivos " + ex);
        }
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaAhorro) {
                CuentaAhorro ca = (CuentaAhorro) cuenta;
                String linea = "Cuenta Ahorro" + ";" + ca.getNombre()
                        + ";" + 55;
                pw.println(linea);
            }
            if (cuenta instanceof CuentaPrestamo) {
                CuentaPrestamo cp = (CuentaPrestamo) cuenta;
                String linea = "Cuenta Prestamo" + ";" + cp.getNombre();
                   
                pw.println(linea);
            }
            
             if (cuenta instanceof CuentaHipoteca) {
                CuentaHipoteca chp = (CuentaHipoteca) cuenta;
                String linea = "Cuenta Hipoteca" + ";" + chp.getNombre();
                   
                pw.println(linea);
             }     
        }
        pw.close();
    }
    
    public static void muestraContenido(String archivo) throws IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }

}
