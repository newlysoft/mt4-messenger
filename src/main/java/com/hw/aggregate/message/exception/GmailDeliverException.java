package com.hw.aggregate.message.exception;

public class GmailDeliverException extends RuntimeException {
    public GmailDeliverException(Throwable cause) {
        super("error during gmail deliver", cause);
    }
}
