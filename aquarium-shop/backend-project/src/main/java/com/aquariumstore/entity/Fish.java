package com.aquariumstore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String species;
    private double price;
    private int stockQuantity;
}
