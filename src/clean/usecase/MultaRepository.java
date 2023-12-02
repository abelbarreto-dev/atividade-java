package clean.usecase;

import clean.entity.Multa;
import java.util.ArrayList;

public interface MultaRepository {
    
    Multa create(Multa multa);
    Multa update(Multa multa);
    Multa delete(int id);
    ArrayList<Multa> findAllMultas();
    ArrayList<Multa> findMultasByClienteId(int idCliente);
    Float somarMultasPorCliente(int idCliente);
    ArrayList<Multa> deleteMultasByClienteId(int idCliente);

}
