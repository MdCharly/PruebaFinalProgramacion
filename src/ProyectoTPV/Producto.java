package ProyectoTPV;

import java.awt.*;

public class Producto {

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getFuente() {
        return fuente;
    }

    private String nombre;
    private int precio;
    private String fuente;

    public Producto (String nombre,int precio,String fuente){

        this.nombre = nombre;
        this.precio = precio;
        this.fuente = fuente;

    }

    public String getnombre () { return nombre;}
    public int getprecio () {return precio; }
    public String getfuente () { return fuente;}

}
