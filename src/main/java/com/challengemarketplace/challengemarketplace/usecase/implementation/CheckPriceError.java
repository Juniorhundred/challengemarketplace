package com.challengemarketplace.challengemarketplace.usecase.implementation;

public class CheckPriceError extends RuntimeException {
    public CheckPriceError(String message) {
        super (message);
    }
}
