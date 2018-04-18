package com.sumit;

/**
 * Created by Sumit on 24-Jul-17.
 */
public class TestCustomException {
    public static void main(String[] args) {
        try {
            validate(13);
        }catch(Exception m){
            System.out.println("Exception occured: " + m);
        }
    }

    static void validate(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age is not valid");
        }
        else{
            System.out.println("you are eligible to vote!");
        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}
