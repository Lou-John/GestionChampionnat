package com.example.appgestionchampionnat.pojos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pointsEquipe1;
    private Long pointsEquipe2;;
    @ManyToOne
    private Journee journee;
    @ManyToOne
    private Stade stade;
    @OneToMany(mappedBy = "equipe1")
    private Equipe equipe1;

    @OneToMany(mappedBy = "equipe2")
    private Equipe equipe2;

    public Match(Long pointsEquipe1, Long pointsEquipe2, Journee journee, Stade stade, List<Equipe> equipes) {
        this.pointsEquipe1 = pointsEquipe1;
        this.pointsEquipe2 = pointsEquipe2;
        this.journee = journee;
        this.stade = stade;
        this.equipes = equipes;
    }

    public Match() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPointsEquipe1() {
        return pointsEquipe1;
    }

    public void setPointsEquipe1(Long pointsEquipe1) {
        this.pointsEquipe1 = pointsEquipe1;
    }

    public Long getPointsEquipe2() {
        return pointsEquipe2;
    }

    public void setPointsEquipe2(Long pointsEquipe2) {
        this.pointsEquipe2 = pointsEquipe2;
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

    public Equipe getEquipe1() {
        return this.equipes.get(0);
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipes.set(0, equipe1);
    }

    public Equipe getEquipe2() {
        return equipes.get(1);
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipes.set(1, equipe2);
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", pointsEquipe1=" + pointsEquipe1 +
                ", pointsEquipe2=" + pointsEquipe2 +
                ", journee=" + journee +
                ", stade=" + stade +
                '}';
    }
}
