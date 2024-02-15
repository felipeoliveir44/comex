package br.com.alura.comex.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {
    int id;
    Cliente cliente;
    BigDecimal preco;
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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
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
    public boolean isMaisBaratoQue(Pedido outroPedido) {
        if(this.getValorTotal().compareTo(outroPedido.getValorTotal()) == -1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isMaisCaroQue(Pedido outroPedido) {
        if(this.getValorTotal().compareTo(outroPedido.getValorTotal()) == 1) {
            return true;
        }else{
            return false;
        }
    }

    public BigDecimal getValorTotal() {
        return this.preco.multiply(new BigDecimal(this.getQuantidade())) ;
    }
    @Override
    public String toString() {
        return ">>> Dados do pedido: \n" +
                "ID: " + getId() + "\n" +
                "Cliente: " + cliente.getNome() + "\n" +
                "Preço: " + getPreco() + "\n" +
                "Data: " + getData() + "\n" +
                "Valor total: " + getValorTotal() + "\n" +
                "-------------------------------------------- \n";

    }
}
