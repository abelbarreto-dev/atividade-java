package clean.entity;

public class Livro {
    
    private int id;
    private String exemplar;
    private String autor;
    private int ano;
    private String disponibilidade;

    public Livro(int id, String exemplar, String autor, int ano, String disponibilidade) {
        this.id = id;
        this.exemplar = exemplar;
        this.autor = autor;
        this.ano = ano;
        this.disponibilidade = disponibilidade;
    }

    public Livro() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExemplar() {
        return exemplar;
    }

    public void setExemplar(String exemplar) {
        this.exemplar = exemplar;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

}
