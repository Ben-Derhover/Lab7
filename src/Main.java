import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        String mySS = safeInput.getRegExString(in,"Enter your SS number","\\d{3}-\\d{2}-\\d{4}");
        String UC = safeInput.getRegExString(in,"whats your m number?", "(M|m)\\d{5}");
        String menuChoice = safeInput.getRegExString(in,"whats your choice, Open Save View Quit ", "[OoSsVvQq]");

        System.out.println("your ssn is "+mySS);
        System.out.println("your UN number is"+ UC);
        System.out.println("your menu choice is " + menuChoice);

    }
}