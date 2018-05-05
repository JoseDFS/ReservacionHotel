/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fredy Sánchez
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

//Menú creado con patron singleton
public class Menu {

    private static Menu menu;
    private final ListaCliente listaClientes = new ListaCliente();
    private final ListaHabitacion listaHabitaciones = new ListaHabitacion();
    private final ListaPaquete listaPaquetes = new ListaPaquete();
    private final ListaReservacion listaReservaciones = new ListaReservacion();
    

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
    

    public void mostrar() throws Exception {
        int optn = 6;
        Scanner choose = new Scanner(System.in);

        while (optn != 5) {
            System.out.println("1. Reservaciones");
            System.out.println("2. Gestionar habitaciones");
            System.out.println("3. Gestionar paquetes.");
            System.out.println("4. Gestionar clientes.");
            System.out.println("5. Salir");

            try {
                optn = choose.nextInt();
                switch (optn) {
                    case 1:
                        //Submenu1
                        subMenu1();
                        break;
                    case 2:
                        subMenu2();
                        break;
                    case 3:
                        subMenu3();
                        break;

                    case 4:
                        subMenu4();
                        break;

                    case 5:
                        System.out.println("Programa finalizado");
                        System.out.println("");
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

    public void subMenu1() throws Exception {
        int optn = 5;
        Scanner read = new Scanner(System.in);

        while (optn != 4) {
            System.out.println("");
            System.out.println("1. Agregar reservación.");
            System.out.println("2. Ver reservaciones.");
            System.out.println("3. Cancelar resarvaciones.");
            System.out.println("4. Atras");

            try {
                optn = read.nextInt();
                switch (optn) {
                    case 1:
                        Cliente huesped = listaClientes.add();
                        //Habitacion cuarto = listaHabitaciones.ElegirHabitacion();// no estas annadiendo habitaciones solo elegis una habitacion de la lista de habitaciones
                        //Paquete pack = listaPaquetes.ElegirPaquete(); // no annadis paquete, elegis un paquete de la lista de paquetes
                        // listaReservaciones.addReservacion(huesped, cuarto, pack);// aqui no creas la reservacion , lo hace la lista.
                        break;
                    case 2:
                        listaReservaciones.mostrarTodo();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;

                    default:
                        System.out.println("opción no valida");
                        System.out.println("");
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Caractér o caracteres no validos");
                System.out.println("");
                read.nextLine();
            }
        }

    }

    public void subMenu2() {
        int optn =9;
        Scanner choose = new Scanner(System.in);

        while (optn != 8) {
            System.out.println("");
            System.out.println("1. Habilitar habitación.");
            System.out.println("2. Desabilitar habitación.");
            System.out.println("3. Habilitar piso.");
            System.out.println("4. Deshabilitar piso.");
            System.out.println("5. Cambiar precio de habitación.");
            System.out.println("6. Ver Habitaciones.");
            System.out.println("7. Añadir Habitacion.");
            System.out.println("8. Atras.");

            try {
                optn = choose.nextInt();
                switch (optn) {
                    case 1:
                        listaHabitaciones.habilitarHabitacion();
                        break;
                    case 2:
                        listaHabitaciones.deshabilitarHabitacion();
                        break;
                    case 3:
                        listaHabitaciones.habilitarPiso();
                        break;
                    case 4:
                        listaHabitaciones.deshabilitarPiso();
                        break;
                    case 5:
                        listaHabitaciones.modificarhabitacion();
                        break;
                    case 6:
                        listaHabitaciones.mostrarHabitaciones();
                        break;
                    case 7:
                        listaHabitaciones.addHabitacion();
                        break;
                    case 8:
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

    public void subMenu3() {
        int optn = 0;
        Scanner choose = new Scanner(System.in);

        while (optn != 1 && optn != 2 && optn != 3 && optn != 4 && optn != 5 && optn != 6) {
            System.out.println("");
            System.out.println("1. Modificar paquete.");
            System.out.println("2. Agregar paquete.");
            System.out.println("3. Eliminar paquete.");
            System.out.println("4. Salir");

            try {
                optn = choose.nextInt();
                switch (optn) {
                    case 1:
                        break;
                    case 2:
                        listaPaquetes.addPaquete();
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Programa finalizado");
                        System.out.println("");
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

    public void subMenu4() throws Exception {
        int optn = 7;
        Scanner choose = new Scanner(System.in);

        while (optn != 4) {
            System.out.println(" ");
            System.out.println("1. Ver Clientes");
            System.out.println("2. Modificar datos de un cliente");
            System.out.println("3. Eliminar Cliente.");
            System.out.println("4. Atras");

            try {
                optn = choose.nextInt();
                switch (optn) {
                    case 1:
                        listaClientes.mostrarTodo();
                        break;
                    case 2:
                        listaClientes.modificarCliente();
                        break;
                    case 3:
                        listaClientes.eliminarCliente();
                        break;

                    case 4:
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

    public static void main(String[] args) throws Exception {
        Menu menu = Menu.getInstance();

        menu.mostrar();
    }
}
