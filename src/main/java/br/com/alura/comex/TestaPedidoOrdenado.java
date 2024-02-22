package br.com.alura.comex;

import br.com.alura.comex.modelo.*;
import org.apache.commons.collections.OrderedBidiMap;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaPedidoOrdenado {
    public static void main(String[] args) {

        // Dados cliente
        Endereco endereco = new Endereco();
        endereco.bairro = "Jd. Peri";
        endereco.cidade = "São Paulo";
        endereco.rua = "Cachoeira dos Antunes";
        endereco.complemento = "-";
        endereco.estado = "São Paulo";
        endereco.numero = 10;

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Luiz");
        cliente1.setEmail("felipe@gmail.com");
        cliente1.setTelefone("(99) 99999-9999");
        cliente1.setCpf("999.999.999-99");
        cliente1.setProfissao("Desenvolvedor");
        cliente1.setEndereco(endereco);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Luiz");
        cliente2.setEmail("felipe@gmail.com");
        cliente2.setTelefone("(99) 99999-9999");
        cliente2.setCpf("999.999.999-99");
        cliente2.setProfissao("Desenvolvedor");
        cliente2.setEndereco(endereco);

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Luiz");
        cliente3.setEmail("felipe@gmail.com");
        cliente3.setTelefone("(99) 99999-9999");
        cliente3.setCpf("999.999.999-99");
        cliente3.setProfissao("Desenvolvedor");
        cliente3.setEndereco(endereco);

        Cliente cliente4 = new Cliente();
        cliente4.setNome("Luiz");
        cliente4.setEmail("felipe@gmail.com");
        cliente4.setTelefone("(99) 99999-9999");
        cliente4.setCpf("999.999.999-99");
        cliente4.setProfissao("Desenvolvedor");
        cliente4.setEndereco(endereco);

        Cliente cliente5 = new Cliente();
        cliente5.setNome("Luiz");
        cliente5.setEmail("felipe@gmail.com");
        cliente5.setTelefone("(99) 99999-9999");
        cliente5.setCpf("999.999.999-99");
        cliente5.setProfissao("Desenvolvedor");
        cliente5.setEndereco(endereco);


        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        pedido1.setCliente(cliente1);
        pedido1.setPreco(BigDecimal.valueOf(10.00));
        pedido1.setQuantidade(5);
        pedido1.setData(LocalDateTime.now());

        Pedido pedido2 = new Pedido();
        pedido2.setId(2);
        pedido2.setCliente(cliente2);
        pedido2.setPreco(BigDecimal.valueOf(35.00));
        pedido2.setQuantidade(2);
        pedido2.setData(LocalDateTime.now());

        Pedido pedido3 = new Pedido();
        pedido3.setId(3);
        pedido3.setCliente(cliente3);
        pedido3.setPreco(BigDecimal.valueOf(78.30));
        pedido3.setQuantidade(4);
        pedido3.setData(LocalDateTime.now());

        Pedido pedido4 = new Pedido();
        pedido4.setId(4);
        pedido4.setCliente(cliente4);
        pedido4.setPreco(BigDecimal.valueOf(5.30));
        pedido4.setQuantidade(8);
        pedido4.setData(LocalDateTime.now());

        Pedido pedido5 = new Pedido();
        pedido5.setId(5);
        pedido5.setCliente(cliente5);
        pedido5.setPreco(new BigDecimal("98.99"));
        pedido5.setQuantidade(1);
        pedido5.setData(LocalDateTime.now());

        Lista listaPedidos = new Lista();

        listaPedidos.adicionarPedido(pedido1);
        listaPedidos.adicionarPedido(pedido2);
        listaPedidos.adicionarPedido(pedido3);
        listaPedidos.adicionarPedido(pedido4);
        listaPedidos.adicionarPedido(pedido5);

        System.out.println(listaPedidos.retornarLista());

        System.out.println("--------------------- Lista ordenada -----------------"); // Menor valor - maior valor
        System.out.println(listaPedidos.retonarListaOrdenada());
        System.out.println("--------------- Lista ordenada reversa ----------------"); // Maior valor - menor valor
        System.out.println(listaPedidos.retornarListaOrdenadaReversa());


    }


}
