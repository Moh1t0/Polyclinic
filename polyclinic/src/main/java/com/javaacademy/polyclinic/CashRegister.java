package com.javaacademy.polyclinic;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Slf4j
@Data
@Component
public class CashRegister {

    private BigDecimal income = BigDecimal.ZERO;

    public void payment(BigDecimal cash) {
        income = income.add(cash);
        log.info("Доход: {}", income);
    }
}
