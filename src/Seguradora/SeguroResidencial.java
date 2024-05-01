package Seguradora;

public class SeguroResidencial extends Seguro{
    private double franquia;
    private int anoCostrução;


    public SeguroResidencial(double franquia, int anoCosntrução,int numeroApolice, String nomeSegurado, Endereço endereçoSegurado, double valorSeguro, double premioSeguro) {
        super(numeroApolice, nomeSegurado, endereçoSegurado, valorSeguro, premioSeguro);
        this.franquia = franquia;
        this.anoCostrução = anoCosntrução;
    }

    public double getFranquia() {
        return franquia;
    }

    public void setFranquia(double franquia) {
        this.franquia = franquia;
    }

    public int getAnoCostrução() {
        return anoCostrução;
    }

    public void setAnoCostrução(int anoCostrução) {
        this.anoCostrução = anoCostrução;
    }

    public void mostraSeguro(){
        System.out.println("Franquia: " + franquia);
        System.out.println("Ano construção: " + anoCostrução);
    }
}
