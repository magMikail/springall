package com.magmik.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @NotNull
//    @Temporal(TemporalType.TIMESTAMP)
    private Date version;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    @PrePersist
//    public void prePersist() {
//        version = new Date();
//        System.out.println("Pre persist version : "+version);
//    }

    private Date getCurrentDate() throws ParseException {
        Date date = null;
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd_HHmmssSSS");
        date = sf.parse(sf.format(new Date()));
        System.out.println("get Date : " + date);
        return date;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}
