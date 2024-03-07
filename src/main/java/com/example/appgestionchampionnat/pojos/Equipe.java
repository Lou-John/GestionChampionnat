package com.example.appgestionchampionnat.pojos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    @OneToMany(mappedBy = "equipe")
    private List<Match> matchs;
    @ManyToMany(mappedBy = "equipe")
    private List<Championnat> championnats;

    public Equipe(String nom, String logo, Date dateCreation, String nomEntraineur, String president, String statut, String siege, String telephone, String siteWeb, Stade stade, List<Match> matchs, List<Championnat> championnats) {
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
        this.championnats = championnats;
    }

    public Equipe() {
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

    public List<Match> getMatchs1() {
        return matchs1;
    }

    public void setMatchs1(List<Match> matchs1) {
        this.matchs1 = matchs1;
    }

    public List<Match> getMatchs2() {
        return matchs2;
    }

    public void setMatchs2(List<Match> matchs2) {
        this.matchs2 = matchs2;
    }

    public List<Championnat> getChampionnats() {
        return championnats;
    }

    public void setChampionnats(List<Championnat> championnats) {
        this.championnats = championnats;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "id=" + id +
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
