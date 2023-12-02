package clean.adapter;

import clean.entity.Emprestimo;

public class EmprestimoPresenter {
    
    private int idEmprestimo;
    private int idCliente;
    private int idLivro;
    private String dataEmprestimo;
    private String dataDevolucao;

    public static EmprestimoPresenter mapToEmprestimoModel(Emprestimo emprestimo) {
        EmprestimoPresenter emprestimoModel = new EmprestimoPresenter();
        emprestimoModel.idEmprestimo = emprestimo.getIdEmprestimo();
        emprestimoModel.idCliente = emprestimo.getIdCliente();
        emprestimoModel.idLivro = emprestimo.getIdLivro();
        emprestimoModel.dataEmprestimo = emprestimo.getDataEmprestimo();
        emprestimoModel.dataDevolucao = emprestimo.getDataDevolucao();
        return emprestimoModel;
    }

    public static Emprestimo mapToEmprestimo(EmprestimoPresenter emprestimoPresenter) {
        return new Emprestimo(
            emprestimoPresenter.getIdEmprestimo(),
            emprestimoPresenter.getIdCliente(),
            emprestimoPresenter.getIdLivro(),
            emprestimoPresenter.getDataEmprestimo(),
            emprestimoPresenter.getDataDevolucao()
        );
    }

    @Override
    public String toString() {
        return "EmprestimoModel { \n" +
            "idEmprestimo='" + idEmprestimo + "'\n" +
            "idCliente='" + idCliente + "'\n" +
            "idLivro=" + idLivro + "\n" +
            "dataEmprestimo='" + dataEmprestimo + "'\n" +
            "dataDevolucao='" + dataDevolucao + "'\n" +
            "}";
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}
