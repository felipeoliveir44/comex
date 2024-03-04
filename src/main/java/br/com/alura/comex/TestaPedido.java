package br.com.alura.comex;

import br.com.alura.comex.modelo.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestaPedido {
    public static void main(String[] args) {
        // Produto

        Produto produto = new Produto("Celular S20");
        produto.descricao = "Celular preto";
        produto.precoUnitario = 1000.00;
        produto.quantidade = 10;

        // Endereço
        Endereco endereco = new Endereco();
        endereco.bairro = "Jd. Peri";
        endereco.cidade = "São Paulo";
        endereco.rua = "Cachoeira dos Antunes";
        endereco.complemento = "-";
        endereco.estado = "São Paulo";
        endereco.numero = 10;

        // Cliente

        Cliente cliente = new Cliente("Luiz Felipe", "49564418860", "felipe@gmail.com", "Dev", "19989346614");
        cliente.setEndereco(endereco);

        // Pedido

        Pedido camisa = new Pedido();
        camisa.setId(1);
        camisa.setCliente(cliente);
        camisa.setPreco(new BigDecimal("10.30"));
        camisa.setQuantidade(5);
        camisa.setData(LocalDateTime.now());
        System.out.println(camisa.toString());


        Pedido calca = new Pedido();
        calca.setId(2);
        calca.setCliente(cliente);
        calca.setPreco(new BigDecimal("82.00"));
        calca.setQuantidade(2);
        calca.setData(LocalDateTime.now());

        System.out.println(calca.toString());

        Pedido calcado = new Pedido();
        calcado.setId(3);
        calcado.setCliente(cliente);
        calcado.setPreco(new BigDecimal("120.00"));
        calcado.setQuantidade(1);
        calcado.setData(LocalDateTime.now());
        System.out.println(calcado.toString());
    }
}
