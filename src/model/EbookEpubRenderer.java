package model;

public class EbookEpubRenderer extends EbookRenderer {

    @Override
    protected void abrirArquivo(Ebook ebook) {
        System.out.println("Abrindo arquivo " + ebook.getTitulo() + ".epub ...");
    }

    @Override
    protected void exibirConteudo(Ebook ebook) {
        System.out.println(ebook.getNumeroPaginas() + " páginas renderizadas no Epub com sucesso!");
    }

    @Override
    protected void fecharArquivo() {
        System.out.println("Fechando arquivo Epub...");
    }

}
