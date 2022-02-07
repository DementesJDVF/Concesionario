package Vista;

import Control.Carro;
import Control.Concesionario;
import Control.Gerente;
import Control.PersonalVentas;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class main {
    public static void main(String args[]) {
        Concesionario concesionario = new Concesionario();
        Menu menu = new Menu();
        Gerente gerente = new Gerente();
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba el nombre del concesionario");
        String nombreConcesionario = leer.nextLine();
        concesionario.agregarNombreConcesionario(nombreConcesionario);
        System.out.println("Escriba el nombre del gerente");
        String nombreGerente = leer.nextLine();
        concesionario.agregarNombreGerente(nombreGerente);
        int opcionPrincipal, opcionCarros, opcionVendedor, opcionConcesionario;
        do {
            menu.principal();
            concesionario.imprimirConcesionarioGerente();
            opcionPrincipal = leer.nextInt();
            leer.nextLine();
            switch (opcionPrincipal) {
                case 1 -> {
                    do{
                        menu.carros();
                        opcionCarros = leer.nextInt();
                        leer.nextLine();
                        switch (opcionCarros) {
                            case 1 ->  {
                                System.out.println("Digite la marca del carro");
                                String marcaCarro = leer.nextLine();
                                System.out.println("digite el precio del carro");
                                double precioCarro = leer.nextDouble();
                                concesionario.agregarCarro(new Carro(marcaCarro, precioCarro));
                                break;
                            }
                            case 2 ->{
                                concesionario.imprimirCarro();
                                System.out.println("Ingrese la marca del carro para eliminar: ");
                                String marcaCarro = leer.nextLine();
                                concesionario.eliminarCarro(marcaCarro);
                                break;
                            }
                            case 3 ->{
                                concesionario.imprimirCarro();
                                concesionario.imprimirPersonal();
                                System.out.println("Ingrese la marca del carro para vender ");
                                String marcaCarro = leer.nextLine();
                                System.out.println("Escriba el nombre de la persona que lo atendio");
                                String nombreVendedor = leer.nextLine();
                                concesionario.venderCarro(marcaCarro, nombreVendedor);  
                            break;
                            }
                            case 4 ->{
                                concesionario.imprimirCarro();
                            }
                            case 5 ->{
                                System.out.println("USTED A CERRADO EL Menu");
                            }
                            default -> {
                                System.out.println("🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶");
                                System.out.println("La opcion introducida es incorrecta");
                                System.out.println("🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶");      
                            }
                        }
                    }while(opcionCarros != 5);
                    break;
                }
                case 2 ->{
                    do{
                        menu.personalVentas();
                        opcionVendedor = leer.nextInt();
                        leer.nextLine();
                        switch (opcionVendedor) {
                            case 1 ->  { 
                                System.out.println("Escriba el Nombre del nuevo vendedor");
                                String nombreVendedor = leer.nextLine();
                                concesionario.agregarPersonal(new PersonalVentas(nombreVendedor, 0));
                                break;
                            }
                            case 2 ->{
                                concesionario.imprimirPersonal();
                                System.out.println("Escriba el Nombre del vendedor a eliminar");
                                String nombreVendedor = leer.nextLine();
                                concesionario.eliminarPersonal(nombreVendedor);
                                break;
                            }
                            case 3 ->{
                                concesionario.imprimirPersonal();
                                System.out.println("Escriba el Nombre del vendedor actual");
                                String nombreActual = leer.nextLine();
                                System.out.println("Escriba el nuevo Nombre del vendedor");
                                String nombreNuevo = leer.nextLine();
                                concesionario.modificarPersonal(nombreActual, nombreNuevo);
                                break;
                            }
                            case 4 ->{
                                concesionario.imprimirPersonal();
                                System.out.println("Escriba el Nombre del vendedor para ver sus ventas");
                                String nombreVendedor = leer.nextLine();
                                concesionario.ventasPorPersonal(nombreVendedor);
                                break;
                            }
                            case 5 ->{
                               concesionario.imprimirPersonal();
                            }
                            case 6->{
                                 System.out.println("USTED A CERRADO EL MENU");
                            }
                            default -> {
                                System.out.println("🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶");
                                System.out.println("La opcion introducida es incorrecta");
                                System.out.println("🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶");   
                            }
                        }
                    }while(opcionVendedor != 6);
                    break;
                }
                case 3 ->{
                    do{
                        menu.concesionario();
                        concesionario.imprimirConcesionarioGerente();
                        opcionConcesionario = leer.nextInt();
                        leer.nextLine();
                        switch (opcionConcesionario) {
                            case 1 ->{
                                System.out.println("Escriba el nuevo nombre del Concesionario");
                                String nombreNuevo = leer.nextLine();
                                concesionario.modificarNombreConcesionario(nombreNuevo);
                               break; 
                            }
                            case 2 ->{
                                System.out.println("Digite el nuevo nombre gerente");
                                String nuevoNombre = leer.nextLine();
                                concesionario.agregarNombreGerente(nuevoNombre);
                                break;
                            }
                            case 3 ->{
                                System.out.println("USTED A CERRADO EL MENU");
                            }
                            default -> {
                                System.out.println("🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶");
                                System.out.println("La opcion introducida es incorrecta");
                                System.out.println("🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶");    
                            }
                        }    
                    }while(opcionConcesionario != 3);
                }
                case 4 ->{
                    System.out.println("USTED A CERRADO EL Menu");
                }
                default -> {
                    System.out.println("🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶");
                    System.out.println("La opcion introducida es incorrecta");
                    System.out.println("🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶🔶");
                } 
            }
        }while(opcionPrincipal != 4);
    }
}