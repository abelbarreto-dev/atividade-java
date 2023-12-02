package clean.usecase;

import clean.entity.Livro;

public class DeleteLivro {
    
    private final LivroRepository repository;

    public DeleteLivro(LivroRepository repository) {
        this.repository = repository;
    }

    public Livro delete(int id) {
        if(LivroValidator.validateDeleteLivro(id)) {
            return repository.delete(id);
        } else {
            return null;
        }
    }

}
