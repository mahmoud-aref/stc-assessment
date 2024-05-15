package com.stc.domain.permission.exception;

public class PermissionNotFoundException extends RuntimeException{
    public PermissionNotFoundException(String message) {
        super(message);
    }
}
