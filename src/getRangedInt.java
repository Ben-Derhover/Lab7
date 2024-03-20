import java.util.Scanner;

public class getRangedInt {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        //year
        int Year = safeInput.getRangedInt(in,"Give me year born", 1950, 2010);
        //month
        int month = safeInput.getRangedInt(in,"enter birth month",1, 12);

        int day;

        switch (month){

            case 9:
                day = safeInput.getRangedInt(in,"enter birth day",1, 30);
                break;
            case 4:
                day = safeInput.getRangedInt(in,"enter birth day",1, 30);
                break;
            case 6:
                day = safeInput.getRangedInt(in,"enter birth day",1, 30);
                break;
            case 11:
                day = safeInput.getRangedInt(in,"enter birth day",1, 30);
                break;
            case 2:
                day = safeInput.getRangedInt(in,"enter birth day",1, 28);
                break;
            default:
                day = safeInput.getRangedInt(in,"enter birth day",1, 31);
                break;
        }
        int hour = safeInput.getRangedInt(in,"enter birth hour",1, 24);
        int Min = safeInput.getRangedInt(in,"enter birth min",1, 60);

        System.out.println("you were born in the year "+Year+" in the month "+month+"and the day "+day+" on the hour of "+hour+" and "+Min+" mins");

        //day - if the month is 9, 4, 6, 11 - day range is 30
        //if month is 2 - day range is 28
        //else it is 31
        //switch(month)
        //case 9, 4, 6, 11:
        //case 2:
        //default

    }

}
