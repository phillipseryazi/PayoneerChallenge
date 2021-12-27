package com.mudhut.software.payoneerchallenge.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Installments {
    /**
     * payment amount of original payment
     */
    private PaymentAmount originalPayment;
    /**
     * installments plans
     */
    private List<InstallmentsPlan> plans;
}
