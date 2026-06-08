import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeri = new int[5];

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = (int) (Math.random() * 10) + 1;
        }
    }
}