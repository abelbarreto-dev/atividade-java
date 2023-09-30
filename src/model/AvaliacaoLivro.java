package model;

public interface AvaliacaoLivro {

    int getIdAvaliacao();
    void setIdAvaliacao(Integer id);
    int getIdCliente();
    void setIdCliente(Integer id);
    int getIdLivro();
    void setIdLivro(Integer id);
    String getComentario();
    void setComentario(String comentario);
    String getDataAvaliacao();
    void setDataAvaliacao(String dataAvaliacao);
    void avaliar();

}