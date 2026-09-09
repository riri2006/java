public class studentExample {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.name = "Riddhi";
        s1.id = 101;
        s2.name = "Vedant";
        s2.id = 102;
        System.out.println("Student Name: " + s1.name);
        System.out.println("Student ID: " + s1.id);
        s1.attendingLec();
        System.out.println("Student Name: " + s2.name);
        System.out.println("Student ID: " + s2.id); 
        s2.attendingLec();
    }
}