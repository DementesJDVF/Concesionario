package Control;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOME
 */

public class Concesionario {
    private String nombreConcesionario;
    
    public Gerente administrador;
    
    public ArrayList<Carro> listaCarro = new ArrayList<>();
    public ArrayList<PersonalVentas> listaPersonas = new ArrayList<>();
    
    Scanner leer = new Scanner(System.in);
    Gerente gerente = new Gerente();
    public Concesionario(String nombreConcesionario, Gerente administrador) {
        this.nombreConcesionario = nombreConcesionario;
        this.administrador = administrador;
    }

    public Concesionario() {
    }

    public String getNombreConcesionario() {
        return nombreConcesionario;
    }

    public void setNombreConcesionario(String nombreConcesionario) {
        this.nombreConcesionario = nombreConcesionario;
    }

    public Gerente getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Gerente administrador) {
        this.administrador = administrador;
    }
    
    //Opciones menu para carros
    public void agregarCarro(Carro carro){
        listaCarro.add(carro);
        imprimirCarro();
    }
    public void eliminarCarro(String marcaCarro){
        boolean  bandera = false;

        for (int i = 0; i < listaCarro.size(); i++){
            Carro getCarro = listaCarro.get(i);
            if (getCarro.getMarca().equals(marcaCarro)){
                bandera = true;
                listaCarro.remove(i);
            }
        }
        if ( bandera==true){   
            System.out.println("El carro de marca:" + marcaCarro + " ha sido eliminado correctamente");
        }else{
            System.out.println("la marca: "+marcaCarro+ " no se ha encontrado");
        }
    }
    public void venderCarro(String marcaCarro, String nombrePersonal){
        boolean bandera = false;
        boolean bandera2 = false;
  
            for (int i = 0; i < listaCarro.size(); i++){
                Carro getCarro = listaCarro.get(i);
                if (getCarro.getMarca().equals(marcaCarro)){
                    bandera = true;
                    listaCarro.remove(i);
                    for (int j = 0; j < listaPersonas.size(); j++){
                    PersonalVentas getPersonalVentas = listaPersonas.get(j);
                        if (getPersonalVentas.getNombrePersonal().equals(nombrePersonal)){
                            bandera2 = true;
                            getPersonalVentas.setCantidadVentas(getCarro.getPrecio());
                        }
                    }
                }
            }
            if ( bandera==true&&bandera2==true){         
                System.out.println("El carro de marca:" + marcaCarro + "se ha encontrado y ha sido vendida correctamente");
                System.out.println("Encargado de la venta fue: "+nombrePersonal);
            }else{
                if(bandera2==true){
                System.out.println("la marca: "+marcaCarro+ " se ha encontrado");
                System.out.println("La persona"+nombrePersonal+"no se encontro");
                }else{
                    System.out.println("la marca: "+marcaCarro+ " NO se ha encontrado");
                }
            }
    }
    
    //Opciones menu para personal
    public void agregarPersonal(PersonalVentas personalVentas){
        listaPersonas.add(personalVentas);
        imprimirPersonal();
    }
    public void eliminarPersonal(String nombrePersonal){
        boolean  bandera = false;

        for (int i = 0; i < listaPersonas.size(); i++){
            PersonalVentas getPersonalVentas = listaPersonas.get(i);
            if (getPersonalVentas.getNombrePersonal().equals(nombrePersonal)){
                bandera = true;
                listaPersonas.remove(i);
            }
        }
        if ( bandera==true){   
            System.out.println("El vendero con Nombre: " + nombrePersonal + " ha sido eliminado correctamente");
        }else{
            System.out.println("La persona: "+nombrePersonal+ " no se ha encontrado");
        }
    }
    public void modificarPersonal(String nombrePersonal, String nuevoNombre){
        boolean  bandera = false;

        for (int i = 0; i < listaPersonas.size(); i++){
            PersonalVentas getPersonalVentas = listaPersonas.get(i);
            if (getPersonalVentas.getNombrePersonal().equals(nombrePersonal)){
                bandera = true;
                listaPersonas.get(i).setNombrePersonal(nuevoNombre);
            }
        }
        if ( bandera==true){   
            System.out.println("El vendero con Nombre: " + nombrePersonal + " ha sido Modificado correctamente");
            System.out.println("El nuevo nombre es" +nuevoNombre);
        }else{
            System.out.println("La persona: "+nombrePersonal+ " no se ha encontrado");
        }
    }
    public void ventasPorPersonal(String nombrePersonal){
        boolean  bandera = false;
        int contador = 0;
        for (int i = 0; i < listaPersonas.size(); i++){
            PersonalVentas getPersonalVentas = listaPersonas.get(i);
            if (getPersonalVentas.getNombrePersonal().equals(nombrePersonal)){
                bandera = true;
                listaPersonas.get(i).getCantidadVentas();
                contador = contador + 1;
            }
        }
        if ( bandera==true){   
            
            System.out.println("ventas de la persona "+nombrePersonal+" son:");
            for( int i = 0; i < contador; i++){
                System.out.println("saldo total de carros vendidos: "+listaPersonas.get(i).getCantidadVentas());
            }  
        }else{
            System.out.println("La persona: "+nombrePersonal+ " no se ha encontrado");
        }
    }
    
    //Opciones menu de concesionario
    public void modificarNombreConcesionario(String nombreNuevo){
        System.out.println("El nombre del concesionario actual es"+getNombreConcesionario());
        System.out.println("El nombre cambiara a :"+nombreNuevo);
        setNombreConcesionario(nombreNuevo);
    }
    public void modificarNombreGerenteGerente(String nombreNuevo){
        gerente.setNombreGerente(nombreNuevo);
        System.out.println("La gerencia pasara a manos de "+nombreNuevo);
    }
    
    //opciones Extras
    public void agregarNombreConcesionario (String nuevoNombre){
        setNombreConcesionario(nuevoNombre);
    }
    public void agregarNombreGerente(String nuevoNombre){
        gerente.setNombreGerente(nuevoNombre);
    }
    public void imprimirPersonal(){
        int pos;
        System.out.println("El personal Actual es:");
        for( int i = 0; i < listaPersonas.size(); i++){
            PersonalVentas ventas = listaPersonas.get(i);
            pos = i + 1;
            System.out.println(+pos+"->: "+ventas.getNombrePersonal());
        }
    }
    public void imprimirConcesionarioGerente(){
        System.out.println("*********************************");
        System.out.println("Concesionario: "+getNombreConcesionario());
        System.out.println("Gerencia es de: "+gerente.getNombreGerente());
        System.out.println("*********************************");
    }
    public void imprimirCarro(){
        int pos;
        System.out.println("   Listado de Carros en:\n"+getNombreConcesionario());
        System.out.println("----------------------------------");
        for( int i = 0; i < listaCarro.size(); i++){
            Carro carro = listaCarro.get(i); 
            pos =i;
            System.out.println((pos+1)+"-> Marca: " + carro.getMarca()+" con un precio de: "+carro.getPrecio());
        }
    }
}