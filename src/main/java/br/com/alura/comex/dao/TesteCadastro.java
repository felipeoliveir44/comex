package br.com.alura.comex.dao;

import br.com.alura.comex.modelo.Cliente;
import br.com.alura.comex.service.ClienteService;

public class TesteCadastro {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService("Luiz","49564418860", "felipe@gmail.com", "Dev", "19989346614");
        // Adicionar cliente
        clienteService.cadastrarClienteService(new Cliente("Luiz","49564418860", "felipe@gmail.com", "Dev", "19989346614"));

        // Listar Cliente
        for (Cliente listarClientes : clienteService.listarClientesService()) {
            System.out.println(listarClientes);
        }

        // Update cliente
        clienteService.atualizarInfo(2, "Aline");

        // Delete cliente
        clienteService.deletarCliente(2);
    }
}
