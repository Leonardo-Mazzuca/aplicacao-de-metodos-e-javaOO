package metodos;

public class Empregado {
	
	private String nome;
	private String sobrenome;
	private double salario;
	
	public Empregado(String nome, String sobrenome, double salario){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
		System.out.println("Nome: " + this.nome);
		System.out.println("Nome completo: " + this.nome + " " +  this.sobrenome);
		System.out.println("Salario mensal: " + this.salario);
		System.out.println();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}

class testaEmpregado{
	public static void main(String[] args) {
		
		Empregado e = new Empregado("Leonardo", "Mazzuca", 6700.0);
		Empregado e2 = new Empregado("Joao", "Almeida", 7000.0);
		
		e.setSalario(e.getSalario() - (e.getSalario() * 0.9) + e.getSalario());
		e2.setSalario(e2.getSalario() - (e2.getSalario() * 0.9) + e2.getSalario());
		
		System.out.println(e.getSalario());
		System.out.println(e2.getSalario());
		
		
		
		
		
		
	}
}
