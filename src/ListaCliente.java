
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author fernando
 */
public class ListaCliente {

    private ArrayList<Cliente> clientes;

    public ListaCliente() {
        clientes = new ArrayList<>();
    }

    Scanner c = new Scanner(System.in);

    public Cliente add() {
        Cliente cliente = new Cliente();
        
        //Ingreso de nombre
        System.out.println("Ingrese nombre del cliente ");
        System.out.print(": ");
        try {
            cliente.setNombre(c.nextLine());
        } catch (Exception e) {
            System.out.println("No ingresaste texto");
        }
        
        //Ingreso de DUI
        System.out.println("Ingrese DUI del cliente");
        System.out.print(": ");
        try {
            cliente.setDui(c.nextLine());
        } catch (Exception e) {
            System.out.println("No ingreso texto");
        }
        
        
        //Ingreso de correo
        System.out.println("Ingrese el correo");
        System.out.print(": ");
        try {
            cliente.setCorreo(c.nextLine());
        } catch (Exception e) {
            System.out.println("No ingreso texto");
        }
        
        //Ingreso de telefono
        System.out.println("Ingrese Telefono");
        System.out.print(": ");
        try{
        cliente.setTelefono(c.nextLine());
        } catch(Exception e){
            System.out.println("No ingreso texto");
        }
        
        //Ingreso de Tarjeta de Credito
        System.out.println("Ingrese Tarjeta de Credito ");
        System.out.print(": ");
        try{
        cliente.setTarjetaCredito(c.nextLine());
        } catch(Exception e){
            System.out.println("No ingreso texto");
        }
        
        
        clientes.add(cliente);

        return cliente;

    }

    public void addCliente(Cliente cliente) throws Exception {
        if (cliente != null) {
            if (!clientes.contains(cliente)) {
                clientes.add(cliente);
            }
            Exception e = new Exception("Ya existe cliente con esos datos.");
            throw e;
        } else {
            throw new Exception("No se puede agregar cliente sin datos.");
        }
    }

    public void mostrarTodo() {
        if (clientes.isEmpty()) {
            System.out.println("No existe ningun cliente");
        } else {
            System.out.println("-----Clientes-----");
            clientes.forEach((e) -> {
                System.out.println(e.toString());
            });
        }
    }

    public void eliminarCliente() {
        String clienteE;

        System.out.println("Escriba el nombre de cliente a eliminar: ");
        clienteE = c.nextLine();

        for (Iterator<Cliente> iter = clientes.iterator(); iter.hasNext();) {
            Cliente cliente = iter.next();
            if (cliente.getNombre().equals(clienteE)) {
                iter.remove();
                System.out.println("Se elimino cliente");
            }
        }
    }

    public void buscarCliente() {
        String clienteN;

        System.out.println("Que nombre de cliente desea buscar: ");
        clienteN = c.nextLine();

        for (Iterator<Cliente> iter = clientes.iterator(); iter.hasNext();) {
            Cliente cliente = iter.next();
            if (cliente.getNombre().equals(clienteN)) {
                System.out.println(cliente.toString());

            }
        }

    }
}
