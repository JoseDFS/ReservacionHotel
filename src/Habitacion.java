/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Segura <com.segura.jd>
 */
class Habitacion {

    private float costoTotal;
    private String piso;
    private int numero;
    private float costoNormal;
    private float costoExtra;
    private boolean habilitada;
    private String tipo;
    

    public boolean isHabilitada() {
        return habilitada;
    }
    
    public void setHablitada(boolean f){
        this.habilitada = f;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCostoNormal(float costoNormal) {
        this.costoNormal = costoNormal;
    }

    public void setCostoExtra(float costoExtra) {
        this.costoExtra = costoExtra;
    }

    public float getCostoNormal() {
        return costoNormal;
    }

    public float getCostoExtra() {
        return costoExtra;
    }
    
    
    
    public void setCostoTotal(float costoTotal) {
        this.costoTotal=costoTotal;
    }
    
    public float getCostoTotal() {
        return costoTotal;
    }

    int getNumero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getPiso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setHabilitada(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
