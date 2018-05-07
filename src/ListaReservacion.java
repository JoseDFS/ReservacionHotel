
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose Segura <com.segura.jd>
 */
public class ListaReservacion {

    private final ArrayList<Reservacion> reservaciones;

    public ListaReservacion() {
        reservaciones = new ArrayList<>();
    }

    Scanner L = new Scanner(System.in);

    public void addReservacion(Cliente cliente, Habitacion habitacion, Paquete paquete) {
        System.out.println("¿Cuantos dias se quedará?: ");
        int dias = L.nextInt();
        if ((cliente.getNumeroReservaciones() <2) && (dias <= 7)) {
            Reservacion reservacion = new Reservacion(cliente, habitacion, paquete, dias);

            reservaciones.add(reservacion);
            habitacion.setHabilitada(false);
            cliente.setNumeroReservaciones(cliente.getNumeroReservaciones() + 1);
        } else {
            System.out.println("El cliente ya ha reservado 2 habitaciones o esta reservando mas de 7 dias");
        }
    }

    public void cancelarReservacion(Cliente cliente) {
        String habitacion;

        System.out.println("Escriba el piso y numero de la habitacion:");
        habitacion = L.nextLine();

        for (Iterator<Reservacion> iter = reservaciones.iterator(); iter.hasNext();) {
            Reservacion reservacion = iter.next();
            if (reservacion.getHabitacion().equals(habitacion) && reservacion.getCliente().equals(cliente)) {
                iter.remove();
                System.out.println("Se ha cancelado la reservacion especificada");
                cliente.setNumeroReservaciones(cliente.getNumeroReservaciones() - 1);
            } else {
                System.out.println("El piso no corresponde a una reservacion");
            }
        }

    }

    public void mostrarTodo() {
        if (reservaciones.isEmpty()) {
            System.out.println("No hay reservaciones");
        } else {
            System.out.println("-----Reservaciones-----");
            System.out.println("Cliente:   |  Habitacion:  |   Paquete:   |   Pago: ");
            reservaciones.forEach((e) -> {
                System.out.println(e.toString());
            });
        }
    }

    public void mostrarPorCliente(Cliente cliente) {
        for (Iterator<Reservacion> iter = reservaciones.iterator(); iter.hasNext();) {
            Reservacion reservacion = iter.next();
            if (reservacion.getClienteR().equals(cliente)) {
                System.out.println(reservacion.toString());
            }
        }

    }

}
