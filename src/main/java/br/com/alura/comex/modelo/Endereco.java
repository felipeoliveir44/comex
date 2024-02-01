package br.com.alura.comex.modelo;

public class Endereco {
    public String bairro;
    public String cidade;
    public String complemento;
    public String estado;
    public String rua;
    public int numero;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {

        return ">>>> Dados do endereço \n" +
                "Bairro: " + bairro + "\n" +
                "Cidade: " + cidade + "\n" +
                "Complemento: " + complemento + "\n" +
                "Estado: " + estado + "\n" +
                "Rua: " + rua + "\n" +
                "Número: " + numero;

    }
}
