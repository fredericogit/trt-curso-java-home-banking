package homebanking;

/**
 *
 * @author fredeam
 */
public class ContaInvestimento extends Conta {

    private final TipoDeAplicacao tipoDeAplicacao;

    public ContaInvestimento(TipoDeAplicacao tipoDeAplicacao, Cliente cliente) {
        super(cliente);
        this.tipoDeAplicacao = tipoDeAplicacao;
    }

    public TipoDeAplicacao getTipoDeAplicacao() {
        return tipoDeAplicacao;
    }

}
