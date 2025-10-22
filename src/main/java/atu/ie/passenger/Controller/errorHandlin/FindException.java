package atu.ie.passenger.Controller.errorHandlin;

import java.lang.reflect.Field;

public class FindException extends RuntimeException
{
    private String message;
    private String Field;
    public FindException(String message, String field)
    {
        this.Field = Field;
    }
    public FindException(String message)
    {
        super(message);
    }
}
