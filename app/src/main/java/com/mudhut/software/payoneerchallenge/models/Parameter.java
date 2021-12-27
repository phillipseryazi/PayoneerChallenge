package com.mudhut.software.payoneerchallenge.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parameter {
    /**
     * Simple API, always present
     */
    private String name;
    /**
     * Simple API, optional
     */
    private String value;
}
