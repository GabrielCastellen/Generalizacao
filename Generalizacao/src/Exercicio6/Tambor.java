package Exercicio6;

public class Tambor extends Percussao {
	
	private String material;
	private String formato;
	
	public Tambor(float preco,String metodoDeExecucao,String elementoProdutorDeSom) {
		super(preco,metodoDeExecucao,elementoProdutorDeSom);
	}
	public Tambor(float preco,String metodoDeExecucao,String elementoProdutorDeSom,String material,String formato) {
		super(preco,metodoDeExecucao,elementoProdutorDeSom);
		setMaterial(material);
		setFormato(formato);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tambor [material=");
		builder.append(material);
		builder.append(", formato=");
		builder.append(formato);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
