package com.prowings.entity.tableperclass;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity(name = "tablePerClassPermanentEmployee")
@Table(name = "TABLE_PER_CLASS_PERMANENT_EMPLOYEE")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PermanentEmployee extends Employee {
    private LocalDate startingDate;
    private String costCenter;
    private Float totalLeaves;
}
