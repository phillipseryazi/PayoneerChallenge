package com.mudhut.software.payoneerchallenge.models;

import java.net.URL;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListResult {
    /**
     * Simple API, always present
     */
    private Map<String, URL> links;
    /**
     * Simple API, always present
     */
    private String resultInfo;
    /**
     * Simple API, optional, always present in response to action (POST, UPDATE)
     */
    private Interaction interaction;
    /**
     * Simple API, optional
     */
    private List<AccountRegistration> accounts;
    /**
     * Simple API, optional, always present in native LIST
     */
    private Networks networks;
    /**
     * Advanced API, optional
     */
    private ExtraElements extraElements;
    /**
     * Preset account, Simple API, optional, could present only in the LIST-for-PRESET
     */
    private PresetAccount presetAccount;
    /**
     * LIST type based on operation of next referred actions, could be one of CHARGE, PRESET, PAYOUT, UPDATE.
     */
    private String operationType;
    /**
     * Indicates whether this LIST is explicitly initialized with permission or denial to delete accounts.
     */
    private Boolean allowDelete;
    /**
     * The style object passed in the transaction.
     */
    private Style style;
    /**
     * Payment information, optional
     */
    private Payment payment;
    /**
     * Collections of the products, optional
     */
    private List<Product> products;
    /**
     * Integration type used when creating the LIST session, always present
     */
    private String integrationType;
}
