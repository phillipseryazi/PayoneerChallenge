package com.mudhut.software.payoneerchallenge.models;

import java.net.URL;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Redirect {
    /**
     * Simple API, always present
     */
    private URL url;
    /**
     * Simple API, always present
     */
    @HttpMethod.Definition
    private String method;
    /**
     * Simple API, optional
     */
    private List<Parameter> parameters;
    /**
     * Simple API, optional
     */
    private Boolean suppressIFrame;
    /**
     * Simple API, always present in new transactions
     */
    private String type;
}
