package Exercicio11;

public class Peao extends Peca {
	
	public Peao(int linha,int coluna,boolean cor,int movimentos) {
		super(linha,coluna,cor,movimentos);
	}
	
	public boolean mover(int linha,int coluna) {
		if(linha >= 1 && linha <=8 && coluna >= 1 && coluna <=8) {
				if(coluna == getColuna()) {
					if(linha == getLinha()+1 || linha == getLinha()-1) {
						setLinha(linha);
						setColuna(coluna);
						setMovimentos(getMovimentos() +1);
						return true;
					}
					else
						return false;
				}
				else
					return false;
			}
			else
				return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peao [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
