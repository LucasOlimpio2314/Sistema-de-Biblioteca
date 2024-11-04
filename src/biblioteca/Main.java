package biblioteca;

import biblioteca.controladores.InformacoesLivro;

public class Main {

	public static void main(String[] args) {
		InformacoesLivro iLivro = new InformacoesLivro();
		
		iLivro.cadastroDeLivros();
		iLivro.cadastroDeLivros();
		iLivro.carregarLivros();
		iLivro.removerLivro(0);
		iLivro.carregarLivros();
	}

}
