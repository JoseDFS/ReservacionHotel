import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
public class ListaPaquete {
    
    private ArrayList<Paquete> paquetes;

    public ListaPaquete() {
        paquetes = new ArrayList<>();
    }

    Scanner L = new Scanner(System.in);

    public void addPaquete() {
        Paquete paquete = new Paquete();
        paquetes.add(paquete);

        System.out.println("Escriba el nombre del paquete:");
        paquete.setNombre(L.nextLine());

        System.out.println("Escriba la cantidad del precio:");
        paquete.setPrecio(Integer.parseInt(L.nextLine()));
        
        System.out.println("Escriba una descripcion para el paquete");
        paquete.setDescripcion(L.nextLine());
        
    }
    
    public void addPaquete(Paquete paquete) throws Exception {
        if (paquete != null) {
            if (!paquetes.contains(paquete)) {
                paquetes.add(paquete);
            }
            Exception e = new Exception("Ese paquete ya existe.");
            throw e;
        } else {
            throw new Exception("No se puede agregar un paquete sin datos.");
        }
    }
    
    public void eliminar() {
        String n;

        System.out.println("Escriba el nombre del paquete a eliminar:");
        n = L.nextLine();
        for (Iterator<Paquete> iter = paquetes.iterator(); iter.hasNext();) {
            Paquete paquete = iter.next();
            if (paquete.getNombre().equals(n)) {
                iter.remove();
                System.out.println("Se ha eliminado el paquete especificado");
            } 
        }

    }
    
    public void mostrar() {
        
        Paquete paquete1 = new Paquete();
        paquetes.add(paquete1);
        paquete1.setNombre(" ");
        paquete1.setPrecio(0);
        paquete1.setDescripcion(" ");
        
        Paquete paquete2 = new Paquete();
        paquetes.add(paquete2);
        paquete2.setNombre(" ");
        paquete2.setPrecio(0);
        paquete2.setDescripcion(" ");
        
        Paquete paquete3 = new Paquete();
        paquetes.add(paquete3);
        paquete3.setNombre(" ");
        paquete3.setPrecio(0);
        paquete3.setDescripcion(" ");
        
        if (paquetes.isEmpty()) {
            System.out.println("No hay paquetes");
        } 
        else {
            System.out.println("-----Paquetes-----");
            paquetes.forEach((e) -> {
                System.out.println(e.toString());
            });
        }
    }
}
    
    
    
