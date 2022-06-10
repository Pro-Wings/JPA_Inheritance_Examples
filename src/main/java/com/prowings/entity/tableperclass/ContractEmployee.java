package com.prowings.entity.tableperclass;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity(name = "tablePerClassContractEmployee")
@Table(name = "TABLE_PER_CLASS_CONTRACT_EMPLOYEE")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ContractEmployee extends Employee {
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
    private String agencyName;
}
