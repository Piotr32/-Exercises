package pl.pawluk.methods;

/* #### Zadanie 2
W pliku `Main2.java` napisz metodę `static int square(int num)`, która zwróci wartość `num` podniesioną do kwadratu. */

public class Main2 {

    public static void main(String[] args) {
        System.out.println("power of 2 = " + square(2));
        System.out.println("power of 4 = " + square(4));
        System.out.println("power of 6 = " + square(6));
        System.out.println("power of 8 = " + square(8));
        System.out.println("power of 10 = " + square(10));
    }

    static int square(int num) {
        return (int)Math.pow(num,2);
    }
}
