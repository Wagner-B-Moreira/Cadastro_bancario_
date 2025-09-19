package Cadastrobancario.sistemadecadastro.controller;

import Cadastrobancario.sistemadecadastro.model.Cliente;
import Cadastrobancario.sistemadecadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes") // URL base
public class ClienteController {

    @Autowired
    private ClienteService service;

    // Cadastra cliente
    @PostMapping
    public Cliente cadastraCliente(@RequestBody Cliente cliente) {
        return service.salvarCliente(cliente);
    }

    // Lista todos os clientes
    @GetMapping
    public List<Cliente> listarTodos() {
        return service.listarCliente();
    }
}
