package controller;

import java.util.List;

import model.FormaEntrega;
import model.ConfInicial;
import model.Motoboy;

public class FormaEntregaBusiness {
	
	public FormaEntregaBusiness() {
		super();
	}
	
	public boolean Cadastra(String codigo, String nome,String descricao, String tipo, String campoExtra) {

		ConfInicial ci = new ConfInicial();
		ci.configura();
		boolean cadastro = false;
		List<FormaEntrega> fes = ci.getFormasEntrega();
		
		FormaEntrega fe = new Motoboy(codigo,nome,descricao,tipo, campoExtra);
		
		if(fe != null){
			fes.add(fe);
			cadastro = true;
		}
		
		return cadastro;
	}

}
