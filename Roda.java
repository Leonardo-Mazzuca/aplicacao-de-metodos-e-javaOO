package metodos;



public class Roda{
	
	public boolean emAndamento;
	
	public void girar() {
		emAndamento = true;
	}
	
	public void parar() {
		emAndamento = false;
	}
	
}


class Bicicleta extends Roda {
	
	public Roda rodaDianteira;
	public Roda rodaTraseira;
	
	public void andar() {
		this.rodaTraseira.girar();
		
	}
	public void frear() {
		this.rodaDianteira.parar();
		
	}
	
	
}

class testaBicicleta{
	

	public static void main(String[] args) {
		
		Bicicleta b = new Bicicleta();
		
		
		
		
		
	}
}
