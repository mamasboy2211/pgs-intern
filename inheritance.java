class inheritance{
    String player;
    int rank;

    void player (String player, int rank){
        this.player = player;
        this.rank = rank;
    }
}

class Tennis extends inheritance{
    void display(){
        System.out.println(player+" is ranked "+rank+" for ATP 2025");
    }
}

class Main{
    public static void main(String[] args){
        Tennis t1 = new Tennis();
        Tennis t2 = new Tennis();

        t1.player ("Novak Djokovic", 6);
        t2.player ("Jannik Sinner", 1);

        t1.display();
        t2.display();

    }
}