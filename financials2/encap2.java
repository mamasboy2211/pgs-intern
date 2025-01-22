package financials2;

import financials1.Model;
import financials1.encap1;

class financials2 extends encap1{
    void showinfo(int revenue, int profits,int nt,int expenses, String name){
        System.out.println(revenue);
    }

}
class financial extends Model {
    public static void main(String[] args){
        Model c1 = new Model();
        c1.name = "vraj llc";
        c1.calcprofits(2000000,5000);

    }
}