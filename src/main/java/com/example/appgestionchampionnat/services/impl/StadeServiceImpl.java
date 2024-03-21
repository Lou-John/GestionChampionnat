package com.example.appgestionchampionnat.services.impl;

import com.example.appgestionchampionnat.dao.*;
import com.example.appgestionchampionnat.pojos.*;
import com.example.appgestionchampionnat.services.PaysService;
import com.example.appgestionchampionnat.services.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadeServiceImpl implements StadeService {
    @Autowired
    private MatchDao matchDao;
    @Autowired
    private EquipeDao equipeDao;
    @Autowired
    private StadeDao stadeDao;

    @Override
    public Stade ajouterStade (Stade stade){ return stadeDao.save(stade);}
    @Override
    public Stade recupererStade(Long idStade){ return stadeDao.findById(idStade).orElse(null);}
    @Override
    public List<Stade> recupererStades(){ return stadeDao.findAll();}
    @Override
    public List<Match> recupererMatchs(Stade stade){return matchDao.findByStade(stade);}
    public List<Equipe> recupererEquipes(Stade stade){return equipeDao.findByStade(stade);}
}
