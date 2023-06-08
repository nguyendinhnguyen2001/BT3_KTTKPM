package com.example.bai1_dichvutinhphiquathe.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="card")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Card implements Serializable {
    private static final long serialVersionUID = 1L;
    private String tenchusohuu;
    private String kieuthe;
    private String sothe;
    private String cvc;
    private  String hansudung;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    public Card(){
        id=0;
    }

    public Card(String tenchusohuu, String kieuthe, String sothe, String cvc, String hansudung) {
        this.tenchusohuu = tenchusohuu;
        this.kieuthe = kieuthe;
        this.sothe = sothe;
        this.cvc = cvc;
        this.hansudung = hansudung;
    }

    public String getTenchusohuu() {
        return tenchusohuu;
    }

    public void setTenchusohuu(String tenchusohuu) {
        this.tenchusohuu = tenchusohuu;
    }

    public String getKieuthe() {
        return kieuthe;
    }

    public void setKieuthe(String kieuthe) {
        this.kieuthe = kieuthe;
    }

    public String getSothe() {
        return sothe;
    }

    public void setSothe(String sothe) {
        this.sothe = sothe;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getHansudung() {
        return hansudung;
    }

    public void setHansudung(String hansudung) {
        this.hansudung = hansudung;
    }

}

