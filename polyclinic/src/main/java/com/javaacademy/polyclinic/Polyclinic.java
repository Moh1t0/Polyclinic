package com.javaacademy.polyclinic;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Data
public class Polyclinic {

    private CashRegister cashRegister;
    private Doctor therapist;
    private Doctor dentist;
    private Doctor juniorSurgeon;
    private Doctor seniorSurgeon;

    public Polyclinic(CashRegister cashRegister,
                      @Qualifier("therapist") Doctor therapist,
                      @Qualifier("dentist") Doctor dentist,
                      @Qualifier("juniorSurgeon") Doctor juniorSurgeon,
                      @Qualifier("seniorSurgeon") Doctor seniorSurgeon) {
        this.cashRegister = cashRegister;
        this.therapist = therapist;
        this.dentist = dentist;
        this.juniorSurgeon = juniorSurgeon;
        this.seniorSurgeon = seniorSurgeon;
    }

    public void therapistTreat() {
        //BigDecimal fee = dentist.treatPatient();
       cashRegister.payment(therapist.treat());
    }

    public void dentistTreat() {
        cashRegister.payment(dentist.treat());
    }

    public void juniorSurgeonTreat() {
        cashRegister.payment(juniorSurgeon.treat());
    }

    public void seniorSurgeonTreat() {
        cashRegister.payment(seniorSurgeon.treat());
    }

}
