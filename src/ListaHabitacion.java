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
    
    Scanner c = new Scanner(System.in);

    public ListaHabitacion() {
        int precioBsencilla = 0;
        int precioBdoble = 0;
        while((precioBsencilla <= 0) && (precioBdoble <= 0)){
             System.out.println("Ingrese el precio base de las habitaciones sencillas:");
             precioBsencilla = c.nextInt();
             
             System.out.println("Ingrese el precio base de las habitaciones dobles:");
             precioBsencilla = c.nextInt();
             
        }
        
        habitaciones = new ArrayList<>();
        for(char i = 'A'; i <= 'F'; i++){
            for(int j = 1; j <= 10; j++ ){
                String h = ""+i;
                Habitacion habitacion=new Habitacion();
                habitacion.setPiso(h);
                habitacion.setNumero(j);
                if(j%2 == 0){
                    habitacion.setTipo("Doble");
                    habitacion.setCostoNormal(precioBdoble);
                }
                else{
                    habitacion.setTipo("Sencilla");
                    habitacion.setCostoNormal(precioBsencilla);
                }
                habitacion.setHabilitada(true);
                habitaciones.add(habitacion);
            }
        }
    }

    
    
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
        
        
    }

    void deshabilitarHabitacion() {
        
    }

    void habilitarPiso() {
       
    }

    void deshabilitarPiso() {
        
    }

    void mostrarHabitaciones() {
         if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones");
        } 
        else {
            System.out.println("-----Habitaciones-----");
            System.out.println("Habitacion: | Estado: ") ;
            habitaciones.forEach((e) -> {
                System.out.println(e.toString());
            });
        }
    }
    
     void mostrarHabitacionesPiso(String piso) {
         if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones");
        } 
        else {
            System.out.println("-----Habitaciones-----");
            System.out.println("Habitacion: | Estado: ") ;
            habitaciones.forEach((e) -> {
                if(e.getPiso().equals(piso)){
                System.out.println(e.toString());
                }
            });
        }
    }

    void modificarhabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
