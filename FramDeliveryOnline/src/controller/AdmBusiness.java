package controller;

import java.util.List;

import model.Administrador;
import model.BaseDados;

public class AdmBusiness {

	BaseDados bd = BaseDados.getInstancia();
	
	public AdmBusiness() {
		super();
	}
	
	public boolean Cadastra(String imagem, String nome, String cpf,String dtNasc, String email,String login, String senha,String endereco, String cidade,String estado, String cep,String delivery) {

		boolean cadastro = false;
		List<Administrador> adms = bd.getAdministradores();
		
		Administrador adm = new Administrador("WebContent/images/cliente.png", nome, cpf, dtNasc, endereco, cidade, estado, cep, email, login, senha, delivery);
		
		if(adm != null){
			adms.add(adm);
			cadastro = true;
		}
		
		return cadastro;
	}
}
