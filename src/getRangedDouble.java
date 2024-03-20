import java.util.Scanner;

import java.util.Scanner;

public class getRangedDouble {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        double total = 0;
        boolean input = false;
        do {

            double intA = safeInput.getRangedDouble(in, "cost of item", .5, 9.99);
            total = intA + total;
            input = safeInput.getYNConfirm(in, "are you done");

        }while(input==false);


        System.out.println("Your total is "+total);
    }
}
