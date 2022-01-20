package mz.co.centralserver.databasefactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDados {

    private final Connection conn;

    public BancoDados(Connection conn) {
        this.conn = conn;
    }

    public String _criarBaseDados(String nomeBaseDados) {
        String resultado = "O banco de dados não foi criado porque já existe";

        
        try {
            Statement s = conn.createStatement();

            if (!_existeBancoDados(nomeBaseDados)) {
                
                String comando_sql = "CREATE DATABASE " + nomeBaseDados;
                String driverClass = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/"+nomeBaseDados;
                String username = Conecta.user;
                String password = Conecta.password;
                String dialect = "org.hibernate.dialect.MySQLDialect";
        
                // Criando a base de dados
                resultado = (s.executeUpdate(comando_sql) > 0) ? "Base de dados " + nomeBaseDados + " criada com sucesso" : "Erro ao criar a base de dados";

                //Cria o ficheiro hibernate.properties
                HibernateGeradorProperties geradorProperties = new HibernateGeradorProperties();
                geradorProperties._gerarFicheiroProperties(driverClass, url, username, password, dialect);
          
                // Criando as tabelas
                HibernateGeradorTabelas geradorTabelas = new HibernateGeradorTabelas();
                geradorTabelas._criarTabelas();
                
                Conecta._fecharConeccao(conn);
            }

        } catch (SQLException erroSql) {

            return erroSql.getMessage();
        }

        return resultado;
    }

    public boolean _existeBancoDados(String nomeBaseDados) {
        String comando_sql = "SHOW DATABASES";

        try {
            PreparedStatement ps = conn.prepareStatement(comando_sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    if (rs.getString(1).equals(nomeBaseDados)) {
                        return true;
                    }
                }
            }

        } catch (SQLException erroSql) {

            System.out.println(erroSql.getMessage());
        }
        return false;
    }

}
