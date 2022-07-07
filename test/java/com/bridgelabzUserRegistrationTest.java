package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void validateFirstNameTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateFirstName.validate("Vodnala");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateFirstNameTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateFirstName.validate("vodn26");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid First Name", exception.getMessage());
        }

    }
   
    @Test
    public void validateLastNameTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateLastname.validate("Sravan");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateLastNameTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateLastname.validate("sravan");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Last Name", exception.getMessage());
        }
    }

    @Test
    public void validateEmailTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateEmail.validate("sravan.sunny81@gmail.com");
        Assert.assertTrue(actualOutput);
    }
   
    @Test
    public void validateEmailTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateEmail.validate("sra@@in.");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Email", exception.getMessage());
        }
    }
    
    @Test
    public void validateMobileNumberReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateMobileNumber.validate("+91 9052382248");
        Assert.assertTrue(actualOutput);
    }
    
    @Test
    public void validateMobileNumberReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateMobileNumber.validate("+91902977");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Mobile Number", exception.getMessage());
        }
    }
   
    @Test
    public void validatePasswordReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validatePassword.validate("Vodnala@26");
        Assert.assertTrue(actualOutput);
    }
    
    @Test
    public void validatePasswordReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validatePassword.validate("vod@30");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Password", exception.getMessage());
        }
    }
}

