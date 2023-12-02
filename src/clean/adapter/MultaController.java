package clean.adapter;

import clean.usecase.CreateMulta;
import clean.usecase.DeleteMulta;
import clean.usecase.GetMultas;
import clean.usecase.UpdateMulta;
import java.util.ArrayList;
import clean.entity.Multa;

public class MultaController {
    
    private final CreateMulta createMulta;
    private final UpdateMulta updateMulta;
    private final DeleteMulta deleteMulta;
    private final GetMultas getMultas;
    
    public MultaController(CreateMulta createMulta,
            UpdateMulta updateMulta,
            DeleteMulta deleteMulta,
            GetMultas getMultas) {
        this.createMulta = createMulta;
        this.updateMulta = updateMulta;
        this.deleteMulta = deleteMulta;
        this.getMultas = getMultas;
    }

    public MultaPresenter createMulta(MultaPresenter multaPresenter) {
        Multa multa = createMulta.create(MultaPresenter.mapToMulta(multaPresenter));
        return MultaPresenter.mapToMultaModel(multa);
    }

    public MultaPresenter updateMulta(MultaPresenter multaPresenter) {
        Multa multa = updateMulta.update(MultaPresenter.mapToMulta(multaPresenter));
        return MultaPresenter.mapToMultaModel(multa);
    }

    public MultaPresenter deleteMulta(MultaPresenter multaPresenter) {
        Multa multa = deleteMulta.delete(MultaPresenter.mapToMulta(multaPresenter).getIdMulta());
        return MultaPresenter.mapToMultaModel(multa);
    }

    public ArrayList<MultaPresenter> getMultas() {
        ArrayList<Multa> multas = getMultas.get();
        ArrayList<MultaPresenter> multasPresenter = new ArrayList<>();
        for (Multa multa : multas) {
            MultaPresenter multaModel = MultaPresenter.mapToMultaModel(multa);
            multasPresenter.add(multaModel);
        }
        return multasPresenter;
    }

    public ArrayList<MultaPresenter> getMultasByClienteId(int idCliente) {
        ArrayList<Multa> multas = getMultas.getMultasByClienteId(idCliente);
        ArrayList<MultaPresenter> multasPresenter = new ArrayList<>();
        for (Multa multa : multas) {
            MultaPresenter multaModel = MultaPresenter.mapToMultaModel(multa);
            multasPresenter.add(multaModel);
        }
        return multasPresenter;
    }

    public Float somarMultasPorCliente(int idCliente) {
        return getMultas.somarMultasPorCliente(idCliente);
    }

    public ArrayList<MultaPresenter> deleteMultasByClienteId(int idCliente) {
        ArrayList<Multa> multasDeletadas = deleteMulta.deleteMultasByClienteId(idCliente);
        ArrayList<MultaPresenter> multasPresenter = new ArrayList<>();
        for (Multa multa : multasDeletadas) {
            MultaPresenter multaModel = MultaPresenter.mapToMultaModel(multa);
            multasPresenter.add(multaModel);
        }
        return multasPresenter;
    }

}
