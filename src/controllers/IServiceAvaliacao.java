package controllers;

import java.sql.SQLException;
import java.util.List;

import model.AvaliacaoLivro;

public interface IServiceAvaliacao {
    public abstract void adicionaAvaliacao(int idCliente, int idLivro, String comentario, String dataAvaliacao) throws SQLException;
    public abstract List<AvaliacaoLivro> getLista(String id) throws SQLException;
    public abstract List<AvaliacaoLivro> getListaPorCliente(String idCliente) throws SQLException;
    public abstract void altera(AvaliacaoLivro avl) throws SQLException;
    public abstract void remove(int id) throws SQLException;
}