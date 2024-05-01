package Seguradora;

public abstract class Seguro {
    private int numeroApolice;
    private String nomeSegurado;
    private Endereço endereçoSegurado;
    private double valorSeguro;
    private double premioSeguro;

    public Seguro(int numeroApolice, String nomeSegurado, Endereço endereçoSegurado, double valorSeguro, double premioSeguro) {
        this.numeroApolice = numeroApolice;
        this.nomeSegurado = nomeSegurado;
        this.endereçoSegurado = endereçoSegurado;
        this.valorSeguro = valorSeguro;
        this.premioSeguro = premioSeguro;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public Endereço getEndereçoSegurado() {
        return endereçoSegurado;
    }

    public void setEndereçoSegurado(Endereço endereçoSegurado) {
        this.endereçoSegurado = endereçoSegurado;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getPremioSeguro() {
        return premioSeguro;
    }

    public void setPremioSeguro(double premioSeguro) {
        this.premioSeguro = premioSeguro;
    }

    public void mostraSeguro(){
        System.out.println("Número apolice: " + numeroApolice);
        System.out.println("\nNome Segurado: " + nomeSegurado);
        System.out.println("\nEndereço Segurado: " + endereçoSegurado);
        System.out.println("\nValor Seguro: " + valorSeguro);
        System.out.println("\nPremio Seguro: " + premioSeguro);
    }

}
