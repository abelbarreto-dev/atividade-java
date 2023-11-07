/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.text.ParseException;

// import controllers.ServiceAvaliacao;
// import controllers.ServiceEbook;
// import dao.decorators.GeneroLivroDecorator;
// import dao.decorators.NumPaginasLivroDecorator;
// import factories.FabricaAvaliacao;
// import factories.FabricaAvaliacaoEstrelas;
// import factories.FabricaAvaliacaoTexto;
// import model.AdapterDigitalizador;
// import model.BrochuraComOrelha;
import model.Ebook;
import model.EbookEpubRenderer;
import model.EbookMobiRenderer;
import model.EbookPdfRenderer;
import model.EbookRenderer;
// import model.EspiralComAcetato;
// import model.FormatoLivro;
// import model.Livro;
// import model.LivroDecorator;
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

        /*

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

        Ebook livroPortugues = new Ebook.EbookBuilder(2)
            .titulo("Livro de Português")
            .autor("Diego")
            .ano(2021)
            .build();

        serviceEbk.adicionaEbook(livroHistoria);
        serviceEbk.adicionaEbook(livroPortugues);

        JFPrincipal principal = new JFPrincipal();
        principal.setVisible(true);

        // ================    DECORATOR    ================
        
        // Instanciando um novo livro
        Livro livroGeo = new Livro(10, "Livro de Geografia", "George", 2022, "Disponível");

        // Uso do decorador de numeração
        LivroDecorator livroComNumeracao = new NumPaginasLivroDecorator(livroGeo, 250);
        livroComNumeracao.exibirDescricao();
        
        // Uso do decorador de gênero
        LivroDecorator livroComGenero = new GeneroLivroDecorator(livroGeo, "Didático");
        livroComGenero.exibirDescricao();

        // ================      BRIDGE      ===============
        
        Livro livroComp = new Livro(11, "Livro de Computação", "Marcos", 2019, "Disponível");
        
        // Uso do padrão bridge para brochura com orelha
        FormatoLivro brochuraComp = new BrochuraComOrelha(livroComp);
        System.out.println(brochuraComp.obterInfo());

        // Uso do padrão bridge para espiral com acetato
        FormatoLivro espiralComp = new EspiralComAcetato(livroComp);
        System.out.println(espiralComp.obterInfo());

        // ================     ADAPTER     ================

        Livro livroIng = new Livro(12, "Livro de Inglês", "Márcio", 2010, "Disponível");
        
        // Uso do padrão adapter
        Ebook adaptadorIng = new AdapterDigitalizador(livroIng);
        adaptadorIng.abrirEbook();
        adaptadorIng.lerEbook();
        adaptadorIng.fecharEbook();

        */

        // ================ TEMPLATE METHOD ================

        Ebook programacao = new Ebook(20, "Compreendendo Padrões", "Rafael", "Didático", 250, 2023);

        // Uso do padrão para renderizar vários formatos

        System.out.println("\n--- --- --- --- --- --- --- --- --- ---\n");

        EbookRenderer pdfRenderer = new EbookPdfRenderer();
        pdfRenderer.renderizarEbook(programacao);

        System.out.println("\n--- --- --- --- --- --- --- --- --- ---\n");

        EbookRenderer epubRenderer = new EbookEpubRenderer();
        epubRenderer.renderizarEbook(programacao);

        System.out.println("\n--- --- --- --- --- --- --- --- --- ---\n");

        EbookMobiRenderer mobiRenderer = new EbookMobiRenderer();
        mobiRenderer.renderizarEbook(programacao);

        System.out.println("\n--- --- --- --- --- --- --- --- --- ---\n");

    }
    
}
