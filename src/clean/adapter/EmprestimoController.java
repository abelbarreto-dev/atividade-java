package clean.adapter;

import clean.usecase.CreateEmprestimo;
import clean.usecase.DeleteEmprestimo;
import clean.usecase.GetEmprestimos;
import clean.usecase.UpdateEmprestimo;
import clean.usecase.VerificaEmprestimo;

import java.util.ArrayList;

import clean.entity.Emprestimo;

public class EmprestimoController {
    
    private final CreateEmprestimo createEmprestimo;
    private final UpdateEmprestimo updateEmprestimo;
    private final DeleteEmprestimo deleteEmprestimo;
    private final GetEmprestimos getEmprestimos;
    private final VerificaEmprestimo verificaEmprestimo;
    
    public EmprestimoController(CreateEmprestimo createEmprestimo,
            UpdateEmprestimo updateEmprestimo,
            DeleteEmprestimo deleteEmprestimo,
            GetEmprestimos getEmprestimos,
            VerificaEmprestimo verificaEmprestimo) {
        this.createEmprestimo = createEmprestimo;
        this.updateEmprestimo = updateEmprestimo;
        this.deleteEmprestimo = deleteEmprestimo;
        this.getEmprestimos = getEmprestimos;
        this.verificaEmprestimo = verificaEmprestimo;
    }

    public EmprestimoPresenter createEmprestimo(EmprestimoPresenter emprestimoPresenter) {
        Emprestimo emprestimo = createEmprestimo.create(EmprestimoPresenter.mapToEmprestimo(emprestimoPresenter));
        return EmprestimoPresenter.mapToEmprestimoModel(emprestimo);
    }

    public EmprestimoPresenter updateEmprestimo(EmprestimoPresenter emprestimoPresenter) {
        Emprestimo emprestimo = updateEmprestimo.update(EmprestimoPresenter.mapToEmprestimo(emprestimoPresenter));
        return EmprestimoPresenter.mapToEmprestimoModel(emprestimo);
    }

    public EmprestimoPresenter deleteEmprestimo(EmprestimoPresenter emprestimoPresenter) {
        Emprestimo emprestimo = deleteEmprestimo.delete(EmprestimoPresenter.mapToEmprestimo(emprestimoPresenter).getIdEmprestimo());
        return EmprestimoPresenter.mapToEmprestimoModel(emprestimo);
    }

    public ArrayList<EmprestimoPresenter> getEmprestimos() {
        ArrayList<Emprestimo> emprestimos = getEmprestimos.get();
        ArrayList<EmprestimoPresenter> emprestimosPresenter = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            EmprestimoPresenter emprestimoModel = EmprestimoPresenter.mapToEmprestimoModel(emprestimo);
            emprestimosPresenter.add(emprestimoModel);
        }
        return emprestimosPresenter;
    }

    public ArrayList<EmprestimoPresenter> getEmprestimosByClienteId(int idCliente) {
        ArrayList<Emprestimo> emprestimos = getEmprestimos.getEmprestimosByClienteId(idCliente);
        ArrayList<EmprestimoPresenter> emprestimosPresenter = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            EmprestimoPresenter emprestimoModel = EmprestimoPresenter.mapToEmprestimoModel(emprestimo);
            emprestimosPresenter.add(emprestimoModel);
        }
        return emprestimosPresenter;
    }

    public String verificaEmprestimoPorClienteId(int idCliente) {
        boolean checagem = verificaEmprestimo.verifica(idCliente);
        String resposta = (checagem)
            ? "O cliente possui empréstimo(s)."
            : "O cliente não possui empréstimo(s).";
        return resposta;
    }

}
