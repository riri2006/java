public class loopsDay{
    public static void main(String[] args){
        System.out.println("For loop - ");
        for ( int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        int j=1;
        System.out.println("While loop - ");
        do{
            if(j%2==0)
            System.out.println(j + " is even number.");
            j++;

        } while(j<=10);

        for(int r=10; r>=20;r++){
            System.out.println(r);
            if(r==15){
                break;
            }
        }
        for (int s=10; s<=20;s++){
            if(s==15){
                continue;
            }
            System.out.println(s);
        }
        
    }
}