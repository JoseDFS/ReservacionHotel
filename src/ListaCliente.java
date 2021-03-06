
import java.util.ArrayList;
import java.util.InputMismatchException;
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

    Scanner h = new Scanner(System.in);

    public Cliente add() {
        Cliente cliente = new Cliente();

        //Ingreso de nombre
        System.out.println(" ");
        System.out.println("Ingrese nombre del cliente ");
        System.out.print(": ");
        try {
            cliente.setNombre(h.nextLine());
        } catch (Exception e) {
            System.out.println("No ingresaste texto");
        }

        //Ingreso de DUI
        System.out.println("Ingrese DUI del cliente");
        System.out.print(": ");
        try {
            cliente.setDui(h.nextLine());
        } catch (Exception e) {
            System.out.println("No ingreso texto");
        }

        //Ingreso de correo
        System.out.println("Ingrese el correo");
        System.out.print(": ");
        try {
            cliente.setCorreo(h.nextLine());
        } catch (Exception e) {
            System.out.println("No ingreso texto");
        }

        //Ingreso de telefono
        System.out.println("Ingrese Telefono");
        System.out.print(": ");
        try {
            cliente.setTelefono(h.nextLine());
        } catch (Exception e) {
            System.out.println("No ingreso texto");
        }

        //Ingreso de Tarjeta de Credito
        System.out.print("Ingrese Tarjeta de Credito ");
        System.out.print(": ");
        System.out.println("");
        try {
            cliente.setTarjetaCredito(h.nextLine());
        } catch (Exception e) {
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
        clienteE = h.nextLine();

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
        String dui;

        System.out.println("Nombre de cliente: ");
        clienteN = h.nextLine();
        System.out.println("Dui de cliente : ");
        dui = h.nextLine();

        for (Iterator<Cliente> iter = clientes.iterator(); iter.hasNext();) {
            Cliente cliente = iter.next();
            if ((cliente.getNombre().equals(clienteN)) && (cliente.getDui().equals(dui))) {
                System.out.println(cliente.toString());

            }
        }

    }

    public Cliente buscarClienteReservavion() {
        String clienteR;
        String dui;
        Cliente cliente = null;

        System.out.println("Nombre de cliente: ");
        clienteR = h.nextLine();
        System.out.println("Dui de cliente : ");
        dui = h.nextLine();

        for (Iterator<Cliente> iter = clientes.iterator(); iter.hasNext();) {
            Cliente tempcliente = iter.next();
            if ((tempcliente.getNombre().equals(clienteR)) && (tempcliente.getDui().equals(dui))) {
                cliente = tempcliente;
            }
        }
        if(cliente == null){
             System.out.println("No se encontro el cliente ");
        }
        return cliente;

    }

    public void modificarCliente() {
        String clienteM;

        System.out.println("Escribir nombre de cliente a modificar: ");
        clienteM = h.nextLine();

        for (Iterator<Cliente> iter = clientes.iterator(); iter.hasNext();) {
            Cliente cliente = iter.next();
            if (cliente.getNombre().equals(clienteM)) {
                //Sub menu para modificar cliente

                int optn = 0;
                Scanner choose = new Scanner(System.in);

                while (optn != 6) {
                    System.out.println("");
                    System.out.println("1. Modificar nombre de cliente: ");
                    System.out.println("2. Modificar DUI de cliente: ");
                    System.out.println("3. Modificar Tarjeta de credito de cliente: ");
                    System.out.println("4. Modificar telefono de cliente: ");
                    System.out.println("5. Modificar correo de cliente: ");
                    System.out.println("6. Atras ");

                    try {
                        optn = choose.nextInt();
                        switch (optn) {
                            case 1:
                                System.out.println(" ");
                                System.out.println("Agregar nuevo nombre: ");
                                cliente.setNombre(h.nextLine());
                                break;
                            case 2:
                                System.out.println("Agregar nuevo DUI: ");
                                cliente.setDui(h.nextLine());
                                break;
                            case 3:
                                System.out.println("Agregar  nueva Tarjeta de credito: ");
                                cliente.setTarjetaCredito(h.nextLine());
                                break;

                            case 4:
                                System.out.println("Agregar nuevo Telefono: ");
                                cliente.setTelefono(h.nextLine());
                                break;

                            case 5:
                                System.out.println(" Agregar nuevo correo: ");
                                cliente.setCorreo(h.nextLine());
                                break;
                                
                            case 6: 
                                break;

                            default:
                                System.out.println("opción no valida");
                                System.out.println("");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println(" ");
                        System.err.println("Caractér o caracteres no validos");
                        System.out.println("");
                        choose.nextLine();
                    }

                }

            }

        }
    }
}
