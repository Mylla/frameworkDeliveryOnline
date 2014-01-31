package controller;

//import java.util.List;
import model.BaseDados;
//import model.Produto;

public class ProdutoBusiness {

	public ProdutoBusiness() {
		super();
	}
	
	public boolean cadastra(String observers,String codigo,String nomeLoja,String imagem,String nome,String tipo,String descricao,int qtdEstoque,double preco,double desconto,double peso) {

		BaseDados bd = new BaseDados();
		bd.configura();
		boolean cadastro = false;
		//List<Produto> produtos = ci.getProdutos();
		
		//Administrador adm = new Administrador("", nome, cpf, dtNasc, endereco, cidade, estado, cep, email, login, senha, delivery);
		
//		if(adm != null){
//			adms.add(adm);
//			cadastro = true;
//		}
		
		return cadastro;
	}
}
