package br.com.alura.comex.modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {

    int id;
    Cliente cliente;
    double preco;
    int quantidade;
    LocalDateTime data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getData() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatador);
        return dataFormatada;
    }

    public void setData(LocalDateTime data) {

        this.data = data;
    }

    @Override
    public String toString() {
        return ">>> Dados do pedido: \n" +
                "ID: " + getId() + "\n" +
                "Cliente: " + getCliente() + "\n" +
                "Preço: " + getPreco() + "\n" +
                "Quantidade: " + getQuantidade() + "\n" +
                "Data: " + getData();

    }
}
