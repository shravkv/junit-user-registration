package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class JunitUserRegistrationTest {
    static JunitUserRegistration userRegistration = new JunitUserRegistration();

    @Test
    public void firstNameValidationTest() {
        try {
            Assert.assertTrue(userRegistration.firstNameValidation("vod"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }
    }
     @Test
    public void positiveLastNameValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.lastNameValidation("vod"));
    }

    @Test
    public void negativeLastNameValidationTest() {
        try {
            Assert.assertTrue(userRegistration.lastNameValidation("sr@12"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }


    }

    @Test
    public void positiveEmailValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.emailValidation("sravan.sunny81@gmail.com"));
    }
      @Test
    public void negativeEmailValidationTest() {
        try {
            Assert.assertTrue(userRegistration.emailValidation("sra..123@gamil.com"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }
    }

    @Test
    public void positivePhoneNumberValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.phoneNumberValidation("+91 9052382248"));
    }

    @Test
    public void negativePhoneNumberValidationTest() {
        try {
            Assert.assertTrue(userRegistration.phoneNumberValidation("+91 01245"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
             }
    }

    @Test
    public void positivePassWordValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.passwordValidation("Sravan@6545"));
    }

    @Test
    public void negativePasswordValidationTest() {
        try {
            Assert.assertTrue(userRegistration.passwordValidation("rav@ivni1@"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }
    }
}

