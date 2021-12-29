package com.retosofka.sofkapreguntas.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name ="preguntas")
public class PreguntaEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta")
    private Long id;
    private  String enunacido;


    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity id_categoria;



    @OneToMany
    @JoinColumn(name = "respuesta_id")
    private List <RespuestaEntity>respuestas;


}
