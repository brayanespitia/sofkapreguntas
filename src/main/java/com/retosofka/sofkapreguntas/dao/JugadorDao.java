package com.retosofka.sofkapreguntas.dao;

import com.retosofka.sofkapreguntas.entity.JugadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorDao  extends JpaRepository <JugadorEntity, Long> {
}
