package br.com.freitas.medEasy.web.exceptions;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(Object id) {
        super("Record not found. Id: " + id);
    }
}