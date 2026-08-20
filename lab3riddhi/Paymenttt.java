interface Payment {

    void pay(double amount);
}


class UPIPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI.");
    }
}


class CreditCardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card.");
    }
}


class DebitCardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Debit Card.");
    }
}


public class Paymenttt {

    public static void main(String[] args) {

        Payment p1 = new UPIPayment();
        p1.pay(500);

        Payment p2 = new CreditCardPayment();
        p2.pay(100);

        Payment p3 = new DebitCardPayment();
        p3.pay(200);
    }
}