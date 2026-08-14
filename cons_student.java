class student {
    String name;
    int id;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Student 1: " + name + ", ID: " + id);
    }
}

public class cons_student {
    public static void main(String[] args) {
        student student1 = new student("Alice", 101);

    }
}