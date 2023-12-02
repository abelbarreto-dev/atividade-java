package clean.usecase;

import clean.entity.Livro;

public class CreateLivro {
    
    private final LivroRepository repository;

    public CreateLivro(LivroRepository repository) {
        this.repository = repository;
    }

    public Livro create(Livro livro) {
        if(LivroValidator.validateCreateLivro(livro)) {
            return repository.create(livro);
        } else {
            return null;
        }
    }

}
