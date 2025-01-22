import java.util.Scanner;

public class polymorphism {
    String name;
    int rank;
    String nationality;

    void info(String name, int rank) {
        System.out.println(name+ " is ranked " + rank + " for ATP 2025");
    }

    void info(String name, int rank, String nationality) {
        System.out.println(name+ " is ranked " + rank + " for ATP 2025. He's from "+ nationality);
    }
}

class Mains{
    public static void main(String[] args) {
        polymorphism p1 = new polymorphism();
        polymorphism p2 = new polymorphism();

        p1.info("Novak Djokovic",7,"Serbia");
        p2.info("Jannik Sinner",1);

    }
}
