package controllers;

import java.sql.SQLException;
import java.util.List;

import model.Emprestimo;

public interface IServiceEmprestimo {
    public abstract void adicionaEmprestimo(Emprestimo emprestimo) throws SQLException;
    public abstract List<Emprestimo> getLista(String exemplar) throws SQLException;
    public abstract List<Emprestimo> getListaPorCliente(String idCliente) throws SQLException;
    public abstract boolean verificaMultaCliente(String idCliente) throws SQLException;
    public abstract void remove(int id) throws SQLException;
}