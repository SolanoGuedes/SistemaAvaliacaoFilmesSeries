
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public void cadastarUsuario(String nome, String email, String senha) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        String sql = "insert into usuarios (nome, email, senha) values ('"+nome+"', '"+email+"', '"+senha+"')";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();
        conexao.close();
    }
    public boolean login(String email, String senha) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        String sql = "select email, senha from usuarios where email = ? and senha = ?";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, senha);
        ResultSet rs = statement.executeQuery();         
        boolean loginSucesso = rs.next();
        rs.close();
        statement.close();
        conexao.close();
        return loginSucesso;
    }
}
