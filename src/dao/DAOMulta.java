package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DAOFactory;
import model.Multa;

public class DAOMulta implements IDAOMulta{
    private Connection conexao;

    public DAOMulta() throws SQLException {       
        this.conexao = DAOFactory.getConexao();
    }

    @Override
    public void adicionaMulta(Multa multa) throws SQLException {
        String sql = "INSERT INTO multa(id_cliente, descricao, valor) VALUES(?, ?, ?)";       
        PreparedStatement stmt;
        
        stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, String.valueOf(multa.getIdCliente()));
        stmt.setString(2, multa.getDescricao());
        stmt.setString(3, String.valueOf(multa.getValor()));

        stmt.execute();
        stmt.close();
        
    }

    @Override
    public List<Multa> getLista(String id) throws SQLException {
        String sql = "SELECT * FROM multa WHERE id_multa like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, id);
        
        ResultSet rs = stmt.executeQuery();
        
        List<Multa> lista = new ArrayList<>();
        
        while(rs.next()) {
            Multa m = new Multa();

            m.setIdMulta(Integer.valueOf(rs.getString("id_multa")));
            m.setIdCliente(Integer.valueOf(rs.getString("id_cliente")));
            m.setDescricao(rs.getString("descricao"));
            m.setValor(Float.valueOf(rs.getString("valor")));

            lista.add(m);            
        }

        rs.close();
        stmt.close();

        return lista;          
    }

    @Override
    public List<Multa> getListaMultaPorCliente(String id_cliente) throws SQLException {  
        String sql = "SELECT multa.id_multa, multa.id_cliente, multa.descricao, multa.valor " +
                    "FROM multa " +
                    "INNER JOIN cliente " +
                    "ON multa.id_cliente = cliente.id_cliente " +
                    "WHERE multa.id_cliente = ?;";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, id_cliente);

        ResultSet rs = stmt.executeQuery();
        
        List<Multa> lista = new ArrayList<>();

        while(rs.next()) {
            Multa m = new Multa();

            m.setIdMulta(Integer.valueOf(rs.getString("multa.id_multa")));
            m.setIdCliente(Integer.valueOf(rs.getString("multa.id_cliente")));
            m.setDescricao(rs.getString("multa.descricao"));
            m.setValor(Float.valueOf(rs.getString("multa.valor")));

            lista.add(m);            
        }

        rs.close();
        stmt.close();

        return lista;          
    }

    @Override
    public String totalMultaCliente(String id_cliente) throws SQLException {
        String sql = "SELECT SUM(multa.valor) AS totalMulta FROM multa "
                + "INNER JOIN cliente ON multa.id_cliente = cliente.id_cliente "
                + "WHERE cliente.id_cliente = ? "
                + "GROUP BY cliente.id_cliente;";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, id_cliente);

        ResultSet rs = stmt.executeQuery();

        rs.next();
        String totalMulta = String.valueOf(rs.getFloat("totalMulta"));

        System.out.println(totalMulta);

        rs.close();
        stmt.close();

        return totalMulta;

    }

    @Override
    public void remove(int id) throws SQLException {
        String sql = "DELETE FROM multa WHERE id_multa=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.execute();
        stmt.close();        
    }

    @Override
    public void removeMultas(String id) throws SQLException {
        String sql = "DELETE FROM multa WHERE id_cliente=?";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, id);

        stmt.execute();
        stmt.close();        
    }
}
