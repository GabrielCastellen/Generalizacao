package Exercicio6;

public class Percussao extends InstrumentoMusical {
	
	private String metodoDeExecucao;
	private String elementoProdutorDeSom;
	
	public Percussao(float preco) {
		super(preco);
	}
	public Percussao(float preco,String metodoDeExecucao,String elementoProdutorDeSom) {
		super(preco);
		setMetodoDeExecucao(metodoDeExecucao);
		setElementoProdutorDeSom(elementoProdutorDeSom);
	}
	
	public String getMetodoDeExecucao() {
		return metodoDeExecucao;
	}
	public void setMetodoDeExecucao(String metodoDeExecucao) {
		if(metodoDeExecucao == "percussão" || metodoDeExecucao == "agitação" || metodoDeExecucao == "raspagem")
			this.metodoDeExecucao = metodoDeExecucao;
	}
	public String getElementoProdutorDeSom() {
		return elementoProdutorDeSom;
	}
	public void setElementoProdutorDeSom(String elementoProdutorDeSom) {
		if(elementoProdutorDeSom == "idiofones" || elementoProdutorDeSom == "membranofones" || elementoProdutorDeSom == "cordas percutidas")
			this.elementoProdutorDeSom = elementoProdutorDeSom;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Percussao [metodoDeExecucao=");
		builder.append(metodoDeExecucao);
		builder.append(", elementoProdutorDeSom=");
		builder.append(elementoProdutorDeSom);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	

}
