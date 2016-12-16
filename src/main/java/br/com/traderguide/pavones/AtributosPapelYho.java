package br.com.traderguide.pavones;

public enum AtributosPapelYho {

	COTACAO("class", "Fw(b) Fz(36px) Mb(-4px)", "Cotação"), 
	FECHAMENTO_ANTERIOR("data-test", "PREV_CLOSE-value", "Fechamento Anterior");

	private final String chave;
	private final String valor;
	private final String label;

	private AtributosPapelYho(String chave, String valor, String label) {
		this.chave = chave;
		this.valor = valor;
		this.label = label;
	}

	public String getChave() {
		return chave;
	}
	
	public String getValor() {
		return valor;
	}
	
	public String getLabel() {
		return label;
	}

}
