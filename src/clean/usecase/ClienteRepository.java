package clean.usecase;

import clean.entity.Cliente;
import java.util.ArrayList;

public interface ClienteRepository {
    
    Cliente create(Cliente cliente);
    Cliente update(Cliente cliente);
    Cliente delete(int id);
    ArrayList<Cliente> findAllClientes();

}
