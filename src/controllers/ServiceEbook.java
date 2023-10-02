package controllers;

import java.sql.SQLException;
import java.util.List;

import model.Ebook;
import model.Ebook.EbookBuilder;
import dao.DAOEbook;
import dao.IDAOEbook;

public class ServiceEbook implements IServiceEbook {

    private IDAOEbook daoEbook = new DAOEbook();

    public ServiceEbook() throws SQLException
    {
        super();
    }

    @Override
    public void adicionaEbook(Ebook ebook) throws SQLException {
        if (!this.verificaDados(ebook)) {
            throw new SQLException("Erro ao cadastrar ebook.");
        }

        this.daoEbook.adicionaEbook(ebook);
    }

    @Override
    public List<EbookBuilder> getLista(String titulo) throws SQLException {
        return this.daoEbook.getLista(titulo);
    }

    @Override
    public void altera(Ebook ebook) throws SQLException {
        if (!this.verificaDados(ebook)) {
            throw new SQLException("Erro ao alterar ebook.");
        }

        this.daoEbook.altera(ebook);
    }

    @Override
    public void remove(int id) throws SQLException {
        this.daoEbook.remove(id);
    }

    private boolean verificaDados(Ebook ebook) {
        if (
            ebook.getTitulo().equals("") ||
            ebook.getAno() == 0 ||
            ebook.getAutor().equals("") ||
            ebook.getNumeroPaginas() <= 0 ||
            ebook.getGenero().equals("")
        ) {
            return false;
        }
        
        return true;
    }

}
