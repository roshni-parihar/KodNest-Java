package decisions;

public class Ternary {
    public static void main(String[] args) {
        int age = 20;
        String res = (age >= 18) ? "Eligible for vote" : "Not-Eligible for vote";
        System.out.println(res);

        int num = 24;
        String res1 = (num % 2 == 0) ? "even " : "odd";
        System.out.println(res1);

        int mark = 32;
        String res2 = (mark >= 35) ? "Pass" : "Fail";
        System.out.println(res2);

        int a = 45;
        int b = 67;
        String res3 = (a > b) ? "a is bigger" : "b is bigger";
        System.out.println(res3);

        int c = 89;
        int d = 56;
        String res4 = (c < d) ? "c is smaller" : "d is smaller";
        System.out.println(res4);

        int x = -17;
        String res5 = (x > 0) ? "Positive" : "Negative";
        System.out.println(res5);

        int y = 0;
        String res6 = (y == 0) ? "Zero" : "Non-Zero";
        System.out.println(res6);

        int marks = 85;
        String res7 = (marks >= 90) ? "Grade A" : (marks >= 75) ? "Grade B" : " Grade C";
        System.out.println(res7);

        double price = 2500.0;
        double res8 = (price > 2000) ? 2500 * 10 / 100 : price;
        System.out.println(res8);

        boolean IsLoggedIn = true;
        String res9 = (IsLoggedIn) ? " Welcome" : "Please Login";
        System.out.println(res9);

        int e = 45;
        int f = 78;
        int g = 32;
        int op = (e > f && e > g) ? e : (f > e && f > g) ? f : g;
        System.out.println(op);

        int units = 250;
        double bill = units * 6;
        double op1 = (bill > 1000) ? 5 / 100 * bill : bill;
        System.out.println(op1);

        int experiance = 6;
        String op2 = (experiance >= 5) ? " Bonus Eligible" : "Not-Eligible";
        System.out.println(op2);

        int year = 2024;
        String op3 = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "Leap year" : "Not leap year";
        System.out.println(op3);

        int p = 50;
        int q = 50;
        String op4 = (p > q) ? "P is greater" : (q > p) ? " q is grater" : "Both are equal";
        System.out.println(op4);
    }
}