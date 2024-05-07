package com.example.demo;

public interface MathService {

    MathOperation add(MathOperation operation);
    MathOperation subtract(MathOperation operation);
    MathOperation multiply(MathOperation operation);
    MathOperation divide(MathOperation operation);
    MathOperation exponentiate(MathOperation operation);
}
