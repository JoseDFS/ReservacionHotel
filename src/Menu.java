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
    private ListaCliente listaClientes = new ListaCliente();
    //private ListaHabitacion listaHabitaciones = new ListaHabitacion();
    //private ListaPaquete listaPaquetes = new ListaPaquetes();
    //private ListaReservacion listaReservaciones = new ListaReservacion();

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void mostrar() {
        int optn = 0;
        Scanner choose = new Scanner(System.in);

        while (optn != 1 && optn != 2 && optn != 3 && optn != 4) {
            System.out.println("1. Reservaciones");
            System.out.println("2. Gestionar habitaciones");
            System.out.println("3. Gestionar paquetes.");
            System.out.println("4. Salir");

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

    public void subMenu1() {
        int optn = 0;
        Scanner read = new Scanner(System.in);

        while (optn != 1 && optn != 2 && optn != 3 && optn != 4 && optn != 5) {
            System.out.println("");
            System.out.println("1. Agregar reservación.");
            System.out.println("2. Ver reservaciones.");
            System.out.println("3. Modificar reservaciones.");
            System.out.println("4. Cancelar resarvaciones.");
            System.out.println("5. Salir");

            try {
                optn = read.nextInt();
                switch (optn) {
                    case 1:
                        Cliente huesped = listaClientes.add();
                        //Habitacion cuarto = listaHabitacion.add();
                        //Paquete pack = listaPaquete.add();
                        System.out.println("¿Cuantos dias se quedará?: ");
                        int cant = read.nextInt();
                        //Reservacion reserva = listaReservacion.add(huesped, cuarto, pack, cant);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
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
                read.nextLine();
            }
        }

    }

    public void subMenu2() {
        int optn = 0;
        Scanner choose = new Scanner(System.in);

        while (optn != 1 && optn != 2 && optn != 3 && optn != 4 && optn != 5 && optn != 6) {
            System.out.println("");
            System.out.println("1. Habilitar habitación.");
            System.out.println("2. Desabilitar habitación.");
            System.out.println("3. Habilitar piso.");
            System.out.println("4. Deshabilitar piso.");
            System.out.println("5. Cambiar precio de habitación.");
            System.out.println("6. Salir.");

            try {
                optn = choose.nextInt();
                switch (optn) {
                    case 1:
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

    public static void main(String[] args) {
        Menu menu = Menu.getInstance();

        menu.mostrar();
    }
}
