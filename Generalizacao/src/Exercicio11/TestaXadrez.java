package Exercicio11;

public class TestaXadrez {

	public static void main(String[] args) {
		Peao p = new Peao(2,3,true,0);
		System.out.println(p);
		if(p.mover(3,3))
			System.out.println("Pode mover o peão");
		System.out.println(p);
		
		Torre t = new Torre(1,1,true,0);
		System.out.println(t);
		if(t.mover(8, 1))
			System.out.println("Pode mover a torre");
		System.out.println(t);
	}

}
