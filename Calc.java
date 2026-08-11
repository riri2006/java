public class Calc{
    public void add(){
        System.out.println(10+5);
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);

    }
    public void add(float a, int b){
        System.out.println(a+b);
    }
    public void add(int a, float b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.add();
        c1.add(10,30);
        c1.add(10,20,20);
        c1.add(1.5f,20);
        c1.add(10,3.5f);
    }


}