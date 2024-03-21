package com.example.appgestionchampionnat.services;

import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.pojos.Journee;
import com.example.appgestionchampionnat.pojos.Match;

import java.util.List;

public interface MatchService {
    Match ajouterMatch(Match match);
    Match recupererMatch(Long idMatch);
    List<Match> recupererMatchs();
    List<Equipe> recupererEquipes(Match match);
}
