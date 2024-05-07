package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

    @Override
    public MathOperation add(MathOperation operation) {
        operation.setResult(operation.getOperand1() + operation.getOperand2());
        return operation;
    }

    @Override
    public MathOperation subtract(MathOperation operation) {
        operation.setResult(operation.getOperand1() - operation.getOperand2());
        return operation;
    }

    @Override
    public MathOperation multiply(MathOperation operation) {
        operation.setResult(operation.getOperand1() * operation.getOperand2());
        return operation;
    }

    @Override
    public MathOperation divide(MathOperation operation) {
        if (operation.getOperand2() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        operation.setResult(operation.getOperand1() / operation.getOperand2());
        return operation;
    }

    @Override
    public MathOperation exponentiate(MathOperation operation) {
        operation.setResult(Math.pow(operation.getOperand1(), operation.getOperand2()));
        return operation;
    }
}


