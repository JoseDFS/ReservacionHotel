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

    private boolean premium;
    private boolean basico;
    
    private String Nombre;
    private String Descripcion;
    private int Precio;
    
    public Paquete(String nombre, String descripcion, int precio) {
        this.Nombre = nombre;
        this.Precio = precio;
        this.Descripcion = descripcion;
    }

    Paquete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getCantidad() {
        return Precio;
    }

    public void setCantidad(int cantidad) {
        this.Precio = cantidad;
    }

    public boolean isPremium() {
        return premium;
    }

    public boolean isBasico() {
        return basico;
    }
    

    private int costoPremium = 150;
    private int costoBasico = 10;

    public int getCostoPremium() {
        return costoPremium;
    }

    public void setCostoPremium(int costoPremium) {
        this.costoPremium = costoPremium;
    }

    public int getCostoBasico() {
        return costoBasico;
    }

    public void setCostoBasico(int costoBasico) {
        this.costoBasico = costoBasico;
    }

    void setPrecio(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDescripcion(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
