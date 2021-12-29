package com.retosofka.sofkapreguntas.dao;


import com.retosofka.sofkapreguntas.entity.RespuestaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaDao extends JpaRepository<RespuestaEntity, Long> {
}
