package controller;

import java.util.List;

import model.Administrador;
import model.ConfInicial;

public class AdmBusiness {

	public AdmBusiness() {
		super();
	}
	
	public boolean Cadastra(String nome, String cpf,String dtNasc, String email,String login, String senha,String endereco, String cidade,String estado, String cep,String delivery) {

		ConfInicial ci = new ConfInicial();
		ci.configura();
		boolean cadastro = false;
		List<Administrador> adms = ci.getAdministradores();
		
		Administrador adm = new Administrador("", nome, cpf, dtNasc, endereco, cidade, estado, cep, email, login, senha, delivery);
		
		if(adm != null){
			adms.add(adm);
			cadastro = true;
		}
		
		return cadastro;
	}
}
