package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.CashRegister;
import com.javaacademy.polyclinic.Doctor;
import com.javaacademy.polyclinic.Specialization;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = DoctorProperty.class)
public class DoctorsConfig {

    private DoctorProperty doctorProperty;

    public DoctorsConfig(DoctorProperty doctorProperty) {
        this.doctorProperty = doctorProperty;
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(doctorProperty.getDentist(), Specialization.DENTIST);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(doctorProperty.getTherapist(), Specialization.THERAPIST);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(doctorProperty.getJuniorSurgeon(), Specialization.SURGEON);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(doctorProperty.getSeniorSurgeon(), Specialization.SURGEON);
    }

    @Bean
    public CashRegister cashRegister() {
        return new CashRegister();
    }

}
