package homebanking;

import java.util.List;

/**
 *
 * @author fredeam
 */
public abstract class Conta {

    private String id;

    private double saldo;

    private Cliente cliente;

    private List<Movimentacao> movimetacoes;

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
