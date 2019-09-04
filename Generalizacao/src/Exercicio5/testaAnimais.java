package Exercicio5;

public class testaAnimais {

	public static void main(String[] args) {
		Animal a = new Animal(true);
		System.out.println(a);
		Mamifero mam = new Mamifero(true,2,"M");
		System.out.println(mam);
		Gato g = new Gato(true,2,"M","siames","marrom");
		System.out.println(g);	
		Cao c = new Cao(true,8,"F","pincher","pequeno");
		System.out.println(c);
		Reptil rep = new Reptil(true,"Agua Salgada","M");
		System.out.println(rep);
		Tartaruga donatello = new Tartaruga(true,"Esgoto","M","verde","Corcunda do Mississípi");
		System.out.println(donatello);
		Lagarto lag = new Lagarto(true,"Deserto","F","Calango",5);
		System.out.println(lag);
	}

}
