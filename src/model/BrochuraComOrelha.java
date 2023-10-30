package model;

public class BrochuraComOrelha extends FormatoLivro {
    public BrochuraComOrelha(Livro livro) {
        super(livro);
    }

    public String obterInfo() {
        return "Este livro foi publicado em formato de brochura com orelha, no qual a estrutura da capa é reforçada para manuseio.";
    }
}