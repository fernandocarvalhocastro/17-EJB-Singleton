package br.com.fiap.bo.impl;

import javax.ejb.Stateful;
import br.com.fiap.bo.CarrinhoBO;

@Stateful
public class CarrinhoBOImpl implements CarrinhoBO {

	private double total;
	
	@Override
	public double adicionarBitcoin(double bitcoin) {
		return total += bitcoin;
	}
	
}
