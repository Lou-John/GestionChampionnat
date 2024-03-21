package com.example.appgestionchampionnat.services.impl;

import com.example.appgestionchampionnat.dao.ChampionnatDao;
import com.example.appgestionchampionnat.dao.EquipeDao;
import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.services.ChampionnatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionnatServiceImpl implements ChampionnatService {
    @Autowired
    private ChampionnatDao championnatDao;
    @Autowired
    private EquipeDao equipeDao;
    @Override
    public Championnat ajouterChampionnat(Championnat championnat){ return championnatDao.save(championnat);}
    @Override
    public Championnat recupererChampionnat(Long idChampionnat){ return championnatDao.findById(idChampionnat).orElse(null);}
    @Override
    public List<Championnat> recupererChampionnats(){ return championnatDao.findAll();}
    @Override
    public List<Equipe> recupererEquipes(Championnat championnat){return equipeDao.findByChampionnat(championnat);}
}
