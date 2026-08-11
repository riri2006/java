public class Conditional{
    public static void main(String[] args) {
        int a=30;
        int b=200;
        int c=100;

        if(a>b){
             System.out.println(a + " is greater than " + b);
        }
        else if(b>c){
             System.out.println(b + " is greater than " + c);
        }
        else{
             System.out.println(c + " is greater than " + a);
        }
    }
}