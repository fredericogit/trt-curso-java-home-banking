package homebanking;

/**
 *
 * @author fredeam
 */
public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente.Builder().set(p -> {
            p.nome = "Frederico";
            p.sobrenome = "Martins";
            p.endereco = "Rua XYZ, 171";
            p.telefone = "(31) 99999-9999";
            //p.contas = "Frederico";
        }).build();

        System.out.println(cliente);
        
//        List<Conta> contas = new ArrayList<>();
//        contas.add(new ContaCorrente());
//        contas.add(new ContaInvestimento());
//        cliente.setContas(contas);

    }

}
