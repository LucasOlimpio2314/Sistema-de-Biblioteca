package biblioteca.util;

public class FormatadorCpfECnpj {
	
	public static String formatoCpf(String cpf) {
		cpf = cpf.replace("[^0-9]", "");
		if (cpf.length() != 11) {
			return cpf;
		}
		return cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9);
	}
	
	public static String formatoCnpj(String cnpj) {
		cnpj = cnpj.replace("[^0-9]", "");
		if (cnpj.length() != 14) {
			return cnpj;
		}
		return cnpj.substring(0,2) + "." + cnpj.substring(2,5) + "." + cnpj.substring(5,8) + "/" + cnpj.substring(8,12) + "-" + cnpj.substring(12);
	}
}
