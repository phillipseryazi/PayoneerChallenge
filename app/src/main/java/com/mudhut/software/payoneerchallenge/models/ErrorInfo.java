package com.mudhut.software.payoneerchallenge.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorInfo {
    /**
     * Simple API, always present
     */
    private String resultInfo;
    /**
     * Simple API, always present
     */
    private Interaction interaction;

    /**
     * Construct an empty ErrorInfo
     */
    public ErrorInfo() {
    }

    /**
     * Constructs a new ErrorInfo with the resultInfo and interaction
     *
     * @param resultInfo  providing a description of the error
     * @param interaction contains recommendation which steps to take next
     */
    public ErrorInfo(String resultInfo, Interaction interaction) {
        this.resultInfo = resultInfo;
        this.interaction = interaction;
    }
}
