package atu.ie.passenger.Controller.errorHandlin;

import java.lang.reflect.Field;

public class FindException extends RuntimeException
{
    private String Field;
    public FindException(String message, String field)
    {
        super(message);
        this.Field = Field;
    }

}
