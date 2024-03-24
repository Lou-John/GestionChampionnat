package com.example.appgestionchampionnat.pojos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Journee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numero;
    @OneToMany(mappedBy = "journee")
    private List<Match> matchs;
    @ManyToOne()
    private Championnat championnat;

    public Journee(Long numero, List<Match> matchs, Championnat championnat) {
        this.numero = numero;
        this.matchs = matchs;
        this.championnat = championnat;
    }

    public Journee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public List<Match> getMatchs() {
        return matchs;
    }

    public void setMatchs(List<Match> matchs) {
        this.matchs = matchs;
    }

    public Championnat getChampionnat() {
        return championnat;
    }

    public void setChampionnat(Championnat championnat) {
        this.championnat = championnat;
    }

    @Override
    public String toString() {
        return "Journee{" +
                "id=" + id +
                ", numero=" + numero +
                ", championnat=" + championnat +
                '}';
    }
}
