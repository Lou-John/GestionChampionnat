package com.example.appgestionchampionnat.services;

import com.example.appgestionchampionnat.pojos.*;

import java.util.List;

public interface StadeService {
    Stade ajouterStade(Stade stade);
    Stade recupererStade(Long idStade);
    List<Stade> recupererStades();
    List<Match> recupererMatchs(Stade stade);
    List<Equipe> recupererEquipes(Stade stade);

}
