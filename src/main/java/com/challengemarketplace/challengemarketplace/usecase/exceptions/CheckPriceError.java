package com.challengemarketplace.challengemarketplace.usecase.exceptions;

public class CheckPriceError extends RuntimeException {
    public CheckPriceError(String message) {
        super(message);
    }
}
