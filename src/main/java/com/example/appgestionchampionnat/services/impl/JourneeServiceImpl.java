package com.example.appgestionchampionnat.services.impl;

import com.example.appgestionchampionnat.dao.ChampionnatDao;
import com.example.appgestionchampionnat.dao.EquipeDao;
import com.example.appgestionchampionnat.dao.JourneeDao;
import com.example.appgestionchampionnat.dao.MatchDao;
import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Equipe;
import com.example.appgestionchampionnat.pojos.Journee;
import com.example.appgestionchampionnat.pojos.Match;
import com.example.appgestionchampionnat.services.EquipeService;
import com.example.appgestionchampionnat.services.JourneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.JobHoldUntil;
import java.util.List;

@Service
public class JourneeServiceImpl implements JourneeService {
    @Autowired
    private JourneeDao journeeDao;
    @Autowired
    private MatchDao matchDao;
    @Override
    public Journee ajouterJournee(Journee journee){ return journeeDao.save(journee);}
    @Override
    public Journee recupererJournee(Long idJournee){ return journeeDao.findById(idJournee).orElse(null);}
    @Override
    public List<Journee> recupererJournees(){ return journeeDao.findAll();}
    @Override
    public List<Match> recupererMatchs(Journee journee){return matchDao.findByJournee(journee);}
}
