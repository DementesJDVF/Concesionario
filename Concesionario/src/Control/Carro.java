
package Control;

/**
 *
 * @author HOME
 */
public class Carro {
    private String marca;
    private double precio;

    public Carro() {
    }

    public Carro(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
