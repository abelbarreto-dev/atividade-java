package clean.adapter;

import clean.entity.Cliente;

public class ClientePresenter {
    
    private int id;
    private String nome;
    private String dataNasc;
    private String sexo;
    private String cpf;
    private String endereco;
    private String fone;

    public static ClientePresenter mapToClienteModel(Cliente cliente) {
        ClientePresenter clienteModel = new ClientePresenter();
        clienteModel.id = cliente.getId();
        clienteModel.nome = cliente.getNome();
        clienteModel.dataNasc = cliente.getDataNasc();
        clienteModel.sexo = cliente.getSexo();
        clienteModel.cpf = cliente.getCpf();
        clienteModel.endereco = cliente.getEndereco();
        clienteModel.fone = cliente.getFone();
        return clienteModel;
    }

    public static Cliente mapToCliente(ClientePresenter clientePresenter) {
        return new Cliente(
            clientePresenter.getId(),
            clientePresenter.getNome(),
            clientePresenter.getDataNasc(),
            clientePresenter.getSexo(),
            clientePresenter.getCpf(),
            clientePresenter.getEndereco(),
            clientePresenter.getFone()
        );
    }

    @Override
    public String toString() {
        return "ClienteModel { \n" +
            "nome='" + nome + "'\n" +
            "dataNasc='" + dataNasc + "'\n" +
            "sexo=" + sexo + "\n" +
            "cpf='" + cpf + "'\n" +
            "endereco='" + endereco + "'\n" +
            "fone='" + fone + "'\n" +
            "}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

}
