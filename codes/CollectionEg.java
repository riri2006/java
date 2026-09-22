import java.util.ArrayList;
import java.util.List;

public class CollectionEg {
    public static void main(String[] args) {
        List <String> name = new ArrayList<>();

    //ADD ELEMENTS TO THE LIST
        name.add("Riddhi");
        name.add("Vedant");
        name.add("Kishu");
        System.out.println("\nOriginal Name list: "+name);
        name.add("Abhishek");
        System.out.println("Adding new name: "+name);

    //REMOVE ELEMENT FROM THE LIST
        name.remove(3);
        System.out.println("After removing 4th element: "+name);
    
    //Contains method
        System.out.println("Contains Riddhi? "+name.contains("Riddhi"));
        System.out.println("Contains Abhishek? "+name.contains("Abhishek"));

    } 
}