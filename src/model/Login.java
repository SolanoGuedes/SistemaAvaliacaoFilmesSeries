package model;

import telas.PaginaInicial;
import telas.TelaLogin;


public class Login {
    
    private String nome, email, senha;   


    public void cadastrar(String nome, String email, String senha ){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   public void abrirPagIni(TelaLogin tl){
            PaginaInicial pg = new PaginaInicial();
            pg.dadousuario(nome);
            pg.email = email;
            pg.setVisible(true);  
            tl.dispose(); 
        }
    }   
   
