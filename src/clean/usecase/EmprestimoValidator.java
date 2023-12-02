package clean.usecase;

import clean.entity.Emprestimo;

public class EmprestimoValidator {
    
    public static boolean validateCreateEmprestimo(Emprestimo emprestimo) {
        if(emprestimo.getIdEmprestimo() <= 0
            || emprestimo.getIdCliente() <= 0
            || emprestimo.getIdLivro() <= 0
            || emprestimo.getDataEmprestimo().equals("")
            || emprestimo.getDataDevolucao().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateUpdateEmprestimo(Emprestimo emprestimo) {
        if(emprestimo.getIdEmprestimo() <= 0
            || emprestimo.getIdCliente() <= 0
            || emprestimo.getIdLivro() <= 0
            || emprestimo.getDataEmprestimo().equals("")
            || emprestimo.getDataDevolucao().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateDeleteEmprestimo(int id) {
        if(id <= 0) {
            return false;
        } else {
            return true;
        }
    }

}
