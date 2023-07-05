import java.util.Random;
import java.util.Scanner;
class Guess {
    private int us;
    private int gn;

    public Guess() {
        Random r = new Random();
        System.out.print("Input Your Number:");
        int gn = r.nextInt(3);
        Scanner sc = new Scanner(System.in);
        int us = sc.nextInt();
        System.out.println("Guess Number is:" + gn);
        if (us != gn) {
            System.out.println("Incorrect Number");
        } else if (us > gn) {
            System.out.println("Greater then random number");
        } else if (us < gn) {
            System.out.println("Less then random number");
        } else if (us == gn) {
            System.out.println("Correct Number");
        }

        System.out.print("No of Guesses:");
        for (int i = 1; i <= us; i++) {
            System.out.print(us);
        }


    }
}
public class Guess_the_Number {
    public static void main(String[] args) {
        Guess g=new Guess();

    }
}
