package io.github.nicholasestrada.clientes.model.repository;

import io.github.nicholasestrada.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
