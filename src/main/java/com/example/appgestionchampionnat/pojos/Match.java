package com.example.appgestionchampionnat.pojos;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long match_id;

    private Long scoreEquipe1;
    private Long scoreEquipe2;

    @ManyToOne
    private Journee journee;

    @ManyToOne
    private Stade stade;

    @ManyToMany
    @JoinTable(
            name = "equipe_match",
            joinColumns = @JoinColumn(name = "match_id"),
            inverseJoinColumns = @JoinColumn(name = "equipe_id")
    )
    private List<Equipe> equipes;

    public Match(Long scoreEquipe1, Long scoreEquipe2, Journee journee, Stade stade, List<Equipe> equipes) {
        this.scoreEquipe1 = scoreEquipe1;
        this.scoreEquipe2 = scoreEquipe2;
        this.journee = journee;
        this.stade = stade;
        this.equipes = equipes;
    }

    public Match() {
    }

    public Long getId() {
        return match_id;
    }

    public void setId(Long id) {
        this.match_id = id;
    }

    public Long getScoreEquipe1() {
        return scoreEquipe1;
    }

    public void setScoreEquipe1(Long scoreEquipe1) {
        this.scoreEquipe1 = scoreEquipe1;
    }

    public Long getScoreEquipe2() {
        return scoreEquipe2;
    }

    public void setScoreEquipe2(Long scoreEquipe2) {
        this.scoreEquipe2 = scoreEquipe2;
    }

    public Journee getJournee() {
        return journee;
    }

    public void setJournee(Journee journee) {
        this.journee = journee;
    }

    public Stade getStade() {
        return stade;
    }

    public void setStade(Stade stade) {
        this.stade = stade;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    @Override
    public String toString() {
        return "Match{" +
                "scoreEquipe1=" + scoreEquipe1 +
                ", scoreEquipe2=" + scoreEquipe2 +
                ", journee=" + journee +
                ", stade=" + stade +
                '}';
    }
}
