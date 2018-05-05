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

    private boolean habilitada;
    private String tipo;
    
    public void Habitacion(){
        if("E".equals(piso) || "F".equals(piso)){
            this.costoTotal = (float) (this.costoNormal + (this.costoNormal*0.1));
        }
        else{
            this.costoTotal = this.costoNormal;
        }
    }

    public boolean isHabilitada() {
        return habilitada;
    }
    
    public void setHabilitada(boolean f){
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

   

    public float getCostoNormal() {
        return costoNormal;
    }

   
    
    
    public void setCostoTotal(float costoTotal) {
        this.costoTotal=costoTotal;
    }
    
    public float getCostoTotal() {
        return costoTotal;
    }

    int getNumero() {
       return this.numero;
    }

    String getPiso() {
        return this.piso;
    }

   @Override
    public String toString() {
        String estado;
        if(this.habilitada){
            estado = "Habilitada";
        }
        else{
            estado = "Deshabilitada";
        }
        
        return  piso + numero + "  " + estado;
    }


}
