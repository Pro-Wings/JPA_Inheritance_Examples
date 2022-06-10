package com.prowings.entity.mappedsuperclass;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity(name = "mappedSuperClassPermanentEmployee")
@Table(name = "MAPPED_PERMANENT_EMPLOYEE")
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
