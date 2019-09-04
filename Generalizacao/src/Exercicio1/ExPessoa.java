package Exercicio1;

public class ExPessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Fulano","Rua tal");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Rodrigo","Rua XYZ");
		pf.setCpf("000.111.222-33");
		pf.setEstadoCivil("Casado");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Zé","Casa do lado do vizinho");
		pj.setCnpj("541343432222");
		pj.setTipoEmpresa("Império");
		System.out.println(pj);
	}

}
