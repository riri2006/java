public class Credit{
    long cred_num;
    String expirydate;
    private int cvv = 543;
    public int getcvv(int mpin){
        if(mpin==1234){
            return cvv;
        }
        else{
            System.out.println("Invalid MPIN");
            return -1;
        }
    }

    private String cardholder_name;

    public String getCardholder_name() {
        return cardholder_name;
    }
    public void setCardholder_name(String cardholder_name) {
        this.cardholder_name = cardholder_name;
    }
}