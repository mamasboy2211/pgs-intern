// private - encap1
// default - in this file
// protected - encap1 & model & pack2

package financials1;

public class encap1 {
    private int stonk;
    int revenue;
    protected int profits,nt,expenses;
    public String name;

    void showstock(String name, double stonk){
        System.out.println(name + " is floating at $" + stonk);
    }
    void showrev(String name, int revenue){
        System.out.println(name+" generated a revenue of $"+revenue+" billion for FY24");
    }
}

class mains{
    public static void main(String[] args) {
        encap1 c1 = new encap1();
        c1.showstock("vraj llc", 145.70);
        c1.showrev("vraj llc", 100);
    }
}