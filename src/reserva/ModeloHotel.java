/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aplo612
 */
public class ModeloHotel {
    public ArrayList<Hotel> obtenerHotel() {
        Gson gson = new Gson();
        
        String contenido = "";
        try{
            File archivo = new File("Hoteles.json");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;

            while((linea = br.readLine())!=null){
                contenido +=linea;
            }
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        Type tipoHoteles = new TypeToken<List<Hotel>>(){}.getType();
        ArrayList<Hotel> hoteles = gson.fromJson(contenido, tipoHoteles);
        
        for(int i=0;i<hoteles.size();i++){
            hoteles.get(i).setIdHotel(i);
        }
        return hoteles;      
    }
}
