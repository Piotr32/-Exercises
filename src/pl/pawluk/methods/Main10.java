package pl.pawluk.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ### Zadanie 10

Napisz program który oblicza pole prostokąta. Wartości boków a i b wprowadzamy z klawiatury. W programie należy przyjąc, że zmienne a,b
oraz pole są typu double.
 */
public class Main10 {

    public static void main(String[] args)
        throws IOException
    {
        double a, b, rectangleArea;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza pole prostokąta");
        System.out.println("Podaj bok a: ");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj bok b: ");
        b = Double.parseDouble(br.readLine());

        rectangleArea = a*b;

        System.out.println("Pole prostokąta o boku a = " + a + " i boku b = " + b);
        System.out.println(" wynosi " + rectangleArea + ".");

    }
}
