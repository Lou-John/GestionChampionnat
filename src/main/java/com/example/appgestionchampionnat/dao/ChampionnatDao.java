package com.example.appgestionchampionnat.dao;

import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.pojos.Match;
import com.example.appgestionchampionnat.pojos.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChampionnatDao extends JpaRepository<Championnat, Long> {
    List<Championnat> findByEquipe(Equipe equipe);
    List<Championnat> findByPays(Pays pays);
}
