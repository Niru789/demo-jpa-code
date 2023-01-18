package com.example.demojpacode.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")

@Getter
@Setter
public class Student {

    @Id
    private String id;

    @Column(name= "firstName")
    private String firstName;
    @Column(name= "lastName")
    private String lastName;


}
