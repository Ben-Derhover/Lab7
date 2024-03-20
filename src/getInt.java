import java.util.Scanner;

public class getInt {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int intA = safeInput.getInt(in,"Give me your fav int");
        double doubleB = safeInput.getDouble(in,"give me your fav double");
        System.out.println("your Fav int is "+intA+" and your fav double is "+doubleB);



    }
}
