package model;

public abstract class FormatoLivro {
    protected Livro livro;

    public FormatoLivro(Livro livro) {
        this.livro = livro;
    }

    public abstract String obterInfo();
}