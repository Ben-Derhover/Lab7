import java.util.Scanner;

public class GetUserName {

    public static void main(String[] args) {


        Scanner in = new Scanner (System.in);

        String fname = safeInput.getNonZeroLenString(in,"What you fname?");
        String lname = safeInput.getNonZeroLenString(in,"What you lname?");

        System.out.println("Your name is "+fname+ " "+lname);

    }


}
