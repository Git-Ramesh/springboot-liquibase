package com.rs.springbootliquibase.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String address;
}
