package homebanking;

/**
 *
 * @author fredeam
 */
public abstract class Conta {

    private String id;

    private double saldo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
