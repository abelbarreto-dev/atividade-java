package controllers;

import java.sql.SQLException;
import java.util.List;

import model.Livro;
import dao.DAOLivro;
import dao.IDAOLivro;

public class ServiceLivro implements IServiceLivro{
    private IDAOLivro daoLivro = new DAOLivro();

    public ServiceLivro() throws SQLException
    {
        super();
    }

    @Override
    public void adicionaLivro(Livro livro) throws SQLException {
        if (!this.verificaDados(livro)) {
            throw new SQLException("Erro ao cadastrar livro.");
        }

        this.daoLivro.adicionaLivro(livro);
    }

    @Override
    public List<Livro> getLista(String exemplar) throws SQLException {
        return this.daoLivro.getLista(exemplar);
    }

    @Override
    public void altera(Livro livro) throws SQLException {
        if (!this.verificaDados(livro)) {
            throw new SQLException("Erro ao alterar livro.");
        }

        this.daoLivro.altera(livro);
    }

    @Override
    public void alteraDisponibilidadeLivro(Livro livro) throws SQLException {
        this.daoLivro.alteraDisponibilidadeLivro(livro);
    }

    @Override
    public void remove(int id) throws SQLException {
        this.daoLivro.remove(id);
    }

    private boolean verificaDados(Livro livro) {
        if (
            livro.getExemplar().equals("") ||
            livro.getAno() == 0 ||
            livro.getAutor().equals("") ||
            livro.getEdicao() == 0 ||
            livro.getDisponibilidade().equals("")
        ) {
            return false;
        }
        
        return true;
    }
}
