
package Control;

/**
 *
 * @author HOME
 */
public class PersonalVentas {
    private String nombrePersonal;
    private double cantidadVentas;

    public PersonalVentas() {
    }

    public PersonalVentas(String nombrePersonal, double cantidadVentas) {
        this.nombrePersonal = nombrePersonal;
        this.cantidadVentas = cantidadVentas;
    }

    public String getNombrePersonal() {
        return nombrePersonal;
    }

    public void setNombrePersonal(String nombrePersonal) {
        this.nombrePersonal = nombrePersonal;
    }

    public double getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(double cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }
    
}
