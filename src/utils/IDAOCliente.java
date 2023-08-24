package utils;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;

public interface IDAOCliente {
    public abstract void adicionaCliente(Cliente c) throws SQLException;
    public abstract List<Cliente> getLista(String nome) throws SQLException;
    public abstract void altera(Cliente c) throws SQLException;
    public abstract void remove(int id) throws SQLException;
}
