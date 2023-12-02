package clean.usecase;

import clean.entity.Cliente;

public class ClienteValidator {
    
    public static boolean validateCreateCliente(Cliente cliente) {
        if(cliente.getId() <= 0
            || cliente.getNome().equals("")
            || cliente.getDataNasc().equals("")
            || cliente.getSexo().equals("")
            || cliente.getCpf().equals("")
            || cliente.getEndereco().equals("")
            || cliente.getFone().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateUpdateCliente(Cliente cliente) {
        if(cliente.getId() <= 0
            || cliente.getNome().equals("")
            || cliente.getDataNasc().equals("")
            || cliente.getSexo().equals("")
            || cliente.getCpf().equals("")
            || cliente.getEndereco().equals("")
            || cliente.getFone().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateDeleteCliente(int id) {
        if(id <= 0) {
            return false;
        } else {
            return true;
        }
    }

}
