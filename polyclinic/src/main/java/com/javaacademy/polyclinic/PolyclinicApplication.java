package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@Slf4j
@SpringBootApplication
public class PolyclinicApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PolyclinicApplication.class, args);
        Polyclinic polyclinic = context.getBean(Polyclinic.class);
        polyclinic.dentistTreat();
        polyclinic.therapistTreat();
        polyclinic.juniorSurgeonTreat();
        polyclinic.seniorSurgeonTreat();
        log.info("доход: {}", polyclinic.getCashRegister().getIncome());
    }
}

