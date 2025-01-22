// static block is executed when the class is loaded onto the memory
// instance block is executed when an object is created
// constructors are executed after the instance blocks, theres no compulsion for instance blocks to be in the code
// methods are executed once they are called

public class assingment1 {

    //instance variables
    String  interests;
    private static String name;

    // static block
    static {
        name = "vraj";
        System.out.println("heyyy " + name );
    }

    // instance block
    {
        interests = "tennis & pickleball";
        System.out.println("i love " + interests );
    }

    // constructor
    public assingment1(String interests, String name) {
        this.interests = interests;
        this.name = name;
    }

    // method
    public void display() {
        System.out.println(interests);
        System.out.println(name);
    }

    public static void main(String[] args) {
        assingment1 a = new assingment1("tennis & pickleball", "vraj");
        a.display();
    }
}
