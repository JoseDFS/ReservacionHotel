
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

    public void addReservacion(Cliente cliente, Habitacion habitacion, Paquete paquete, int dias) throws Exception {
        if (cliente.numeroReservaciones <= 2) {
            Reservacion reservacion = new Reservacion(cliente, habitacion, paquete, dias);
            try {
                addReservacion(reservacion);
            } catch (Exception ex) {
                Logger.getLogger(ListaReservacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("El cliente ya ha reservado 2 habitaciones");
        }
    }

    public void addReservacion(Reservacion reservacion) throws Exception {
        if (reservacion != null) {
            if (!reservaciones.contains(reservacion)) {
                reservaciones.add(reservacion);
            }
            Exception e = new Exception("Ya existe cliente con esos datos.");
            throw e;
        } else {
            throw new Exception("No se puede agregar cliente sin datos.");
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
                cliente.numeroReservaciones -= 1;
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
            reservaciones.forEach((e) -> {
                System.out.println(e.toString());
            });
        }
    }

    public void mostrarPorCliente(Cliente cliente) {
        for (Iterator<Reservacion> iter = reservaciones.iterator(); iter.hasNext();) {
            Reservacion reservacion = iter.next();
            if (reservacion.getCliente().equals(cliente)) {
                System.out.println(reservacion.toString());
            }
        }

    }

}
