package com.bezkoder.spring.jpa.h2.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "designation")
    private String designation;

    @Column(name = "dateOfBirth")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "qualification")
    private Qualification qualification;

    @Column(name = "sportDepartment")
    private SportDepartment sportDepartment;

    @Column(name = "address")
    private String address;
}
