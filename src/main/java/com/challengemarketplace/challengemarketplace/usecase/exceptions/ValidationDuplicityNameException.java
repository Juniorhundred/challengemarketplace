package com.challengemarketplace.challengemarketplace.usecase.exceptions;

public class ValidationDuplicityNameException extends RuntimeException {
    public ValidationDuplicityNameException(String message) {
        super(message);
    }
}
