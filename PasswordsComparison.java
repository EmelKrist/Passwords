package taskpassword;

public class PasswordsComparison {
    static String inputPassword;
    static String passwordSample;
    static String Result;
 
public PasswordsComparison(String inputPassword,String passwordSample){
     
     this.inputPassword = inputPassword;
     this.passwordSample = passwordSample;
     PasswordComparison();
} 

    /**
     * Метод,отвечающий за сравнение строки-образца с введенным паролем.
     */
    public static void PasswordComparison() {

        //Если строка-образец и пароль равны
        if (passwordSample.equals(inputPassword)) {
            //то выводим в консоль надпись о том,что пароль верный
            Result = "\nThe entered password is correct :)";          
        } else { // иначе выводим надпись, что он не верный
            Result = "\nThe entered password is not correct :(";   
        }
         System.out.println(Result);
    }
}
