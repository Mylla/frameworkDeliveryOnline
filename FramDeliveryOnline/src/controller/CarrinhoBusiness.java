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

	BaseDados bd = BaseDados.getInstancia();
	
	public CarrinhoBusiness() {
		super();
	}
	
	public Carrinho criaCarrinho(Cliente cliente,ItemProduto item) {

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
		}else{//sen�o cria o carrinho
			ArrayList<ItemProduto> listaProdutos = new ArrayList<ItemProduto>();
			listaProdutos.add(item);
			c = new Carrinho(listaProdutos, cliente, dateFormat.format(date), calendar.getTime().toString());
		}
		
		this.mudarStatus(cliente);
		
		return c;
	}
	
	public Carrinho getCarrinho(Cliente cliente) {
		
		Carrinho carrinho = null;
		List<Carrinho> carrinhos = bd.getCarrinhos();
		
		for (int i = 0; i < carrinhos.size(); i++) {
			if(carrinhos.get(i).getCliente().equals(cliente)){
				carrinho = carrinhos.get(i);
			}
		}
		
		return carrinho;
	}
	
	public void mudarStatus(Cliente cliente) {
		
		List<Carrinho> carrinhos = bd.getCarrinhos();
		List<Carrinho> cars = new ArrayList<Carrinho>();
		
		for (int i = 0; i < carrinhos.size(); i++) {
			if(carrinhos.get(i).getCliente().getLogin().equals(cliente.getLogin())){
				cars.add(carrinhos.get(i));
			}
		}
		
		if(cars.size() > 5){
			cliente.mudarStatusMaster();
		}
	}
}
