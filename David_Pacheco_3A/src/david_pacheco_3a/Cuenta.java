package david_pacheco_3a;

/**
 *
 * @author DAVID
 */
public abstract class Cuenta {

    private String nombre;
    private String tipoCliente;
    private double balance;
    private double tasaIntere;

    public abstract double calcularItereses(int meses);

    public Cuenta() {
    }

    public Cuenta(String nombre, String tipoCliente, double balance, double tasaIntere) {
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
        this.balance = balance;
        this.tasaIntere = tasaIntere;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTasaIntere() {
        return tasaIntere;
    }

    public void setTasaIntere(double tasaIntere) {
        this.tasaIntere = tasaIntere;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", tipoCliente=" + tipoCliente + ", balance=" + balance + ", tasaIntere=" + tasaIntere + '}';
    }
    

}
