
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose Segura <com.segura.jd>
 */
public class Reservacion {

    private Cliente cliente;
    private Habitacion habitacion;
    private int numeroDias;
    private Paquete paquete;
    private float totalPago;
    Calendar fechaReserva = Calendar.getInstance();
    int diaOut;

    public Reservacion(Cliente cliente, Habitacion habitacion, Paquete paquete, int numeroDias) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.paquete = paquete;
        this.numeroDias = numeroDias;
        diaOut = fechaReserva.get(Calendar.DAY_OF_YEAR) + numeroDias;
        CostoTotal();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public void CostoTotal() {
        if (this.paquete != null) {
            this.totalPago = (this.habitacion.getCostoTotal() + this.paquete.getPrecio()) * numeroDias;
        } else {
            this.totalPago = (this.habitacion.getCostoTotal()) * numeroDias;
        }
    }

    public Cliente getClienteR() {
        this.cliente.toString();
        return this.cliente;
    }

    public String getCliente() {
        return this.cliente.toString();
    }

    public String getHabitacion() {

        return this.habitacion.toString();
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void getPaquete() {
        if (paquete == null) {
            System.out.println("No se contrato paquete para esta reservacion ");
        } else {
            this.paquete.toString();
        }
    }

    public float getTotalPago() {
        return totalPago;
    }

    public String toString() {
        return this.cliente.getNombre() + "         " + this.habitacion.getPiso() + this.habitacion.getNumero() + "         " + this.paquete.getNombre() + "        " + this.totalPago + "\n";
    }

}
