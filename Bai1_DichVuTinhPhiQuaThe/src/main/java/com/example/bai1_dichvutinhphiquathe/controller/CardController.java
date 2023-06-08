package com.example.bai1_dichvutinhphiquathe.controller;

import com.example.bai1_dichvutinhphiquathe.model.Card;
import com.example.bai1_dichvutinhphiquathe.service.CardService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class CardController {
//    public static Logger logger = (Logger) LoggerFactory.getLogger(CardController.class);

    @Autowired
    CardService cardService;

    @GetMapping(value = "/card")
    public Card saveContact(@RequestParam String tenchusohuu,@RequestParam String kieuthe,@RequestParam String sothe, @RequestParam String cvc, @RequestParam String hansudung) {
        List<Card> cardResult;
       cardResult=  cardService.findByTenchusohuuAndKieutheAndSotheAndCvcAndHansudung(tenchusohuu, kieuthe, sothe, cvc, hansudung);
       Card card = new Card(tenchusohuu, kieuthe, sothe, cvc, hansudung);
       if(cardResult.size()==0){
           return null;
       }
       return card;
//                cardService.save(card);
//        return ResponseEntity.ok(card);
    }
}
