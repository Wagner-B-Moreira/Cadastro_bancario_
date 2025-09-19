package Cadastrobancario.sistemadecadastro.service;

import Cadastrobancario.sistemadecadastro.model.Cliente;
import Cadastrobancario.sistemadecadastro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

@Autowired
    private ClienteRepository repository;
        // metado salvar cliente
    public Cliente salvarCliente(Cliente cliente) {
     return repository.save(cliente);
    }


    // metado para listar todos clietes
    public List<Cliente> listarCliente() {
    return repository.findAll();

    }


    public void setRepository(ClienteRepository repository) {
        this.repository = repository;
    }
}
