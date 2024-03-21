package com.example.appgestionchampionnat.services.impl;

import com.example.appgestionchampionnat.dao.ChampionnatDao;
import com.example.appgestionchampionnat.dao.EquipeDao;
import com.example.appgestionchampionnat.dao.MatchDao;
import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.pojos.Match;
import com.example.appgestionchampionnat.services.ChampionnatService;
import com.example.appgestionchampionnat.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeServiceImpl implements EquipeService {
    @Autowired
    private EquipeDao equipeDao;
    @Autowired
    private MatchDao matchDao;
    @Autowired
    private ChampionnatDao championnatDao;
    @Override
    public Equipe ajouterEquipe(Equipe equipe){ return equipeDao.save(equipe);}
    @Override
    public Equipe recupererEquipe(Long idEquipe){ return equipeDao.findById(idEquipe).orElse(null);}
    @Override
    public List<Equipe> recupererEquipes(){ return equipeDao.findAll();}
    @Override
    public List<Championnat> recupererChampionnats(Equipe equipe){ return championnatDao.findByEquipe(equipe);}
    @Override
    public List<Match> recupererMatchs(Equipe equipe){return matchDao.findByEquipe(equipe);}
}
