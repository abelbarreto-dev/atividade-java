package clean.usecase;

import clean.entity.Cliente;

public class UpdateCliente {
    
    private final ClienteRepository repository;

    public UpdateCliente(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente update(Cliente cliente) {
        if(ClienteValidator.validateUpdateCliente(cliente)) {
            return repository.update(cliente);
        } else {
            return null;
        }
    }

}
