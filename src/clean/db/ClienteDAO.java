package clean.db;

import clean.entity.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import clean.usecase.ClienteRepository;

public class ClienteDAO implements ClienteRepository {

    private final Map<Integer, Cliente> baseClientes = new HashMap<>();

    @Override
    public Cliente create(Cliente cliente) {
        baseClientes.put(cliente.getId(), cliente);
        return cliente;
    }

    @Override
    public Cliente update(Cliente cliente) {
        if (baseClientes.containsKey(cliente.getId())) {
            baseClientes.put(cliente.getId(), cliente);
            return cliente;
        } else {
            throw new IllegalArgumentException("Cliente não encontrado: ID inexistente " + cliente.getId());
        }
    }

    @Override
    public Cliente delete(int id) {
        if (baseClientes.containsKey(id)) {
            return baseClientes.remove(id);
        } else {
            throw new IllegalArgumentException("Cliente não encontrado: ID inexistente " + id);
        }
    }

    @Override
    public ArrayList<Cliente> findAllClientes() {
        return new ArrayList<>(baseClientes.values());
    }
    
}
