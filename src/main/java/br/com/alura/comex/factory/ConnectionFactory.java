package br.com.alura.comex.factory;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection abrirConexaoBD() {
        try {
            return createDataSource().getConnection();


        } catch(SQLException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }

    }

    private HikariDataSource createDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/comex");
        config.setUsername("root");
        config.setPassword("toophotel12");
        config.setMaximumPoolSize(10);

        return new HikariDataSource(config);
    }
}
