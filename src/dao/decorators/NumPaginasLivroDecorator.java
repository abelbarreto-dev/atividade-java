package dao.decorators;

import model.Livro;
import model.LivroDecorator;

public class NumPaginasLivroDecorator implements LivroDecorator {
    
    private Livro livro;
    private int numeroPaginas;

    public NumPaginasLivroDecorator (Livro livro, int numPaginas) {
        this.livro = livro;
        this.numeroPaginas = numPaginas;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    @Override
    public void exibirDescricao() {
        System.out.println(
            "Título: " + livro.getExemplar() +
            "Autor: " + livro.getAutor() +
            "Número de páginas: " + numeroPaginas
        );
    }

}
