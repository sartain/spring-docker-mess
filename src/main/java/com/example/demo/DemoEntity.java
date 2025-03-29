package com.example.demo;


import jakarta.persistence.*;

@Entity
@Table(name = "demoexample")
public class DemoEntity {

    public DemoEntity() {
    }

    public DemoEntity(String v) {
        this.value = v;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String value;

    public Integer getId() {
        return this.id;
    }

    public String getValue() {
        return this.value;
    }


}
