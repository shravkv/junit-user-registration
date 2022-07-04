package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class JunitRegistrationTest {
    private static final JunitUserRegistration userRegistration = new JunitUserRegistration();
    private String userMail;
    private boolean actualOutPut;

    public void JunitUserRegistrationTest(String userMail, boolean actualOutPut) {
        this.userMail = userMail;
        this.actualOutPut = actualOutPut;
    }

    @Parameterized.Parameters
    public static Collection multipleEmailsTest() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc+100@gmail.com", true},
                {"abc.10@gmail.com", true},
                {"abc-100@abc.net", true},
                {"abc@abc@gmail.com", false},
                {"abc", false},
                {"abc123@gmail.a", false}

        });
    }

    @Test
    public void emailChecker() {
        Assert.assertEquals(actualOutPut, userRegistration.validEmailsValidation(userMail));
    }

    @Test
    public void positiveFirstNameValidationTest() {
        boolean actualOutPut = userRegistration.firstNameValidation("Vodnala");
        Assert.assertTrue(actualOutPut);
    }
    @Test
    public void negativeFirstNameValidationTest() {
        boolean actualOutPut = userRegistration.firstNameValidation("vodnala");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void positiveLastNameValidationTest() {
        boolean actualOutPut = userRegistration.lastNameValidation("Sravan");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void negativeLastNameValidationTest() {
        boolean actualOutPut = userRegistration.lastNameValidation("sravan");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void positiveEmailValidationTest() {
        boolean actualOutPut = userRegistration.emailValidation("sravan.sunny81@gamil.com");
        Assert.assertTrue(actualOutPut);
    }
    @Test
    public void negativeEmailValidationTest() {
        boolean actualOutPut = userRegistration.emailValidation("sravan@com");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void positivePhoneNumberValidationTest() {
        boolean actualOutPut = userRegistration.phoneNumberValidation("+91 9052382248");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void negativePhoneNumberValidationTest() {
        boolean actualOutPut = userRegistration.phoneNumberValidation("+919052382248");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void positivePasswordValidationTest() {
        boolean actualOutPut = userRegistration.passwordValidation("Sravank6#");
        Assert.assertTrue(actualOutPut);
    }
    @Test
    public void negativePasswordValidationTest() {
        boolean actualOutPut = userRegistration.passwordValidation("sravan6*");
        Assert.assertTrue(actualOutPut);
    }
}

