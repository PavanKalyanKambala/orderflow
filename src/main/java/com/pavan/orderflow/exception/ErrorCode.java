package com.pavan.orderflow.exception;

public enum ErrorCode {

    ORDER_VALIDATION_FAILED("ORD-400-001", "Order request validation failed");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}