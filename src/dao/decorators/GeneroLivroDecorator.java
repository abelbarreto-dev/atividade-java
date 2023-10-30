package dao.decorators;

import model.Livro;
import model.LivroDecorator;

public class GeneroLivroDecorator implements LivroDecorator {
    
    private Livro livro;
    private String genero;

    public GeneroLivroDecorator (Livro livro, String genero) {
        this.livro = livro;
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    @Override
    public void exibirDescricao() {
        System.out.println(
            "Título: " + livro.getExemplar() +
            "Autor: " + livro.getAutor() +
            "Gênero: " + genero
        );
    }

}
