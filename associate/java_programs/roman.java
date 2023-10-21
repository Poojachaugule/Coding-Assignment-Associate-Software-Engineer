import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a Roman numeral: ");
        Scanner s1 = new Scanner(System.in);
        String roman_value = s1.nextLine().toUpperCase();
      

        int result = 0;
        int prevValue = 0;

        for (int i = roman_value.length() - 1; i >= 0; i--) {
            char c = roman_value.charAt(i);
            int value = 0;

            switch (c) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    System.out.println("Invalid character in Roman numeral.");
                    return;
            }

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        System.out.println("Integer equivalent is: " + result);
    }
}
