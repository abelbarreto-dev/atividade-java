package clean.usecase;

import java.util.ArrayList;

import clean.entity.Multa;

public class DeleteMulta {
    
    private final MultaRepository repository;

    public DeleteMulta(MultaRepository repository) {
        this.repository = repository;
    }

    public Multa delete(int id) {
        if(MultaValidator.validateDeleteMulta(id)) {
            return repository.delete(id);
        } else {
            return null;
        }
    }

    public ArrayList<Multa> deleteMultasByClienteId(int idCliente) {
        if(MultaValidator.validateDeleteMulta(idCliente)) {
            return repository.deleteMultasByClienteId(idCliente);
        } else {
            return null;
        }
    }

}
