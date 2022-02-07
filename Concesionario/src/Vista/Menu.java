
package Vista;

/**
 *
 * @author HOME
 */
public class Menu {
    public void principal(){
        System.out.println("*********************************");
        System.out.println("MENU PRINCIPAL DEL CONCESIONARIO");
        System.out.println("*********************************");
        System.out.println("Elija el menu a acceder");
        System.out.println("1: Menu de Carros");
        System.out.println("2: Menu de Personal de Ventas");
        System.out.println("3: Menu del Concecionario");
        System.out.println("4: Cerrar Menu principal");
    }
    
    public void carros(){
        System.out.println("*********************************");
        System.out.println("MENU CARROS");
        System.out.println("*********************************");
        System.out.println("Elija la opcion de su preferencia");
        System.out.println("1: Agregar un Carro");
        System.out.println("2: Eliminar un Carro");
        System.out.println("3: Vender un Carro");
        System.out.println("4: Imprimir Carros");
        System.out.println("5: Salir del menu");
    }
    public void personalVentas(){
        System.out.println("*********************************");
        System.out.println("MENU PRINCIPAL DEL CONCESIONARIO");
        System.out.println("*********************************");
        System.out.println("Elija el menu a acceder");
        System.out.println("1: Agregar Personal");
        System.out.println("2: Eliminar Personal");
        System.out.println("3: Modificar Personal");
        System.out.println("4: Ventas por persona");
        System.out.println("5: Imprimir Personal");
        System.out.println("6: Salir del menu");
    }
    public void concesionario(){
        System.out.println("*********************************");
        System.out.println("MENU CONCECIONARIO");
        System.out.println("*********************************");
        System.out.println("Elija la opcion de su preferencia");
        System.out.println("1: Modificar el nombre del CONCECIONARIO");
        System.out.println("2: Modificar el nombre del GERENTE");
        System.out.println("3: Salir del menu");
    }
}