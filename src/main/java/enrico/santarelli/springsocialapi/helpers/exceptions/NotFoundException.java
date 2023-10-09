package enrico.santarelli.springsocialapi.helpers.exceptions;

public class NotFoundException extends Exception {
    public NotFoundException(String object){
        super(object + " was not found");
    }
}
