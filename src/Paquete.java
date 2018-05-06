/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Segura <com.segura.jd>
 */
class Paquete {
    
    private String Nombre;
    private String Descripcion;
    private float Precio;
    
    public Paquete(String nombre, String descripcion, int precio) {
        this.Nombre = nombre;
        this.Precio = precio;
        this.Descripcion = descripcion;
    }

    Paquete() {
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    
    public String getDescripcion(){
        return Descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.Descripcion = descripcion;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        this.Precio = precio;
    }

    
    @Override
    public String toString() {
        return   Nombre  + "    " + Precio + "    "  + Descripcion;
    }
}
