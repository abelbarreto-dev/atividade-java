package model;

public class EbookMobiRenderer extends EbookRenderer {

    @Override
    protected void abrirArquivo(Ebook ebook) {
        System.out.println("Abrindo arquivo " + ebook.getTitulo() + ".mobi ...");
    }

    @Override
    protected void exibirConteudo(Ebook ebook) {
        System.out.println(ebook.getNumeroPaginas() + " páginas renderizadas no Mobi com sucesso!");
    }

    @Override
    protected void fecharArquivo() {
        System.out.println("Fechando arquivo Mobi...");
    }

}
