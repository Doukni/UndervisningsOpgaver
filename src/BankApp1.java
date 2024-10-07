import java.util.Scanner;

public class BankApp1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // vi skal have et navn til personen som ejer banken
        String navn = "Abu Qudamah";

        // så skal vi have en saldo til kontoen
        double saldo = 44.50;

        // Sidst for at lave et besalt konto skal vi have et konto nr
        int Knr = 1;

        // så har vi tilføjet en rente
        double rente = 1.05;

        System.out.println("Din nuværende saldo " + saldo);

        System.out.println("indsæt mængde");
        saldo = saldo + scan.nextDouble();

        System.out.println(saldo);

        System.out.println("Efter din rente vil du have en saldo på");
        saldo = saldo + rente;
        System.out.println("Ny saldo = " + saldo);
    }
}