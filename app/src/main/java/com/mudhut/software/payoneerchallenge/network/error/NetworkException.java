package com.mudhut.software.payoneerchallenge.network.error;

import java.io.IOException;

import lombok.Getter;

@Getter
public class NetworkException extends IOException {
    private final int code;
    private final String message;

    public NetworkException(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
