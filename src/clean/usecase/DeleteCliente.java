package clean.usecase;

import clean.entity.Cliente;

public class DeleteCliente {
    
    private final ClienteRepository repository;

    public DeleteCliente(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente delete(int id) {
        if(ClienteValidator.validateDeleteCliente(id)) {
            return repository.delete(id);
        } else {
            return null;
        }
    }

}
