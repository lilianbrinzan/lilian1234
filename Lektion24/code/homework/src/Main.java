import java.util.ArrayList;
      // Lektion 22 Hausaufgaben 3
public class Main {
    public static void main(String[] args) {
        System.out.println("das Wort ruckwarts schreiben " );
        String word = "strassenbahn";
        System.out.println(word);
        int lengthOfWord = word.length();
        System.out.println("Wortlange - lungimea kuvintului " + lengthOfWord + " simboluri");

        ArrayList<Character> letters = new ArrayList <>();

        for ( int i = 0 ; i < lengthOfWord ; i++ ) {
            // bbb
            letters.add( i , Character.valueOf(word.charAt(i)));
        }
        System.out.println(letters);

        ArrayList<Character> lettersReverce = new ArrayList <>();

        for (  int i = 0 ; i < lengthOfWord  ; i++ ){
            lettersReverce.add( i , letters.get(lengthOfWord - 1 - i )  );
        }
        System.out.println("ruckwarts schreiben " );
        System.out.println(lettersReverce);
    }
}