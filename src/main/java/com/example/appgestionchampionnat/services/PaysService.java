package com.example.appgestionchampionnat.services;

import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.pojos.Pays;

import java.util.List;

public interface PaysService {
    Pays ajouterPays(Pays pays);
    Pays recupererPays(Long idPays);
    List<Pays> recupererPays();
    List<Championnat> recupererChampionnats(Pays pays);
    
}
