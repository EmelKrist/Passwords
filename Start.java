package taskpassword;

import java.util.Base64;
import java.util.Scanner;

public class Start {

    public Start() {
        inputPassword();//вызываем метод для ввода данных        
    }

    /**
     * Метод,отвечающий за ввод пароля пользователя и строки-образца из
     * командной строки.
     */
    public static void inputPassword() {
        //Вводим пароли с консоли и тут же кодируем их с помощью метода Encode
        Scanner pass = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String passwordSample = Encode(pass.nextLine());
        System.out.print("Repeat your password: ");
        String inputPassword = Encode(pass.nextLine());
        //создаем объект класса  PasswordsComparison для сравнения паролей
        PasswordsComparison PC = new PasswordsComparison(inputPassword, passwordSample);

    }

    /**
     * Метод,отвечающий за кодировку ввдеенных паролей. 
     * originalInput- строка, которая подвергается кодированию 
     * encodedString(возвращаемое значение) - та же строка в закодированном виде
     */
    public static String Encode(String originalInput) {
        String encodedString;
        return encodedString = Base64.getEncoder().
                encodeToString(originalInput.getBytes());
    }

}
