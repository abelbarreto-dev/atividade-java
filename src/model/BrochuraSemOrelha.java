package model;

public class BrochuraSemOrelha extends FormatoLivro {
    public BrochuraSemOrelha(Livro livro) {
        super(livro);
    }

    public String obterInfo() {
        return "Este livro foi publicado em formato de brochura sem orelha, modelo comum utilizando cola e costuras.";
    }
}
