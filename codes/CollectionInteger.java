import java.util.ArrayList;
import java.util.List;

public class CollectionInteger {
    public static void main(String[] args) {
        List <Integer> num = new ArrayList<>();

    //ADD ELEMENTS TO THE LIST
        num.add(10);
        num.add(20);
        num.add(30);
        System.out.println("\nOriginal Number list: "+num);
        num.add(40);
        System.out.println("Adding new number: "+num);

    //REMOVE ELEMENT FROM THE LIST
        num.remove(3);
        System.out.println("After removing 4th element: "+num);
    
    //Contains method
        System.out.println("Contains 10? "+num.contains(10));
        System.out.println("Contains 40? "+num.contains(40));

    } 
}