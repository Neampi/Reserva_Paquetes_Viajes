/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author aplo612
 */
public class ModeloPaises {
    public static ArrayList<Paises> obtenerPais() {
        ArrayList<Paises> paises = new ArrayList<>();

        try {
            File archivo = new File("Paises.csv");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] paisesComoArreglo = linea.split(";");
                paises.add(new Paises(Integer.parseInt(paisesComoArreglo[0]),paisesComoArreglo[1]));
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        }
            return paises;      
    }
}
