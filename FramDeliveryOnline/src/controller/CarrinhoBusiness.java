package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.Carrinho;
import model.Cliente;
import model.BaseDados;
import model.ItemProduto;

public class CarrinhoBusiness {

	public CarrinhoBusiness() {
		super();
	}
	
	public void criaCarrinho(Cliente cliente,ItemProduto item) {

		BaseDados bd = new BaseDados();
		bd.configura();
		boolean temCarrinho = false;
		List<Carrinho> carrinhos = bd.getCarrinhos();
		Carrinho c = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy");
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		
		for (int i = 0; i < carrinhos.size(); i++) {
			if(carrinhos.get(i).getCliente().equals(cliente)){
				c = carrinhos.get(i);
				temCarrinho = true;
				break;
			}
		}
		
		if(temCarrinho){//se o cliente tiver o carrinho, add item e atualiza data e hora
			c.addItemProduto(item);
			c.setData(dateFormat.format(date));
			c.setHora(calendar.getTime().toString());
		}else{//senão cria o carrinho
			ArrayList<ItemProduto> listaProdutos = new ArrayList<ItemProduto>();
			listaProdutos.add(item);
			c = new Carrinho(listaProdutos, cliente, dateFormat.format(date), calendar.getTime().toString());
		}
	}
	
	public Carrinho getCarrinho(Cliente cliente) {
		
		Carrinho carrinho = null;
		BaseDados bd = new BaseDados();
		bd.configura();
		List<Carrinho> carrinhos = bd.getCarrinhos();
		
		for (int i = 0; i < carrinhos.size(); i++) {
			if(carrinhos.get(i).getCliente().equals(cliente)){
				carrinho = carrinhos.get(i);
			}
		}
		
		return carrinho;
	}
}
