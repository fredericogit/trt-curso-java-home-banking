package homebanking;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author fredeam
 */
public abstract class Conta {

    private final String id;

    private double saldo;

    private final Cliente cliente;

    private List<Movimentacao> movimetacoes;

    public Conta(Cliente cliente) {
        this.id = UUID.randomUUID().toString();
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Movimentacao> getMovimetacoes() {
        return movimetacoes;
    }

    public void setMovimetacoes(List<Movimentacao> movimetacoes) {
        this.movimetacoes = movimetacoes;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", saldo=" + saldo + ", cliente=" + cliente + ", movimetacoes=" + movimetacoes + "}";
    }

}
