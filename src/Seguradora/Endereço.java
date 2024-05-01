package Seguradora;

public class Endereço {
    private String nomeLogradouro;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

    public Endereço(String nomeLogradouro, int numero, String complemento, String cidade, String estado, String cep) {
        this.nomeLogradouro = nomeLogradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String toString(){
        return "Nome do Logradouro: " + nomeLogradouro
                +"\n Número: " + numero
                +"\nComplemento: " + complemento
                +"\nCidade: " + cidade
                +"\nEstado: " + estado
                +"\nCep: " + cep;
    }
}
