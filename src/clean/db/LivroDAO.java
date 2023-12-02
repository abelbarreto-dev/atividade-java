package clean.db;

import clean.entity.Livro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import clean.usecase.LivroRepository;

public class LivroDAO implements LivroRepository {

    private final Map<Integer, Livro> baseLivros = new HashMap<>();

    @Override
    public Livro create(Livro livro) {
        baseLivros.put(livro.getId(), livro);
        return livro;
    }

    @Override
    public Livro update(Livro livro) {
        if (baseLivros.containsKey(livro.getId())) {
            baseLivros.put(livro.getId(), livro);
            return livro;
        } else {
            throw new IllegalArgumentException("Livro não encontrado: ID inexistente " + livro.getId());
        }
    }

    @Override
    public Livro delete(int id) {
        if (baseLivros.containsKey(id)) {
            return baseLivros.remove(id);
        } else {
            throw new IllegalArgumentException("Livro não encontrado: ID inexistente " + id);
        }
    }

    @Override
    public ArrayList<Livro> findAllLivros() {
        return new ArrayList<>(baseLivros.values());
    }
    
}
