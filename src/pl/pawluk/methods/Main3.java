package pl.pawluk.methods;

/* #### Zadanie 3

W pliku `Main3.java` napisz metodę `convertToUsd`, która przyjmuje parametr `pln`, czyli kwotę w złotówkach.
 Metoda ma zwrócić podaną kwotę w dolarach amerykańskich. Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.*/

public class Main3 {

    private static final double USD_VALUE = 4.04;

    public static void main(String[] args) {
        double v = convertToUsd(404);
        double v1 = convertToUsd(123);
        double v2 = convertToUsd(585);

    }

    private static double convertToUsd(double pln){
        double usd = pln/USD_VALUE;
        System.out.println("convert "+pln+" = "+String.format("%.2f",usd));
        return usd;
    }
}
