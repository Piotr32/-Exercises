package pl.pawluk.methods;

/* ### Zadanie 12

Napisz program,który wyświetla na ekranie komputera pierwiastek kwadratowy z wartości predefiniowanej stałej π = 3,14…
Należy przyjąć format wyświetlania tego pierwiastka z dokładnością dwóch miejsc po kropce.
 */

public class Main12 {

    public static void main(String[] args){
        System.out.println("Program wyświetla pierwiastek kwadratowy z liczby pi z zadaną dokładnością");
        System.out.printf("Sqrt(Pi) = " + "%2.2f\n", Math.sqrt(Math.PI));
    }
}
