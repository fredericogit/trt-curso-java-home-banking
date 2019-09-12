package homebanking;

/**
 *
 * @author fredeam
 */
public class ContaCorrente extends Conta {

    private double limiteDeCredito = 0;

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

}
