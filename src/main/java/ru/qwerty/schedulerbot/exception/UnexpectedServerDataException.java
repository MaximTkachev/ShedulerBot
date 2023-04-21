package ru.qwerty.schedulerbot.exception;

import ru.qwerty.schedulerbot.data.model.Response;

public class UnexpectedServerDataException extends InternalException {

    public UnexpectedServerDataException() {
        super(Response.UNEXPECTED_SERVER_DATA);
    }
}
