package ui;

import core.CartaoCashBack;
import core.CartaoPrePago;

public class TestaCartao {
	public static void main(String args[]) {

		double credito;
		double debito;

		CartaoPrePago cartao = new CartaoPrePago("12345", "Paulo", 2030, 8, 2000.0);

		System.out.println(cartao.getNumeroCartao() + " " + cartao.getNomeTitular() + " " + cartao.getAnoValidade()
				+ " " + cartao.getMesValidade() + " " + cartao.getSaldo());

		debito = 500.0;
		boolean resul = cartao.comprar(debito);

		if (resul == true) {
			System.out.println("Compra efetuada com sucesso");
			System.out.println("Valor compra: " + debito + " Saldo: " + cartao.getSaldo());
		} else {
			System.out.println(
					"Saldo insuficiente para compra. Valor compra: " + debito + " Saldo: " + cartao.getSaldo());
		}
		System.out.println();

		CartaoCashBack cartao2 = new CartaoCashBack("67890", "Paulo", 2029, 8, 2000.0, 3);

		System.out.println(cartao2.getNumeroCartao() + " " + cartao2.getNomeTitular() + " " + cartao2.getAnoValidade()
				+ " " + cartao2.getMesValidade() + " " + cartao2.getSaldo() + " " + cartao2.getTipo());

		debito = 500.0;
		boolean resul2 = cartao2.comprar(debito);
		
		if (resul2 == true) {
			System.out.println("Compra efetuada com sucesso");
			System.out.println("Valor compara: "+debito+" Saldo: "+cartao2.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para compra. Valor compra: "+debito+" Saldo: "+cartao2.getSaldo());
		}
		System.out.println();
	}
}
