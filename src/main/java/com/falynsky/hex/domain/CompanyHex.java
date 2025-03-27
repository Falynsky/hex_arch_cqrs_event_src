package com.falynsky.hex.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "company")
public class CompanyHex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public CompanyHex() {}

    public CompanyHex(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}
