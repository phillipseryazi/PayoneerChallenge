package com.mudhut.software.payoneerchallenge.models;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Networks {
    /**
     * Simple API, always present
     */
    private List<ApplicableNetwork> applicable;
    /**
     * Simple API, always present
     */
    private Date resourcesLastUpdate;
}
