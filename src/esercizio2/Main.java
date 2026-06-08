package esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        try {
        System.out.println("Inserisci il numero dei chilometri percorsi");
        double km = scanner.nextDouble();

        System.out.println("Inserisci la quantità di litri di carburante consumati");
        double litri = scanner.nextDouble();

        if (litri == 0) {
            throw new ArithmeticException("Impossibile consumare 0 litri!");
        }

            double kmLitro = km / litri;
            System.out.println("La quantità di chilometri fatta per litro è: " + kmLitro);
        } catch (ArithmeticException e) {
            System.out.println("Attenzione numero non valido!");
        } catch (Exception e) {
            System.out.println("Errore: errore generale");
            scanner.nextLine();
        } finally {
            scanner.close();
        }



    }
}
