package Exercicio2;

public class MostraItem {

	public static void main(String[] args) {
		Item it = new Item(002,"blabla");
		System.out.println(it);
		
		Livro lv = new Livro(015,"desc","fulano");
		System.out.println(lv);
	
		Midia mid = new Midia(122,"legal","dora",(float)5.46);
		System.out.println(mid);
		
		CD cd1 = new CD(235,"descriçao legal","CD Records",(float)45.32,3,"Gustavo Santana","Meteoro de pegasus");
		System.out.println(cd1);
		
		VHS vhs1 = new VHS(123,"velho","VHS Records",(float)25.59,"Um titulo Qualquer");
		System.out.println(vhs1);
	}

}
