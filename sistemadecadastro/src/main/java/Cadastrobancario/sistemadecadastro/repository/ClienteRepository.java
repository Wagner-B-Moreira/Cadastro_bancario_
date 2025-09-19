package Cadastrobancario.sistemadecadastro.repository;

import Cadastrobancario.sistemadecadastro.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Aqui podem vir consultas personalizadas se necessário
}
