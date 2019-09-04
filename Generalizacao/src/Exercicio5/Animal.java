package Exercicio5;

public class Animal {
	
	private boolean temVida;
	
	public Animal() {
		
	}
	public Animal(boolean temVida) {
		setTemVida(temVida);
	}

	public boolean isTemVida() {
		return temVida;
	}

	public void setTemVida(boolean temVida) {
		this.temVida = temVida;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [temVida=");
		builder.append(temVida);
		builder.append("]");
		return builder.toString();
	}
	
	

}
