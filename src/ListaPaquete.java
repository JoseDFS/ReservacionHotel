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

    public void addListaPaquete() {
        Paquete paquete = new Paquete();
        paquetes.add(paquete);

        System.out.println("Escriba el nombre del paquete:");
        paquete.setNombre(L.nextLine());

        System.out.println("Escriba la cantidad del precio:");
        paquete.setPrecio(Integer.parseInt(L.nextLine()));
        
        System.out.println("Escriba una descripcion para el paquete");
        paquete.setDescripcion(Integer.parseInt(L.nextLine()))

    }
    
}