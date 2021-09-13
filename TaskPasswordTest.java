package taskpassword;

import java.util.Base64;
import org.junit.*;

/**
 * Тесты для задания 1.3 с использованием класса assert.
 */
public class TaskPasswordTest {

    private static PasswordsComparison PC1;
    private static Start S1;

    public TaskPasswordTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        PC1 = new PasswordsComparison("5555555555ke", "5555555555ke");
    }

    @Test //проверка пароля пользователя на null
    public void IinputPassword_NO_NULL() {
        String expected = PC1.inputPassword;
        Assert.assertNotNull(expected);
    }

    @Test //проверка строки образца на null 
    public void SamplePassword_NO_NULL() {
        String expected = PC1.passwordSample;
        Assert.assertNotNull(expected);
    }

    @Test //тестирование методя для сравнения паролей (одинаковые пароли)
    public void PasswordsComparisonTest() {
        boolean expected = PC1.passwordSample.equals(PC1.inputPassword);
        boolean actual = true;
        Assert.assertEquals(expected, actual);
    }

    @Ignore //тестирование методя для сравнения паролей (разные пароли)
    public void PasswordsAreIncompatible() {
        boolean expected = PC1.passwordSample.equals(PC1.inputPassword);
        boolean actual = false;
        Assert.assertEquals(expected, actual);
    }

    @Test //тестирование кодирования введенных строк
    public void EncoderTest() {
        String expected = Base64.getEncoder().encodeToString(PC1.passwordSample.getBytes());
        String actual = "NTU1NTU1NTU1NWtl";
        Assert.assertEquals(expected, actual);
    }

}
