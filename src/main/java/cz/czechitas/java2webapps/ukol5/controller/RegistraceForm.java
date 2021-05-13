package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.EnumSet;
import java.util.Objects;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RegistraceForm {
    @NotBlank
    private String jmeno;
    @NotBlank
    private String prijmeni;
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate datumNarozeni;
    @NotNull
    private PohlaviEnum pohlavi;
    private EnumSet<SportEnum> sport;
    @NotNull
    private String turnus;
    @Email
    private String email;
    private String telefon;

    public RegistraceForm(String jmeno, String prijmeni, LocalDate datumNarozeni, PohlaviEnum pohlavi, EnumSet<SportEnum> sport, String turnus, String email, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.pohlavi = pohlavi;
        this.sport = sport;
        this.turnus = turnus;
        this.email = email;
        this.telefon = telefon;
    }

    public RegistraceForm() {
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public PohlaviEnum getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(PohlaviEnum pohlavi) {
        this.pohlavi = pohlavi;
    }

    public void setSport(EnumSet<SportEnum> sport) {
        this.sport = sport;
    }

    public EnumSet<SportEnum> getSport() {
        return sport;
    }

    public String getTurnus() {
        return turnus;
    }

    public void setTurnus(String turnus) {
        this.turnus = turnus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

}
