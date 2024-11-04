package biblioteca.modelos;

import java.time.LocalDate;

public class Livros {
	private String titulo;
	private String autor;
	private LocalDate anoDePublicacao;
	private boolean status = true;
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public LocalDate getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setAnoDePublicacao(LocalDate anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	
	
}
