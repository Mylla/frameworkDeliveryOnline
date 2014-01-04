package controller;

import model.*;

public class LoginBusiness {

	private Cliente cliente;
	private Administrador administrador;

	public LoginBusiness(Cliente cliente) {

		this.cliente = cliente;
	}

	public LoginBusiness(Administrador administrador) {

		this.administrador = administrador;
	}

	public boolean Login(Cliente cliente) {

		if (cliente.getLogin().equals("cliente") && cliente.getSenha().equals("cliente")) {
			return true;
		}
		return false;
	}

	public boolean Login(Administrador adm) {

		if (adm.getLogin().equals("admin") && adm.getSenha().equals("admin")) {
			return true;
		}
		return false;
	}

}
