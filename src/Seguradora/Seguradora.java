package Seguradora;

public class Seguradora {
    private Seguro[] seguros;

    public Seguradora(Seguro[] seguros) {
        this.seguros = seguros;
    }

    public Seguro[] getSeguros() {
        return seguros;
    }

    public void setSeguros(Seguro[] seguros) {
        this.seguros = seguros;
    }

    public void inserirSeguro(Seguro seguro) {
        Seguro[] novoArray = new Seguro[seguros.length + 1];
        for (int i = 0; i < seguros.length; i++) {
            novoArray[i] = seguros[i];
        }
        novoArray[novoArray.length - 1] = seguro;
        seguros = novoArray;
    }

    public boolean removerSeguro(int numeroApolice) {
        for (int i = 0; i < seguros.length; i++) {
            if (seguros[i].getNumeroApolice() == numeroApolice) {
                for (int j = i; j < seguros.length - 1; j++) {
                    seguros[j] = seguros[j + 1];
                }
                Seguro[] novoArray = new Seguro[seguros.length - 1];
                for (int k = 0; k < novoArray.length; k++) {
                    novoArray[k] = seguros[k];
                }
                seguros = novoArray;
                return true;
            }
        }
        return false;
    }

    public boolean alteraSeguro(int numeroApolice, Seguro novoSeguro) {
        for (int i = 0; i < seguros.length; i++) {
            if (seguros[i].getNumeroApolice() == numeroApolice) {
                seguros[i] = novoSeguro;
                return true;
            }
        }
        return false;
    }

    public void mostraTodosSeguros() {
        for (Seguro seguro : seguros) {
            seguro.mostraSeguro();
            System.out.println();
        }
    }

    public Seguro buscarSeguro(int numeroApolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice() == numeroApolice) {
                return seguro;
            }
        }
        return null;
    }
}

