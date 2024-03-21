package com.example.appgestionchampionnat.services.impl;

import com.example.appgestionchampionnat.dao.ChampionnatDao;
import com.example.appgestionchampionnat.dao.EquipeDao;
import com.example.appgestionchampionnat.dao.MatchDao;
import com.example.appgestionchampionnat.dao.PaysDao;
import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.pojos.Match;
import com.example.appgestionchampionnat.pojos.Pays;
import com.example.appgestionchampionnat.services.MatchService;
import com.example.appgestionchampionnat.services.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaysServiceImpl implements PaysService {
    @Autowired
    private PaysDao paysDao;
    @Autowired
    private ChampionnatDao championnatDao;
    @Override
    public Pays ajouterPays(Pays pays){ return paysDao.save(pays);}
    @Override
    public Pays recupererPays(Long idPays){ return paysDao.findById(idPays).orElse(null);}
    @Override
    public List<Pays> recupererPays(){ return paysDao.findAll();}
    @Override
    public List<Championnat> recupererChampionnats(Pays pays){return championnatDao.findByPays(pays);}
}
