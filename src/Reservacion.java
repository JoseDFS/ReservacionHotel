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

    public void CostoTotal() {
        int costoPaquete = 0, costoHabitacion;

        if (paquete.isPremium()) {
            costoPaquete = paquete.getCostoPremium();
        }

        if (paquete.isBasico()) {
            costoPaquete = paquete.getCostoBasico();
        }

        costoHabitacion = habitacion.getCostoTotal();
        this.totalPago = (costoPaquete + costoHabitacion) * numeroDias;

    }

    public void getCliente() {
        //Aqui pondre para luego ver el nombre y dui  datos del cliente de esta reservacion
    }

     public void getHabitacion() {
       //Aqui pondre para luego ver el numero y piso de habitacion de esta reservacion
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

    
    
    
}
