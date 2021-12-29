package com.retosofka.sofkapreguntas.dao;


import com.retosofka.sofkapreguntas.entity.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaDao  extends JpaRepository <PreguntaEntity, Long> {
}
