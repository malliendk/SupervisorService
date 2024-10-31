package com.dillian.supervisorservice;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("supervisor")
@AllArgsConstructor
public class SupervisorController {

    private final SupervisorService supervisorService;

    @GetMapping
    public ResponseEntity<List<Supervisor>> getSupervisor() {
        return ResponseEntity
                .ok(supervisorService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<SupervisorDTO> getById(@PathVariable Long id) {
        return ResponseEntity
                .ok(supervisorService.findById(id));
    }
}
