package com.dillian.supervisorservice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SupervisorService {

    private final SupervisorRepository supervisorRepository;
    private final SupervisorMapper supervisorMapper;

    public SupervisorDTO findById(Long id) {
        Supervisor supervisor = supervisorRepository.findById(id).orElseThrow(RuntimeException::new);
        return supervisorMapper.toDto(supervisor);
    }

    public List<Supervisor> findAll() {
        return supervisorRepository.findAll();
    }
}
