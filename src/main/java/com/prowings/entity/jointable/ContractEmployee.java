package com.prowings.entity.jointable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity(name = "joinedTableContractEmployee")
@Table(name = "JOIN_TABLE_CONTRACT_EMPLOYEE")
@PrimaryKeyJoinColumn(name = "ID")
@DiscriminatorValue("CONTRACT")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ContractEmployee extends Employee {
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
    private String agencyName;
}
