package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.Period;

/*
*Entita obsahující osobní údaje.
 */
public class Person {

    private String givenName;
    private String surname;
    private String birthDate;
    private String photoURL;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }
    public int getAge(){

        Period period = birthDate.until(LocalDate.now());
        return period.getYears();
    }
}
