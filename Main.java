interface Person {                 
    void study();
}

class Student implements Person {  
    private String name = "Rahul"; 

    public void study() {          
        System.out.println("Student is studying");
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Person p = new Student();  
        p.study();

        Student s = new Student();
        System.out.println("Name: " + s.getName());
    }
}