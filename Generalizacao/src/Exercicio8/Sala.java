package Exercicio8;

public class Sala extends Ambiente {
	
	private boolean tv;
	
	public Sala(float area) {
		super(area);
	}
	public Sala(float area,boolean tv) {
		super(area);
		setTv(tv);
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sala [tv=");
		builder.append(tv);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
