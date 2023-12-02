package clean.usecase;

import clean.entity.Emprestimo;

public class UpdateEmprestimo {
    
    private final EmprestimoRepository repository;

    public UpdateEmprestimo(EmprestimoRepository repository) {
        this.repository = repository;
    }

    public Emprestimo update(Emprestimo emprestimo) {
        if(EmprestimoValidator.validateUpdateEmprestimo(emprestimo)) {
            return repository.update(emprestimo);
        } else {
            return null;
        }
    }

}
