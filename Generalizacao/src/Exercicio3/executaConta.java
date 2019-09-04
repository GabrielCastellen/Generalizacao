package Exercicio3;

public class executaConta {

	public static void main(String[] args) {
		Conta c = new Conta("Banco do Brasil",33,547,33000.00);
		System.out.println(c);
		c.deposito(650.12);
		System.out.println(c);
		c.saque(12530);
		System.out.println(c);
		
		ContaSimples cs = new ContaSimples("Banco da Praça", 52, 24156, 9000, 20000);
		System.out.println(cs);
		
		ContaEspecial ce = new ContaEspecial("Banqueta", 14, 5145, 12325.50, 23, 200000);
		System.out.println(ce);
	}

}
