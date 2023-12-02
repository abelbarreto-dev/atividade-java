package clean.entity;

public class Multa {
    private int idMulta;
    private int idCliente;
    private String descricao;
    private float valor;

    public Multa(int idMulta, int idCliente, String descricao, float valor) {
        this.idMulta = idMulta;
        this.idCliente = idCliente;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Multa() {
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
