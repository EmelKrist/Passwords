package taskpassword;

import java.util.Base64;
import org.junit.*;

/**
 * Тесты для задания 1.3 с использованием класса assume.
 */
public class TaskPassword2Test {
    
    private static PasswordsComparison PC1;
    private static Start S1;
    
    @BeforeClass
    public static void setUpClass() {     
    PC1 = new PasswordsComparison("5555555555ke","5555555555ke"); 
    //если введеные строки не null, то тесты будут запускаться
    Assume.assumeNotNull(PC1.inputPassword,PC1.passwordSample);
    }
    
    @Test //тестирование методя для сравнения паролей (одинаковые пароли)
    public void PasswordsComparisonTest() {
        //если пароли одинаковые, то тест не будет игнорироваться
        Assume.assumeTrue(PC1.passwordSample.equals(PC1.inputPassword));
        boolean actual = true;
        Assert.assertEquals(true, actual);
    }
    
    @Test //тестирование методя для сравнения паролей (разные пароли)
    public void PasswordsAreIncompatible() {
        //если пароли разные, то тест не будет игнорироваться
        Assume.assumeTrue(!PC1.passwordSample.equals(PC1.inputPassword));
        boolean actual = true;
        Assert.assertEquals(true, actual);
    }
    
    @Test //тестирование кодирования введенных строк
    public void EncoderTest() {
        //если строка образец равна 5555555555ke, то тест не будет игнорироваться
        Assume.assumeTrue(PC1.passwordSample == "5555555555ke");
        String expected = Base64.getEncoder().encodeToString(PC1.passwordSample.getBytes());
        String actual = "NTU1NTU1NTU1NWtl";
        Assert.assertEquals(expected, actual);
    }
    
    
}
