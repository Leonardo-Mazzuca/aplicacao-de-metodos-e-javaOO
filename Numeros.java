package metodos;

import java.util.*;

public class Numeros {
	
	public static int totalPares(int[] arrayDeNum) {
		int par = 0;
		for (int i = 0; i <arrayDeNum.length; i++) {
			
			if (arrayDeNum[i] % 2 == 0) {
				par++;
	
			}
			
		}
		return par;
	}
	
	public static int maiorValor(int[] arrayDeNum) {
		int maiorNum = 0;
		for (int i = 0; i<arrayDeNum.length; i++) {
			if (arrayDeNum[i] > maiorNum) {
				maiorNum = arrayDeNum[i];
			}
		}
		return maiorNum;
		
	}
	
	public static int menorValor(int[] arrayDeNum) {
		int menorNum = 0;
		for (int i = 0; i<arrayDeNum.length; i++) {
			if (i == 0) {
				menorNum = arrayDeNum[i];
			}
			if (arrayDeNum[i] < menorNum) {
				menorNum = arrayDeNum[i];
			}
		}
		return menorNum;
	}
	
	public static int arrayIgual(int[] array1 , int[] array2) {
		int totalIguais = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j]) {
					totalIguais++;
				}
			}
		}
		return totalIguais;
	}
	
	public static int[] valoresEntre(int[] array, int min, int max) {
		List <Integer>valoresEntre = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
		if (array[i] > min && array[i] < max) {
			valoresEntre.add(array[i]);
		}
		
		}
		
		int resultado[] = new int[valoresEntre.size()];
		for (int i = 0; i <valoresEntre.size(); i++) {
			resultado[i] = valoresEntre.get(i);
			
		
		}
		return resultado;

	}
	
	public static int[] uniao(int[] array1, int[] array2) {
		List<Integer> arrayConcatenada = new ArrayList<>();
		
		for (int i = 0; i<array1.length;i++) {
			if(!Arrays.asList(array2).contains(array1[i])) {
				arrayConcatenada.add(array1[i]);
			}
		}
		
//		for (int i = 0; i < array1.length; i++) {
//				arrayConcatenada.add(array1[i]);
//		}
//		
//		for (int j = 0; j < array2.length; j++) {
//			arrayConcatenada.add(array2[j]);
//		}
		
		
		int[] arrayNovo = new int[arrayConcatenada.size()];
		
	
		for(int i = 0; i<arrayConcatenada.size(); i++) {
			arrayNovo[i] = arrayConcatenada.get(i);
		}
		
		return arrayNovo;
		
	}
	
	
	
}

class testaNumeros{
	public static void main(String[] args) {
		
		
		int min = 0, max = 0;
		int[] conjuntoDeNum = {2,3,4,5,6,8,10,12,13};
		int[] conjuntoDeNum2 = {2,7,10,12,3,13};
		int[] array = new int[10];
		
		
//		for (int i = 0; i < array.length; i++) {
//			array[i] = (int) (Math.random() * 100);
//			
//		}
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i] + " ");;
//			
//		}
//		
//		for (int i =0; i < array.length; i++) {
//			if (i == 1) {
//				min = array[i];
//				max = array[i];
//			}
//			if (array[i] > max) {
//				max = array[i];
//			}
//			if(array[i] < min) {
//				min = array[i];
//			}
//		}
		
		
		
		int[] resultado = Numeros.valoresEntre(array, min, max);
		int[] concatenacao = Numeros.uniao(conjuntoDeNum, conjuntoDeNum2);
		
//		System.out.println("Valores entre " + min + " e " + max + ".");
//		if (resultado.length > 0) {
//			for (int i =0; i< resultado.length;i++) {
//				System.out.print(resultado[i] + " ");
//			}
//		}
		

		for(int i = 0; i<concatenacao.length; i++) {
			System.out.print(concatenacao[i] + ",");
		}
		
		


		
		
		
		
		
		}
	}


