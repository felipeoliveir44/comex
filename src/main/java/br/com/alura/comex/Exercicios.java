package br.com.alura.comex;

import br.com.alura.comex.modelo.Cliente;
import br.com.alura.comex.modelo.Endereco;
import br.com.alura.comex.modelo.Produto;

public class Exercicios {
    public static void main(String[] args) {

        // Ex 02
        Produto produto = new Produto("Celular S20");
        Produto produto2 = new Produto("Fone QCY T13");

        produto.descricao = "Celular preto";
        produto.precoUnitario = 1000.00;
        produto.quantidade = 10;
        
        produto2.descricao = "Fone sem fio preto";
        produto2.precoUnitario = 100.20;
        produto2.quantidade = 2;

        System.out.println("Nome do produto: " + produto.nome);
        System.out.println("Descrição do produto: " + produto.descricao);
        System.out.println("Preço unitário do produto: " + produto.precoUnitario);
        System.out.println("Quantidade do produto: " + produto.quantidade);

        System.out.println("_________________________________");

        System.out.println("Nome do produto: " + produto2.nome);
        System.out.println("Descrição do produto: " + produto2.descricao);
        System.out.println("Preço unitário do produto: " + produto2.precoUnitario);
        System.out.println("Quantidade do produto: " + produto2.quantidade);

        System.out.println("_________________________________");

        //  Ex 03
        if(produto.equals(produto2)) {
            System.out.println("Os produtos são iguais");
        }
        else {
            System.out.println("Os produtos não são iguais");
        }

        System.out.println("__________________________________");

        // Ex 04
        System.out.println(produto.toString());
        System.out.println(produto2.toString());


        // Ex 05

        Endereco endereco = new Endereco();
        endereco.bairro = "Jd. Peri";
        endereco.cidade = "São Paulo";
        endereco.rua = "Cachoeira dos Antunes";
        endereco.complemento = "-";
        endereco.estado = "São Paulo";
        endereco.numero = 10;

        System.out.println(endereco.toString());

        Cliente cliente = new Cliente();
        cliente.setNome("Luiz");
        cliente.setEmail("felipe@gmail.com");
        cliente.setTelefone("(99) 99999-9999");
        cliente.setCpf("999.999.999-99");
        cliente.setProfissao("Desenvolvedor");
        cliente.setEndereco(endereco);

        System.out.println(cliente.toString());
    }
}
