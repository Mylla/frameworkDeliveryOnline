package controller;

import java.util.List;

import model.ConfInicial;
import model.Administrador;
import model.Cliente;

public class LoginBusiness {

	public LoginBusiness() {
		super();
	}

	public boolean Login(String login, String senha) {

		ConfInicial ci = new ConfInicial();
		ci.configura();
		boolean logado = false;
		List<Administrador> adm = ci.getAdministradores();
		List<Cliente> cliente = ci.getClientes();
		
		for(int i=0; i < adm.size();i++)
		{
			if (adm.get(i).getLogin().equals(login) && adm.get(i).getSenha().equals(senha)) {
				logado = true;
			}
		}
		
		for(int i=0; i < cliente.size();i++)
		{
			if (cliente.get(i).getLogin().equals(login) && cliente.get(i).getSenha().equals(senha)) {
				logado = true;
			}
		}
		
		return logado;
	}
}
