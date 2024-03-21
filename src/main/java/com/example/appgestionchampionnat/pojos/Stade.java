package com.example.appgestionchampionnat.pojos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Stade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String adresse;
    private Long capacite;
    private String telephone;
    @OneToMany(mappedBy = "Stade")
    private List<Match> matchs;
    @OneToMany(mappedBy = "Stade")
    private List<Equipe> equipes;

    public Stade(String nom, String adresse, Long capacite, String telephone, List<Match> matchs, List<Equipe> equipes) {
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
        this.telephone = telephone;
        this.matchs = matchs;
        this.equipes = equipes;
    }

    public Stade() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Long getCapacite() {
        return capacite;
    }

    public void setCapacite(Long capacite) {
        this.capacite = capacite;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Match> getMatchs() {
        return matchs;
    }

    public void setMatchs(List<Match> matchs) {
        this.matchs = matchs;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    @Override
    public String   toString() {
        return "Stade{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", capacite=" + capacite +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
