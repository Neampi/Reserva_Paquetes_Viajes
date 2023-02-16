/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Adrian Lozano
 */
public class Vuelo {
    private String nombreAerolinea;
    private int origen;
    private int destino;
    private Date horario; //formato 24 horas
    private String hora;
    private float precio;
    private ArrayList<Asientos> asientos;
    private int idVuelo;

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public ArrayList<Asientos> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asientos> asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "nombreAerolinea=" + nombreAerolinea + ", origen=" + origen + ", destino=" + destino + ", hora=" + hora + ", precio=" + precio + ", asientos=" + asientos + '}';
    }
}
