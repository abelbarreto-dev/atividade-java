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
    public void altera(AvaliacaoLivro avl) throws SQLException {
        if (!this.verificaDados(avl)) {
            throw new SQLException("Erro ao alterar livro.");
        }

        this.daoAvaliacao.altera(avl);
    }

    @Override
    public void remove(int id) throws SQLException {
        this.daoAvaliacao.remove(id);
    }

    private boolean verificaDados(AvaliacaoLivro avl) {
        if (
            avl.getIdCliente() <= 0 ||
            avl.getIdLivro() == 0 ||
            avl.getComentario().equals("") ||
            avl.getDataAvaliacao().equals("")
        ) {
            return false;
        }
        return true;
    }

}