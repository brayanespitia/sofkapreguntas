package com.retosofka.sofkapreguntas.dao;


import com.retosofka.sofkapreguntas.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDao  extends JpaRepository <CategoriaEntity, Long> {
}
