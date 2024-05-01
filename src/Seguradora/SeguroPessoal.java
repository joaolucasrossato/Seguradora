package Seguradora;

public class SeguroPessoal extends Seguro{
    private String beneficiario;
    private Data dataNascimento;

    public SeguroPessoal(int numeroApolice, String nomeSegurado, Endereço endereçoSegurado, double valorSeguro, double premioSeguro, String beneficiario, Data dataNascimento) {
        super(numeroApolice, nomeSegurado, endereçoSegurado, valorSeguro, premioSeguro);
        this.beneficiario = beneficiario;
        this.dataNascimento = dataNascimento;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void mostraSeguro(){
        System.out.println("Beneficiário: " + beneficiario);
        System.out.println("Data de nascimento: " +dataNascimento);
    }
}
