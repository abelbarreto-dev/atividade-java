package clean.adapter;

import clean.usecase.CreateCliente;
import clean.usecase.DeleteCliente;
import clean.usecase.UpdateCliente;
import clean.usecase.GetClientes;

import java.util.ArrayList;

import clean.entity.Cliente;

public class ClienteController {
    
    private final CreateCliente createCliente;
    private final UpdateCliente updateCliente;
    private final DeleteCliente deleteCliente;
    private final GetClientes getClientes;
    
    public ClienteController(
            CreateCliente createCliente,
            UpdateCliente updateCliente,
            DeleteCliente deleteCliente,
            GetClientes getClientes) {
        this.createCliente = createCliente;
        this.updateCliente = updateCliente;
        this.deleteCliente = deleteCliente;
        this.getClientes = getClientes;
    }

    public ClientePresenter createCliente(ClientePresenter clientePresenter) {
        Cliente cliente = createCliente.create(ClientePresenter.mapToCliente(clientePresenter));
        return ClientePresenter.mapToClienteModel(cliente);
    }

    public ClientePresenter updateCliente(ClientePresenter clientePresenter) {
        Cliente cliente = updateCliente.update(ClientePresenter.mapToCliente(clientePresenter));
        return ClientePresenter.mapToClienteModel(cliente);
    }

    public ClientePresenter deleteCliente(ClientePresenter clientePresenter) {
        Cliente cliente = deleteCliente.delete(ClientePresenter.mapToCliente(clientePresenter).getId());
        return ClientePresenter.mapToClienteModel(cliente);
    }

    public ArrayList<ClientePresenter> getClientes() {
        ArrayList<Cliente> clientes = getClientes.get();
        ArrayList<ClientePresenter> clientesPresenter = new ArrayList<>();
        for (Cliente cliente : clientes) {
            ClientePresenter clienteModel = ClientePresenter.mapToClienteModel(cliente);
            clientesPresenter.add(clienteModel);
        }
        return clientesPresenter;
    }

}
