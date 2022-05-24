package com.encurtador.clientes.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Links {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String linkOriginal;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column
    private String linkEncurtado;
}
