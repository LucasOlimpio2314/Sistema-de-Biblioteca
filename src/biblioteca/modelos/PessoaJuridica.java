package biblioteca.modelos;

public class PessoaJuridica extends Leitores {
	private String cnpg;
	
	public String getCnpg() {
		return cnpg;
	}
	@Override
	public String getNomeCompleto() {
		return super.getNomeCompleto();
	}
	
	public void setCnpg(String cnpg) {
		this.cnpg = cnpg;
	}
	@Override
	public void setNomeCompleto(String nomeCompleto) {
		super.setNomeCompleto(nomeCompleto);
	}
}
