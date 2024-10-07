package diceGame;

public class Player {
    Cup cup = new Cup();
    String name;
    int sum = 0;

    Player(String name) {
        this.name = name;
    }

    void turn() {
        cup.roll();
        ;
        sum += cup.getSum();
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Player p = new Player("Adam");
        System.out.println(p);
        while (p.sum < 100) {
            p.turn();
            System.out.println(p.sum);
        }
    }
}
