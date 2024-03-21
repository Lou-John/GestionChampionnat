package com.example.appgestionchampionnat.dao;

import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.pojos.Journee;
import com.example.appgestionchampionnat.pojos.Match;
import com.example.appgestionchampionnat.pojos.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StadeDao extends JpaRepository<Stade, Long> {
    List<Match> findByMatch(Stade stade);
    List<Match> findByEquipe(Equipe equipe  );
}
