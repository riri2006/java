public class customer{
    public static void main(String[] args){
        Credit c1 = new Credit();
        c1.setCardholder_name("Vridhi");    
        System.out.println("Cardholder Name: " + c1.getCardholder_name());
        System.out.println("CVV: " + c1.getcvv(1234));
    }
}