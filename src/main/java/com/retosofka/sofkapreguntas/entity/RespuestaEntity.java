package com.retosofka.sofkapreguntas.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name ="respuestas")
public class RespuestaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private boolean esCorrecta;
}
