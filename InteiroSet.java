package metodos;

public class InteiroSet {
	
	public boolean conjunto[];
	
	InteiroSet() {
		conjunto = new boolean[101];
	}
	
	public boolean union(InteiroSet outroConjunto) {
		InteiroSet resultado = new InteiroSet();
		
		for (int i = 0; i < conjunto.length; i++) {
			resultado.conjunto[i] = conjunto[i] || outroConjunto.conjunto[i];
		}
		
		return resultado.isEmpty();
	}
	
	
	public boolean interseccao(InteiroSet outroConjunto) {
		InteiroSet resultado = new InteiroSet();
		
		for (int i =0; i<conjunto.length; i++) {
			resultado.conjunto[i] = conjunto[i] && outroConjunto.conjunto[i];
		}
		
		return resultado.isEmpty();
		
	}
	
	public void insereElemento(int elemento) {
		if (elemento >= 0 && elemento <= 100) {
			conjunto[elemento] = true;
		} else {
			conjunto[elemento] = false;
			throw new IllegalArgumentException("Falso, elemento com valor acima de 100");
		}
	}
	
	public void deleteElemento(int elemento) {
		if (elemento <= conjunto.length) {
			conjunto[elemento] = false;
		} else {
			throw new IllegalArgumentException("Falso, elemento fora de cogitação");
		}
	}
	
	public String toSetString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<conjunto.length; i++) {
			if (conjunto[i]) {
				sb.append(i).append(" ");
			}
			
		}
		if (sb.length() == 0) {
			return "-";
		}
		return sb.toString().trim();
	}
	
	public boolean isEqualsTo(InteiroSet outroConjunto) {
		
		
		for (int i = 0; i<conjunto.length; i++) {
			if (conjunto[i] != outroConjunto.conjunto[i]) {
				return false;
			} 
		
		}
		return true;
	}
	
	
	
	public boolean isEmpty() {
		for (int i = 0; i < conjunto.length; i++){
			if (conjunto[i]) {
				return false;
			}
		}
		return true;
	}

}


class testaSet{
	public static void main(String[] args) {
		InteiroSet conjunto1 = new InteiroSet();
		
		conjunto1.insereElemento(10);
		conjunto1.insereElemento(15);
		conjunto1.insereElemento(20);
		
		InteiroSet conjunto2 = new InteiroSet();
		
		conjunto2.insereElemento(10);
		conjunto2.insereElemento(15);
		conjunto2.insereElemento(20);
	
		
		System.out.println(conjunto1.toSetString());
		System.out.println(conjunto2.toSetString());
		System.out.println(conjunto1.isEqualsTo(conjunto2));
		System.out.println(conjunto1.interseccao(conjunto2));
	}
}


