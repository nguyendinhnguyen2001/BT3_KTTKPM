package com.example.bai1_dichvutinhphiquathe.service;


import com.example.bai1_dichvutinhphiquathe.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CardService extends JpaRepository<Card, Long>{
    List<Card> findByTenchusohuuAndKieutheAndSotheAndCvcAndHansudung (String tenchusohuu, String kieuthe, String sothe, String cvc, String hansudung);
}

