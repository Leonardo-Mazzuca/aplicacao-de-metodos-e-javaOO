package metodos;

public class Fatura {

	private String numero;
	private String descricao;
	private int quantidadeComparada;
	private double preco;
	
	
	//Construtor
	public Fatura(String numero, String desc, int quant, double preco) {
		this.numero = numero;
        this.descricao = desc;
        this.quantidadeComparada = quant;
        this.preco = preco;
	}
	
	
	
	
	
	
	//Getters e Setters
	
	
	public double getTotalFatura() {
		 if (this.preco * this.quantidadeComparada < 0) {
			 return 0;
		 } else if (this.preco < 0) {
			 return 0;
		 } else {
			 return this.preco * this.quantidadeComparada;
		 }
	}
	
	
	public void setNumero(String numero) {
		this.numero = numero;
		
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setDescricao(String desc) {
		this.descricao = desc;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setQuantidade(int quant) {
		this.quantidadeComparada = quant;
		
	}
	
	public int getQuantidade() {
		return this.quantidadeComparada;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return this.preco;
	}
		
	
}



class testaFatura{
	public static void main(String args[]) {
		
		
		
		Fatura f = new Fatura("1224", "CPU", 7, 900.0);
		
		System.out.println(f.getDescricao());
		System.out.println(f.getTotalFatura());
		
		
	
	}
}


