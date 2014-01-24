package controller;

import java.util.List;

import model.ConfInicial;
import model.Administrador;
import model.Cliente;

public class LoginBusiness {

	public LoginBusiness() {
		super();
	}

	public String Login(String login, String senha) {

		ConfInicial ci = new ConfInicial();
		ci.configura();
		String logado = "deslogado";
		List<Administrador> adms = ci.getAdministradores();
		List<Cliente> clientes = ci.getClientes();
		
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
}
