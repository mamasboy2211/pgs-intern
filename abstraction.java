
abstract class dorothy {
    public abstract void sport();

}

class tennis extends dorothy {

    public void sport() {
        System.out.println("tennis pro");
    }
}

class pickleball extends dorothy {
    // Implementing abstract method
    public void sport() {
        System.out.println("pickleball pro");
    }
}

public class abstraction {
    public static void main(String[] args) {
        tennis t = new tennis();
        pickleball p = new pickleball();

        t.sport();
        p.sport();
    }
}
