package model;

public class CapaDura extends FormatoLivro {
    public CapaDura(Livro livro) {
        super(livro);
    }

    public String obterInfo() {
        return "Este livro foi publicado em formato capa dura, provendo maior resistência.";
    }
}
