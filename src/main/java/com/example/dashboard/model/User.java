package com.example.dashboard.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
}