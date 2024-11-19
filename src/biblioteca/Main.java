package biblioteca;

import biblioteca.controladores.InformacoesEmprestimo;
import biblioteca.controladores.InformacoesLeitores;
import biblioteca.controladores.InformacoesLivro;
//import biblioteca.controladores.InformacoesLivro;

public class Main {

	public static void main(String[] args) {
		InformacoesLivro iLivro = new InformacoesLivro();
		InformacoesLeitores iLeitores = new InformacoesLeitores();
		InformacoesEmprestimo iEmprestimo = new InformacoesEmprestimo();
		
		iEmprestimo.cadastroDeEmprestimo();
		iEmprestimo.listarEmprestimo();
	}
		

}
