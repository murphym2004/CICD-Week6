package atu.ie.passenger.Controller.errorHandlin;

public class DuplicateException extends RuntimeException{
private String message;
private String field;
public DuplicateException(String message, String field){
    this.field = field;
}
  public DuplicateException(String message){
    super(message);
  }
}
