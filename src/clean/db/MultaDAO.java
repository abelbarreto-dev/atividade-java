package clean.db;

import clean.entity.Multa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import clean.usecase.MultaRepository;

public class MultaDAO implements MultaRepository {

    private final Map<Integer, Multa> baseMultas = new HashMap<>();

    @Override
    public Multa create(Multa multa) {
        baseMultas.put(multa.getIdMulta(), multa);
        return multa;
    }

    @Override
    public Multa update(Multa multa) {
        if (baseMultas.containsKey(multa.getIdMulta())) {
            baseMultas.put(multa.getIdMulta(), multa);
            return multa;
        } else {
            throw new IllegalArgumentException("Multa não encontrada: ID inexistente " + multa.getIdMulta());
        }
    }

    @Override
    public Multa delete(int id) {
        if (baseMultas.containsKey(id)) {
            return baseMultas.remove(id);
        } else {
            throw new IllegalArgumentException("Multa não encontrada: ID inexistente " + id);
        }
    }

    @Override
    public ArrayList<Multa> findAllMultas() {
        return new ArrayList<>(baseMultas.values());
    }

    @Override
    public ArrayList<Multa> findMultasByClienteId(int idCliente) {
        ArrayList<Multa> multasCliente = new ArrayList<>();
        for (Multa multa : baseMultas.values()) {
            if (multa.getIdCliente() == idCliente) {
                multasCliente.add(multa);
            }
        }
        return multasCliente;
    }

    @Override
    public Float somarMultasPorCliente(int idCliente) {
        float totalMulta = 0.0f;
        for (Multa multa : baseMultas.values()) {
            if (multa.getIdCliente() == idCliente) {
                totalMulta += multa.getValor();
            }
        }
        return totalMulta;
    }

    @Override
    public ArrayList<Multa> deleteMultasByClienteId(int idCliente) {
        ArrayList<Multa> multasRemovidas = new ArrayList<>();
        Iterator<Map.Entry<Integer, Multa>> iterator = baseMultas.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Multa> entry = iterator.next();
            if (entry.getValue().getIdCliente() == idCliente) {
                multasRemovidas.add(entry.getValue());
                iterator.remove();
            }
        }
        return multasRemovidas;
    }
    
}
