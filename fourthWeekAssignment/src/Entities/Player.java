package Entities;

import java.time.LocalDate;


public class Player {
    private String nationalityId;
    private String firstName;
    private String lastName;
    private java.time.LocalDate dateOfbirth;

    public Player(String nationalityId, String firstName, String lastName, LocalDate dateOfbirth) {
        this.nationalityId = nationalityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfbirth = dateOfbirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(LocalDate dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }
}
