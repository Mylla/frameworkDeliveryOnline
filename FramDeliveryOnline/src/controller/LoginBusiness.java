package controller;

import java.util.List;
import model.BaseDados;
import model.Administrador;
import model.Cliente;

public class LoginBusiness {

	private BaseDados bd = BaseDados.getInstancia();
	private List<Administrador> adms = bd.getAdministradores();
	private List<Cliente> clientes = bd.getClientes();
	
	public LoginBusiness() {
		super();
	}

	public String Login(String login, String senha) {

		String logado = "deslogado";
		
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
