
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
        try {
            cliente.setTelefono(c.nextLine());
        } catch (Exception e) {
            System.out.println("No ingreso texto");
        }

        //Ingreso de Tarjeta de Credito
        System.out.println("Ingrese Tarjeta de Credito ");
        System.out.print(": ");
        try {
            cliente.setTarjetaCredito(c.nextLine());
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

    public Cliente buscarClienteReservavion() {
        String clienteR;
        Cliente cliente = null;

        System.out.println("Que nombre de cliente desea: ");
        clienteR = c.nextLine();

        for (Iterator<Cliente> iter = clientes.iterator(); iter.hasNext();) {
            Cliente tempcliente = iter.next();
            if (tempcliente.getNombre().equals(clienteR)) {
                cliente = tempcliente;
            }
        }
        return cliente;

    }

    public void modificarCliente() {
        String clienteM;

        System.out.println("Escribir nombre de cliente a modificar: ");
        clienteM = c.nextLine();

        for (Iterator<Cliente> iter = clientes.iterator(); iter.hasNext();) {
            Cliente cliente = iter.next();
            if (cliente.getNombre().equals(clienteM)) {
                //Sub menu para modificar cliente
                
                int optn = 0;
                Scanner choose = new Scanner(System.in);

                while (optn != 1 && optn != 2 && optn != 3 && optn != 4 && optn != 5 && optn != 6 && optn != 7) {
                    System.out.println("");
                    System.out.println("1. Modificar nombre de cliente: ");
                    System.out.println("2. Modificar DUI de cliente: ");
                    System.out.println("3. Modificar Tarjeta de credito de cliente: ");
                    System.out.println("4. Modificar telefono de cliente: ");
                    System.out.println("5. Modificar correo de cliente: ");
                    System.out.println("6. Salir. ");
                    
                    try {
                        optn = choose.nextInt();
                        switch (optn) {
                            case 1:
                                System.out.println("Escribir nombre: ");
                                break;
                            case 2:
                        
                                break;
                            case 3:
                                    
                                break;

                            case 4:
                                break;
                                
                            case 5:
                                break;
                                
                            case 6:
                                break;
                            default:
                                System.out.println("opción no valida");
                                System.out.println("");
                                break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Caractér o caracteres no validos");
                System.out.println("");
                choose.nextLine();
            }
                    
                }

            }

        }
    }    
}