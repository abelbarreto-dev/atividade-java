package model;

public class Ebook {

    private int id;
    private String titulo;
    private String autor;
    private String genero;
    private int numeroPaginas;
    private int ano;

    public Ebook() {};

    private Ebook(int id, String titulo, String autor, int numeroPaginas, String genero, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getAno() {
        return ano;
    }

    public static class EbookBuilder {
        private int id;
        private String titulo;
        private String autor;
        private String genero;
        private int numeroPaginas;
        private int ano;

        public EbookBuilder(int id) {
            this.id = id;
        }

        public EbookBuilder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public EbookBuilder autor(String autor) {
            this.autor = autor;
            return this;
        }

        public EbookBuilder genero(String genero) {
            this.genero = genero;
            return this;
        }

        public EbookBuilder numeroPaginas(int numeroPaginas) {
            this.numeroPaginas = numeroPaginas;
            return this;
        }

        public EbookBuilder ano(int ano) {
            this.ano = ano;
            return this;
        }

        public Ebook build() {
            return new Ebook(id, titulo, autor, numeroPaginas, genero, ano);
        }
    }

    public void abrirEbook() {
        System.out.println("Executando arquivo do ebook " + this.titulo);
    }

    public void lerEbook() {
        System.out.println("Lendo ebook...");
    }

    public void fecharEbook() {
        System.out.println("Fechando arquivo do ebook " + this.titulo);
    }

}
