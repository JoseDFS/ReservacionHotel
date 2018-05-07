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
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaHabitacion {

    private final ArrayList<Habitacion> habitaciones;
    private int precioBsencilla;
    private int precioBdoble;

    Scanner c = new Scanner(System.in);

    public ListaHabitacion() {
        precioBsencilla = 0;
        precioBdoble = 0;
        while ((precioBsencilla <= 0) && (precioBdoble <= 0)) {
            System.out.println("Ingrese el precio base de las habitaciones sencillas:");
            precioBsencilla = c.nextInt();

            System.out.println("Ingrese el precio base de las habitaciones dobles:");
            precioBdoble = c.nextInt();

        }

        habitaciones = new ArrayList<>();
        for (char i = 'A'; i <= 'F'; i++) {
            for (int j = 1; j <= 10; j++) {
                String h = "" + i;
                Habitacion habitacion = new Habitacion();
                habitacion.setPiso(h);
                habitacion.setNumero(j);
                if (j % 2 == 0) {
                    habitacion.setTipo("Doble");
                    habitacion.setCostoNormal(precioBdoble);
                } else {
                    habitacion.setTipo("Sencilla");
                    habitacion.setCostoNormal(precioBsencilla);
                }
                habitacion.setHabilitada(true);
                habitaciones.add(habitacion);
            }
        }
    }

    public int getPrecioBsencilla() {
        return precioBsencilla;
    }

    public void setPrecioBsencilla(int precioBsencilla) {
        this.precioBsencilla = precioBsencilla;
        habitaciones.forEach((e) -> {
            if ("Sencilla".equals(e.getTipo())) {
                e.setCostoNormal(precioBsencilla);
            }
        });

    }

    public int getPrecioBdoble() {
        return precioBdoble;
    }

    public void setPrecioBdoble(int precioBdoble) {
        this.precioBdoble = precioBdoble;
        habitaciones.forEach((e) -> {
            if ("Doble".equals(e.getTipo())) {
                e.setCostoNormal(precioBdoble);
            }
        });
    }

   /*
    No logre q funcionara correctamente.
    
    public void addHabitacion() throws Exception {
        Habitacion habitacion = new Habitacion();

        System.out.println("Ingrese el piso");
        System.out.print(": ");
        habitacion.setPiso(c.next());

        System.out.println("Ingrese el numero de habitacion");
        System.out.print(": ");
        habitacion.setNumero(c.nextInt());

        System.out.println("Ingrese Precio Base");
        System.out.print(": ");
        habitacion.setCostoNormal(c.nextInt());

        habitaciones.forEach((habitaciontemp) -> {
            if (habitacion.getPiso().equals((habitaciontemp.getPiso())) && (habitacion.getNumero() == habitaciontemp.getNumero())) {
                System.out.println("Ya existe esas habitacion");
            } else {
                habitaciones.add(habitacion);
                System.out.println("Se agrego la habitacion");
            }
        });
    }
*/

    public void habilitarHabitacion() {
        int numero;
        String piso;

        String bug = c.nextLine();

        System.out.println("Escriba el piso: ");
        piso = c.nextLine();
        System.out.print("Escriba el numero: ");
        numero = c.nextInt();

        for (Iterator<Habitacion> iter = habitaciones.iterator(); iter.hasNext();) {
            Habitacion habitacion = iter.next();
            if ((habitacion.getPiso().equals(piso)) && (habitacion.getNumero() == numero)) {
                if (habitacion.isHabilitada()) {
                    System.out.println("Ya se encuentra habilitada");
                } else {
                    habitacion.setHabilitada(true);

                }
            }
        }

    }

    public void deshabilitarHabitacion() {
        int numero;
        String piso;

        String bug = c.nextLine();

        System.out.println("Escriba el piso: ");
        piso = c.nextLine();
        System.out.print("Escriba el numero: ");
        numero = c.nextInt();

        for (Iterator<Habitacion> iter = habitaciones.iterator(); iter.hasNext();) {
            Habitacion habitacion = iter.next();
            if ((habitacion.getPiso().equals(piso)) && (habitacion.getNumero() == numero)) {
                if (!habitacion.isHabilitada()) {
                    System.out.println("Ya se encuentra deshabilitada");
                } else {
                    habitacion.setHabilitada(false);

                }
            }
        }

    }

    public void habilitarPiso() {
        String piso;

        String bug = c.nextLine();

        System.out.println("Escriba el piso: ");
        piso = c.nextLine();

        for (Iterator<Habitacion> iter = habitaciones.iterator(); iter.hasNext();) {
            Habitacion habitacion = iter.next();
            if (habitacion.getPiso().equals(piso)) {
                if (habitacion.isHabilitada()) {
                } else {
                    habitacion.setHabilitada(true);

                }
            }
        }

    }

    public void deshabilitarPiso() {
        String piso;

        String bug = c.nextLine();

        System.out.println("Escriba el piso: ");
        piso = c.nextLine();

        for (Iterator<Habitacion> iter = habitaciones.iterator(); iter.hasNext();) {
            Habitacion habitacion = iter.next();
            if (habitacion.getPiso().equals(piso)) {
                if (!habitacion.isHabilitada()) {
                } else {
                    habitacion.setHabilitada(false);

                }
            }
        }
    }

    public void mostrarHabitaciones() {
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones");
        } else {
            System.out.println("-----Habitaciones-----");
            System.out.println("Precio base sencilla:" + precioBsencilla + "  " + "Precio base doble:" + precioBdoble);
            System.out.println("Habitacion: | Estado: | Tipo: ");
            habitaciones.forEach((e) -> {
                System.out.println(e.toString());
            });
        }
    }

    public void mostrarHabitacionesPiso(String piso) {
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones");
        } else {
            System.out.println("-----Habitaciones-----");
            System.out.println("Precio base sencilla:" + precioBsencilla + "  " + "Precio base doble:" + precioBdoble);
            System.out.println("Habitacion: | Estado: | Tipo:");
            habitaciones.forEach((e) -> {
                if (e.getPiso().equals(piso)) {
                    System.out.println(e.toString());
                }
            });
        }
    }

    public Habitacion elegirHabitacion() {
        String numero;
        String piso;
        Habitacion habitacion = null;
        String prueba = c.nextLine();

        System.out.println("Escriba el piso: ");
        piso = c.nextLine();
        System.out.print("Escriba el numero: ");
        numero = c.nextLine();

        for (Iterator<Habitacion> iter = habitaciones.iterator(); iter.hasNext();) {
            Habitacion temphabitacion = iter.next();
            if ((temphabitacion.getPiso().equals(piso)) && (temphabitacion.getNumero() == Integer.parseInt(numero))) {
                if (temphabitacion.isHabilitada()) {
                    habitacion = temphabitacion;

                } else {
                    System.out.println("Esa habitacion no esta habilitada");
                }
            }
        }

        return habitacion;

    }
}
