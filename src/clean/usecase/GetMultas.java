package clean.usecase;

import java.util.ArrayList;

import clean.entity.Multa;

public class GetMultas {
    
    private final MultaRepository repository;

    public GetMultas(MultaRepository repository) {
        this.repository = repository;
    }

    public ArrayList<Multa> get() {
        return repository.findAllMultas();
    }

    public ArrayList<Multa> getMultasByClienteId(int idCliente) {
        return repository.findMultasByClienteId(idCliente);
    }

    public Float somarMultasPorCliente(int idCliente) {
        return repository.somarMultasPorCliente(idCliente);
    }

}
