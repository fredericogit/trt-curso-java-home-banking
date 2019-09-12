package homebanking;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fredeam
 */
public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        List<Conta> contas = new ArrayList<>();
        contas.add(new ContaCorrente());
        contas.add(new ContaInvestimento());
        cliente.setContas(contas);

    }

}
