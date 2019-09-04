package Exercicio7;

public class Aluno extends Pessoa {
	
	private int matricula;
	
	public Aluno(int codigo,String nome,String endereco) {
		super(codigo,nome,endereco);
	}
	public Aluno(int codigo,String nome,String endereco,int matricula) {
		super(codigo,nome,endereco);
		setMatricula(matricula);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		if(matricula > 0)
			this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

}
