package controller;

import model.Pessoa;

public class LoginBusiness {
	
	private Pessoa pessoa;
	
	public LoginBusiness (Pessoa pessoa){
		
		this.pessoa = pessoa;
	}
	
	public boolean Login(Pessoa pessoa){
		
		if(pessoa.getLogin().equals("adm") && pessoa.getSenha().equals("adm"))
		{
			return true;
		}
		return false;
	}

}
