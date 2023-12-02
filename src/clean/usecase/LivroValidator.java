package clean.usecase;

import clean.entity.Livro;

public class LivroValidator {
    
    public static boolean validateCreateLivro(Livro livro) {
        if(livro.getId() <= 0
            || livro.getExemplar().equals("")
            || livro.getAutor().equals("")
            || livro.getAno() <= 0
            || livro.getDisponibilidade().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateUpdateLivro(Livro livro) {
        if(livro.getId() <= 0
            || livro.getExemplar().equals("")
            || livro.getAutor().equals("")
            || livro.getAno() <= 0
            || livro.getDisponibilidade().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateDeleteLivro(int id) {
        if(id <= 0) {
            return false;
        } else {
            return true;
        }
    }

}
