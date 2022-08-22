package Lab3;

import java.util.Scanner;

//import java.util.StringTokenizer;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int input = sc.nextInt();
        Diff obj1 = new Diff();
        System.out.println(" Modifyied number is :");

        obj1.modifyNumber(input);
    }

    static class Diff {
        static int number1;

        public static void modifyNumber(int number1) {// this method is not working well

            String str = Integer.toString(number1);

            for (int i = 0; i < str.length(); i++) {
                char c, c1;
                int num, num1 = 0, diff = 0;
                c = str.charAt(i);
                num = Character.getNumericValue(c);

                if (i < str.length() - 1) {
                    c1 = str.charAt(i + 1);
                    num1 = Character.getNumericValue(c1);
                    diff = num1 - num;
                } else diff = num;

                StringBuffer sb = new StringBuffer();
                sb = sb.append(diff);
                String s = sb.toString();
                number1 = Integer.parseInt(s);
                System.out.println(number1);
            }
        }
    }
}