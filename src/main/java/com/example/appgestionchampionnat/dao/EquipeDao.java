package com.example.appgestionchampionnat.dao;

import com.example.appgestionchampionnat.pojos.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeDao extends JpaRepository<Equipe, Long> {
}
