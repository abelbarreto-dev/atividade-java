package controllers;

import java.sql.SQLException;
import java.util.List;

import factories.FabricaAvaliacao;
import dao.DAOAvaliacao;
import dao.IDAOAvaliacao;
import model.AvaliacaoLivro;

public class ServiceAvaliacao implements IServiceAvaliacao {

    private FabricaAvaliacao fabricaAvaliacao;
    private IDAOAvaliacao daoAvaliacao = new DAOAvaliacao();

    public ServiceAvaliacao() throws SQLException {
        super();
    }

    public ServiceAvaliacao(FabricaAvaliacao fabricaAvaliacao) throws SQLException {
        this.fabricaAvaliacao = fabricaAvaliacao;
    }

    @Override
    public void adicionaAvaliacao(int idCliente, int idLivro, String comentario, String dataAvaliacao) throws SQLException {
        AvaliacaoLivro avaliacaoLivro = fabricaAvaliacao.criarAvaliacao(idCliente, idLivro, comentario, dataAvaliacao);
        avaliacaoLivro.avaliar();
        daoAvaliacao.adicionaAvaliacao(avaliacaoLivro);
    }

    @Override
    public List<AvaliacaoLivro> getLista(String id) throws SQLException {
        return this.daoAvaliacao.getLista(id);
    }

    @Override
    public List<AvaliacaoLivro> getListaPorCliente(String idCliente) throws SQLException {
        return this.daoAvaliacao.getListaPorCliente(idCliente);
    }

    @Override
    public void remove(int id) throws SQLException {
        this.daoAvaliacao.remove(id);
    }

}