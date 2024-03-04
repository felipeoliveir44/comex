package br.com.alura.comex.dao;

import br.com.alura.comex.factory.ConnectionFactory;
import br.com.alura.comex.modelo.Cliente;

import java.math.BigDecimal;
import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    ConnectionFactory connectionFactory;

    public ClienteDAO(Connection conn) {
        this.connectionFactory = new ConnectionFactory();
    }

    public void cadastrarCliente(Cliente cliente) {
        connectionFactory.abrirConexaoBD();

        String sql = "insert into cliente(nome, cpf, email, profissao, telefone) values (?,?,?,?,?);";

        try {
            // Criamos a variavel de conexao que irá receber a classe de abrir conexao com banco de dados
            Connection con = connectionFactory.abrirConexaoBD();
            // Prepara para enviar a query
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.setString(4, cliente.getProfissao());
            preparedStatement.setString(5, cliente.getTelefone());
            preparedStatement.execute();
            preparedStatement.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }
    }

    public List<Cliente> listarCliente() {
        List<Cliente> contas = new ArrayList<>();

        String sql = "select * from cliente";

        try {
            // Criamos a variavel de conexao que irá receber a classe de abrir conexao com banco de dados
            Connection con = connectionFactory.abrirConexaoBD();
            // Prepara para enviar a query
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {

                int id = result.getInt(1);
                String nome = result.getString(2);
                String cpf = result.getString(3);
                String email = result.getString(4);
                String profissao = result.getString(5);
                String telefone = result.getString(6);
                Cliente cliente = new Cliente(nome, cpf, email, profissao, telefone);

                contas.add(cliente);

            }
            result.close();
            preparedStatement.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }
        return contas;
    }

    public void alterarCliente (String nome, Integer idConta) {
        connectionFactory.abrirConexaoBD();

        String sql = "update cliente set nome = ? where id = ?";

        try {
            // Criamos a variavel de conexao que irá receber a classe de abrir conexao com banco de dados
            Connection con = connectionFactory.abrirConexaoBD();
            // Prepara para enviar a query
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2,idConta);
            preparedStatement.execute();
            preparedStatement.close();
            con.close();
        }
        catch (SQLException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }

    }

    public void deletarCliente (Integer idConta) {
        connectionFactory.abrirConexaoBD();

        String sql = "delete from cliente where id = ?";

        try {
            // Criamos a variavel de conexao que irá receber a classe de abrir conexao com banco de dados
            Connection con = connectionFactory.abrirConexaoBD();
            // Prepara para enviar a query
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,idConta);
            preparedStatement.execute();
            preparedStatement.close();
            con.close();
        }
        catch (SQLException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }

    }
}



