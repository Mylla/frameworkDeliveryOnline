package controller;

import java.util.List;
import model.Cliente;
import model.BaseDados;

public class ClienteBusiness {

	public ClienteBusiness() {
		super();
	}
	
	public boolean Cadastra(String imagem,String nome, String cpf,String dtNasc, String email,String login, String senha,String endereco, String cidade,String estado, String cep) {

		final BaseDados bd = BaseDados.getInstancia();		
		bd.configura();
		boolean cadastro = false;
		List<Cliente> clientes = bd.getClientes();
		
		Cliente c = new Cliente(imagem, nome, cpf, dtNasc, endereco, cidade, estado, cep, email, login, senha,"");
		
		if(c != null){
			clientes.add(c);
			cadastro = true;
		}
		
		return cadastro;
	}
	
	public Cliente getCliente(String login){
		
		BaseDados bd = BaseDados.getInstancia();
		bd.configura();
		List<Cliente> clientes = bd.getClientes();
		Cliente c = null;
		
		for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getLogin().equals(login)){
				c = clientes.get(i);
			}
		}
		
		return c;
		
	}
	
}
