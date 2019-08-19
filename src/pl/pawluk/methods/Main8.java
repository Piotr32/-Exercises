package pl.pawluk.methods;

/* #### Zadanie 8

W pliku `Main8.java` napisz metodę `maxOfThree`, która przyjmie trzy parametry liczbowe. Metoda ma zwrócić największą liczbę.*/

public class Main8 {

    public static void main(String[] args) {

        System.out.println(maxOfThree(1,2,3));
        System.out.println(maxOfThree(2,2,3));
        System.out.println(maxOfThree(5,5,3));
        System.out.println(maxOfThree(5,6,6));
    }


    static int maxOfThree(int a, int b, int c ){
        if(a>b && a>c){
            return a;
        }else if(b>c){
            return b;
        }
        return c;
    }
}
