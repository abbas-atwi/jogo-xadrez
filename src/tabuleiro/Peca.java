package tabuleiro;

public class Peca {
	protected Posicao posicao;
	
	private Tabuleiro tabulerio;

	public Peca(Tabuleiro tabulerio) {
		this.tabulerio = tabulerio;
		posicao = null;
	}

	protected Tabuleiro getTabulerio() {
		return tabulerio;
	}

	
	
}
