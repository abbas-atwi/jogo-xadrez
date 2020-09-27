package application;

import java.util.Locale;

import tabuleiro.Posicao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Posicao pos = new Posicao(3, 5);
		System.out.println(pos);

	}

}
