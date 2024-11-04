package biblioteca.modelos;

public class PessoaFisica extends Leitores {
	private String cpf;
	
	@Override
	public String getNomeCompleto() {
		return super.getNomeCompleto();
	}
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public void setNomeCompleto(String nomeCompleto) {
		super.setNomeCompleto(nomeCompleto);
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
