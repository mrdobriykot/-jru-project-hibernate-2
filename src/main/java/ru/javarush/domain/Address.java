package ru.javarush.domain;

import jakarta.persistence.*;

@Entity
@Table(schema = "movie", name = "address")
public class Address {
    @Id
    @Column(name = "staff_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    private String address;
    private String address2;
    private String district;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
