
import java.util.ArrayList;
import java.util.Scanner;

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

    public void add() {
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

        System.out.println("Ingrese Tarjeta de Credito ");
        System.out.print(": ");
        cliente.setTarjetaCredito(c.nextLine());

        clientes.add(cliente);

    }

}
