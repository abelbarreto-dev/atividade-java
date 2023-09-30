package model;

public class AvaliacaoTexto implements AvaliacaoLivro {

    private int idAvaliacao;
    private int idCliente;
    private int idLivro;
    private String comentario;
    private String dataAvaliacao;

    public AvaliacaoTexto() {}

    public AvaliacaoTexto(int idCliente, int idLivro, String comentario, String dataAvaliacao) {
        this.idCliente = idCliente;
        this.idLivro = idLivro;
        this.comentario = comentario;
        this.dataAvaliacao = dataAvaliacao;
    }

    @Override
    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    @Override
    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public int getIdLivro() {
        return idLivro;
    }

    @Override
    public String getComentario() {
        return comentario;
    }

    @Override
    public String getDataAvaliacao() {
        return dataAvaliacao;
    }

    @Override
    public void setIdAvaliacao(Integer id) {
        this.idAvaliacao = id;
    }

    @Override
    public void setIdCliente(Integer id) {
        this.idCliente = id;
    }

    @Override
    public void setIdLivro(Integer id) {
        this.idLivro = id;
    }

    @Override
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public void setDataAvaliacao(String dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    @Override
    public void avaliar() {}

}