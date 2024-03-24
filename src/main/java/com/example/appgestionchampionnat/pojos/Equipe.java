package com.example.appgestionchampionnat.pojos;

import com.example.appgestionchampionnat.pojos.Championnat;
import com.example.appgestionchampionnat.pojos.Match;
import com.example.appgestionchampionnat.pojos.Stade;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipe_id;

    private String nom;
    private String logo;
    private Date dateCreation;
    private String nomEntraineur;
    private String president;
    private String statut;
    private String siege;
    private String telephone;
    private String siteWeb;

    @ManyToOne
    private Stade stade;

    @ManyToMany(mappedBy = "equipe")
    private List<Match> matchs;

    @ManyToOne
    private Championnat championnat;

    public Equipe(String nom, String logo, Date dateCreation, String nomEntraineur, String president, String statut, String siege, String telephone, String siteWeb, Stade stade, List<Match> matchs, Championnat championnat) {
        this.nom = nom;
        this.logo = logo;
        this.dateCreation = dateCreation;
        this.nomEntraineur = nomEntraineur;
        this.president = president;
        this.statut = statut;
        this.siege = siege;
        this.telephone = telephone;
        this.siteWeb = siteWeb;
        this.stade = stade;
        this.matchs = matchs;
        this.championnat = championnat;
    }

    public Equipe() {
    }

    public Long getId() {
        return equipe_id;
    }

    public void setId(Long id) {
        this.equipe_id = equipe_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getNomEntraineur() {
        return nomEntraineur;
    }

    public void setNomEntraineur(String nomEntraineur) {
        this.nomEntraineur = nomEntraineur;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getSiege() {
        return siege;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public Stade getStade() {
        return stade;
    }

    public void setStade(Stade stade) {
        this.stade = stade;
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
        return "Equipe{" +
                ", nom='" + nom + '\'' +
                ", logo='" + logo + '\'' +
                ", dateCreation=" + dateCreation +
                ", nomEntraineur='" + nomEntraineur + '\'' +
                ", president='" + president + '\'' +
                ", statut='" + statut + '\'' +
                ", siege='" + siege + '\'' +
                ", telephone='" + telephone + '\'' +
                ", siteWeb='" + siteWeb + '\'' +
                ", stade=" + stade +
                '}';
    }
}
