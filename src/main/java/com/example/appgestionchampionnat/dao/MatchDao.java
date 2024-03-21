package com.example.appgestionchampionnat.dao;

import com.example.appgestionchampionnat.pojos.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchDao extends JpaRepository<Match, Long> {
    List<Match> findByEquipe(Equipe equipe);
    List<Match> findByJournee(Journee journee);
    List<Match> findByStade(Stade stade);
}
