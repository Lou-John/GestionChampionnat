package com.example.appgestionchampionnat.pojos;

import jakarta.persistence.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Entity
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String logo;
    @OneToMany(mappedBy = "pays")
    private List<Championnat> championnats;

    public Pays(String nom, String logo, List<Championnat> championnats) {
        this.nom = nom;
        this.logo = logo;
        this.championnats = championnats;
    }

    public Pays() {
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

    public List<Championnat> getChampionnats() {
        return championnats;
    }

    public void setChampionnats(List<Championnat> championnats) {
        this.championnats = championnats;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
