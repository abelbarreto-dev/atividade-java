package clean.usecase;

import clean.entity.Multa;

public class MultaValidator {
    
    public static boolean validateCreateMulta(Multa multa) {
        if(multa.getIdMulta() <= 0
            || multa.getIdCliente() <= 0
            || multa.getDescricao().equals("")
            || multa.getValor() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateUpdateMulta(Multa multa) {
        if(multa.getIdMulta() <= 0
            || multa.getIdCliente() <= 0
            || multa.getDescricao().equals("")
            || multa.getValor() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateDeleteMulta(int id) {
        if(id <= 0) {
            return false;
        } else {
            return true;
        }
    }

}
