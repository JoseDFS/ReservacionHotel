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
    private int Precio;
    
    public Paquete(String nombre, int precio) {
        this.Nombre = nombre;
        this.Precio = precio;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
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

}
