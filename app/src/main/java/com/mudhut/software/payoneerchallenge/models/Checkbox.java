package com.mudhut.software.payoneerchallenge.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Checkbox {
    /**
     * Defines the mode of this Checkbox, required
     */
    @CheckboxMode.Definition
    private String mode;
    /**
     * Error message that should be displayed if required checkbox is not checked by customer.
     */
    private String requiredMessage;
}
