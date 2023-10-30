package model;

public class EspiralComAcetato extends FormatoLivro {
    public EspiralComAcetato(Livro livro) {
        super(livro);
    }

    public String obterInfo() {
        return "Este livro foi publicado em formato de espiral com acetato, provendo facilidade na troca de páginas.";
    }
}
