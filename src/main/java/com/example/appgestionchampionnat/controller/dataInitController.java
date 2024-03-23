package com.example.appgestionchampionnat.controller;

import com.example.appgestionchampionnat.pojos.*;
import com.example.appgestionchampionnat.services.*;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class dataInitController {
    private ChampionnatService championnatService;
    private EquipeService equipeService;
    private JourneeService journeeService;
    private MatchService matchService;
    private PaysService paysService;
    private StadeService stadeService;

    public dataInitController(ChampionnatService championnatService, EquipeService equipeService, JourneeService journeeService, MatchService matchService, PaysService paysService, StadeService stadeService) {
        this.championnatService = championnatService;
        this.equipeService = equipeService;
        this.journeeService = journeeService;
        this.matchService = matchService;
        this.paysService = paysService;
        this.stadeService = stadeService;
    }

    @PostConstruct
    private void init() {
        // Create and persist Pays
        Pays pays1 = new Pays("France", "logo1.png", new ArrayList<>());
        Pays pays2 = new Pays("Argentine", "logo2.png", new ArrayList<>());
        Pays pays3 = new Pays("Espagne", "logo3.png", new ArrayList<>());
        Pays pays4 = new Pays("Brésil", "logo4.png", new ArrayList<>());
        Pays pays5 = new Pays("Italie", "logo5.png", new ArrayList<>());
        paysService.ajouterPays(pays1);
        paysService.ajouterPays(pays2);
        paysService.ajouterPays(pays3);
        paysService.ajouterPays(pays4);
        paysService.ajouterPays(pays5);

        // Create and persist Championnat
        Championnat championnat1 = new Championnat(
                "La Liga",
                "la_liga_logo.png",
                new Date(2024, 8, 15),
                new Date(2024, 12, 20),
                3,
                0,
                1,
                "Différence",
                pays3,
                new ArrayList<>(),
                new ArrayList<>()
        );
        championnat1.getEquipes().add(equipe1);
        championnat1.getEquipes().add(equipe2);

        Championnat championnat2 = new Championnat(
                "Primera División Argentina",
                "primera_division_argentina_logo.png",
                new Date(2024, 7, 20),
                new Date(2024, 11, 25),
                3,
                0,
                1,
                "Marqués",
                pays2, // Assuming pays2 represents Argentina
                new ArrayList<>(), // Assuming no journees are created yet
                new ArrayList<>()  // List of equipes
        );
        championnat2.getEquipes().add(equipe3);
        championnat2.getEquipes().add(equipe4);


        // Create and persist Stade
        Stade stade1 = new Stade("Santiago Bernabéu", "Av. de Concha Espina, 1, 28036 Madrid, Spain", 81044L, "+34 913 46 14 00", new ArrayList<>(), new ArrayList<>());
        Stade stade2 = new Stade("Camp Nou", "Carrer d'Aristides Maillol, s/n, 08028 Barcelona, Spain", 99354L, "+34 902 18 99 00", new ArrayList<>(), new ArrayList<>());
        Stade stade3 = new Stade("Estadio Monumental Antonio Vespucio Liberti", "Avenida Figueroa Alcorta 7597, Ciudad Autónoma de Buenos Aires, Argentina", 67000L, "+54 11 4789-1200", new ArrayList<>(), new ArrayList<>());
        Stade stade4 = new Stade("Old Trafford", "Sir Matt Busby Way, Old Trafford, Manchester M16 0RA, United Kingdom", 74691L, "+44 161 868 8000", new ArrayList<>(), new ArrayList<>());
        Stade stade5 = new Stade("Anfield", "Anfield Road, Liverpool L4 0TH, United Kingdom", 53394L, "+44 151 260 6677", new ArrayList<>(), new ArrayList<>());
        Stade stade6 = new Stade("Parc des Princes", "24 Rue du Commandant Guilbaud, 75016 Paris, France", 48712L, "+33 1 47 43 71 71", new ArrayList<>(), new ArrayList<>());
        Stade stade7 = new Stade("Allianz Arena", "Werner-Heisenberg-Allee 25, 80939 München, Germany", 75000L, "+49 89 699310", new ArrayList<>(), new ArrayList<>());
        Stade stade8 = new Stade("Allianz Stadium", "Corso Gaetano Scirea, 50, 10151 Torino TO, Italy", 41806L, "+39 011 65631", new ArrayList<>(), new ArrayList<>());
        Stade stade9 = new Stade("San Siro", "Via Aldo Rossi, 8, 20149 Milano MI, Italy", 75219L, "+39 02 6228 1", new ArrayList<>(), new ArrayList<>());
        Stade stade10 = new Stade("Etihad Stadium", "Etihad Stadium, Ashton New Rd, Manchester M11 3FF, United Kingdom", 55097L, "+44 161 444 1894", new ArrayList<>(), new ArrayList<>());
        stadeService.ajouterStade(stade1);
        stadeService.ajouterStade(stade2);
        stadeService.ajouterStade(stade3);
        stadeService.ajouterStade(stade4);
        stadeService.ajouterStade(stade5);
        stadeService.ajouterStade(stade7);
        stadeService.ajouterStade(stade8);
        stadeService.ajouterStade(stade9);
        stadeService.ajouterStade(stade10);




        // Create and persist Equipe
        Equipe equipe1 = new Equipe("Real Madrid", "real_madrid_logo.png", new Date(1902, 3, 6), "Carlo Ancelotti", "Florentino Pérez", "Società per azioni", "Av. Concha Espina, 1, 28036 Madrid, Spain", "123456789", "https://www.realmadrid.com/", stade1, new ArrayList<>(), new ArrayList<>());
        Equipe equipe2 = new Equipe("FC Barcelona", "barcelona_logo.png", new Date(1899, 11, 29), "Xavi Hernandez", "Joan Laporta", "Club", "Carrer d'Aristides Maillol, s/n, 08028 Barcelona, Spain", "987654321", "https://www.fcbarcelona.com/", stade2, new ArrayList<>(), new ArrayList<>());
        Equipe equipe3 = new Equipe("River Plate", "river_plate_logo.png", new Date(1901, 5, 25), "Marcelo Gallardo", "Rodolfo D'Onofrio", "Società Anonima Sportiva", "Avenida Figueroa Alcorta 7597, Ciudad Autónoma de Buenos Aires, Argentina", "123456789", "https://www.cariverplate.com.ar/", stade3, new ArrayList<>(), new ArrayList<>());// Teams
        Equipe equipe4 = new Equipe("Manchester United", "manchester_united_logo.png", new Date(1878, 12, 5), "Ralf Rangnick", "Joel Glazer", "Limited company", "Sir Matt Busby Way, Old Trafford, Manchester M16 0RA, United Kingdom", "+44 161 868 8000", "https://www.manutd.com/", stade4, new ArrayList<>(), new ArrayList<>());
        Equipe equipe5 = new Equipe("Liverpool", "liverpool_logo.png", new Date(1892, 3, 15), "Jürgen Klopp", "Tom Werner", "Club", "Anfield Road, Liverpool L4 0TH, United Kingdom", "+44 151 260 6677", "https://www.liverpoolfc.com/", stade5, new ArrayList<>(), new ArrayList<>());
        Equipe equipe6 = new Equipe("Paris Saint-Germain", "psg_logo.png", new Date(1970, 8, 12), "Mauricio Pochettino", "Nasser Al-Khelaifi", "Société anonyme", "24 Rue du Commandant Guilbaud, 75016 Paris, France", "+33 1 47 43 71 71", "https://en.psg.fr/", stade6, new ArrayList<>(), new ArrayList<>());
        Equipe equipe7 = new Equipe("Bayern Munich", "bayern_munich_logo.png", new Date(1900, 2, 27), "Julian Nagelsmann", "Herbert Hainer", "Aktiengesellschaft", "Werner-Heisenberg-Allee 25, 80939 München, Germany", "+49 89 699310", "https://fcbayern.com/", stade7, new ArrayList<>(), new ArrayList<>());
        Equipe equipe8 = new Equipe("Juventus", "juventus_logo.png", new Date(1897, 11, 1), "Massimiliano Allegri", "Andrea Agnelli", "Società per azioni", "Corso Gaetano Scirea, 50, 10151 Torino TO, Italy", "+39 011 65631", "https://www.juventus.com/", stade8, new ArrayList<>(), new ArrayList<>());
        Equipe equipe9 = new Equipe("AC Milan", "ac_milan_logo.png", new Date(1899, 12, 13), "Stefano Pioli", "Paolo Scaroni", "Società per azioni", "Via Aldo Rossi, 8, 20149 Milano MI, Italy", "+39 02 6228 1", "https://www.acmilan.com/", stade9, new ArrayList<>(), new ArrayList<>());
        Equipe equipe10 = new Equipe("Manchester City", "manchester_city_logo.png", new Date(1880, 4, 13), "Pep Guardiola", "Khaldoon Al Mubarak", "Limited company", "Etihad Stadium, Ashton New Rd, Manchester M11 3FF, United Kingdom", "+44 161 444 1894", "https://www.mancity.com/", stade10, new ArrayList<>(), new ArrayList<>());Equipe equipe11 = new Equipe("Arsenal", "arsenal_logo.png", new Date(1886, 12, 1), "Mikel Arteta", "Stan Kroenke", "Club", "75 Drayton Park, London N5 1BU, United Kingdom", "+44 20 7619 5003", "https://www.arsenal.com/", stade2, new ArrayList<>(), new ArrayList<>());Equipe equipe11 = new Equipe("Atletico Madrid", "atletico_madrid_logo.png", new Date(1903, 4, 26), "Diego Simeone", "Enrique Cerezo", "Sociedad Anónima Deportiva", "Paseo Virgen del Puerto, 67, 28005 Madrid, Spain", "+34 91 366 4707", "https://en.atleticodemadrid.com/", stade1, new ArrayList<>(), new ArrayList<>());
        equipeService.ajouterEquipe(equipe1);
        equipeService.ajouterEquipe(equipe2);
        equipeService.ajouterEquipe(equipe3);
        equipeService.ajouterEquipe(equipe4);
        equipeService.ajouterEquipe(equipe5);
        equipeService.ajouterEquipe(equipe6);
        equipeService.ajouterEquipe(equipe7);
        equipeService.ajouterEquipe(equipe8);
        equipeService.ajouterEquipe(equipe9);
        equipeService.ajouterEquipe(equipe10);



        // Ajout des équipes aux championnats
        List<Equipe> equipeList = new ArrayList<>();
        equipeList.add(equipe1);
        equipeList.add(equipe2);
        championnat1.setEquipes(equipeList);



        //String nom, String logo, Date "dateCreation", String nomEntraineur, String president, String statut, String siege, String telephone, String siteWeb, Stade stade, List<Match> matchs, List<Championnat> championnats
// Create and persist Journee
        Journee journee1 = new Journee();
        journeeService.ajouterJournee(journee1);

        Journee journee2 = new Journee();
        journeeService.ajouterJournee(journee2);



// Create and persist Match
        Match match1 = new Match();
        match1.setEquipe1(equipe1);
        match1.setEquipe2(equipe2);
        match1.setStade(stade1);
        match1.setJournee(journee1);
        matchService.ajouterMatch(match1);

        Match match2 = new Match();
        match2.setEquipe1(equipe3);
        match2.setEquipe2(equipe4);
        match2.setStade(stade3);
        match2.setJournee(journee1);
        matchService.ajouterMatch(match2);

        Match match3 = new Match();
        match3.setEquipe1(equipe1);
        match3.setEquipe2(equipe3);
        match3.setStade(stade2);
        match3.setJournee(journee2);
        matchService.ajouterMatch(match3);

        Match match4 = new Match();
        match4.setEquipe1(equipe2);
        match4.setEquipe2(equipe4);
        match4.setStade(stade4);
        match4.setJournee(journee2);
        matchService.ajouterMatch(match4);
    }
}
