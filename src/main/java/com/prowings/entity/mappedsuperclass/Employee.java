package com.prowings.entity.mappedsuperclass;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@MappedSuperclass
@DiscriminatorColumn(name = "EMPLOYMENT_TYPE")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    @Column(name = "EMPLOYEE_ID")
    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
}
