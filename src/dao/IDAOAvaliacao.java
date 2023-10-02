package dao;

import java.sql.SQLException;
import java.util.List;

import model.AvaliacaoLivro;

public interface IDAOAvaliacao {
    public abstract void adicionaAvaliacao(AvaliacaoLivro avl) throws SQLException;
    public abstract List<AvaliacaoLivro> getLista(String id) throws SQLException;
    public abstract List<AvaliacaoLivro> getListaPorCliente(String idCliente) throws SQLException;
    public abstract void altera(AvaliacaoLivro avl) throws SQLException;
    public abstract void remove(int id) throws SQLException;
}