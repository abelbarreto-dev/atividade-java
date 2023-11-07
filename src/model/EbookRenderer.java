package model;

public abstract class EbookRenderer {
    
    public final void renderizarEbook(Ebook ebook) {
        abrirArquivo(ebook);
        exibirConteudo(ebook);
        fecharArquivo();
    }

    protected abstract void abrirArquivo(Ebook ebook);

    protected abstract void exibirConteudo(Ebook ebook);

    protected abstract void fecharArquivo();

}
