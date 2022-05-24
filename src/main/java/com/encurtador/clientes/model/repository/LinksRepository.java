package com.encurtador.clientes.model.repository;

import com.encurtador.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinksRepository extends JpaRepository<Cliente, Long> {
}
