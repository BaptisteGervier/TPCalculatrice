package fr.eni;

import java.security.PrivilegedActionException;

public class DepassementCapaciteException extends Exception{

    public DepassementCapaciteException(String message) {
        super(message);
    }

}
