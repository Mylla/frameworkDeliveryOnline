package controller;

import java.util.ArrayList;
import java.util.List;

import model.BaseDados;

public class LojaBusiness {

	public LojaBusiness() {
		super();
	}
	
	public boolean cadastra(String codigo, String logotipo,String nome,String tipo,String endereco,String bairro,
			String cep,String estado,String cidade,String telefone,String cnpj,String responsavel,String email,
			ArrayList <String> areasEntrega,String site) {

		BaseDados bd = new BaseDados();
		bd.configura();
		boolean cadastro = false;

		return cadastro;
	}
}
