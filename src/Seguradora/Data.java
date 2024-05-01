// Implementar o metodo construtor e o  metodo get para cada um dos atributos.
// O método construtor deve chamar o metodo setData.
// O méto setData deve aceitar apenas datas válidas.

// setData( dia: int, mes : int, ano : int) void
// getData(): String
// toString(): String

package Seguradora;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setData(dia, mes, ano);
    }

    public void setData(int dia, int mes, int ano) {
        if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 0) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido");
        }
    }

    public String getData() {
        return dia + "/" + mes + "/" + ano;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}

