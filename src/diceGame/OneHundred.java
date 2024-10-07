package diceGame;

public class OneHundred {

    Player p1 = new Player("Mo");
    Player p2 = new Player("So");


    void play(){
        System.out.println(p1 + "\t" + p2);
        while (p1.sum < 100 && p2.sum < 100){
            p1.turn();
            p2.turn();
            System.out.println(p1.sum + "\t" + p2.sum);
        }
    }

    public static void main(String[] args) {
        OneHundred game = new OneHundred();

        game.play();
        // opageve at lave så at vinderen få en tillykke og hvor mange forsøg han brygte på at vinde.
    }
}
