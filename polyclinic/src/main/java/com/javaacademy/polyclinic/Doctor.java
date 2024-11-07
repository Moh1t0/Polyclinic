package com.javaacademy.polyclinic;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@Slf4j
public class Doctor {
    private final BigDecimal costOfAdmission;
    private final Specialization specialization;

    public BigDecimal treat() {
      log.info("{} вылечил человека", getSpecialization());
      return costOfAdmission;
    }
}
