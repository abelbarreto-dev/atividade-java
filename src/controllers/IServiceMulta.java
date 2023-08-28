package controllers;

import java.sql.SQLException;
import java.util.List;

import model.Multa;

public interface IServiceMulta {
    public abstract void adicionaMulta(Multa multa) throws SQLException;
    public abstract List<Multa> getLista(String id) throws SQLException;
    public abstract List<Multa> getListaMultaPorCliente(String id_cliente) throws SQLException;
    public abstract String totalMultaCliente(String id_cliente) throws SQLException;
    public abstract void remove(int id) throws SQLException;
    public abstract void removeMultas(String id) throws SQLException;
}
