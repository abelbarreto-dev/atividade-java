package clean.adapter;

import clean.entity.Livro;

public class LivroPresenter {
    
    private int id;
    private String exemplar;
    private String autor;
    private int ano;
    private String disponibilidade;

    public static LivroPresenter mapToLivroModel(Livro livro) {
        LivroPresenter livroModel = new LivroPresenter();
        livroModel.id = livro.getId();
        livroModel.exemplar = livro.getExemplar();
        livroModel.autor = livro.getAutor();
        livroModel.ano = livro.getAno();
        livroModel.disponibilidade = livro.getDisponibilidade();
        return livroModel;
    }

    public static Livro mapToLivro(LivroPresenter livroPresenter) {
        return new Livro(
            livroPresenter.getId(),
            livroPresenter.getExemplar(),
            livroPresenter.getAutor(),
            livroPresenter.getAno(),
            livroPresenter.getDisponibilidade()
        );
    }

    @Override
    public String toString() {
        return "LivroModel { \n" +
            "exemplar='" + exemplar + "'\n" +
            "autor='" + autor + "'\n" +
            "ano=" + ano + "\n" +
            "disponibilidade='" + disponibilidade + "'\n" +
            "}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExemplar() {
        return exemplar;
    }

    public void setExemplar(String exemplar) {
        this.exemplar = exemplar;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

}
