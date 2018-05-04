/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Segura <com.segura.jd>
 */
class Cliente {
    
    private int numerodeCliente;
    private String nombre;
    private int dui;
    private int tarjetaCredito;
    private int telefono;
    private String correo;
    private int numeroReservaciones;
    

    public Cliente() {

    }

    public Cliente(int numerodeCliente, String nombre, int dui, int tarjetaCredito, int telefono, String correo, int numeroReservaciones) {
        this.numerodeCliente = numerodeCliente;
        this.nombre = nombre;
        this.dui = dui;
        this.tarjetaCredito = tarjetaCredito;
        this.telefono = telefono;
        this.correo = correo;
        this.numeroReservaciones = numeroReservaciones;
    }

    public int getNumerodeCliente() {
        return numerodeCliente;
    }

    public void setNumerodeCliente(int numerodeCliente) {
        this.numerodeCliente = numerodeCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDui() {
        return dui;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }

    public int getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(int tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroReservaciones() {
        return numeroReservaciones;
    }

    public void setNumeroReservaciones(int numeroReservaciones) {
        this.numeroReservaciones = numeroReservaciones;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numerodeCliente=" + numerodeCliente + ", nombre=" + nombre + ", dui=" + dui + ", tarjetaCredito=" + tarjetaCredito + ", telefono=" + telefono + ", correo=" + correo + ", numeroReservaciones=" + numeroReservaciones + '}';
    }

    
    

    

}
