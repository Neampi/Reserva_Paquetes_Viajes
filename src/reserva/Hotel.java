/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;

/**
 *
 * @author Adrian Lozano
 */
public class Hotel {
    private String nombreHotel ;
    private int valoracion;
    private int ubicacion;
    private float precio;
    private int idHotel;
    // despues

    public Hotel(int ubicacion, String nombreHotel,int valoracion,float precio) {
        this.ubicacion = ubicacion;
        this.nombreHotel = nombreHotel;
        this.valoracion=valoracion;
        //this.setPrecio(precio);
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }
    
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }
    
    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombreHotel=" + nombreHotel + ", valoracion=" + valoracion + ", ubicacion=" + ubicacion + ", precio=" + precio + ", idHotel=" + idHotel + '}';
    }
    
    
}
