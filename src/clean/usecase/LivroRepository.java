package clean.usecase;

import clean.entity.Livro;
import java.util.ArrayList;

public interface LivroRepository {
    
    Livro create(Livro livro);
    Livro update(Livro livro);
    Livro delete(int id);
    ArrayList<Livro> findAllLivros();

}
