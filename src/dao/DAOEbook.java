package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DAOFactory;
import model.Ebook;
import model.Ebook.EbookBuilder;

public class DAOEbook implements IDAOEbook {

    private Connection conexao;

    public DAOEbook() throws SQLException {
        this.conexao = DAOFactory.getConexao();
    }

    @Override
    public void adicionaEbook(Ebook ebook) throws SQLException {

        String sql = "INSERT INTO ebook(titulo, autor, genero, numero_paginas, ano)"
                + "VALUES(?, ?, ?, ?, ?)";       
        PreparedStatement stmt;

        stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, ebook.getTitulo());
        stmt.setString(2, ebook.getAutor());
        stmt.setString(3, ebook.getGenero());
        stmt.setString(4, String.valueOf(ebook.getNumeroPaginas()));
        stmt.setString(5, String.valueOf(ebook.getAno()));

        stmt.execute();
        stmt.close();
    }
    
    @Override
    public List<EbookBuilder> getLista(String titulo) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<EbookBuilder> lista = new ArrayList<>();

        try {
            String sql = "SELECT * FROM ebook WHERE titulo like ?";
            stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, titulo);

            rs = stmt.executeQuery();

            while(rs.next()) {
                EbookBuilder l = new Ebook.EbookBuilder(rs.getInt("id_ebook"))
                    .titulo(rs.getString("titulo"))
                    .autor(rs.getString("autor"))
                    .genero(rs.getString("genero"))
                    .numeroPaginas(Integer.parseInt(rs.getString("numero_paginas")))
                    .ano(Integer.parseInt(rs.getString("ano")));

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
    public void altera(Ebook ebook) throws SQLException {
        PreparedStatement stmt = null;

        String sql = "UPDATE ebook SET titulo=?, autor=?, genero=?, numero_paginas=?, ano=?"
                + " WHERE id_ebook=?";
        
        try {
            stmt = this.conexao.prepareStatement(sql);
            
            stmt.setString(1, ebook.getTitulo());
            stmt.setString(2, ebook.getAutor());
            stmt.setString(3, ebook.getGenero());
            stmt.setString(4, String.valueOf(ebook.getNumeroPaginas()));
            stmt.setString(5, String.valueOf(ebook.getAno()));
            
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
        if (stmt != null) {stmt.close();}} catch (SQLException e) {System.out.println(e.getMessage());}
        }
    }
    
    @Override
    public void remove(int id) throws SQLException {       
        
        String sql = "DELETE FROM ebook WHERE id_ebook=?";
        
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        stmt.setInt(1, id);
        
        stmt.execute();
        stmt.close();
        
    }
}
