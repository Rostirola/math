package com.example.demo;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "math_operation")
@Data // Substitui getters, setters, equals, hashCode e toString
public class MathOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double operand1;
    private Double operand2;
    private String operation;
    private Double result;
}
