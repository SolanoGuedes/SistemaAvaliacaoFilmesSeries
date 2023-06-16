package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Filme;


public class FilmesDAO {
       List<Filme> rstFilme = new ArrayList<>();
       
    public List<Filme> buscarFilmes(int idFilme) throws SQLException{
       
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT f.titulo, f.capa, f.capa_trailer, f.url_trailer, f.sinopse, f.onde_assistir, f.onde_assistir_url, AVG(r.nota) AS media FROM filmes_series f JOIN avaliacao r ON f.id = r.id_filme WHERE f.id = ?";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, idFilme);
        ResultSet resultSet = statement.executeQuery();       
         if (resultSet.next()){                   
        Filme filme = new Filme();
            filme.setTitulo(resultSet.getString("titulo"));
            filme.setCapa(resultSet.getString("capa"));
            filme.setCapaTrailer(resultSet.getString("capa_trailer"));
            filme.setUrlTrailer(resultSet.getString("url_trailer"));
            filme.setSinopse(resultSet.getString("sinopse"));
            filme.setOndeAssistir(resultSet.getString("onde_assistir"));
            filme.setOndeAssistirUrl(resultSet.getString("onde_assistir_url"));
            filme.setMediaAvaliacao(resultSet.getDouble("media"));
            
            rstFilme.add(filme);
         }
        return rstFilme;
               
    }
    public void avaliarFilmes(int nota, String email, int idfilme) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        String sql = "insert into avaliacao (nota, email_usuario, id_filme) values (?, ?, ?)";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1,nota);
        statement.setString(2, email);
        statement.setInt(3, idfilme);
        statement.executeUpdate();
       
        
    }
}
