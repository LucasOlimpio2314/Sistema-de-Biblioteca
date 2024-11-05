package biblioteca;

import biblioteca.controladores.InformacoesLeitores;
//import biblioteca.controladores.InformacoesLivro;

public class Main {

	public static void main(String[] args) {
		//InformacoesLivro iLivro = new InformacoesLivro();
		InformacoesLeitores iLeitores = new InformacoesLeitores();
		
		iLeitores.cadastroDeLeitor();
		iLeitores.carregarLeitores();
		iLeitores.atualizarLeitor(0);
		iLeitores.carregarLeitores();
	}
		

}
