public class UPI extends Payment{
    
    public void pay(){
        System.out.println("Payment is done using UPI..");
    }
    public static void main(String[] args) {
        UPI u1 = new UPI();
        u1.pay();
    }
    
}