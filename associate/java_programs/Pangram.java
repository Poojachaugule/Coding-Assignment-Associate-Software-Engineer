import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = s1.nextLine().toLowerCase(); 
        

        boolean is_Pangram = true;
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                is_Pangram = false;
                break;
            }
        }

        if (is_Pangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
