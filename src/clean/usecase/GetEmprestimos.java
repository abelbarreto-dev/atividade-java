package clean.usecase;

import java.util.ArrayList;
import clean.entity.Emprestimo;

public class GetEmprestimos {
    
    private final EmprestimoRepository repository;

    public GetEmprestimos(EmprestimoRepository repository) {
        this.repository = repository;
    }

    public ArrayList<Emprestimo> get() {
        return repository.findAllEmprestimos();
    }

    public ArrayList<Emprestimo> getEmprestimosByClienteId(int idCliente) {
        return repository.findEmprestimosByClienteId(idCliente);
    }

}
