package factories;

import model.AvaliacaoLivro;
import model.AvaliacaoEstrelas;

public class FabricaAvaliacaoEstrelas extends FabricaAvaliacao {

    @Override
    public AvaliacaoLivro criarAvaliacao(int idCliente, int idLivro, String comentario, String dataAvaliacao) {
        return new AvaliacaoEstrelas(idCliente, idLivro, comentario, dataAvaliacao);
    }

}