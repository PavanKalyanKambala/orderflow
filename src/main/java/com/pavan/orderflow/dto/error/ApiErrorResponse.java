package com.pavan.orderflow.dto.error;

import java.time.Instant;
import java.util.List;

public record ApiErrorResponse(
        Instant timestamp,
        int status,
        String errorCode,
        String message,
        List<FieldError> errors,
        String path
) {
}