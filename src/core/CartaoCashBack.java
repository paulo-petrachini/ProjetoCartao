package core;

public class CartaoCashBack extends CartaoPrePago {
	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			if (tipo == 1) {
				super.saldo = super.saldo + (0.02 * valor);
			} else if (tipo == 2) {
				super.saldo = super.saldo + (0.05 * valor);
			} else {
				super.saldo = super.saldo + (0.08 * valor);
			}
			return true;
		} else {
			return false;
		}
	}
}
