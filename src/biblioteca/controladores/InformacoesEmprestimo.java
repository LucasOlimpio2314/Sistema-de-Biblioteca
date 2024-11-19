package biblioteca.controladores;

import java.util.ArrayList;
import java.util.Scanner;

import biblioteca.modelos.Emprestimo;

public class InformacoesEmprestimo {
	
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
	private InformacoesLeitores iLeitores = new InformacoesLeitores();
	private InformacoesLivro iLivro = new InformacoesLivro();
	
	public void cadastroDeEmprestimo() {
		
		try {
			
			Emprestimo emprestimo = new Emprestimo();
			
			System.out.println("cadastro de Leitor:");
			iLeitores.cadastroDeLeitor();
			
			System.out.println("\nLista de Leitores");
			iLeitores.carregarLeitores();
			
			
			System.out.println("\nInforme o id do Leitor:");
			int idLeitor = scanner.nextInt();
			scanner.nextLine();
			
			if (idLeitor >= 0 && idLeitor < iLeitores.getArrayListLeitores().size()) {
				emprestimo.setLeitores(iLeitores.getArrayListLeitores().get(idLeitor));
			}else {
				System.out.println("Id invalido");
				return;
			}
			
			System.out.println("cadastro de Livros:");
			iLivro.cadastroDeLivros();
			
			System.out.println("\nLista de Livros:");
			iLivro.carregarLivros();
			
			System.out.println("\nInforme o id do Livro:");
			int idLivro = scanner.nextInt();
			scanner.nextLine();
			
			if (idLivro >= 0 && idLivro < iLivro.getListaLivros().size()) {
				emprestimo.setLivros(iLivro.getListaLivros().get(idLivro));;
			}else {
				System.out.println("Id invalido");
				return;
			}
			
			emprestimos.add(emprestimo);
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar empréstimo: " + e.getMessage());
		}
		
	}
	
	
	public void listarEmprestimo() {
		if (emprestimos.isEmpty()) {
			System.out.println("Não há emprestimos cadastrados");
			return;
		}
		
		System.out.println("\n=== Lista de Emprestimos ===");
		for (int i = 0; i < emprestimos.size(); i++) {
			Emprestimo emprestimo = emprestimos.get(i);
			System.out.println(
					"id: " + i +
					" Nome do Leitor: " + emprestimo.getNome(i)+ 
					" Documento: " + emprestimo.getIdentidade() + 
					" Livro: " + emprestimo.getTituloLivro());
			
		}
	}
	
	public void removerEmprestimo(int posicao) {
		if (posicao >= 0 && posicao < emprestimos.size()) {
			emprestimos.remove(posicao);
			System.out.println("Emprestimo Removido");
		}else {
			System.out.println("Erro");
		}
	}
}
