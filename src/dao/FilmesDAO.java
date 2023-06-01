package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Filme;


public class FilmesDAO {
       ArrayList<Filme> rstFilme = new ArrayList<>();
       
    public ArrayList<Filme> buscarFilmes(int idFilme) throws SQLException{
        
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT f.titulo, f.capa, f.capa_trailer, f.url_trailer, f.sinopse, f.onde_assistir, f.onde_assistir_url, AVG(r.nota) AS media FROM filmes_series f JOIN avaliacao r ON f.id = r.id_filme WHERE f.id = ?";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, idFilme);
        ResultSet resultSet = statement.executeQuery();
        
        while (resultSet.next()) {                    
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
}
