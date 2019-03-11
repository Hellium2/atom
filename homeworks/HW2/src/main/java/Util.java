import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Util {

    public static void main(String[] args) {
        newgame("dictionary.txt");
    }

    public static void newgame(String file) {

        String game = "Y";

        while (game.equals("Y")) {

            play(file);

            Scanner scan = new Scanner(System.in);
            System.out.println("Wonna play again? Y/N");
            game = scan.nextLine();
        }
        //return true;
    }

    public static boolean play(String file) {


        String word = getWord(file); //System.out.println(word);
        char[] baseword = word.toCharArray();
        int count = baseword.length;
        System.out.println("Welcome to Bulls and Cows game!");
        System.out.println("I offered a " + count + "-letter word, your guess?");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {

            String newtext = scan.nextLine();
            char[] newword = newtext.toCharArray();
            if (word.equals(newtext)) {
                System.out.println("You Won!!!");
                return true;

            }

            int bulls = bulls(newword, baseword);
            int cows = cows(newword, baseword);
            System.out.println("Bulls: " + bulls);
            System.out.println("Cows: " + (cows - bulls));

        }

        System.out.println("You Lose: " + word);
        return false;

    }

    public static int bulls(char[] newword, char[] baseword) {

        int count = Math.min(baseword.length, newword.length);
        int bulls = 0;
        for (int i = 0; i < count; i++) //Считаем "Быков"
            if (baseword[i] == newword[i])
                bulls++;
        return bulls;

    }

    public static int cows(char[] newword, char[] baseword) {

        int cows = 0;
        boolean flag;
        for (int i = 0; i < baseword.length; i++) {
            flag = false;
            for (int j = 0; j < newword.length; j++)
                if (baseword[i] == newword[j])
                    flag = true;
            if (flag) cows++;
        }
        return cows;
    }

    public static String getWord(String file) {

        try {

            Scanner scan = new Scanner(new File(file));
            int count = 0;
            while (scan.hasNext()) {
                scan.nextLine();
                count++;

            }

            Random rnd = new Random(System.currentTimeMillis());
            int number = rnd.nextInt(count);
            scan = new Scanner(new File(file));
            for (int i = 0; i < number - 1; i++)
                scan.nextLine();
            return (scan.nextLine());

        } catch (FileNotFoundException ex) {

            System.err.println("File not found: " + ex.getMessage());
            return null;

        }

    }
}
