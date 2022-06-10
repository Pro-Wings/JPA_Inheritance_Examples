package com.prowings.entity.singletable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("PERMANENT")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PermanentEmployee extends Employee {
    private LocalDate startingDate;
    private String costCenter;
    private Float totalLeaves;
}
