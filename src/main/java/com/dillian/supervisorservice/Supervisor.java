package com.dillian.supervisorservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Supervisor {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String imageUrl;
    private String biography;
}
