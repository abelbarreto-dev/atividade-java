package clean.usecase;

import clean.entity.Emprestimo;
import java.util.ArrayList;

public interface EmprestimoRepository {
    
    Emprestimo create(Emprestimo emprestimo);
    Emprestimo update(Emprestimo emprestimo);
    Emprestimo delete(int id);
    ArrayList<Emprestimo> findAllEmprestimos();
    ArrayList<Emprestimo> findEmprestimosByClienteId(int idCliente);
    boolean verificaEmprestimoPorClienteId(int idCliente);

}
