package com.prowings.entity.jointable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity(name = "joinedTablePermanentEmployee")
@Table(name = "JOIN_TABLE_PERMANENT_EMPLOYEE")
@PrimaryKeyJoinColumn(name = "ID")
@DiscriminatorValue("PERMANENT")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PermanentEmployee extends Employee {
    private LocalDate startingDate;
    private String costCenter;
    private Float totalLeaves;
}
