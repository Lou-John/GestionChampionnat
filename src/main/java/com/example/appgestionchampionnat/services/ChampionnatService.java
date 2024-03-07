package com.example.appgestionchampionnat.services;

import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Equipe;

import java.util.List;

public interface ChampionnatService {
    Championnat ajouterChampionnat(Championnat championnat);
    Championnat recupererChampionnat(Long idChampionnat);
    List<Championnat> recupererChampionnats();
    List<Equipe> recupererEquipes(Championnat championnat);
    
}
