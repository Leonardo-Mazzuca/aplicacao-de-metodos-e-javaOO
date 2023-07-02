package metodos;

public class Data {
	
	private int mes;
	private int ano;
	private int dia;
	
	
	
	public Data(int dia, int mes, int ano) {
		if (dia < 0 || mes < 0 || ano < 0) {
            throw new IllegalArgumentException("Data inválida, datas negativas");
        } else if (mes > 12) {
        	throw new IllegalArgumentException("Data inválida, valor inexistente.");
        } else if (mes % 2 == 1) {
            if (dia > 31) {
            	throw new IllegalArgumentException("Data inválida, tente colocar um valor para "
            			+ " dia abaixo"
            			+ " de 31 para meses ímpares.");
            }
        } else if (mes == 2) {
            if (dia > 29) {
            	throw new IllegalArgumentException("Data inválida, fevereiro não possui"
            			+ " mais do que 29 dias.");
            }
        } else if (mes % 2 == 0) {
            if (dia > 30) {
            	throw new IllegalArgumentException("Data inválida, tente colocar um valor para"
            			+ " dia abaixo de"
            			+ " 30 para meses pares.");
            }
        } 
		
		this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        	
        	
        
    }
		
		
		
		
	//converter int para String = valueOf
	public String displayData() {
		String dia = String.valueOf(this.dia);
		String mes = String.valueOf(this.mes);
		String ano = String.valueOf(this.ano);
		if (this.dia < 10) {
			return "0" + dia + "/" + mes + "/" + ano;
		} else if(this.mes < 10) {
			return  dia + "/" + "0" + mes + "/" + ano;
		} else if (this.dia < 10 && this.mes<10) {
			return  "0" + dia + "/" + "0" + mes + "/" + ano;
		}
		return dia + "/" + mes + "/" + ano;
	}
	
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if (mes == 0) {
			throw new IllegalArgumentException("Data inválida, valor inêxistente");
			
		}else if (mes < 0) {
			throw new IllegalArgumentException("Data inválida, mês negativo");
		}
		else if (mes > 12) {
			throw new IllegalArgumentException("Data inválida, valor inêxistente");
		} else if(mes < 10) {
			String mesStr = String.valueOf(mes);
			mesStr.concat("0" + mes);
			int mesInt = Integer.parseInt(mesStr);
			this.mes = mesInt;
			
		} 
		this.mes = mes;
	}
	public int getAno() {
		
		return ano;
	}
	public void setAno(int ano) {
		if (ano < 0) {
			throw new IllegalArgumentException("Data inválida, ano negativo");
		}
		this.ano = ano;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if (dia < 0) {
			throw new IllegalArgumentException("Data inválida, dia negativo");
		}
		else if (this.mes / 2 == 1 && dia > 31) {
			throw new IllegalArgumentException("Data inválida");
		} else if (this.mes / 2 == 0 && dia > 30) {
			throw new IllegalArgumentException("Data inválida");
		} else if(dia < 10) {
			String diaStr = String.valueOf(dia);
			diaStr.concat("0" + dia);
			int diaInt = Integer.parseInt(diaStr);
			this.dia = diaInt;
		}
		
		this.dia = dia;
	}

}

class testaData{
	public static void main(String[] args) {
		
		Data d = new Data(10, 12, 2002);
		
		d.setMes(2);
		d.setDia(2);
		System.out.println(d.displayData());
		
	}
}
