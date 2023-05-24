package Deonis_Week_1;

public class Task3 {

    public static String finra(int startingNumber, int endingNumber) {

        String result = "";

        for (int i = startingNumber; i <= endingNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(finra(1, 30));

    }


}






/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */