package com.example.appgestionchampionnat.services;

import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.pojos.Journee;
import com.example.appgestionchampionnat.pojos.Match;

import java.util.List;

public interface JourneeService {
    Journee ajouterJournee(Journee journee);
    Journee recupererJournee(Long idJournee);
    List<Journee> recupererJournees();
    List<Match> recupererMatchs(Journee journee);
}
