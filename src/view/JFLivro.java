/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controllers.IServiceLivro;
import controllers.ServiceLivro;
import model.Livro;


/**
 *
 * @author paulojp
 */
public class JFLivro extends javax.swing.JFrame {  
   
    private JFPrincipal telaPrincipal;
    
    /**
     * Creates new form Cliente
     */
    public JFLivro() {
        initComponents();
        
        // Desabilita os campos ao iniciar a janela
        desabilitaCampos();
    }
    
    JFLivro(JFPrincipal telaPrincipal) {
        
        this();
        this.telaPrincipal = telaPrincipal;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jT1Exemplar = new javax.swing.JTextField();
        jT2Autor = new javax.swing.JTextField();
        jT3Edicao = new javax.swing.JTextField();
        jT4Ano = new javax.swing.JTextField();
        jT5Status = new javax.swing.JTextField();
        jT0Id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTPesquisar = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBExcluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBNovo = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Livros");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Livros"));

        jLabel1.setText("Exemplar: ");

        jLabel2.setText("Autor: ");

        jLabel3.setText("Edição: ");

        jLabel4.setText("Ano: ");

        jLabel5.setText("Disponibilidade: ");

        jLabel7.setText("ID: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(531, 531, 531))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT5Status)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jT3Edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(jT0Id, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT4Ano))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jT1Exemplar)
                            .addComponent(jT2Autor))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jT0Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT1Exemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jT2Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jT3Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jT4Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jT5Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Livros"));

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jTablePesquisa.setModel(tmLivro);
        jTablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisa);

        jLabel8.setText("Nome:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jBSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jBSair)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAlterar, jBCadastrar, jBExcluir, jBNovo, jBSair});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cadastro de Clientes");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // BOTÃO NOVO - Precionando
    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        habilitaCampos();
        // Limpa os dados dos campos
        limpaCampos();        
    }//GEN-LAST:event_jBNovoActionPerformed
      
    // BOTÃO CADASTRAR - Precionando
    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        cadastraRegistro();  
    }//GEN-LAST:event_jBCadastrarActionPerformed
     
    // BOTÃO PESQUISAR - Precionando
    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        // Ao clicar em pesquisar, é executado o método que efetua a pesquisa, e outro método que exibe a lista da pesquisa
        try {            
            listaContatos(); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Problemas ao listar contatos.");            
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed
    
    // TABELA PESQUISA - Selecionando registro com o clique do mouse
    private void jTablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaMouseClicked
        // Salva a posição da linha selecionada na tabela de pesquisa
        int linhaSelecionada = jTablePesquisa.getSelectedRow();
        
        jT0Id.setText(jTablePesquisa.getValueAt(linhaSelecionada, 0).toString());
        jT1Exemplar.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 1));
        jT2Autor.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 2));
        jT3Edicao.setText(jTablePesquisa.getValueAt(linhaSelecionada, 3).toString());
        jT4Ano.setText(jTablePesquisa.getValueAt(linhaSelecionada, 4).toString());
        jT5Status.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 5));        
        
        // Ao selecionar um registro, os campos são ativados possibilitando fazer alterações
        habilitaCampos();
    }//GEN-LAST:event_jTablePesquisaMouseClicked
    
    // BOTÃO EXCLUIR - Precionando
    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        try {
            excluirRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao excluir registro.");
        }
    }//GEN-LAST:event_jBExcluirActionPerformed
    
    // BOTÃO ALTERAR
    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        try {
            alteraRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao alterar registro.");
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        telaPrincipal.setEnabled(true);
        
    }//GEN-LAST:event_formWindowClosed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSairActionPerformed
    
    
    
    
    /* ----CADASTRO-> */
    // MÉTODOS:
    
    // Método p/ cadastrar um registro no banco de dados.
    private void cadastraRegistro() {
        // Antes de cadastrar, verifica se o usuário está com algum registro selecionado
        if (jT1Exemplar.isEditable() && jT0Id.getText().equals("")) {
            try {
                Livro l = new Livro();

                l.setExemplar(jT1Exemplar.getText());
                l.setAutor(jT2Autor.getText());
                l.setEdicao(Byte.valueOf(jT3Edicao.getText()));
                l.setAno(Short.valueOf(jT4Ano.getText()));
                l.setDisponibilidade(jT5Status.getText());                  

                this.service.adicionaLivro(l);

                JOptionPane.showMessageDialog(rootPane, "Dados cadastrados com sucesso.");
                limpaCampos();
                desabilitaCampos();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar dados.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Para cadastrar um novo registro.\nClique em 'Novo'.");
        }
    }
    
    
    /* ----PESQUISA-> */
    // MÉTODOS:
    
    // Edita os campos e colunas da tabela de resultados
    DefaultTableModel tmLivro = new DefaultTableModel(null, new String[]{"Id", "Exemplar", "Autor", "Edição", "Ano", "Disponibilidade"});
    List<Livro> livros;
    
    // Lista a quantidade de resultado, de acordo com o nome passado no campo pesquisa
    private void listaContatos() throws SQLException {
        limpaCampos();
        String pesquisa = "%" + jTPesquisar.getText() + "%";
        livros = this.service.getLista(pesquisa); 
        
        // Após pesquisar os contatos, executa o método p/ exibir o resultado na tabela pesquisa
        mostraPesquisa(livros);
        livros.clear();
    }
    
    // Mostra a lista de resultado de acordo com o nome passado no campo pesquisa
    private void mostraPesquisa(List<Livro> livros) {
        // Limpa a tabela sempre que for solicitado uma nova pesquisa
        limparTabela();
        
        if (livros.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro encontrado.");
        } else {            
            // Linha em branco usada no for, para cada registro é criada uma nova linha 
            String[] linha = new String[] {null, null, null, null, null, null, null};
            // P/ cada registro é criada uma nova linha, cada linha recebe os campos do registro
            for (int i = 0; i < livros.size(); i++) {
                tmLivro.addRow(linha);
                tmLivro.setValueAt(livros.get(i).getId(), i, 0);
                tmLivro.setValueAt(livros.get(i).getExemplar(), i, 1);
                tmLivro.setValueAt(livros.get(i).getAutor(), i, 2);
                tmLivro.setValueAt(livros.get(i).getEdicao(), i, 3);
                tmLivro.setValueAt(livros.get(i).getAno(), i, 4);
                tmLivro.setValueAt(livros.get(i).getDisponibilidade(), i, 5);               
            }            
        }
    }
    
    // Limpa a tabela de resultados
    private void limparTabela() {       
        while (tmLivro.getRowCount() > 0) {            
            tmLivro.removeRow(0);
        }
    }
    /* Outra opção de limpar tabelas
    private void limparTabela() {        
        while (tmLivro.getRowCount() > 0) {                
            tmLivro.getDataVector().removeAllElements();
        }
    }
    */  
    /* <-PESQUISA---- */      
    
    
    
    /* ----EXCLUIR-> */
    // MÉTODOS:
    
    // Exclui resgistro
    private void excluirRegistro() throws SQLException {
        // Se algum registro estiver selecionado
        if (jTablePesquisa.getSelectedRow() != -1) {
            // Exibe uma janela de confirmação antes de exluir o registro
            int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir este registro?",
                    "Confirmação!", JOptionPane.YES_NO_OPTION);

            // Se a confirmação for SIM
            if (resp == JOptionPane.YES_NO_OPTION) {
                // Recebe a linha selecionada
                int linhaSelecionada = jTablePesquisa.getSelectedRow();
                // Recebe o ID da linha selecionada
                int id = (int) jTablePesquisa.getValueAt(linhaSelecionada, 0);
                // Remove o registro, usando como parâmetro, o id da linha selecionada
                this.service.remove(id);

                JOptionPane.showMessageDialog(rootPane, "Registro excluido com sucesso.");
                limpaCampos();
                desabilitaCampos();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Registro não selecionado.");
        }
    }
    /* <-EXCLUIR---- */
    
    
    
    
    /* ----ALTERAR-> */
    // MÉTODOS:
    
    // Altera registro
    private void alteraRegistro() throws SQLException {
        if (jTablePesquisa.getSelectedRow() != -1) {
            int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente alterar este registro?",
                    "Confirmação!", JOptionPane.YES_NO_OPTION);

            // Se a confirmação for SIM
            if (resp == JOptionPane.YES_NO_OPTION) {                
                Livro l = new Livro();
                
                l.setId(Integer.valueOf(jT0Id.getText()));
                l.setExemplar(jT1Exemplar.getText());
                l.setAutor(jT2Autor.getText());
                l.setEdicao(Byte.valueOf(jT3Edicao.getText()));
                l.setAno(Short.valueOf(jT4Ano.getText())); 
                l.setDisponibilidade(jT5Status.getText());          
                       
                this.service.altera(l);
                
                JOptionPane.showMessageDialog(rootPane, "Registro alterado com sucesso.");
                limpaCampos();
                desabilitaCampos();
                listaContatos();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Registro não selecionado.");
        }
    }
    /* <-ALTERAR---- */
    
    
    
    
    /* ----OUTROS-> */
    // MÉTODOS:
    
    // Limpa os campos do formulário
    private void limpaCampos() {
        jT0Id.setText("");
        jT1Exemplar.setText("");
        jT2Autor.setText("");
        jT3Edicao.setText("");
        jT4Ano.setText("");
        jT5Status.setText("");
    }
    
    // Desabilita os campos do formulário
    private void desabilitaCampos() {
        jT0Id.setEditable(false);
        jT1Exemplar.setEditable(false);
        jT2Autor.setEditable(false);
        jT3Edicao.setEditable(false);
        jT4Ano.setEditable(false);
        jT5Status.setEditable(false);
    }
    
    // Habilita os campos do formulário
    private void habilitaCampos() {
        
        jT1Exemplar.setEditable(true);
        jT2Autor.setEditable(true);
        jT3Edicao.setEditable(true);
        jT4Ano.setEditable(true);
        jT5Status.setEditable(true);
    }
    
    /* <-OUTROS---- */
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLivro().setVisible(true);
            }
        });
    }

    IServiceLivro service = new ServiceLivro();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT0Id;
    private javax.swing.JTextField jT1Exemplar;
    private javax.swing.JTextField jT2Autor;
    private javax.swing.JTextField jT3Edicao;
    private javax.swing.JTextField jT4Ano;
    private javax.swing.JTextField jT5Status;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTable jTablePesquisa;
    // End of variables declaration//GEN-END:variables

}
