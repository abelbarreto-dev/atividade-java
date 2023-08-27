package dao;

import java.sql.SQLException;
import java.util.List;

import model.Emprestimo;

public interface IDAOEmprestimo {
    public abstract void adicionaEmprestimo(Emprestimo e) throws SQLException;
    public abstract List<Emprestimo> getLista(String id) throws SQLException;
    public abstract List<Emprestimo> getListaPorCliente(String idCliente) throws SQLException;
    public abstract boolean verificaMultaCliente(String idCliente) throws SQLException;
    public abstract void remove(int id) throws SQLException;
}