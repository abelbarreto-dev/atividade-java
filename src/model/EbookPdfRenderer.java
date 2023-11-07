package model;

public class EbookPdfRenderer extends EbookRenderer {

    @Override
    protected void abrirArquivo(Ebook ebook) {
        System.out.println("Abrindo arquivo " + ebook.getTitulo() + ".pdf ...");
    }

    @Override
    protected void exibirConteudo(Ebook ebook) {
        System.out.println(ebook.getNumeroPaginas() + " páginas renderizadas no PDF com sucesso!");
    }

    @Override
    protected void fecharArquivo() {
        System.out.println("Fechando arquivo PDF...");
    }

}
