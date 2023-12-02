package clean.usecase;

import java.util.ArrayList;

import clean.entity.Cliente;

public class GetClientes {
    
    private final ClienteRepository repository;

    public GetClientes(ClienteRepository repository) {
        this.repository = repository;
    }

    public ArrayList<Cliente> get() {
        return repository.findAllClientes();
    }

}
