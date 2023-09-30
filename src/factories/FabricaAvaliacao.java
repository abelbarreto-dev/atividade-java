package factories;

import model.AvaliacaoLivro;

public abstract class FabricaAvaliacao {

    public abstract AvaliacaoLivro criarAvaliacao(int idCliente, int idLivro, String comentario, String dataAvaliacao);

}