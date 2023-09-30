package controllers;

import java.sql.SQLException;
import java.util.List;

import dao.DAOCliente;
import dao.IDAOCliente;
import model.Cliente;

public class ServiceCliente implements IServiceCliente {
    // Cliente

    private IDAOCliente daoCliente = new DAOCliente();

    public ServiceCliente() throws SQLException
    {
        super();
    }

    private boolean verificaDados(Cliente cliente) {
        if (
            cliente.getNome().equals("") ||
            cliente.getDataNasc().equals("") ||
            cliente.getSexo().equals("") || 
            cliente.getCpf().equals("") ||
            cliente.getEndereco().equals("")
        ) {
            return false;
        }

        return true;
    }

    @Override
    public void cadastraRegistro(Cliente cliente) throws SQLException {
        if (!this.verificaDados(cliente)) {
            throw new SQLException("Erro ao cadastrar cliente.");
        }

        this.daoCliente.adicionaCliente(cliente);
    }

    @Override
    public List<Cliente> getLista(String nome) throws SQLException
    {
        return this.daoCliente.getLista(nome);
    }

    @Override
    public void remove(int id) throws SQLException
    {
        if (id < 1)
        {
            throw new SQLException("id deve ser maior que zero.");
        }

        this.daoCliente.remove(id);
    }

    @Override
    public void altera(Cliente cliente) throws SQLException
    {
        if (!this.verificaDados(cliente)) {
            throw new SQLException("Erro ao alterar cliente.");
        }

        this.daoCliente.adicionaCliente(cliente);
    }
}
