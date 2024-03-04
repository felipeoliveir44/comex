package br.com.alura.comex.modelo;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String profissao;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String cpf, String email, String profissao, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.profissao = profissao;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {

        return ">>>> Dados do cliente \n" +
                "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "E-mail: " + email + "\n" +
                "Profissão: " + profissao + "\n" +
                "Telefone: " + telefone + "\n" +
                "Endereço: " + endereco + "\n" +
                "------------------------------------";

    }

}
