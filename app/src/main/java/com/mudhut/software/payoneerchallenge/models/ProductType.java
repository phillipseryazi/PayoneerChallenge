package com.mudhut.software.payoneerchallenge.models;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ProductType {
    public final static String PHYSICAL = "PHYSICAL";
    public final static String DIGITAL = "DIGITAL";
    public final static String SERVICE = "SERVICE";
    public final static String TAX = "TAX";
    public final static String OTHER = "OTHER";

    /**
     * Check if the given type is a valid product type
     *
     * @param productType the product type to validate
     * @return true when valid, false otherwise
     */
    public static boolean isValid(final String productType) {

        if (productType != null) {
            switch (productType) {
                case PHYSICAL:
                case DIGITAL:
                case SERVICE:
                case TAX:
                case OTHER:
                    return true;
            }
        }
        return false;
    }

    /**
     * The interface Definition
     */
    @Retention(RetentionPolicy.SOURCE)
    @StringDef({
            PHYSICAL,
            DIGITAL,
            SERVICE,
            TAX,
            OTHER})
    public @interface Definition {
    }
}
