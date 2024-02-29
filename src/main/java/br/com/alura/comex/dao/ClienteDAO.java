package br.com.alura.comex.dao;

import br.com.alura.comex.factory.ConnectionFactory;
import br.com.alura.comex.modelo.Cliente;

import java.math.BigDecimal;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

    ConnectionFactory connectionFactory;
    public ClienteDAO(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }
    public void salvar() {
        connectionFactory.abrirConexaoBD();

        String sql = "insert into cliente(id, nome)" + "values (?, ?)";

        try {
            // Criamos a variavel de conexao que irá receber a classe de abrir conexao com banco de dados
            Connection con = connectionFactory.abrirConexaoBD();
            // Prepara para enviar a query
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 10);
            ps.setString(2, "teste");
            ps.execute();
            System.out.println("Executou");
            ps.close();
            con.close();

        }catch (SQLException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }
    }
}
