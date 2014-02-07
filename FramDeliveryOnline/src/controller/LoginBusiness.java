package controller;

import java.util.List;
import model.BaseDados;
import model.Administrador;
import model.Cliente;

public class LoginBusiness {

	public LoginBusiness() {
		super();
	}

	public String Login(String login, String senha) {

		BaseDados bd = new BaseDados();
		bd.configura();
		String logado = "deslogado";
		List<Administrador> adms = bd.getAdministradores();
		List<Cliente> clientes = bd.getClientes();
		
		for(int i=0; i < adms.size();i++)
		{
			if (adms.get(i).getLogin().equals(login) && adms.get(i).getSenha().equals(senha)) {
				logado = "adm";
			}
		}
		
		for(int i=0; i < clientes.size();i++)
		{
			if (clientes.get(i).getLogin().equals(login) && clientes.get(i).getSenha().equals(senha)) {
				logado = "cliente";
			}
		}
		
		return logado;
	}
	
	public Cliente getCliente(String login,String senha){
		
		BaseDados bd = new BaseDados();
		bd.configura();
		List<Cliente> clientes = bd.getClientes();
		Cliente cliente = null;
		
		for(int i=0; i < clientes.size();i++)
		{
			if (clientes.get(i).getLogin().equals(login) && clientes.get(i).getSenha().equals(senha)) {
				cliente = clientes.get(i);
			}
		}
		
		return cliente;
	}
}
