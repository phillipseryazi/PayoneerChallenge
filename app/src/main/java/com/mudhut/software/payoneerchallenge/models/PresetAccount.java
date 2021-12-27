package com.mudhut.software.payoneerchallenge.models;

import java.net.URL;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PresetAccount {
    /**
     * Links (Simple API, always present)
     */
    private Map<String, URL> links;
    /**
     * Network code (Simple API, always present)
     */
    private String code;
    /**
     * Simple API, always present
     */
    @NetworkOperationType.Definition
    private String operationType;
    /**
     * Masked account (Simple API, optional)
     */
    private AccountMask maskedAccount;
    /**
     * PCI API, optional
     */
    private Redirect redirect;
    /**
     * Simple API, always present
     */
    @PaymentMethod.Definition
    private String method;
    /**
     * The following three booleans determine the visibility of the preset warning text
     */
    private boolean registered;
    private boolean autoRegistration;
    private boolean allowRecurrence;
}
