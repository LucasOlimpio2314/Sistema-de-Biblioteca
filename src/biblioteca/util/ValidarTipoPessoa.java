package biblioteca.util;

import biblioteca.exceptions.TipoPessoaInvalidoException;

public class ValidarTipoPessoa {
	public static void validarTipoPessoa(int tipo) throws TipoPessoaInvalidoException {
		if (tipo < 0 || tipo > 1) {
			throw new TipoPessoaInvalidoException("Tipo de pessoa inválido! Digite 0 para Pessoa Física ou 1 para Pessoa Jurídica.");
		}
	}
}
