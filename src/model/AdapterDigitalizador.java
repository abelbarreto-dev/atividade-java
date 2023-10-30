package model;

public class AdapterDigitalizador extends Ebook {

    private Livro livro;

    public AdapterDigitalizador(Livro livro) {
        super();
        this.livro = livro;
    }

    public void abrirEbook() {
        livro.abrirLivro();
    }

    public void lerEbook() {
        livro.lerLivro();
    }

    public void fecharEbook() {
        livro.fecharLivro();
    }

}
