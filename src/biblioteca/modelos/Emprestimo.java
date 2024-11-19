package biblioteca.modelos;

public class Emprestimo {
	
	private Leitores leitores;
	private Livros livros;
	
	public void setLeitores(Leitores leitores) {
		this.leitores = leitores;
	}
	
	public void setLivros(Livros livros) {
		this.livros = livros;
	}
	
	public String getNome(int posicao) {
		return leitores.getNomeCompleto();
	}
	
	public String getIdentidade() {
		if (leitores instanceof PessoaFisica ) {
			PessoaFisica pFisica = (PessoaFisica) leitores;
			return pFisica.getCpf();
			
		}else if (leitores instanceof PessoaJuridica) {
			PessoaJuridica pJuridica = (PessoaJuridica) leitores;
			return pJuridica.getCnpg();
		}
		return "erro";
	}
	
	public String getTituloLivro() {
		return livros.getTitulo();
	}
}
