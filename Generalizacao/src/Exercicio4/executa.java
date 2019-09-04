package Exercicio4;

public class executa {

	public static void main(String[] args) {
		Veiculo v = new Veiculo(true);
		System.out.println(v);
		
		Caminhao c = new Caminhao(true,3);
		System.out.println(c);
		
		Carro cr = new Carro(false,2);
		System.out.println(cr);
		
		Moto m = new Moto(true,1600);
		System.out.println(m);

	}

}
