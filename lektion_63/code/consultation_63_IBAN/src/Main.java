import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> l1 = List.of( new BankAccount("DE43249898543096"),
                                        new BankAccount("DE33249898543096"),
                                        new BankAccount("DE73249898543096"));
        List<BankAccount> l2 = List.of( new BankAccount("DE13249898543096"),
                                        new BankAccount("DE73249898543096"),
                                        new BankAccount("DE23249898543096"));
        List<BankAccount> l3 = List.of( new BankAccount("DE53249898543096"),
                                        new BankAccount("DE43249898543096"));
        List<BankAccount> l4 = List.of( new BankAccount("DE43249898543096"),
                                        new BankAccount("DE33249898543096"),
                                        new BankAccount("DE73249898543096"),
                                        new BankAccount("DE23249898543096"));
        List<Person> newList = List.of( new Person("Mark", l1),
                                        new Person("Karl", l2),
                                        new Person("Jimmy", l3),
                                        new Person("Vasja", l4));

           System.out.println(ibanWithStars(newList));


    }


  /*  Есть класс BankAccount  с полем String IBAN  и класс Person  с полями name и List<BankAccount>. Написать
    // метод, возвращающий список IBANs   со звездочками после третьего символа */

    public static List<String> ibanWithStars(List<Person> persons) {
        return persons
                .stream()
                .flatMap(ba -> ba.getBankAccounts().stream())
                //   .map(ba -> ba.getBankAccounts().stream())
                .map(BankAccount::getIBAN)
                .map(Main::stars)
                .collect(Collectors.toList());
    }

    private static String stars(String input) {
        char[] ch = input.toCharArray();
        for (int i = 3; i < ch.length; i++) {
            ch[i] = '*';
        }
        return new String(ch);


    }

}