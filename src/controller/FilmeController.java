package controller;

import dao.FilmesDAO;
import java.sql.SQLException;


public class FilmeController {

    public void avaliarfilmes(int nota, String email, int idFilme) throws SQLException { 
        FilmesDAO filmedao = new FilmesDAO();
        filmedao.avaliarFilmes(nota, email, idFilme);
    }

}
