package com.mudhut.software.payoneerchallenge.models;

import java.net.URL;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicableNetwork {
    /**
     * Simple API, always present
     */
    private String code;
    /**
     * Simple API, always present
     */
    private String label;
    /**
     * Simple API, always present
     */
    @PaymentMethod.Definition
    private String method;
    /**
     * Simple API, always present
     */
    private String grouping;
    /**
     * Simple API, always present
     */
    @NetworkOperationType.Definition
    private String operationType;
    /**
     * Simple API, always present
     */
    @RegistrationType.Definition
    private String registration;
    /**
     * Simple API, always present
     */
    @RegistrationType.Definition
    private String recurrence;
    /**
     * Simple API, always present
     */
    private Boolean redirect;
    /**
     * Simple API, always present
     */
    private Map<String, URL> links;
    /**
     * code of button-label if this network is selected
     */
    private String button;
    /**
     * flag that network is initially selected
     */
    private Boolean selected;
    /**
     * form data to pre-fill a form
     */
    private FormData formData;
    /**
     * An indicator that a form for this network is an empty one, without any text and input elements
     */
    private Boolean emptyForm;
    /**
     * Form elements descriptions
     */
    private List<InputElement> inputElements;
    /**
     * contract data of first possible route.
     */
    private Map<String, String> contractData;
}
