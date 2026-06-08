package esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero dei chilometri percorsi");
        int km = scanner.nextInt();

        System.out.println("Inserisci la quantità di litri di carburante consumati");
        int litri = scanner.nextInt();

        try {
            int kmLitro = km / litri;
            System.out.println("La quantità di chilometri fatta per litro è: " + kmLitro);
        } catch (ArithmeticException e) {
            System.out.println("Attenzione numero non valido!");
        } catch (Exception e) {
            System.out.println("Errore: errore generale");
            throw new RuntimeException(e);
        }




    }
}
