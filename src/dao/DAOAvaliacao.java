package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DAOFactory;
import model.AvaliacaoLivro;
import model.AvaliacaoTexto;

public class DAOAvaliacao implements IDAOAvaliacao {
    
    private Connection conexao;
    
    public DAOAvaliacao() throws SQLException {       
        this.conexao = DAOFactory.getConexao();
    }
     
    @Override
    public void adicionaAvaliacao(AvaliacaoLivro e) throws SQLException {
        String sql = "INSERT INTO avaliacao(id_cliente, id_livro, comentario, data_avaliacao) VALUES(?, ?, ?, ?)";       
        PreparedStatement stmt;
        stmt = this.conexao.prepareStatement(sql);
                
        stmt.setString(1, String.valueOf(e.getIdCliente()));
        stmt.setString(2, String.valueOf(e.getIdLivro()));
        stmt.setString(3, String.valueOf(e.getComentario()));
        stmt.setString(4, e.getDataAvaliacao());
        
        stmt.execute();
        stmt.close();
    }
    
    @Override
    public List<AvaliacaoLivro> getLista(String id) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<AvaliacaoLivro> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM avaliacao WHERE id_avaliacao like ?";
            stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, id);

            rs = stmt.executeQuery();

            while(rs.next()) {
                AvaliacaoLivro e = new AvaliacaoTexto();
                e.setIdAvaliacao(Integer.valueOf(rs.getString("id_avaliacao")));
                e.setIdCliente(Integer.valueOf(rs.getString("id_cliente")));
                e.setIdLivro(Integer.valueOf(rs.getString("id_livro")));
                e.setComentario(rs.getString("comentario"));
                e.setDataAvaliacao(rs.getString("data_avaliacao"));
                
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
    public List<AvaliacaoLivro> getListaPorCliente(String idCliente) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<AvaliacaoLivro> lista = new ArrayList<>();

        try {
            String sql = "SELECT avaliacao.id_avaliacao, avaliacao.id_cliente," +
                    " avaliacao.id_livro, avaliacao.comentario, avaliacao.data_avaliacao" +
                    " FROM avaliacao" +
                    " INNER JOIN cliente" +
                    " ON avaliacao.id_cliente = cliente.id_cliente" +
                    " WHERE avaliacao.id_cliente = ?;";
            stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, idCliente);

            rs = stmt.executeQuery();

            while(rs.next()) {
                AvaliacaoLivro e = new AvaliacaoTexto();
                
                e.setIdAvaliacao(Integer.valueOf(rs.getString("avaliacao.id_avaliacao")));
                e.setIdCliente(Integer.valueOf(rs.getString("avaliacao.id_cliente")));
                e.setIdLivro(Integer.valueOf(rs.getString("avaliacao.id_livro")));
                e.setComentario(rs.getString("avaliacao.comentario"));
                e.setDataAvaliacao(rs.getString("avaliacao.data_avaliacao"));
                
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
    public void remove(int id) throws SQLException {       

        String sql = "DELETE FROM avaliacao WHERE id_avaliacao=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.execute();
        stmt.close();

    }
}
