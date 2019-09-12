package homebanking;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author fredeam
 */
public class Cliente {

    private String nome;

    private String sobrenome;

    private String endereco;

    private String telefone;

    private List<Conta> contas;

    private Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", endereco=" + endereco + ", telefone=" + telefone + "}";
    }

    public static class Builder {

        public String nome;

        public String sobrenome;

        public String endereco;

        public String telefone;

        public List<Conta> contas;

        public Builder() {
        }

        public Builder set(Consumer<Builder> consumer) {
            consumer.accept(this);
            return this;
        }

        public Cliente build() {

            Cliente cliente = new Cliente();
            cliente.setContas(contas);
            cliente.setEndereco(endereco);
            cliente.setNome(nome);
            cliente.setSobrenome(sobrenome);
            cliente.setTelefone(telefone);

            return cliente;

        }

    }

}
