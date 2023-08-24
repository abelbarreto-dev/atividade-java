package service;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import model.Multa;
import utils.IDAOMulta;
import utils.DAOMulta;

public class ServiceD implements IServiceD {

    @Override
    public void adicionaMulta(Multa multa) throws SQLException {
        if (!this.verificaDados(multa))
        {
            throw new SQLException("Problem to validade data");
        }

        this.daoMulta.adicionaMulta(multa);
    }

    @Override
    public List<Multa> getLista(String id) throws SQLException {
        return this.daoMulta.getLista(id);
    }

    @Override
    public List<Multa> getListaMultaPorCliente(String id_cliente) throws SQLException {
        return this.daoMulta.getListaMultaPorCliente(id_cliente);
    }

    @Override
    public String totalMultaCliente(String id_cliente) throws SQLException {
        return this.daoMulta.totalMultaCliente(id_cliente);
    }

    @Override
    public void remove(int id) throws SQLException {
        this.daoMulta.remove(id);
    }

    @Override
    public void removeMultas(String id) throws SQLException {
        this.daoMulta.removeMultas(id);
    }

    private boolean verificaDados(Multa multa) {
        if (
            multa.getIdCliente() == 0 ||
            multa.getValor() < 0
        )
        {
            return false;
        }
    
        return true;
    }

    private IDAOMulta daoMulta = new DAOMulta();
}
