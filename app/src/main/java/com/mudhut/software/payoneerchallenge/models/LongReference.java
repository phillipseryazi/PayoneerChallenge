package com.mudhut.software.payoneerchallenge.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LongReference {
    /**
     * mandatory (max 32)
     */
    private String essential;
    /**
     * optional (max 32)
     */
    private String extended;
    /**
     * optional (max 32)
     */
    private String verbose;
}
