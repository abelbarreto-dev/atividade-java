package controllerslers;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;

public interface IServiceCliente {
    public abstract void cadastraRegistro(Cliente cliente) throws SQLException;
    public abstract List<Cliente> getLista(String nome) throws SQLException;
    public abstract void remove(int id) throws SQLException;
    public abstract void altera(Cliente cliente) throws SQLException;
}
