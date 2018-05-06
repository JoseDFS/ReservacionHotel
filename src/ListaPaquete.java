
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

    Scanner L = new Scanner(System.in);

    public ListaPaquete() {
        paquetes = new ArrayList<>();
        Paquete paquete1 = new Paquete();

        paquete1.setNombre("Basico");
        paquete1.setPrecio(10);
        paquete1.setDescripcion("Acceso a la piscina, internet ilimitado");
        paquetes.add(paquete1);

        Paquete paquete2 = new Paquete();

        paquete2.setNombre("Premium ");
        paquete2.setPrecio(150);
        paquete2.setDescripcion("Buffet de desayuno, acceso ilimitado a la piscina, servicio a la habitacion, acceso ilimitado al minibar");
        paquetes.add(paquete2);

    }

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

        if (paquetes.isEmpty()) {
            System.out.println("No hay paquetes");
        } else {
            System.out.println("-----Paquetes-----");
            System.out.println("Nombre:  | Precio:  | Descripcion:");
            paquetes.forEach((e) -> {
                System.out.println(e.toString());
            });

        }
    }

    public Paquete elegirPaquete() {
        Paquete paquete = null;
        String opc;
        mostrar();
        System.out.println("Escriba el nombre del paquete a elegir:");
        opc = L.nextLine();
        for (Iterator<Paquete> iter = paquetes.iterator(); iter.hasNext();) {
            Paquete tempPaquete = iter.next();
            if (tempPaquete.getNombre().equals(opc)) {
                paquete = tempPaquete;
                System.out.println("Se ha seleccionado el paquete");
            }
        }
        return paquete;
    }
}
