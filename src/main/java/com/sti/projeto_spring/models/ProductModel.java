package com.sti.projeto_spring.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable {
    private static final long serialVersionUIO = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;
}
