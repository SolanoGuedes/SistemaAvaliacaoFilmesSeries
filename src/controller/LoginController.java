package controller;

import telas.TelaLogin;
import java.sql.Connection;
import java.sql.SQLException;
import dao.Conexao;
import dao.LoginDAO;

public class LoginController {

    public void cadastroUsuario(TelaLogin view) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastarUsuario(view.getTxt_regis_usuario().getText(), view.getTxt_regis_email().getText(), view.getTxt_regis_senha().getText());

    }

    public void login(TelaLogin tl) throws SQLException {
        String email = tl.getTxt_usuario().getText();
        String senha = tl.getjPassword_senha().getText();

        Connection conexao = new Conexao().getConnection();
        LoginDAO login = new LoginDAO();
        login.login(email, senha, tl);
    }
}
