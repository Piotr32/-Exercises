package pl.pawluk.methods;
/* #### Zadanie 1

W pliku `Main1.java` napisz metodę `static int multiply(int multipler, int index)`,
która zwróci wartość zmiennej `multipler` pomnożonej przez wartość argumentu `index`.*/


public class Main1 {

    public static void main(String[] args) {
        int value = multiply(5,4);
        int value2 = multiply(4,4);
        int value3 = multiply(3,3);
        int value4 = multiply(10,5);
        int value5 = multiply(6,8);
        System.out.println("multiplied: " + value);
        System.out.println("multiplied: " + value2);
        System.out.println("multiplied: " + value3);
        System.out.println("multiplied: " + value4);
        System.out.println("multiplied: " + value5);
    }

    static int multiply(int multipler, int index) {
        return multipler*index;
    }
}
