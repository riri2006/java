public class Operators{
    public static void main(String[] args) {
        int a=30;
        int b=20;
        // assignment operator
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

        // arithmetic operator
        System.out.println("Addition = " + (a+b));
        System.out.println("Multiplication = " + (a*b));

        //Logical operator
        boolean r = true;
        boolean v = false;
        System.out.println(r && v);
        System.out.println(r || v); 

        // relational operator
        System.out.println(" a > b = " + (a>b));
        System.out.println(" a != b = " + (a!=b));
        boolean flag = true;
        boolean result = !flag;
        System.out.println(" result = " + result);
    }
}