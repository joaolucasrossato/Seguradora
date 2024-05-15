package Seguradora;

public class Data {
	private int dia;
	private int mês;
	private int ano;

    public Data(int dia, int mes, int ano) {
        setData(dia, mes, ano);
    }
	
	public void seData(int dia, int mês, int ano) {
		if(dia > 0 && dia <= 31 && mês > 0 && mês <=12 && ano > 0) {
			this.dia = dia;
			this.mês = mês;
			this.ano = ano;
		}
		else {
			System.out.println("Data inválida");
		}
	}
    public String getData() {
        return dia + "/" + mes + "/" + ano;
    }

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia > 0 && dia <= 31) {
			this.dia = dia;
		}
		else {
			System.out.println("Dta inválida");
		}
	}

	public int getMês() {
		return mês;
	}

	public void setMês(int mês) {
		if (mês > 0 && mês <=12) {
			this.mês = mês;
		}
		else {
			System.out.println("Data inválida");
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > 0) {
			this.ano = ano;
		}
		else {
			System.out.println("Data inválida");
		}
	}
	
	public String toString() {
		return "Dia/" + dia
				+"Mês/" + mês
				+"Ano"+ano;
	}
	
}
