package br.com.alura.comex.modelo;

public class Produto {
     // Ex 02
    public String nome;
    public String descricao;
    public double precoUnitario;
    public int quantidade;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {

        return ">>>> Dados do projeto \n" + "Nome: " + nome + "\n" +
                "Descrição: " + descricao + "\n" +
                "Preço Unitário: " + precoUnitario + "\n" +
                "Quantidade: " + quantidade;
    }


}

