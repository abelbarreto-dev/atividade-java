package clean.usecase;

import clean.entity.Emprestimo;

public class DeleteEmprestimo {
    
    private final EmprestimoRepository repository;

    public DeleteEmprestimo(EmprestimoRepository repository) {
        this.repository = repository;
    }

    public Emprestimo delete(int id) {
        if(EmprestimoValidator.validateDeleteEmprestimo(id)) {
            return repository.delete(id);
        } else {
            return null;
        }
    }

}
