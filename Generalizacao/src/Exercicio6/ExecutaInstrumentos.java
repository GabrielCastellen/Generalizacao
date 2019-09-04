package Exercicio6;

public class ExecutaInstrumentos {

	public static void main(String[] args) {
		Fagote fgt = new Fagote(800,"Madeira","Buffet");
		System.out.println(fgt);
		
		Saxofone sax = new Saxofone(1250,"latão","barítono");
		System.out.println(sax);
		
		Prato prt = new Prato(214,"percussão","idiofones","bateria");
		System.out.println(prt);
		
		Tambor tam = new Tambor((float)99.70,"percussão","membranofones","madeira","cilíndrico");
		System.out.println(tam);
		
		Piano p = new Piano((float)1480.90,88,"vertical");
		System.out.println(p);
		
		Violao v = new Violao((float)322.85,6,"nylon","Cedro Vermelho");
		System.out.println(v);
		
		Tuba tub = new Tuba((float)110.50,"cobre","sousafone");
		System.out.println(tub);
		
		Trompete tromp = new Trompete(699,"latão","picollo");
		System.out.println(tromp);
	}

}
