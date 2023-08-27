package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DAOFactory;
import model.Livro;

public class DAOLivro implements IDAOLivro {

    private Connection conexao;

    public DAOLivro() throws SQLException {
        this.conexao = DAOFactory.getConexao();
    }

    @Override
    public void adicionaLivro(Livro livro) throws SQLException {

        String sql = "INSERT INTO livro(exemplar, autor, edicao, ano, disponibilidade)"
                + "VALUES(?, ?, ?, ?, ?)";       
        PreparedStatement stmt;

        stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, livro.getExemplar());
        stmt.setString(2, livro.getAutor());
        stmt.setString(3, String.valueOf(livro.getEdicao()));
        stmt.setString(4, String.valueOf(livro.getAno()));
        stmt.setString(5, livro.getDisponibilidade());

        stmt.execute();
        stmt.close();
    }
    
    @Override
    public List<Livro> getLista(String exemplar) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Livro> lista = new ArrayList<>();

        try {
            String sql = "SELECT * FROM livro WHERE exemplar like ?";
            stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, exemplar);

            rs = stmt.executeQuery();

            while(rs.next()) {
                Livro l = new Livro();

                l.setId(Integer.valueOf(rs.getString("id_livro")));
                l.setExemplar(rs.getString("exemplar"));
                l.setAutor(rs.getString("autor"));
                l.setEdicao(Byte.valueOf(rs.getString("edicao")));
                l.setAno(Short.valueOf(rs.getString("ano")));
                l.setDisponibilidade(rs.getString("disponibilidade"));

                lista.add(l);            
            }
            
            return lista;  
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (stmt != null) {stmt.close();}
            if (rs != null) {rs.close();}
        }

        return lista;
    }

    @Override
    public void altera(Livro livro) throws SQLException {
        PreparedStatement stmt = null;

        String sql = "UPDATE livro SET exemplar=?, autor=?, edicao=?, ano=?, disponibilidade=?"
                + " WHERE id_livro=?";
        
        try {
            stmt = this.conexao.prepareStatement(sql);
            
            stmt.setString(1, livro.getExemplar());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, String.valueOf(livro.getEdicao()));
            stmt.setString(4, String.valueOf(livro.getAno()));
            stmt.setString(5, livro.getDisponibilidade());
            stmt.setInt(6, livro.getId());
            
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
        if (stmt != null) {stmt.close();}} catch (SQLException e) {System.out.println(e.getMessage());}
        }
    }
    
    @Override
    public void alteraDisponibilidadeLivro(Livro livro) throws SQLException {
        String sql = "UPDATE livro set disponibilidade=?"
                + "WHERE id_livro=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        stmt.setString(1, livro.getDisponibilidade());
        stmt.setInt(2, livro.getId());
        
        stmt.execute();
        stmt.close();
    }
    
    @Override
    public void remove(int id) throws SQLException {       
        
        String sql = "DELETE FROM livro WHERE id_livro=?";
        
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        stmt.setInt(1, id);
        
        stmt.execute();
        stmt.close();
        
    }
}
