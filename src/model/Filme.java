package model;


public class Filme {
    private String titulo, capa, capaTrailer, urlTrailer, sinopse, ondeAssistir, ondeAssistirUrl;
    private int idFilme;
    private double mediaAvaliacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getCapaTrailer() {
        return capaTrailer;
    }

    public void setCapaTrailer(String capaTrailer) {
        this.capaTrailer = capaTrailer;
    }

    public String getUrlTrailer() {
        return urlTrailer;
    }

    public void setUrlTrailer(String urlTrailer) {
        this.urlTrailer = urlTrailer;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getOndeAssistir() {
        return ondeAssistir;
    }

    public void setOndeAssistir(String ondeAssistir) {
        this.ondeAssistir = ondeAssistir;
    }

    public String getOndeAssistirUrl() {
        return ondeAssistirUrl;
    }

    public void setOndeAssistirUrl(String ondeAssistirUrl) {
        this.ondeAssistirUrl = ondeAssistirUrl;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public double getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(double mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

}