package clean.usecase;

import clean.entity.Multa;

public class CreateMulta {
    
    private final MultaRepository repository;

    public CreateMulta(MultaRepository repository) {
        this.repository = repository;
    }

    public Multa create(Multa multa) {
        if(MultaValidator.validateCreateMulta(multa)) {
            return repository.create(multa);
        } else {
            return null;
        }
    }

}
