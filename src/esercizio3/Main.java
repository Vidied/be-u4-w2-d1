package esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContoCorrente conto = new ContoCorrente("Gianpiero", 1000);
        ContoOnLine contoOnLine= new ContoOnLine("Giangiorgio", 1000, 50);

        System.out.println("Inserisci delle cifre da prelevare dal conto di Gianpiero! Inserisci 0 per smettere di prelevare");
        while (true) {
            double prelievo = scanner.nextDouble();

            if(prelievo == 0) {
                System.out.println("Uscita dal prelievo");
                break;
            }

            try {
                conto.preleva(prelievo);
                System.out.println("Hai prelevato: " + prelievo);
                System.out.println("Il tuo nuovo saldo è: " + conto.getSaldo());
            } catch (BancaException e) {
                System.out.println("Errore: " + e.getMessage());
            }

        }


        System.out.println("Inserisci delle cifre da prelevare dal conto online di Giangiorgio! Inserisci 0 per smettere di prelevare");
        while (true) {
            double prelievo = scanner.nextDouble();

            if(prelievo == 0) {
                System.out.println("Uscita dal prelievo");
                contoOnLine.stampaSaldo();
                break;
            }

            try {
                contoOnLine.preleva(prelievo);
                System.out.println("Hai prelevato: " + prelievo);
                System.out.println("Il tuo nuovo saldo è: " + contoOnLine.getSaldo());
            } catch (BancaException e) {
                System.out.println("Errore: " + e.getMessage());
            }

        } scanner.close();
    }
}
