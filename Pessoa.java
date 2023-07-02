package metodos;

public class Pessoa {
	
	public String dizerInformacao(String nome) {
		return("Meu nome é " + nome);
	}
	
	public String dizerInformacao(int idade) {
		return("Minha idade é " + idade);
	}
	
	public String dizerInformacao(double peso, double altura) {
		return("Meu peso é " + peso + ", e minha altura é " + altura + "m.");
	}

}

class testaPessoa{
	public static void main(String[] args) {
		
		String nome = "Leonardo";
		int idade = 17;
		double peso = 70, altura = 1.80;
		
		Pessoa p = new Pessoa();
		
		
		
		System.out.println(p.dizerInformacao(nome));
		System.out.println(p.dizerInformacao(idade));
		System.out.println(p.dizerInformacao(peso, altura));
		
	}
}
