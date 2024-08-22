import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void addConta(Conta conta) {
		this.contas.add(conta);
	}

	public Set<Cliente> getClientes() {
		Set<Cliente> clientes = new HashSet<>();

		contas.stream().forEach(c -> clientes.add(c.cliente));

		return clientes;
	}
}
