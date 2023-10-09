package enrico.santarelli.springsocialapi.helpers.exceptions;

public class EntityAttributeException extends Exception {
    public EntityAttributeException(String attribute){
        super("nvalid value for " + attribute);
    }
}
