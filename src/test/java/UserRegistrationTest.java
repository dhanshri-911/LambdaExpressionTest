import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest extends TestCase {

    @Test
    public void testingFirstName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFNameValid = userRegistration.checkFName("Rachoti");
        Assert.assertTrue(isFNameValid);
    }

    @Test
    public void testFirstNameInvalidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFnameValid = userRegistration.checkFName("rachoti");
        Assert.assertFalse(isFnameValid);
    }

    @Test
    public void testLastNameValidMustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameValid = userRegistration.Lname("Minajagi");
        Assert.assertTrue(isLnameValid);
    }

    @Test
    public void testLastNameValidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameINValid = userRegistration.Lname("minajagi");
        Assert.assertFalse(isLnameINValid);
    }

    @Test

    public void testEmailId_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailValid = userRegistration.checkEmail("rachoti.ab@gmail.com");
        Assert.assertTrue(isEmailValid);
    }

    @Test

    public void testEmailId_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailInvalid = userRegistration.checkEmail("rachoti@.com");
        Assert.assertFalse(isEmailInvalid);
    }

    @Test

    public void testPhoneNumber_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberValid = userRegistration.checkPhoneNum("91 9686127142");
        Assert.assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testPhoneNumber_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberInValid = userRegistration.checkPhoneNum("9686127142");
        Assert.assertFalse(isPhoneNumberInValid);
    }

    @Test

    public void testPassword_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();

        boolean isPasswordValid = userRegistration.checkPassword("Abc@123gjyg");
        Assert.assertTrue(isPasswordValid);
    }

    @Test

    public void testPassword_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordInValid = userRegistration.checkPassword("abcdefghi");
        Assert.assertFalse(isPasswordInValid);
    }


}


