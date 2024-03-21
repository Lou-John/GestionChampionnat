package com.example.appgestionchampionnat.services;

import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.pojos.Match;

import java.util.List;

public interface EquipeService {
    Equipe ajouterEquipe(Equipe equipe);
    Equipe recupererEquipe(Long idEquipe);
    List<Equipe> recupererEquipes();
    List<Championnat> recupererChampionnats(Equipe equipe);
    List<Match> recupererMatchs(Equipe equipe);
}
