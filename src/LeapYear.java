public class LeapYear {
    public static int leapYearCount(int year) {
        return year/4-year/100+year/400;
    }

    public static void main(String[] args) {
        //int countYears = 0;
        /*for (int i =0; i <= 2022; i++) {
            int x = leapYearCount(i);*/
        int  countYears = 2022;
        System.out.println("Count leap years is " + leapYearCount(countYears));

        }
    }

