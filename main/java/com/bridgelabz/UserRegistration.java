package com.bridgelabz;

import java.util.regex.Pattern;


@FunctionalInterface
interface UserDetailsValidationFI {
    boolean validate(String x) throws UserRegistrationException;
}
public class UserRegistration {
    // Using lambda function to check firstname Valid or Invalid
    UserDetailsValidationFI validateFirstName = firstName -> {
        // regex pattern for firstname
        if(Pattern.matches("[A-Z][a-z A-Z]{2,}", firstName))
            return true;
        else
            throw new UserRegistrationException("Invalid First Name");
    };

    // Using lambda function to check lastName Valid or Invalid
    UserDetailsValidationFI validateLastname = lastName -> {
        // regex pattern for lastname
        if(Pattern.matches("[A-Z][a-z A-Z]{2,}", lastName))
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");
    };
    UserDetailsValidationFI validateEmail= email -> {
        // regex pattern for email
        if(Pattern.matches("[\\w+-]+(?:\\.[\\w+-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}", email))
            return true;
        else
            throw new UserRegistrationException("Invalid Email");
    };

    // Using lambda function to check mobile number Valid or Invalid
    UserDetailsValidationFI validateMobileNumber = mobileNumber -> {
        // regex pattern for mobile number
        if(Pattern.matches("[+]91 [6-9]\\d{9}", mobileNumber))
            return true;
        else
            throw new UserRegistrationException("Invalid Mobile Number");
    };
    // Using lambda function to check the password Valid or Invalid
    UserDetailsValidationFI validatePassword = password -> {
        // regex pattern for password
        if(Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z \\d $&+,:;=?@#|'<>.-^*()%!]{8,}", password))
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    };
}
