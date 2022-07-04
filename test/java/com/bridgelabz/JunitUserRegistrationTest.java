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
            System.out.println(e);
        }
    }


    @Test
    public void lastNameValidationTest() {
        try {
            Assert.assertTrue(userRegistration.lastNameValidation("sr@12"));
        } catch (InvalidInputExceptionError e) {
            System.out.println(e);
        }


    }

    @Test
    public void emailValidationTest() {
        try {
            Assert.assertTrue(userRegistration.emailValidation("srs..123@gamil.com"));
        } catch (InvalidInputExceptionError e) {
            System.out.println(e);
        }
    }

    @Test
    public void phoneNumberValidationTest() {
        try {
            Assert.assertTrue(userRegistration.phoneNumberValidation("+91 01245"));
        } catch (InvalidInputExceptionError e) {
            System.out.println(e);
        }
    }

    @Test
    public void passwordValidationTest() {
        try {
            Assert.assertTrue(userRegistration.passwordValidation("rav@inad1@"));
        } catch (InvalidInputExceptionError e) {
            System.out.println(e);
        }
    }
}

