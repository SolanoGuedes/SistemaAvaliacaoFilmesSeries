
package login.controller;

import telas.TelaLogin;
import java.sql.Connection;
import java.sql.SQLException;
import login.dao.Conexao;
import login.dao.LoginDAO;
import telas.PaginaInicial;

public class LoginController {
    
    
    public void cadastroUsuario(TelaLogin view) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastarUsuario(view.getTxt_regis_usuario().getText(), view.getTxt_regis_email().getText(), view.getTxt_regis_senha().getText());
        
    }
    public void login(TelaLogin view) throws SQLException{
        String email = view.getTxt_usuario().getText();
        String senha = view.getjPassword_senha().getText();
        
        Connection conexao = new Conexao().getConnection();
        LoginDAO login = new LoginDAO();       
        
        boolean loginSucesso = login.login(email, senha);
        if (loginSucesso) {
            view.dispose(); 
            new PaginaInicial().setVisible(true);
    }else {
            view.dadosErrados();
        }
    }
}
