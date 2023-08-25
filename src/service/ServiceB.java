package service;

import java.sql.SQLException;
import java.util.List;

import model.Emprestimo;
import utils.DAOEmprestimo;
import utils.IDAOEmprestimo;
 
public class ServiceB implements IServiceB {
    private IDAOEmprestimo daoEmprestimo = new DAOEmprestimo();

    public ServiceB() throws SQLException {
        super();
    }

    @Override
    public void adicionaEmprestimo(Emprestimo emprestimo) throws SQLException {
        if (!this.verificaDados(emprestimo)) {
            throw new SQLException("Erro ao cadastrar emprestimo.");
        }

        this.daoEmprestimo.adicionaEmprestimo(emprestimo);
    }

    @Override
    public List<Emprestimo> getLista(String id) throws SQLException {
        return this.daoEmprestimo.getLista(id);
    }

    @Override
    public List<Emprestimo> getListaPorCliente(String idCliente) throws SQLException {
        return this.daoEmprestimo.getListaPorCliente(idCliente);
    }

    @Override
    public boolean verificaMultaCliente(String idCliente) throws SQLException {
        return this.daoEmprestimo.verificaMultaCliente(idCliente);
    }

    @Override
    public void altera(Emprestimo emprestimo) throws SQLException {
        if (!this.verificaDados(emprestimo)) {
            throw new SQLException("Erro ao alterar emprestimo.");
        }

        this.daoEmprestimo.altera(emprestimo);
    }

    @Override
    public void remove(int id) throws SQLException {
        this.daoEmprestimo.remove(id);
    }

    private boolean verificaDados(Emprestimo emprestimo) {
        if (emprestimo.getIdCliente() == null ||
        emprestimo.getIdLivro() == null ||
        emprestimo.getDataEmprestimo.equals("") ||
        emprestimo.getDataDevolucao.equals("")) {
            return false;
        }

        return true;
    }
}
