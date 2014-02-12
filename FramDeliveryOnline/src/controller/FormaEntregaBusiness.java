package controller;

import java.util.ArrayList;
import java.util.List;

import model.FormaEntrega;
import model.BaseDados;
import model.Motoboy;

public class FormaEntregaBusiness {
	
	BaseDados bd = BaseDados.getInstancia();
	private List<FormaEntrega> busca = new ArrayList<FormaEntrega>();
	
	public FormaEntregaBusiness() {
		super();
	}
	
	public boolean Cadastra(String codigo, String nome,String descricao, String tipo, String campoExtra) {

		boolean cadastro = false;
		List<FormaEntrega> fes = bd.getFormasEntrega();
		
		FormaEntrega fe = new Motoboy(codigo,nome,descricao,tipo, campoExtra);
		
		if(fe != null){
			fes.add(fe);
			cadastro = true;
		}
		
		return cadastro;
	}

	public boolean consulta(String codigo, String nome, String tipo) {
	
		boolean consulta = false;
		List<FormaEntrega> formasEntrega = bd.getFormasEntrega();
		
		for (int i = 0; i < formasEntrega.size(); i++) {
			
			FormaEntrega fe = formasEntrega.get(i);
			
			if((fe.getCodigo().equals(codigo)) ||(fe.getNome().equals(nome)) ||(fe.getNome().equals(tipo))){
				
				busca.add(fe);
				consulta = true;
			}
		}
		
		return consulta;
	}

	public List<FormaEntrega> getBusca() {
		
		return busca;
	}

}
