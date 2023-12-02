package clean.db;

import clean.entity.Emprestimo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import clean.usecase.EmprestimoRepository;

public class EmprestimoDAO implements EmprestimoRepository {

    private final Map<Integer, Emprestimo> baseEmprestimos = new HashMap<>();

    @Override
    public Emprestimo create(Emprestimo emprestimo) {
        baseEmprestimos.put(emprestimo.getIdEmprestimo(), emprestimo);
        return emprestimo;
    }

    @Override
    public Emprestimo update(Emprestimo emprestimo) {
        if (baseEmprestimos.containsKey(emprestimo.getIdEmprestimo())) {
            baseEmprestimos.put(emprestimo.getIdEmprestimo(), emprestimo);
            return emprestimo;
        } else {
            throw new IllegalArgumentException("Emprestimo não encontrado: ID inexistente " + emprestimo.getIdEmprestimo());
        }
    }

    @Override
    public Emprestimo delete(int id) {
        if (baseEmprestimos.containsKey(id)) {
            return baseEmprestimos.remove(id);
        } else {
            throw new IllegalArgumentException("Emprestimo não encontrado: ID inexistente " + id);
        }
    }

    @Override
    public ArrayList<Emprestimo> findAllEmprestimos() {
        return new ArrayList<>(baseEmprestimos.values());
    }

    @Override
    public ArrayList<Emprestimo> findEmprestimosByClienteId(int idCliente) {
        ArrayList<Emprestimo> emprestimosCliente = new ArrayList<>();
        for (Emprestimo emprestimo : baseEmprestimos.values()) {
            if (emprestimo.getIdCliente() == idCliente) {
                emprestimosCliente.add(emprestimo);
            }
        }
        return emprestimosCliente;
    }

    @Override
    public boolean verificaEmprestimoPorClienteId(int idCliente) {
        for (Emprestimo emprestimo : baseEmprestimos.values()) {
            if (emprestimo.getIdCliente() == idCliente) {
                return true;
            }
        }
        return false;
    }
    
}
