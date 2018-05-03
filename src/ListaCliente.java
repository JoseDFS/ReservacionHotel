
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

        System.out.println("Ingrese los nombre del cliente");
        System.out.print(": ");
        cliente.setNombre(c.nextLine());

        System.out.println("Ingrese el correo");
        System.out.print(": ");
        cliente.setCorreo(c.nextLine());

        System.out.println("Ingrese Telefono");
        System.out.print(": ");
        cliente.setTelefono(c.nextLine());
        
        System.out.println("Ingrese el numero de dui");
        System.out.print(": ");
        cliente.setDui(c.nextLine());

        System.out.println("Ingrese Tarjeta de Credito ");
        System.out.print(": ");
        cliente.setTarjetaCredito(c.nextLine());

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
    
    public void mostrarTodo(){
        if(clientes.isEmpty()){
            System.out.println("No existe ningun cliente");
        } else{
            System.out.println("-----Clientes-----");
            clientes.forEach((e) ->{
                System.out.println(e.toString());
            });
        }
    }
    
    public void elimanarCliente(){
        String clienteE;
        
        System.out.println("Escriba el nombre de cliente a eliminar: ");
        clienteE = c.nextLine();
        
        
    }

}
