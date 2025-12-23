package com.example.course.services.exceptions;

import java.io.Serial;

public class ObjectNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(Object id) {
        super("ID: " + id + " wasn´t found");
    }
}
