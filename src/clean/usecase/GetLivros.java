package clean.usecase;

import java.util.ArrayList;

import clean.entity.Livro;

public class GetLivros {
    
    private final LivroRepository repository;

    public GetLivros(LivroRepository repository) {
        this.repository = repository;
    }

    public ArrayList<Livro> get() {
        return repository.findAllLivros();
    }

}
