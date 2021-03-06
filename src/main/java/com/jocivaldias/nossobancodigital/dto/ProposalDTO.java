package com.jocivaldias.nossobancodigital.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jocivaldias.nossobancodigital.services.validation.ProposalUpdate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.time.LocalDate;

@ProposalUpdate
public class ProposalDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotBlank(message = "Can't be blank.")
    private String name;

    @NotBlank(message = "Can't be blank.")
    private String lastName;

    @NotBlank(message = "Can't be blank.")
    @Email(message = "Invalid Email")
    private String email;

    @NotNull(message = "Can't be blank.")
    @Past(message = "Invalid birthdate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone="America/Sao_Paulo")
    private LocalDate birthdate;

    public ProposalDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

}
