/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author aplo612
 */
public class ModeloVuelo {
    public ArrayList<Vuelo> obtenerLineaAerea(){
        Gson gson = new Gson();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String contenido = "";
        try{
            File archivo = new File("Vuelos.json");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;

            while((linea = br.readLine())!=null){
                contenido +=linea;
            }
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        Type tipoLineaAerea = new TypeToken<List<Vuelo>>(){}.getType();
        ArrayList<Vuelo> vuelos = gson.fromJson(contenido, tipoLineaAerea);

        for(int i=0;i<vuelos.size();i++){
            try {
                String hora = vuelos.get(i).getHora();
                Date horario = sdf.parse(hora); 
                vuelos.get(i).setHorario(horario);
                vuelos.get(i).setIdVuelo(i);
            } catch (ParseException ex) {
                Logger.getLogger(ModeloVuelo.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        return vuelos;
    }
    public void sobreescribirLineaAerea(ArrayList<Vuelo> listaLineaAerea) {
        
        Gson gson = new Gson();
        
        //Persona persona = new Persona("Esther","García Ocampo",35);
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String representacionBonita = prettyGson.toJson(listaLineaAerea);
        //String contenido = gson.toJson(listaLineaAerea);
        try{
            PrintWriter writer = new PrintWriter("Vuelos.json");
            writer.print(representacionBonita);
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }  
    }
}
