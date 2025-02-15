package com.pojo;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "personid")
    private int personId;

    @Column(name = "h_no")
    private String hNo;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    // Uncomment below to make it bidirectional
    // @OneToOne
    // @MapsId
    // @JoinColumn(name = "personid")
    // private Person person;

    // Getters and Setters
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getHNo() {
        return hNo;
    }

    public void setHNo(String hNo) {
        this.hNo = hNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Uncomment below to make it bidirectional
    // public Person getPerson() {
    //     return person;
    // }

    // public void setPerson(Person person) {
    //     this.person = person;
    // }
}
