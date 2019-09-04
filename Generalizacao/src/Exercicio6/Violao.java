package Exercicio6;

public class Violao extends Cordas {
	
	private String materialCorda;
	private String madeira;
	
	public Violao(float preco,int quantCordas) {
		super(preco,quantCordas);
	}
	public Violao(float preco,int quantCordas,String materialCorda,String madeira) {
		super(preco,quantCordas);
		setMaterialCorda(materialCorda);
		setMadeira(madeira);
	}

	public String getMaterialCorda() {
		return materialCorda;
	}

	public void setMaterialCorda(String materialCorda) {
		if(materialCorda == "nylon" || materialCorda == "aço")
			this.materialCorda = materialCorda;
	}

	public String getMadeira() {
		return madeira;
	}

	public void setMadeira(String madeira) {
		this.madeira = madeira;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Violao [materialCorda=");
		builder.append(materialCorda);
		builder.append(", madeira=");
		builder.append(madeira);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
