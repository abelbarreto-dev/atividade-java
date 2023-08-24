package service;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;
import utils.DAOCliente;
import utils.IDAOCliente;

public class ServiceA implements IServiceA {
    // Cliente

    private IDAOCliente daoCliente = new DAOCliente();

    public ServiceA() throws SQLException
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
