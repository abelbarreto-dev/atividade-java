package service;

import java.sql.SQLException;
import java.util.List;

import model.Livro;

public interface IServiceC {
    public abstract void adicionaLivro(Livro livro) throws SQLException;
    public abstract List<Livro> getLista(String exemplar) throws SQLException;
    public abstract void altera(Livro livro) throws SQLException;
    public abstract void alteraDisponibilidadeLivro(Livro livro) throws SQLException;
    public abstract void remove(int id) throws SQLException;
}
