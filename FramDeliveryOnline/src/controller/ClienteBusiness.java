package controller;

import java.util.List;
import model.Cliente;
import model.ConfInicial;

public class ClienteBusiness {

	public ClienteBusiness() {
		super();
	}
	
	public boolean Cadastra(String nome, String cpf,String dtNasc, String email,String login, String senha,String endereco, String cidade,String estado, String cep) {

		BaseDados bd = new BaseDados();
		bd.configura();
		boolean cadastro = false;
		List<Cliente> clientes = bd.getClientes();
		
		Cliente c = new Cliente("", nome, cpf, dtNasc, endereco, cidade, estado, cep, email, login, senha);
		
		if(c != null){
			clientes.add(c);
			cadastro = true;
		}
		
		return cadastro;
	}
	
}
