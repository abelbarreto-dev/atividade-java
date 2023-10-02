package dao;

import java.sql.SQLException;
import java.util.List;

import model.Ebook;
import model.Ebook.EbookBuilder;

public interface IDAOEbook {
    public abstract void adicionaEbook(Ebook ebook) throws SQLException;
    public abstract List<EbookBuilder> getLista(String titulo) throws SQLException;
    public abstract void altera(Ebook ebook) throws SQLException;
    public abstract void remove(int id) throws SQLException;
}
