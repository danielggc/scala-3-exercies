package com.example.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
    
    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY )
    private long id ;
    private String name;
    private String lastname;
    @Column( name = "programin_language" )
    private String programingLenguage;

    public Person() {

    }
    
    public Person(long id, String name, String lastname, String programingLenguage) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.programingLenguage = programingLenguage;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getProgramingLenguage() {
        return programingLenguage;
    }
    public void setProgramingLenguage(String programingLenguage) {
        this.programingLenguage = programingLenguage;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", lastname=" + lastname + ", programingLenguage="
                + programingLenguage + "]";
    }

    
}
