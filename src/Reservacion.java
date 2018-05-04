
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
    private int totalPago;
    Calendar fechaReserva = Calendar.getInstance();
    int diaOut;
    
    

    public Reservacion(Cliente cliente, Habitacion habitacion, Paquete paquete, int numeroDias) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.paquete = paquete;
        this.numeroDias = numeroDias;
        diaOut = fechaReserva.get(Calendar.DAY_OF_YEAR) + numeroDias;
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
        int costoPaquete = 0, costoHabitacion;

        costoHabitacion = habitacion.getCostoTotal();
        this.totalPago = (costoPaquete + costoHabitacion) * numeroDias;

    }

    public Cliente getCliente() {
        return this.cliente;
    }

     public String getHabitacion() {
       int n = this.habitacion.getNumero();
       String p = this.habitacion.getPiso();
       
       return p + n;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    

    public void getPaquete() {
        //Aqui pondre para luego ver el nombre y precio del paquete de esta reservacion
    }
    
    public int getTotalPago() {
        return totalPago;
    }
    
    public String toString() {
        return   this.cliente.getNombre() + "    " + this.habitacion.getPiso() + "    "+ this.paquete.getNombre() + "    " + this.totalPago + "\n";
    }

    
    
    
}
