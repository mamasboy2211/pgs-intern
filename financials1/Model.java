package financials1;

public class Model extends encap1 {
    public void calcprofits(int profits, int expenses){
        nt = profits - expenses;
        System.out.println("Overall profits for FY24 were "+profits);
        System.out.println(name + " made a net profit of "+ nt + " over a total expense of "+ expenses);

        if(nt > 0){
            System.out.println(name + " was profitable for FY24 ");
        }
        else{
            System.out.println(name + " faced losses for FY24 ");
        }
    }

}
