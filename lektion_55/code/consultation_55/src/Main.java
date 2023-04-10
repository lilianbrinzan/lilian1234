import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        vowelsAndConsonants("abce!");

        char ch = 'ы';
        char chDigit = '4';
        System.out.println("is "+ch+" a letter? "+ Character.isLetter(ch));
        System.out.println("is "+chDigit+" a digit? "+ Character.isDigit(chDigit));

    }

    // Написать метод, который подсчитывает и выводит на экран количество гласных и согласных
    // букв английского алфавита в слове
    // public static void vowelsAndConsonants (String)
    // hello -> number of vowels 2, number of consonants 3
    // hello! -> number of vowels 2, number of consonants 3
    // a*M
    //   1- пройти по всем символам слова в цикле
    //   2- определить является ли символ буквой английского алфавита c помощью таблицы ASCII  или метода класса
    //   Character
    // определить гласная или согласная
    public static void vowelsAndConsonants (String string){
        int counterVowels = 0;
        int counterConsonants = 0;

        for( int i = 0;i<string.length();i++){
            char character = string.toLowerCase().charAt(i);
            //  if(character >=97 && character <= 122){
            if(Character.isLetter(character)){
                if(character == 'a' ||
                        character == 'u' ||
                        character == 'e' ||
                        character == 'i' ||
                        character == 'y' ||
                        character == 'o')
                    counterVowels++;
                else counterConsonants++;
            }
        }
        System.out.println(counterVowels);
        System.out.println(counterConsonants);
    }
}

