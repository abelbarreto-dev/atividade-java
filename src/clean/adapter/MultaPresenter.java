package clean.adapter;

import clean.entity.Multa;

public class MultaPresenter {
    
    private int idMulta;
    private int idCliente;
    private String descricao;
    private float valor;

    public static MultaPresenter mapToMultaModel(Multa multa) {
        MultaPresenter multaModel = new MultaPresenter();
        multaModel.idMulta = multa.getIdMulta();
        multaModel.idCliente = multa.getIdCliente();
        multaModel.descricao = multa.getDescricao();
        multaModel.valor = multa.getValor();
        return multaModel;
    }

    public static Multa mapToMulta(MultaPresenter multaPresenter) {
        return new Multa(
            multaPresenter.getIdMulta(),
            multaPresenter.getIdCliente(),
            multaPresenter.getDescricao(),
            multaPresenter.getValor()
        );
    }

    @Override
    public String toString() {
        return "MultaModel { \n" +
            "idMulta='" + idMulta + "'\n" +
            "idCliente='" + idCliente + "'\n" +
            "descricao=" + descricao + "\n" +
            "valor='" + valor + "'\n" +
            "}";
    }

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
