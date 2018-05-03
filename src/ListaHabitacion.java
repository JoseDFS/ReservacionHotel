/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fredy
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class ListaHabitacion {
    private ArrayList<Habitacion> habitaciones;

    public ListaHabitacion() {
        habitaciones = new ArrayList<>();
    }

    Scanner c = new Scanner(System.in);
    
    public Habitacion add() {
        Habitacion habitacion = new Habitacion();

        System.out.println("Ingrese los nombre del cliente");
        System.out.print(": ");
        habitacion.setPiso(c.next());

        System.out.println("Ingrese el correo");
        System.out.print(": ");
        habitacion.setNumero(c.nextInt());

        System.out.println("Ingrese Telefono");
        System.out.print(": ");
        habitacion.setCostoNormal(c.nextInt());
        
        System.out.println("Ingrese el numero de dui");
        System.out.print(": ");
        habitacion.setCostoExtra(c.nextInt());

        habitaciones.add(habitacion);
        
        return habitacion;

    }

    public void addHabitacion(Habitacion habitacion) throws Exception {
        if (habitaciones != null) {
            if (!habitaciones.contains(habitacion)) {
                habitaciones.add(habitacion);
            }
            Exception e = new Exception("Ya existe cliente con esos datos.");
            throw e;
        } else {
            throw new Exception("No se puede agregar.");
        }
    }
    
}
