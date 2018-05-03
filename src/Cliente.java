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

    private String nombre;
    private int dui;
    private String tarjetaCredito;
    private String telefono;
    private String correo;

    public Cliente() {

    }

    public Cliente(String nombre, String tarjetaCredito, String telefono, String correo, int dui) {
        this.nombre = nombre;
        this.tarjetaCredito = tarjetaCredito;
        this.telefono = telefono;
        this.correo = correo;
        this.dui = dui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDui() {
        return dui;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dui=" + dui + ", tarjetaCredito=" + tarjetaCredito + ", telefono=" + telefono + ", correo=" + correo + '}';
    }

}
