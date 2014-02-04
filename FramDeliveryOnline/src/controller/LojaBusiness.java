package controller;

import java.util.ArrayList;
import java.util.List;
import model.BaseDados;
import model.Loja;

public class LojaBusiness {

	private BaseDados bd = new BaseDados();
	
	public LojaBusiness() {
		super();
	}
	
	public boolean cadastra(String codigo, String logotipo,String nome,String tipo,String endereco,String bairro,
			String cep,String estado,String cidade,String telefone,String cnpj,String responsavel,String email,
			ArrayList<String> areasEntrega,String site) {

		bd.configura();
		boolean cadastro = false;
		
		List<Loja> lojas = bd.getLojas();
		
		Loja l = new Loja(codigo,logotipo,nome,tipo,endereco,bairro,cep,estado,cidade,telefone,cnpj,responsavel,email,areasEntrega,site);
				
		if(l != null){
			lojas.add(l);
			cadastro = true;
		}

		return cadastro;
	}
}
