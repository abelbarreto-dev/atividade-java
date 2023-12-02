package clean.usecase;

import clean.entity.Livro;

public class UpdateLivro {
    
    private final LivroRepository repository;

    public UpdateLivro(LivroRepository repository) {
        this.repository = repository;
    }

    public Livro update(Livro livro) {
        if(LivroValidator.validateUpdateLivro(livro)) {
            return repository.update(livro);
        } else {
            return null;
        }
    }

}
