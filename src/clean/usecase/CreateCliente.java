package clean.usecase;

import clean.entity.Cliente;

public class CreateCliente {
    
    private final ClienteRepository repository;

    public CreateCliente(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente create(Cliente cliente) {
        if(ClienteValidator.validateCreateCliente(cliente)) {
            return repository.create(cliente);
        } else {
            return null;
        }
    }

}
