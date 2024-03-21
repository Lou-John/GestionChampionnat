package com.example.appgestionchampionnat.dao;

import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.pojos.Match;
import com.example.appgestionchampionnat.pojos.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipeDao extends JpaRepository<Equipe, Long> {
    List<Equipe> findByChampionnat(Championnat championnat);
    List<Equipe> findByMatch(Match match);
    List<Equipe> findByStade(Stade stade);
}
