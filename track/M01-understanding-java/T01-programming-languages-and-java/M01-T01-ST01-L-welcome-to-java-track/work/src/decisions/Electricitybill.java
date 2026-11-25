package decisions;

public class Electricitybill {
    public static void main(String[] args) {
        String CustomerName = "Rahul";
        int unitConsumed = 350;
        int bill = 0;
        double total = 0;

        if (unitConsumed >= 0 && unitConsumed <= 100) {
            bill = unitConsumed * 2;

        } else if (unitConsumed >= 101 && unitConsumed <= 200) {

            bill = unitConsumed * 3;
        } else if (unitConsumed >= 201 && unitConsumed <= 300) {
            bill = unitConsumed * 5;
        } else if (unitConsumed <= 0) {
            System.out.println("Invalid Units");
        } else {
            bill = unitConsumed * 7;
        }
        double surgecharge = bill * 0.05;
        if (bill > 1000) {
            total = bill + surgecharge;
        } else {
            System.out.println(bill);
        }

        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Units consumeed: " + unitConsumed);
        System.out.println("Electricity bill: " + bill);
        System.out.println("Total bill: " + total);
    }
}
