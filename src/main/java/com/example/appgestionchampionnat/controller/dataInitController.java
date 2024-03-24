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

        Championnat championnat3 = new Championnat(
                "Premier League",
                "premier_league_logo.png",
                new Date(2024, 8, 10),
                new Date(2025, 5, 22),
                3,
                0,
                1,
                "Marqués",
                pays4,
                new ArrayList<>(), // Assuming no journees are created yet
                new ArrayList<>()  // List of equipes
        );

        Championnat championnat4 = new Championnat(
                "Ligue 1",
                "ligue_1_logo.png",
                new Date(2024, 8, 7),
                new Date(2025, 5, 29),
                3,
                0,
                1,
                "Marqués",
                pays1, // Assuming pays6 represents France
                new ArrayList<>(), // Assuming no journees are created yet
                new ArrayList<>()  // List of equipes
        );



        // Create and persist Equipe
        Equipe equipe1 = new Equipe("Real Madrid", "real_madrid_logo.png", new Date(1902, 3, 6), "Carlo Ancelotti", "Florentino Pérez", "Società per azioni", "Av. Concha Espina, 1, 28036 Madrid, Spain", "123456789", "https://www.realmadrid.com/", stade1, new ArrayList<>(), championnat1);
        Equipe equipe2 = new Equipe("FC Barcelona", "barcelona_logo.png", new Date(1899, 11, 29), "Xavi Hernandez", "Joan Laporta", "Club", "Carrer d'Aristides Maillol, s/n, 08028 Barcelona, Spain", "987654321", "https://www.fcbarcelona.com/", stade2, new ArrayList<>(), championnat1);
        Equipe equipe10 = new Equipe("Atletico Madrid", "atletico_madrid_logo.png", new Date(1903, 4, 26), "Diego Simeone", "Enrique Cerezo", "Società per azioni", "Paseo Virgen del Puerto, 67, 28005 Madrid, Spain", "987654321", "https://www.atleticodemadrid.com/", stade3, new ArrayList<>(), championnat1);
        Equipe equipe3 = new Equipe("River Plate", "river_plate_logo.png", new Date(1901, 5, 25), "Marcelo Gallardo", "Rodolfo D'Onofrio", "Società Anonima Sportiva", "Avenida Figueroa Alcorta 7597, Ciudad Autónoma de Buenos Aires, Argentina", "123456789", "https://www.cariverplate.com.ar/", stade3, new ArrayList<>(), championnat2);// Teams
        Equipe equipe4 = new Equipe("Manchester United", "manchester_united_logo.png", new Date(1878, 12, 5), "Ralf Rangnick", "Joel Glazer", "Limited company", "Sir Matt Busby Way, Old Trafford, Manchester M16 0RA, United Kingdom", "+44 161 868 8000", "https://www.manutd.com/", stade4, new ArrayList<>(), championnat3);
        Equipe equipe5 = new Equipe("Liverpool", "liverpool_logo.png", new Date(1892, 3, 15), "Jürgen Klopp", "Tom Werner", "Club", "Anfield Road, Liverpool L4 0TH, United Kingdom", "+44 151 260 6677", "https://www.liverpoolfc.com/", stade5, new ArrayList<>(), championnat3);
        Equipe equipe6 = new Equipe("Paris Saint-Germain", "psg_logo.png", new Date(1970, 8, 12), "Mauricio Pochettino", "Nasser Al-Khelaifi", "Société anonyme", "24 Rue du Commandant Guilbaud, 75016 Paris, France", "+33 1 47 43 71 71", "https://en.psg.fr/", stade6, new ArrayList<>(), championnat4);
        equipeService.ajouterEquipe(equipe1);
        equipeService.ajouterEquipe(equipe2);
        equipeService.ajouterEquipe(equipe3);
        equipeService.ajouterEquipe(equipe4);
        equipeService.ajouterEquipe(equipe5);
        equipeService.ajouterEquipe(equipe6);

        // Add teams to the championships
        championnat1.setEquipe(equipe1);
        championnat1.setEquipe(equipe2);
        championnat1.setEquipe(equipe10);
        championnat2.setEquipe(equipe3);
        championnat3.setEquipe(equipe4);
        championnat3.setEquipe(equipe5);



        // Create and persist Journee
        Journee journee1 = new Journee(1L, new ArrayList<>(), championnat1);
        journeeService.ajouterJournee(journee1);
        Journee journee2 = new Journee(2L, new ArrayList<>(), championnat1);
        journeeService.ajouterJournee(journee1);
        Journee journee3 = new Journee(1L, new ArrayList<>(), championnat2);
        journeeService.ajouterJournee(journee1);


// Create and persist Match
        List<Equipe> equipesList1 = new ArrayList<>();
        equipesList1.add(equipe1);
        equipesList1.add(equipe2);
        Match match1 = new Match(2L, 1L, journee1, stade1, equipesList1);
        matchService.ajouterMatch(match1);

        List<Equipe> equipesList2 = new ArrayList<>();
        equipesList2.add(equipe1);
        equipesList2.add(equipe2);
        Match match2 = new Match(2L, 2L, journee2, stade1, equipesList2);
        matchService.ajouterMatch(match2);

        List<Equipe> equipesList3 = new ArrayList<>();
        equipesList3.add(equipe1);
        equipesList3.add(equipe2);
        Match match3 = new Match(3L, 0L, journee3, stade3, equipesList3);
        matchService.ajouterMatch(match3);

    }
}
