package Exercicio6;

public class Madeiras extends InstrumentoMusical {
	
	private String material;
	
	public Madeiras(float preco) {
		super(preco);
	}
	public Madeiras(float preco,String material) {
		super(preco);
		setMaterial(material);
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Madeiras [material=");
		builder.append(material);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
