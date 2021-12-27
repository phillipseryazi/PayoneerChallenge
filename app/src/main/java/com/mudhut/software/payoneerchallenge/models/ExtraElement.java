package com.mudhut.software.payoneerchallenge.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ExtraElement {

    /**
     * The name of the extra element. Required
     */
    private String name;

    /**
     * The label text that should be visualised for this element. Required
     */
    private String label;

    /**
     * Determines if this extra element is a checkbox, and its additional properties. Optional
     */
    private Checkbox checkbox;
}
