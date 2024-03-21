package com.example.appgestionchampionnat.services.impl;

import com.example.appgestionchampionnat.dao.ChampionnatDao;
import com.example.appgestionchampionnat.dao.EquipeDao;
import com.example.appgestionchampionnat.dao.JourneeDao;
import com.example.appgestionchampionnat.dao.MatchDao;
import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.pojos.Journee;
import com.example.appgestionchampionnat.pojos.Match;
import com.example.appgestionchampionnat.services.JourneeService;
import com.example.appgestionchampionnat.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {
    @Autowired
    private MatchDao matchDao;
    @Autowired
    private EquipeDao equipeDao;
    @Override
    public Match ajouterMatch(Match match){ return matchDao.save(match);}
    @Override
    public Match recupererMatch(Long idMatch){ return matchDao.findById(idMatch).orElse(null);}
    @Override
    public List<Match> recupererMatchs(){ return matchDao.findAll();}
    @Override
    public List<Equipe> recupererEquipes(Match match){return equipeDao.findByMatch(match);}
}
