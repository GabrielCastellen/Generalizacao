package Exercicio8;

public class Quarto extends Ambiente {

	private int capacidade;
	
	public Quarto(float area) {
		super(area);
	}
	public Quarto(float area,int capacidade) {
		super(area);
		setCapacidade(capacidade);
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		if(capacidade > 0)
			this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quarto [capacidade=");
		builder.append(capacidade);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
