package br.com.alura.comex.dao;

import br.com.alura.comex.factory.ConnectionFactory;
import br.com.alura.comex.modelo.Cliente;
import br.com.alura.comex.modelo.Endereco;

public class TesteCadastro {
    public static void main(String[] args) {
        ClienteDAO clienteCon = new ClienteDAO(new ConnectionFactory());

        Endereco endereco = new Endereco();
        endereco.bairro = "Jd. Peri";
        endereco.cidade = "São Paulo";
        endereco.rua = "Cachoeira dos Antunes";
        endereco.complemento = "-";
        endereco.estado = "São Paulo";
        endereco.numero = 10;

        Cliente cliente = new Cliente();
        cliente.setNome("Luiz");
        cliente.setEmail("felipe@gmail.com");
        cliente.setTelefone("(99) 99999-9999");
        cliente.setCpf("999.999.999-99");
        cliente.setProfissao("Desenvolvedor");
        cliente.setEndereco(endereco);

        clienteCon.salvar();


    }
}
