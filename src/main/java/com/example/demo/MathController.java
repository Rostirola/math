package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    private final MathService mathService;
    private final MathOperationRepository repository;

    public MathController(MathService mathService, MathOperationRepository repository) {
        this.mathService = mathService;
        this.repository = repository;
    }

    @GetMapping("/add")
    @PostMapping("/add")
    public ResponseEntity<Double> add(@RequestBody MathOperation operation) {
        operation = mathService.add(operation);
        repository.save(operation);
        return ResponseEntity.ok(operation.getResult());
    }

    @GetMapping("/subtract")
    @PostMapping("/subtract")
    public ResponseEntity<Double> subtract(@RequestBody MathOperation operation) {
        operation = mathService.subtract(operation);
        repository.save(operation);
        return ResponseEntity.ok(operation.getResult());
    }

    @GetMapping("/multiply")
    @PostMapping("/multiply")
    public ResponseEntity<Double> multiply(@RequestBody MathOperation operation) {
        operation = mathService.multiply(operation);
        repository.save(operation);
        return ResponseEntity.ok(operation.getResult());
    }

    @GetMapping("/divide")
    @PostMapping("/divide")
    public ResponseEntity<Double> divide(@RequestBody MathOperation operation) {
        operation = mathService.divide(operation);
        repository.save(operation);
        return ResponseEntity.ok(operation.getResult());
    }

    @GetMapping("/exponentiate")
    @PostMapping("/exponentiate")
    public ResponseEntity<Double> exponentiate(@RequestBody MathOperation operation) {
        operation = mathService.exponentiate(operation);
        repository.save(operation);
        return ResponseEntity.ok(operation.getResult());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MathOperation> getById(@PathVariable Long id) {
        MathOperation operation = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Operation not found with id: " + id));
        return ResponseEntity.ok(operation);
    }
}

