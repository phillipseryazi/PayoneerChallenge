package com.mudhut.software.payoneerchallenge.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ExtraElements {

    /**
     * Elements that should be displayed at the top of the payment page.
     * The display order of the elements is defined by the order in which they appear in the collection.
     */
    private List<ExtraElement> top;

    /**
     * Elements that should be displayed at the bottom of the payment page.
     * The display order of the elements is defined by the order in which they appear in the collection.
     */
    private List<ExtraElement> bottom;
}
