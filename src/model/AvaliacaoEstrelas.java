package model;

public class AvaliacaoEstrelas implements AvaliacaoLivro {
    
    private int idAvaliacao;
    private int idCliente;
    private int idLivro;
    private String comentario;
    private String dataAvaliacao;

    public AvaliacaoEstrelas() {}

    public AvaliacaoEstrelas(int idCliente, int idLivro, String comentario, String dataAvaliacao) {
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
    public void avaliar() {
        switch(comentario) {
            case "1":
                this.comentario = "★ - Péssimo";
                break;
            case "2":
                this.comentario = "★★ - Ruim";
                break;
            case "3":
                this.comentario = "★★★ - Regular";
                break;
            case "4":
                this.comentario = "★★★★ - Bom";
                break;
            case "5":
                this.comentario = "★★★★★ - Excelente";
                break;
        }
    }

}