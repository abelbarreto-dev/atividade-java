package clean;

import clean.adapter.ClienteController;
import clean.adapter.ClientePresenter;
import clean.adapter.EmprestimoController;
import clean.adapter.EmprestimoPresenter;
import clean.adapter.LivroController;
import clean.adapter.LivroPresenter;
import clean.adapter.MultaController;
import clean.adapter.MultaPresenter;
import clean.usecase.CreateCliente;
import clean.usecase.CreateEmprestimo;
import clean.usecase.CreateLivro;
import clean.usecase.CreateMulta;
import clean.usecase.DeleteCliente;
import clean.usecase.DeleteEmprestimo;
import clean.usecase.DeleteLivro;
import clean.usecase.DeleteMulta;
import clean.usecase.GetClientes;
import clean.usecase.GetEmprestimos;
import clean.usecase.GetLivros;
import clean.usecase.GetMultas;
import clean.usecase.UpdateCliente;
import clean.usecase.UpdateEmprestimo;
import clean.usecase.UpdateLivro;
import clean.usecase.UpdateMulta;
import clean.usecase.VerificaEmprestimo;

public class Main {
    
    public static void main(String[] args) {

        // ========== Instanciando configuração manual ==========
        
        ManualConfig config = new ManualConfig();

        // ========== Configurando objetos para manipular dados ==========

        CreateCliente createCliente = config.createCliente();
        CreateLivro createLivro = config.createLivro();
        CreateEmprestimo createEmprestimo = config.createEmprestimo();
        CreateMulta createMulta = config.createMulta();

        UpdateCliente updateCliente = config.updateCliente();
        UpdateLivro updateLivro = config.updateLivro();
        UpdateEmprestimo updateEmprestimo = config.updateEmprestimo();
        UpdateMulta updateMulta = config.updateMulta();

        DeleteCliente deleteCliente = config.deleteCliente();
        DeleteLivro deleteLivro = config.deleteLivro();
        DeleteEmprestimo deleteEmprestimo = config.deleteEmprestimo();
        DeleteMulta deleteMulta = config.deleteMulta();

        GetClientes getClientes = config.getClientes();
        GetLivros getLivros = config.getLivros();
        GetEmprestimos getEmprestimos = config.getEmprestimos();
        GetMultas getMultas = config.getMultas();

        VerificaEmprestimo verificaEmprestimo = config.verificaEmprestimo();

        // ========== Instanciando controllers ==========

        ClienteController clienteController = new ClienteController(
            createCliente,
            updateCliente,
            deleteCliente,
            getClientes
        );

        LivroController livroController = new LivroController(
            createLivro,
            updateLivro,
            deleteLivro,
            getLivros
        );

        EmprestimoController emprestimoController = new EmprestimoController(
            createEmprestimo,
            updateEmprestimo,
            deleteEmprestimo,
            getEmprestimos,
            verificaEmprestimo
        );

        MultaController multaController = new MultaController(
            createMulta,
            updateMulta,
            deleteMulta,
            getMultas
        );

        // ========== Instanciando presenters ==========

        ClientePresenter clientePresenter = new ClientePresenter();
        LivroPresenter livroPresenter = new LivroPresenter();
        EmprestimoPresenter emprestimoPresenter = new EmprestimoPresenter();
        MultaPresenter multaPresenter = new MultaPresenter();

        // ========== Preenchendo presenters com dados ==========

        clientePresenter.setId(1);
        clientePresenter.setNome("Mateus");
        clientePresenter.setDataNasc("20/01/2000");
        clientePresenter.setSexo("Masculino");
        clientePresenter.setCpf("123456789-10");
        clientePresenter.setEndereco("Rua ABC, nº 100, Centro, Irecê BA");
        clientePresenter.setFone("(74)99911-2222");

        livroPresenter.setId(1);
        livroPresenter.setExemplar("Tudo sobre Arquitetura Limpa");
        livroPresenter.setAutor("Francisco");
        livroPresenter.setAno(2023);
        livroPresenter.setDisponibilidade("Disponível");

        emprestimoPresenter.setIdEmprestimo(1);
        emprestimoPresenter.setIdCliente(1);
        emprestimoPresenter.setIdLivro(1);
        emprestimoPresenter.setDataEmprestimo("01/11/2023");
        emprestimoPresenter.setDataDevolucao("01/12/2023");

        multaPresenter.setIdMulta(1);
        multaPresenter.setIdCliente(1);
        multaPresenter.setDescricao("Multa por atraso na devolução!");
        multaPresenter.setValor(10.0f);

        // ========== Exibindo saídas ==========

        System.out.println("\n-----------------------------------------\n");

        System.out.println("Cadastrando novo usuário:");
        System.out.println(
            clienteController.createCliente(clientePresenter).toString()
        );

        System.out.println("\n-----------------------------------------\n");

        clientePresenter.setNome("Mateus Oliveira");
        System.out.println("Atualizando dados do cliente:");
        clienteController.updateCliente(clientePresenter);
        System.out.println(
            clienteController.createCliente(clientePresenter).toString()
        );

        System.out.println("\n-----------------------------------------\n");

        System.out.println("Cadastrando novo livro");
        System.out.println(
            livroController.createLivro(livroPresenter).toString()
        );

        System.out.println("\n-----------------------------------------\n");

        System.out.println("Cadastrando novo empréstimo:");
        System.out.println(
            emprestimoController.createEmprestimo(emprestimoPresenter).toString()
        );

        System.out.println("\n-----------------------------------------\n");

        System.out.println("Cadastrando nova multa:");
        System.out.println(
            multaController.createMulta(multaPresenter).toString()
        );

        System.out.println("\n-----------------------------------------\n");

        System.out.println("Verificando se o cliente com ID 1 possui multa:");
        System.out.println(emprestimoController.verificaEmprestimoPorClienteId(1));

        System.out.println("\n-----------------------------------------\n");

        System.out.println("Removendo multas do cliente com ID 1:");
        multaController.deleteMultasByClienteId(1);

        System.out.println("\n-----------------------------------------\n");

        System.out.println("Verificando novamente por multas no cliente 1:");
        System.out.println(emprestimoController.verificaEmprestimoPorClienteId(1));

        System.out.println("\n-----------------------------------------\n");

        livroPresenter.setId(2);
        livroPresenter.setExemplar("Padrões na Prática");
        livroPresenter.setAutor("José");
        livroPresenter.setAno(2022);
        livroPresenter.setDisponibilidade("Disponível");
        
        livroController.createLivro(livroPresenter);

        System.out.println("Exibindo todos os livros cadastrados:");
        System.out.println(
            livroController.getLivros().toString()
        );

    }

}
