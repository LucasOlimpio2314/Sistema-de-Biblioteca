package biblioteca.controladores;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

import biblioteca.modelos.Livros;

public class InformacoesLivro {
	
	private ArrayList<Livros> listaLivros = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public void cadastroDeLivros() {
		try {
			Livros livros = new Livros();
			System.out.println("Informe o nome do livro:");
			livros.setTitulo(scanner.nextLine());
			System.out.println("Informe o nome do autor:");
			livros.setAutor(scanner.nextLine());
			System.out.println("Informe o ano do livro");
			
			String anoStr = scanner.nextLine();
			LocalDate anoDePublicacao = LocalDate.parse(anoStr);
			livros.setAnoDePublicacao(anoDePublicacao);
			
			listaLivros.add(livros);
		} catch (DateTimeParseException e) {
			System.out.println("Formato de data inválido. Por favor, insira no formato AAAA-MM-DD.");
		}catch (NullPointerException e) {
			System.out.println("erro: valor invalido");
		}
	}
	
	public void carregarLivros() {
		
		for(int i = 0 ; i < listaLivros.size(); i++) {
			Livros livroAtual = listaLivros.get(i);
			
			System.out.println("Livro");
			System.out.println(
					"id: " + i
					+" Titulo: " + livroAtual.getTitulo()
					+" Autor: " + livroAtual.getAutor()
					+" Data: " + livroAtual.getAnoDePublicacao());
					
		}
	}
	
	public void removerLivro(int posicao) {
		if (posicao >= 0 && posicao < listaLivros.size()) {
			listaLivros.remove(posicao);
		}
	}
	
	public void atualizarLivro(int posicao) {
		if (posicao >= 0 && posicao < listaLivros.size()) {
			try {
				Livros livroAtua = listaLivros.get(posicao);
				System.out.println("Informe o nome do livro:");
				livroAtua.setTitulo(scanner.nextLine());
				System.out.println("Informe o nome do autor:");
				livroAtua.setAutor(scanner.nextLine());
				System.out.println("Informe o ano do livro:");
				
				String anoStr = scanner.nextLine();
				LocalDate anoDePublicacao = LocalDate.parse(anoStr);
				livroAtua.setAnoDePublicacao(anoDePublicacao);
				
			} catch (DateTimeParseException e) {
				System.out.println("Formato de data inválido. Por favor, insira no formato AAAA-MM-DD.");
			}catch (NullPointerException e) {
				System.out.println("erro: valor invalido");
			}
		}
	}
	
	public ArrayList<Livros> getListaLivros() {
		return listaLivros;
	}
}
