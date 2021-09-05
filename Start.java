package taskpassword;

import java.util.Scanner;

public class Start {

    /**
     * Статичные переменные типа String. passwordSample - строка-образец;
     * inputPassword - пароль, вводимый с консоли;
     */
    static String passwordSample = "5555555555ke";
    static String inputPassword;

    public Start() {

        inputPassword(); //вызываем метод для ввода пароля
        PasswordComparison(); //вызываем метод для сравнения паролей     

    }

    /**
     * Метод,отвечающий за ввод пароля пользователя из командной строки.
     */
    public static void inputPassword() {

        Scanner pass = new Scanner(System.in);
        System.out.print("Enter your password: ");
        inputPassword = pass.nextLine();

    }

    /**
     * Метод,отвечающий за сравнение строки-образца с введенным паролем.
     */
    public static void PasswordComparison() {

        //Если строка-образец и пароль равны
        if (passwordSample.equals(inputPassword)) {
            //то выводим в консоль надпись о том,что пароль верный
            System.out.println("\nThe entered password is correct :)");
        } else { // иначе выводим надпись, что он не верный
            System.out.println("\nThe entered password is not correct :(");
        }
    }

}
