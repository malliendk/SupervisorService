package com.dillian.supervisorservice;

import org.springframework.stereotype.Component;

@Component
public class SupervisorMapper {

    public SupervisorDTO toDto(Supervisor supervisor) {
        SupervisorDTO dto = new SupervisorDTO();
        dto.setId(supervisor.getId());
        dto.setFirstName(supervisor.getFirstName());
        dto.setLastName(supervisor.getLastName());
        dto.setImageUrl(supervisor.getImageUrl());
        dto.setBiography(supervisor.getBiography());
        return dto;
    }
}
