package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Login;


public class LoginDAO {

    public void cadastarUsuario(String nome, String email, String senha) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "insert into usuarios (nome, email, senha) values ('" + nome + "', '" + email + "', '" + senha + "')";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();
        conexao.close();
    }

    public  List<Login> login(String email, String senha) throws SQLException {
        List<Login> usuario = new ArrayList<>();
        Connection conexao = new Conexao().getConnection();
        String sql = "select nome, email from usuarios where email = ? and senha = ?";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, senha);
        ResultSet rs = statement.executeQuery();
        if (rs.next()) {
            Login login = new Login();
            login.setNome(rs.getString("nome"));
            login.setEmail(rs.getString("Email"));            
            usuario.add(login);
        }
              
        return usuario;
    }
}
