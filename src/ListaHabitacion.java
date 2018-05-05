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
    private ArrayList<Habitacion> habitaciones;

    public ListaHabitacion() {
        habitaciones = new ArrayList<>();
        for(char i = 'A'; i <= 'F'; i++){
            for(int j = 1; j <= 10; j++ ){
                String h = ""+i;
                Habitacion habitacion=new Habitacion();
                habitacion.setPiso(h);
                habitacion.setNumero(j);
                if(j%2 == 0){
                    habitacion.setTipo("Doble");
                }
                else{
                    habitacion.setTipo("Sencilla");
                }
                habitaciones.add(habitacion);
            }
        }
    }

    Scanner c = new Scanner(System.in);
    
    public void addHabitacion() {
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
        
        System.out.println("Ingrese costo Extra");
        System.out.print(": ");
        habitacion.setCostoExtra(c.nextInt());

        try {
            addHabitacion(habitacion);
        } catch (Exception ex) {
            Logger.getLogger(ListaHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
       

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

    void habilitarHabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    void deshabilitarHabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void habilitarPiso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void deshabilitarPiso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void mostrarHabitaciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void modificarhabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
