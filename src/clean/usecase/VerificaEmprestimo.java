package clean.usecase;

public class VerificaEmprestimo {
    
    private final EmprestimoRepository repository;

    public VerificaEmprestimo(EmprestimoRepository repository) {
        this.repository = repository;
    }

    public boolean verifica(int idCliente) {
        return repository.verificaEmprestimoPorClienteId(idCliente);
    }

}
