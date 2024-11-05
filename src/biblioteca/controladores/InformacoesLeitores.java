package biblioteca.controladores;

import java.util.ArrayList;
import java.util.Scanner;

import biblioteca.exceptions.TipoPessoaInvalidoException;
import biblioteca.modelos.Leitores;
import biblioteca.modelos.Livros;
import biblioteca.modelos.PessoaFisica;
import biblioteca.modelos.PessoaJuridica;
import biblioteca.util.FormatadorCpfECnpj;
import biblioteca.util.ValidarTipoPessoa;

public class InformacoesLeitores {
	
	private ArrayList<Leitores> listaLeitores = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public void cadastroDeLeitor() {
		System.out.println("Informe se é Pessoa Fisica(0) ou Juridica(1)");
		int tipoPessoa = scanner.nextInt();
		scanner.nextLine();
		
		try {
			ValidarTipoPessoa.validarTipoPessoa(tipoPessoa);
			if (tipoPessoa == 0) {
				PessoaFisica peFisica = new PessoaFisica();
				
				System.out.println("Informe o nome:");
				peFisica.setNomeCompleto(scanner.nextLine());
				
				System.out.println("Informe o cpf:");
				String cpfString = scanner.nextLine();
				peFisica.setCpf(FormatadorCpfECnpj.formatoCpf(cpfString));
				
				listaLeitores.add(peFisica);
				System.out.println("Cadastro do leitor feito!");
			}else {
				PessoaJuridica pJuridica = new PessoaJuridica();
				
				System.out.println("Informe o nome:");
				pJuridica.setNomeCompleto(scanner.nextLine());
				
				System.out.println("Informe o cnpj:");
				String cnpjString = scanner.nextLine();
				pJuridica.setCnpg(FormatadorCpfECnpj.formatoCnpj(cnpjString));
				
				listaLeitores.add(pJuridica);
				System.out.println("Cadastro do leitor feito!");
			}
		} catch (TipoPessoaInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public void carregarLeitores() {
		for(int i = 0 ; i < listaLeitores.size(); i++) {
			Leitores leitorAtual = listaLeitores.get(i);
			if (leitorAtual instanceof PessoaFisica) {
				PessoaFisica pFisica = (PessoaFisica) leitorAtual;
				System.out.println(
						"id: " + i
						+ " Nome: " + pFisica.getNomeCompleto()
						+ " Cpf: " + pFisica.getCpf()
						);
			} else if (leitorAtual instanceof PessoaJuridica) {
				PessoaJuridica pJuridica = (PessoaJuridica) leitorAtual;
				System.out.println(
						"id: " + i
						+ " Nome: " + pJuridica.getNomeCompleto()
						+ " Cnpj: " + pJuridica.getCnpg()
						);
			}
		}
	}
	
	public void removerLeitor(int posicao) {
		if (posicao >= 0 && posicao < listaLeitores.size()) {
			listaLeitores.remove(posicao);
		}
	}
	
	public void atualizarLeitor(int posicao) {
		
		if (posicao >= 0 && posicao < listaLeitores.size()) {
			
			Leitores leitorAtual = listaLeitores.get(posicao);
			
			if (leitorAtual instanceof PessoaFisica) {
				PessoaFisica pFisica = (PessoaFisica) leitorAtual;
				
				System.out.println("Informe o nome:");
				pFisica.setNomeCompleto(scanner.nextLine());
				
				System.out.println("Informe o cpf:");
				String cpf = scanner.nextLine();
				pFisica.setCpf(FormatadorCpfECnpj.formatoCpf(cpf));
				
				
			} else if (leitorAtual instanceof PessoaJuridica) {
				PessoaJuridica pJuridica = (PessoaJuridica) leitorAtual;
				
				System.out.println("Informe o nome:");
				pJuridica.setCnpg(scanner.nextLine());
				
				System.out.println("Informe o cnpj:");
				String cnpj = scanner.nextLine();
				pJuridica.setCnpg(FormatadorCpfECnpj.formatoCnpj(cnpj));
			}
		}
			
		}
	
}