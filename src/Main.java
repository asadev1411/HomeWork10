import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String phone = "+960-415-75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Номер телефона слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Номер телефона слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        String deviceModel = "Samsung Galaxy S" + 9;
        System.out.println(deviceModel);

        //Task №1
        System.out.println(" ");
        System.out.println("Задание №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName + ".");

        //Task №2
        System.out.println(" ");
        System.out.println("Задание №2");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper + ".");

        //Task №3
        System.out.println(" ");
        System.out.println("Задание №3");
        String fullNameSemen = "Иванов Семён Семёнович";
        fullNameSemen = fullNameSemen.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameSemen + ".");
    }
}