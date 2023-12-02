package clean.adapter;

import clean.usecase.CreateLivro;
import clean.usecase.DeleteLivro;
import clean.usecase.GetLivros;
import clean.usecase.UpdateLivro;

import java.util.ArrayList;

import clean.entity.Livro;

public class LivroController {
    
    private final CreateLivro createLivro;
    private final UpdateLivro updateLivro;
    private final DeleteLivro deleteLivro;
    private final GetLivros getLivros;
    
    public LivroController(CreateLivro createLivro,
            UpdateLivro updateLivro,
            DeleteLivro deleteLivro,
            GetLivros getLivros) {
        this.createLivro = createLivro;
        this.updateLivro = updateLivro;
        this.deleteLivro = deleteLivro;
        this.getLivros = getLivros;
    }

    public LivroPresenter createLivro(LivroPresenter livroPresenter) {
        Livro livro = createLivro.create(LivroPresenter.mapToLivro(livroPresenter));
        return LivroPresenter.mapToLivroModel(livro);
    }

    public LivroPresenter updateLivro(LivroPresenter livroPresenter) {
        Livro livro = updateLivro.update(LivroPresenter.mapToLivro(livroPresenter));
        return LivroPresenter.mapToLivroModel(livro);
    }

    public LivroPresenter deleteLivro(LivroPresenter livroPresenter) {
        Livro livro = deleteLivro.delete(LivroPresenter.mapToLivro(livroPresenter).getId());
        return LivroPresenter.mapToLivroModel(livro);
    }

    public ArrayList<LivroPresenter> getLivros() {
        ArrayList<Livro> livros = getLivros.get();
        ArrayList<LivroPresenter> livrosPresenter = new ArrayList<>();
        for (Livro livro : livros) {
            LivroPresenter livroModel = LivroPresenter.mapToLivroModel(livro);
            livrosPresenter.add(livroModel);
        }
        return livrosPresenter;
    }

}
