package clean.usecase;

import clean.entity.Emprestimo;

public class CreateEmprestimo {
    
    private final EmprestimoRepository repository;

    public CreateEmprestimo(EmprestimoRepository repository) {
        this.repository = repository;
    }

    public Emprestimo create(Emprestimo emprestimo) {
        if(EmprestimoValidator.validateCreateEmprestimo(emprestimo)) {
            return repository.create(emprestimo);
        } else {
            return null;
        }
    }

}
