package com.mudhut.software.payoneerchallenge.models;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentAmount {
    /**
     * amount
     */
    private BigDecimal amount;
    /**
     * currency
     */
    private String currency;
}
