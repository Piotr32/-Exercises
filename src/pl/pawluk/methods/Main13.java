package pl.pawluk.methods;

/* ### Zadanie 13

Napisz program,który oblicza objętość kuli o promieniu r. Wartość promienia wprowadzamy z klawiatury. W programie należy przyjąć,
że zmienne: promień r i objętość są typu double (rzeczywistego). Dla tych zmiennych nalezy przyjąć format na ekranie z dokładnością
do dwóch miejsc po przecinku.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main13 {

    public static void main(String[] args)
            throws IOException
    {

        double r, objętość;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza objętość kuli");
        System.out.println("Podaj promień r. ");
        r = Double.parseDouble(br.readLine());

        objętość = 4 * Math.PI * r * r * r / 3;

        System.out.println("Objętość kuli o promieniu r = ");
        System.out.printf("%2.2f\n", r);
        System.out.println("wynosi: ");
        System.out.printf("%2.2f\n", objętość);
        System.out.println();
    }
}



