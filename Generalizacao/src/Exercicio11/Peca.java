package Exercicio11;

public class Peca {
	
	private int linha;
	private int coluna;
	private boolean cor;
	private int movimentos;
	
	public Peca() {
		
	}
	public Peca(int linha,int coluna,boolean cor,int movimentos) {
		setLinha(linha);
		setColuna(coluna);
		setCor(cor);
		setMovimentos(movimentos);
	}
	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		if(linha >= 1 && linha <=8)
			this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		if(coluna >= 1 && coluna <=8)
			this.coluna = coluna;
	}
	public boolean isCor() {
		return cor;
	}
	public void setCor(boolean cor) {
		this.cor = cor;
	}
	public int getMovimentos() {
		return movimentos;
	}
	public void setMovimentos(int movimentos) {
		if(movimentos >= 0)
			this.movimentos = movimentos;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peca [linha=");
		builder.append(linha);
		builder.append(", coluna=");
		builder.append(coluna);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", movimentos=");
		builder.append(movimentos);
		builder.append("]");
		return builder.toString();
	}
	
	
}
