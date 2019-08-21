package pl.pawluk.methods;

/* ### Zadanie 11

Napisz program który wyświetla na ekranie komputera wartość predefiniowanej stałej Pi = 3,14.
Należy przyjąć format wyświetlania tej stałej z dokładnością do pięciu miejsc po przecinku.
 */

public class Main11 {

    public static void main(String[] args){
        System.out.println("Program wyświetla liczbę Pi z zadaną dokładnością");
        System.out.printf("Pi = " + "%6.5f\n", Math.PI);

    }
}
