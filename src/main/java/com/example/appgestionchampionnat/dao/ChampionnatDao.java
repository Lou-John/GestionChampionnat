package com.example.appgestionchampionnat.dao;

import com.example.appgestionchampionnat.pojos.Championnat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampionnatDao extends JpaRepository<Championnat, Long> {

}
