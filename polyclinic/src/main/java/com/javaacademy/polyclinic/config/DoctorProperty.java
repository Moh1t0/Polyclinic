package com.javaacademy.polyclinic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@ConfigurationProperties(prefix = "doctor.cost-of-admission")
@Data
public class DoctorProperty {
   private BigDecimal therapist;
   private BigDecimal dentist;
   private BigDecimal juniorSurgeon;
   private BigDecimal seniorSurgeon;
}
