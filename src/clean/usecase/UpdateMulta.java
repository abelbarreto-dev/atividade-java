package clean.usecase;

import clean.entity.Multa;

public class UpdateMulta {
    
    private final MultaRepository repository;

    public UpdateMulta(MultaRepository repository) {
        this.repository = repository;
    }

    public Multa update(Multa multa) {
        if(MultaValidator.validateUpdateMulta(multa)) {
            return repository.update(multa);
        } else {
            return null;
        }
    }

}
