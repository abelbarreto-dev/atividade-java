package clean;

import clean.db.ClienteDAO;
import clean.db.LivroDAO;
import clean.db.EmprestimoDAO;
import clean.db.MultaDAO;

import clean.usecase.CreateCliente;
import clean.usecase.CreateLivro;
import clean.usecase.CreateEmprestimo;
import clean.usecase.CreateMulta;

import clean.usecase.UpdateCliente;
import clean.usecase.UpdateLivro;
import clean.usecase.UpdateEmprestimo;
import clean.usecase.UpdateMulta;

import clean.usecase.DeleteCliente;
import clean.usecase.DeleteLivro;
import clean.usecase.DeleteEmprestimo;
import clean.usecase.DeleteMulta;

import clean.usecase.GetClientes;
import clean.usecase.GetLivros;
import clean.usecase.GetEmprestimos;
import clean.usecase.GetMultas;

import clean.usecase.VerificaEmprestimo;

public class ManualConfig {
    
    // =========== Instanciando DAOs ===========

    private final ClienteDAO clienteDAO = new ClienteDAO();
    private final LivroDAO livroDAO = new LivroDAO();
    private final EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
    private final MultaDAO multaDAO = new MultaDAO();
    
    // =========== Métodos Create ===========

    public CreateCliente createCliente() {
        return new CreateCliente(clienteDAO);
    }

    public CreateLivro createLivro() {
        return new CreateLivro(livroDAO);
    }

    public CreateEmprestimo createEmprestimo() {
        return new CreateEmprestimo(emprestimoDAO);
    }

    public CreateMulta createMulta() {
        return new CreateMulta(multaDAO);
    }

    // =========== Métodos Update ===========

    public UpdateCliente updateCliente() {
        return new UpdateCliente(clienteDAO);
    }

    public UpdateLivro updateLivro() {
        return new UpdateLivro(livroDAO);
    }

    public UpdateEmprestimo updateEmprestimo() {
        return new UpdateEmprestimo(emprestimoDAO);
    }

    public UpdateMulta updateMulta() {
        return new UpdateMulta(multaDAO);
    }

    // =========== Métodos Delete ===========

    public DeleteCliente deleteCliente() {
        return new DeleteCliente(clienteDAO);
    }

    public DeleteLivro deleteLivro() {
        return new DeleteLivro(livroDAO);
    }

    public DeleteEmprestimo deleteEmprestimo() {
        return new DeleteEmprestimo(emprestimoDAO);
    }

    public DeleteMulta deleteMulta() {
        return new DeleteMulta(multaDAO);
    }

    // =========== Métodos Get ===========

    public GetClientes getClientes() {
        return new GetClientes(clienteDAO);
    }

    public GetLivros getLivros() {
        return new GetLivros(livroDAO);
    }

    public GetEmprestimos getEmprestimos() {
        return new GetEmprestimos(emprestimoDAO);
    }

    public GetMultas getMultas() {
        return new GetMultas(multaDAO);
    }

    // =========== Método para verificar empréstimo por cliente ===========
    public VerificaEmprestimo verificaEmprestimo() {
        return new VerificaEmprestimo(emprestimoDAO);
    }

}
