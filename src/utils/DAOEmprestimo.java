package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Emprestimo;

public class DAOEmprestimo implements IDAOEmprestimo {
    
    private Connection conexao;
    
    public DAOEmprestimo() throws SQLException {       
        this.conexao = DAOFactory.getConexao();
    }
     
    @Override
    public void adicionaEmprestimo(Emprestimo e) throws SQLException {
        String sql = "INSERT INTO emprestimo(id_cliente, id_livro, data_emprestimo, data_devolucao) VALUES(?, ?, ?, ?)";       
        PreparedStatement stmt;
        stmt = this.conexao.prepareStatement(sql);
                
        stmt.setString(1, String.valueOf(e.getIdCliente()));
        stmt.setString(2, String.valueOf(e.getIdLivro()));
        stmt.setString(3, e.getDataEmprestimo());
        stmt.setString(4, e.getDataDevolucao());
        
        stmt.execute();
        stmt.close();
    }
    
    @Override
    public List<Emprestimo> getLista(String id) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Emprestimo> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM emprestimo WHERE id_emprestimo like ?";
            stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, id);

            rs = stmt.executeQuery();

            while(rs.next()) {
                Emprestimo e = new Emprestimo();
                e.setIdEmprestimo(Integer.valueOf(rs.getString("id_emprestimo")));
                e.setIdCliente(Integer.valueOf(rs.getString("id_cliente")));
                e.setIdLivro(Integer.valueOf(rs.getString("id_livro")));
                e.setDataEmprestimo(rs.getString("data_emprestimo"));
                e.setDataDevolucao(rs.getString("data_devolucao"));
                
                lista.add(e);
            }

            return lista;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (stmt != null) {stmt.close();}
            if (rs != null) {rs.close();}
        }   
        return lista;            
    }

    @Override
    public List<Emprestimo> getListaPorCliente(String idCliente) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Emprestimo> lista = new ArrayList<>();

        try {
            String sql = "SELECT emprestimo.id_emprestimo, emprestimo.id_cliente, emprestimo.id_livro, emprestimo.data_emprestimo, emprestimo.data_devolucao" +
                    " FROM emprestimo" +
                    " INNER JOIN cliente" +
                    " ON emprestimo.id_cliente = cliente.id_cliente" +
                    " WHERE emprestimo.id_cliente = ?;";
            stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, idCliente);

            rs = stmt.executeQuery();

            while(rs.next()) {
                Emprestimo e = new Emprestimo();
                
                e.setIdEmprestimo(Integer.valueOf(rs.getString("emprestimo.id_emprestimo")));
                e.setIdCliente(Integer.valueOf(rs.getString("emprestimo.id_cliente")));
                e.setIdLivro(Integer.valueOf(rs.getString("emprestimo.id_livro")));
                e.setDataEmprestimo(rs.getString("emprestimo.data_emprestimo"));
                e.setDataDevolucao(rs.getString("emprestimo.data_devolucao"));
                
                lista.add(e);            
            }

            return lista;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (stmt != null) {stmt.close();}
            if (rs != null) {rs.close();}
        }
        return lista;            
    }
    
    @Override
    public boolean verificaMultaCliente(String idCliente) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT COUNT(multa.id_cliente) AS quantMulta" +
                        " FROM multa" +
                        " WHERE id_cliente = ?;";
            stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, idCliente);

            rs = stmt.executeQuery();

            rs.next();
        
            int quantMulta = 0;
            quantMulta = rs.getInt("quantMulta");
            
            rs.close();
            stmt.close();
            
            if (quantMulta > 0) {
                return true;
            }
        
            return false;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (stmt != null) {stmt.close();}
            if (rs != null) {rs.close();}
        }
    }
    
    @Override
    public void remove(int id) throws SQLException {       

        String sql = "DELETE FROM emprestimo WHERE id_emprestimo=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.execute();
        stmt.close();

    }
}
