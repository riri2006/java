abstract class Vaccine {

    int age;
    String nationality;
    boolean firstDoseCompleted = false;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("User is eligible for first dose.");
            System.out.println("First dose completed.");
            System.out.println("Please pay Rs. 250.");

            firstDoseCompleted = true;
        } else {
            System.out.println("User is not eligible for first dose.");
        }
    }

    public void secondDose() {
        if (firstDoseCompleted) {
            System.out.println("Second dose completed.");
        } else {
            System.out.println("First dose is not completed.");
            System.out.println("User cannot take the second dose.");
        }
    }

    abstract void boosterDose();
}


class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    void boosterDose() {
        System.out.println("Booster dose completed successfully.");
    }
}


public class Vaccination {

    public static void main(String[] args) {

        VaccinationSuccessful v =
                new VaccinationSuccessful(18, "Indian");

        System.out.println("Nationality: " + v.nationality);
        System.out.println("Age: " + v.age);

        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}