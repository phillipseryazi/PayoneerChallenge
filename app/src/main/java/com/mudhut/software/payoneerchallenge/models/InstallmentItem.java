package com.mudhut.software.payoneerchallenge.models;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstallmentItem {
    /**
     * The amount of installment (mandatory)
     */
    private BigDecimal amount;
    /**
     * Installment/payment date
     */
    private Date date;
}
