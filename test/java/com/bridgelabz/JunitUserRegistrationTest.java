package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class JunitUserRegistrationTest {

    private static final JunitUserRegistration userRegistration = new JunitUserRegistration();

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
        boolean actualOutPut = userRegistration.emailValidation("srava@com");
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
        boolean actualOutPut = userRegistration.passwordValidation("Sravan6#");
        Assert.assertTrue(actualOutPut);
    }

    @Test
    public void negativePasswordValidationTest() {
        boolean actualOutPut = userRegistration.passwordValidation("sravan6*");
        Assert.assertTrue(actualOutPut);
    }




}
