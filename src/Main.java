import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeri = new int[5];

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = (int) (Math.random() * 10) + 1;
            System.out.println("Numero array creato: " + numeri[i]);
        }

        while (true) {
            try {
                System.out.println("Inserisci il numero da voler aggiungere nell'array di numeri");
                int numero = scanner.nextInt();

                System.out.println("Inserisci la posizione in cui vuoi mettere il numero 1-5 inserisci 0 se vuoi uscire dal programma");
                int posizione = scanner.nextInt();

                if (posizione == 0) {
                    System.out.println("Chiusura del programma");
                    break;
                }

                numeri[posizione - 1] = numero;

                System.out.println(Arrays.toString(numeri));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: posizione non valida");
            } catch (Exception e) {
                System.out.println("Errore: errore generico");
                scanner.nextLine();
            }
            }
        }
    }
