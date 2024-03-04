package br.com.alura.comex.service;

import br.com.alura.comex.dao.ClienteDAO;
import br.com.alura.comex.factory.ConnectionFactory;
import br.com.alura.comex.modelo.Cliente;

import java.util.List;

public class ClienteService {
    private Cliente cliente;
    private ConnectionFactory connectionFactory;

    public ClienteService(String nome, String cpf, String email, String profissao, String telefone) {
        this.connectionFactory = new ConnectionFactory();
        this.cliente = new Cliente(nome, cpf, email, profissao, telefone);
    }

    public void cadastrarClienteService(Cliente cliente) {
        ClienteDAO clienteDao = new ClienteDAO(connectionFactory.abrirConexaoBD());
        clienteDao.cadastrarCliente(this.cliente);
    }
    public List<Cliente> listarClientesService() {
        ClienteDAO clienteDao = new ClienteDAO(connectionFactory.abrirConexaoBD());
        return clienteDao.listarCliente();
    }

    public void atualizarInfo(Integer idConta, String nome) {
        ClienteDAO clienteDAO = new ClienteDAO(connectionFactory.abrirConexaoBD());
        clienteDAO.alterarCliente(nome, idConta);
    }

    public void deletarCliente(Integer idConta) {
        ClienteDAO clienteDAO = new ClienteDAO(connectionFactory.abrirConexaoBD());
        clienteDAO.deletarCliente(idConta);
    }
}
