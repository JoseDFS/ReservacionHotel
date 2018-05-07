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
            System.out.println("1. Gestionar Reservaciones");
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
                        boolean flag = true;
                        int oppack = 0;
                        Paquete pack = null;
                        Habitacion cuarto = null;
                        Cliente huesped = listaClientes.buscarClienteReservavion();
                        if (huesped == null) {
                            System.out.println("Este cliente no esta registrado se añadira al sistema pidiendole todos los datos necesarios.");
                            huesped = listaClientes.add();
                        }

                        while (flag) {

                            cuarto = listaHabitaciones.elegirHabitacion();
                            if (cuarto == null) {
                                System.out.println("No existe esa habitacion.");
                            } else {
                                flag = false;
                            }
                        }
                        while (oppack != 1 && oppack != 2) {
                            System.out.println("Desea contratar un paquete? 1.Si 2.No ");
                            oppack = read.nextInt();
                            if (oppack == 1) {
                                pack = listaPaquetes.elegirPaquete();
                                if (pack == null) {
                                    oppack = 0;
                                    System.out.println("No eligio un paquete existente ");
                                }
                            }
                        }
                        listaReservaciones.addReservacion(huesped, cuarto, pack);// aqui no creas la reservacion , lo hace la lista.
                        break;
                    case 2:
                        listaReservaciones.mostrarTodo();
                        break;
                    case 3:
                        Cliente buscCancelar = listaClientes.buscarClienteReservavion();
                        if (buscCancelar == null) {
                            break;
                        } else {
                            listaReservaciones.cancelarReservacion(buscCancelar);
                            break;
                        }
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

    public void subMenu2() throws Exception {
        int optn = 9;
        Scanner choose = new Scanner(System.in);

        while (optn != 7) {
            System.out.println("");
            System.out.println("1. Habilitar habitación.");
            System.out.println("2. Desabilitar habitación.");
            System.out.println("3. Habilitar piso.");
            System.out.println("4. Deshabilitar piso.");
            System.out.println("5. Cambiar precio base de habitación.");
            System.out.println("6. Ver Habitaciones.");
            //System.out.println("7. Añadir Habitacion.");
            System.out.println("7. Atras.");

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
                        int opc5 = 0;
                        int precio;
                        while (opc5 != 3) {
                            System.out.println("1. Cambiar precio base Habitacion sencilla  2.Cambiar precio base Habitacion doble  3.Atras");

                            opc5 = choose.nextInt();
                            switch (opc5) {
                                case 1:
                                    System.out.println("Ingrese el nuevo precio base: ");
                                    precio = choose.nextInt();
                                    listaHabitaciones.setPrecioBsencilla(precio);
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nuevo precio base: ");
                                    precio = choose.nextInt();
                                    listaHabitaciones.setPrecioBdoble(precio);
                                    break;
                                case 3:
                                    break;

                                default:
                                    System.out.println("opción no valida");
                                    System.out.println("");
                                    break;
                            }

                        }

                        break;
                    case 6:
                        int opc6 = 0;
                        String piso;
                        while (opc6 != 3) {
                            System.out.println("1. Ver Habitaciones de un piso   2.Ver todas las Habitaciones  3.Atras");

                            opc6 = choose.nextInt();
                            switch (opc6) {
                                case 1:
                                    System.out.println("Ingrese el piso: ");
                                    piso = choose.next();
                                    listaHabitaciones.mostrarHabitacionesPiso(piso);
                                    break;
                                case 2:
                                    listaHabitaciones.mostrarHabitaciones();
                                    break;
                                case 3:
                                    break;

                                default:
                                    System.out.println("opción no valida");
                                    System.out.println("");
                                    break;
                            }

                        }
                        break;

                    case 7:
                        //listaHabitaciones.addHabitacion();
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

        while (optn != 6) {
            System.out.println("1. Modificar precio paquete.");
            System.out.println("2. Modificar servicios paquete");
            System.out.println("3. Agregar paquete.");
            System.out.println("4. Eliminar paquete.");
            System.out.println("5. Ver paquetes");
            System.out.println("6. Atras");

            try {
                optn = choose.nextInt();
                switch (optn) {
                    case 1:
                        listaPaquetes.modificarPaquetePrecio();
                        break;
                    case 2:
                        listaPaquetes.modificarServicios();
                        break;
                    case 3:
                        listaPaquetes.addPaquete();
                        break;
                    case 4:
                        listaPaquetes.eliminar();
                        break;
                    case 5:
                        listaPaquetes.mostrar();
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
