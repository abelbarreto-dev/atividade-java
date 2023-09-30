package factories;

import model.AvaliacaoLivro;
import model.AvaliacaoTexto;

public class FabricaAvaliacaoTexto extends FabricaAvaliacao {

    @Override
    public AvaliacaoLivro criarAvaliacao(int idCliente, int idLivro, String comentario, String dataAvaliacao) {
        return new AvaliacaoTexto(idCliente, idLivro, comentario, dataAvaliacao);
    }

}