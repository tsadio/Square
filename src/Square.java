import java.util.Scanner;

public class Square {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = in.nextInt();

        System.out.println("Here are the squares from 1 to " + num + ":");
        System.out.println("Number        Square");
        System.out.println("------        ------");
        for (int i = 1; i <= num; i++) {
            System.out.println("  " + i + "              " + (i*i));

        }

    }
}
