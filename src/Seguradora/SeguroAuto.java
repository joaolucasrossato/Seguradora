package Seguradora;

public class SeguroAuto extends Seguro{
    private double franquia;
    private String renavam;
    private String marca;
    private String modelo;
    private int anoFabricação;
    private int anoModelo;

    public SeguroAuto(int numeroApolice, String nomeSegurado, Endereço endereçoSegurado, double valorSeguro, double premioSeguro, double franquia, String renavam, String marca, String modelo, int anoFabricação, int anoModelo) {
        super(numeroApolice, nomeSegurado, endereçoSegurado, valorSeguro, premioSeguro);
        this.franquia = franquia;
        this.renavam = renavam;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricação = anoFabricação;
        this.anoModelo = anoModelo;
    }

    public double getFranquia() {
        return franquia;
    }

    public void setFranquia(double franquia) {
        this.franquia = franquia;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricação() {
        return anoFabricação;
    }

    public void setAnoFabricação(int anoFabricação) {
        this.anoFabricação = anoFabricação;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void mostraSeguro(){
        System.out.println("Franquia: " + franquia);
        System.out.println("Renavam: " + renavam);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricação);
        System.out.println("Ano Modelo: " + anoModelo);
    }
}
