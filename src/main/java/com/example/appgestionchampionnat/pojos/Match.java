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
    @ManyToOne
    private Equipe equipe1;
    @ManyToOne
    private Equipe equipe2;

    public Match(Long pointsEquipe1, Long pointsEquipe2, Journee journee, Stade stade, Equipe equipe1, Equipe equipe2) {
        this.pointsEquipe1 = pointsEquipe1;
        this.pointsEquipe2 = pointsEquipe2;
        this.journee = journee;
        this.stade = stade;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
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
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", pointsEquipe1=" + pointsEquipe1 +
                ", pointsEquipe2=" + pointsEquipe2 +
                ", journee=" + journee +
                ", stade=" + stade +
                ", equipe1=" + equipe1 +
                ", equipe2=" + equipe2 +
                '}';
    }
}
