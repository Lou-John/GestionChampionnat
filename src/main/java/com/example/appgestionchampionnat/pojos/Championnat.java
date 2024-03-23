package com.example.appgestionchampionnat.pojos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String logo;
    private Date dateDebut;
    private Date dateFin;
    private int pointGagne;
    private int pointPerdu;
    private int pointNul;
    private String typeCLassement;
    @ManyToOne
    private Pays pays;
    @OneToMany(mappedBy = "championnat")
    private List<Journee> journees;
    @ManyToMany(mappedBy = "championnats")
    private List<Equipe> equipes;

    public Championnat(String nom, String logo, Date dateDebut, Date dateFin, int pointGagne, int pointPerdu, int pointNul, String typeCLassement, Pays pays, List<Journee> journees, List<Equipe> equipes) {
        this.nom = nom;
        this.logo = logo;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.pointGagne = pointGagne;
        this.pointPerdu = pointPerdu;
        this.pointNul = pointNul;
        this.typeCLassement = typeCLassement;
        this.pays = pays;
        this.journees = journees;
        this.equipes = equipes;
    }

    public Championnat() {
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

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getPointGagne() {
        return pointGagne;
    }

    public void setPointGagne(int pointGagne) {
        this.pointGagne = pointGagne;
    }

    public int getPointPerdu() {
        return pointPerdu;
    }

    public void setPointPerdu(int pointPerdu) {
        this.pointPerdu = pointPerdu;
    }

    public int getPointNul() {
        return pointNul;
    }

    public void setPointNul(int pointNul) {
        this.pointNul = pointNul;
    }

    public String getTypeCLassement() {
        return typeCLassement;
    }

    public void setTypeCLassement(String typeCLassement) {
        this.typeCLassement = typeCLassement;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public List<Journee> getJournees() {
        return journees;
    }

    public void setJournees(List<Journee> journees) {
        this.journees = journees;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    @Override
    public String toString() {
        return "Championnat{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", logo='" + logo + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", pointGagne=" + pointGagne +
                ", pointPerdu=" + pointPerdu +
                ", pointNul=" + pointNul +
                ", typeCLassement='" + typeCLassement + '\'' +
                ", pays=" + pays +
                '}';
    }
}
