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

    void tournament(String name) {
        System.out.println(name+ " won US Open 2024 ");
    }
}

class novak extends polymorphism {
    void tournament(String name) {
        System.out.println(name+ " won Olympic Gold 2024 ");
    }

}

class jannik extends polymorphism {
    void tournament(String name) {
        System.out.println(name+ " won AO 2024 ");
    }
}
class Mains{
    public static void main(String[] args) {
        polymorphism p1 = new polymorphism();
        polymorphism p2 = new polymorphism();

        p1.info("Novak Djokovic",7,"Serbia");
        p2.info("Jannik Sinner",1);
        p1.tournament("Novak Djokovic");
        p2.tournament("Jannik Sinner");

    }
}
