/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.text.ParseException;

import controllers.ServiceAvaliacao;
import controllers.ServiceEbook;
import factories.FabricaAvaliacao;
import factories.FabricaAvaliacaoEstrelas;
import factories.FabricaAvaliacaoTexto;
import model.Ebook;
/**
 *
 * @author paulojp
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws SQLException, ParseException {

        // Services
        ServiceAvaliacao serviceAvl;
        ServiceEbook serviceEbk = new ServiceEbook();

        // ================ FACTORY METHOD ================

        // Uso do padrão Factory Method para avaliação por estrelas
        FabricaAvaliacao fabricaAvlEstrelas = new FabricaAvaliacaoEstrelas();
        serviceAvl = new ServiceAvaliacao(fabricaAvlEstrelas);
        serviceAvl.adicionaAvaliacao(1, 1, "4", "02/10/2023");

        // Uso do padrão Factory Method para avaliação por texto
        FabricaAvaliacao fabricaAvlTexto = new FabricaAvaliacaoTexto();
        serviceAvl = new ServiceAvaliacao(fabricaAvlTexto);
        serviceAvl.adicionaAvaliacao(1, 1, "Gostei bastante desta história!", "02/10/2023");

        // ================     BUILDER    ================

        // Criação de livros
        Ebook livroHistoria = new Ebook.EbookBuilder(1)
            .titulo("Livro de História")
            .autor("Mateus")
            .genero("História")
            .numeroPaginas(125)
            .ano(2023)
            .build();

        Ebook livroPortugues = new Ebook.EbookBuilder(1)
            .titulo("Livro de História")
            .autor("Mateus")
            .ano(2023)
            .build();

        serviceEbk.adicionaEbook(livroHistoria);
        serviceEbk.adicionaEbook(livroPortugues);

        JFPrincipal principal = new JFPrincipal();
        principal.setVisible(true);
        
    }
    
}
